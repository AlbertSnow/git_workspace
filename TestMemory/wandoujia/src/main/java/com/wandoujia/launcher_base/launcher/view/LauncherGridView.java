package com.wandoujia.launcher_base.launcher.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.wandoujia.launcher_base.R.dimen;
import com.wandoujia.launcher_base.R.styleable;
import com.wandoujia.launcher_base.launcher.c.a;
import com.wandoujia.launcher_base.launcher.c.b;
import com.wandoujia.launcher_base.utils.g;

public class LauncherGridView extends ViewGroup
{
  private b a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;

  public LauncherGridView(Context paramContext)
  {
    super(paramContext);
  }

  public LauncherGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public LauncherGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.LauncherGridView);
    this.b = localTypedArray.getDimensionPixelSize(R.styleable.LauncherGridView_row_head, 0);
    this.c = localTypedArray.getDimensionPixelSize(R.styleable.LauncherGridView_row_height, 0);
    this.d = localTypedArray.getDimensionPixelSize(R.styleable.LauncherGridView_row_foot, 0);
    this.e = localTypedArray.getDimensionPixelSize(R.styleable.LauncherGridView_col_margin, 0);
    this.f = localTypedArray.getDimensionPixelSize(R.styleable.LauncherGridView_col_width, 0);
    this.g = paramContext.getResources().getDimensionPixelOffset(R.dimen.launcher_grid_max_width);
  }

  public final void a()
  {
    removeAllViews();
    if (this.a == null);
    while (true)
    {
      return;
      int i = this.a.b();
      for (int j = 0; j < i; j++)
      {
        a locala = this.a.b(j);
        if ((locala == null) || (locala.b(this) == null))
          continue;
        locala.a(this);
      }
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.a == null)
      return;
    int i = this.a.c();
    int j = (paramInt4 - paramInt2 - this.b - i * this.c - this.d) / (i - 1);
    int k = (paramInt3 - paramInt1 - 2 * this.e - 4 * this.f) / 3;
    int m = getChildCount();
    int n = 0;
    label77: View localView;
    Point localPoint;
    g localg;
    int i1;
    int i2;
    int i3;
    if (n < m)
    {
      localView = getChildAt(n);
      if (localView != null)
      {
        a locala = a.c(localView);
        if (locala != null)
        {
          localPoint = locala.f();
          localg = locala.g();
          if ((localPoint != null) && (localg != null))
          {
            if ((localg.a() != 4) || (localg.b() != i))
              break label214;
            i1 = 0;
            i2 = 0;
            i3 = paramInt3 - paramInt1;
          }
        }
      }
    }
    for (int i4 = paramInt4 - paramInt2; ; i4 = (-1 + localg.b()) * (j + this.c) + this.c)
    {
      localView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
      localView.layout(i1, i2, i3 + i1, i4 + i2);
      n++;
      break label77;
      break;
      label214: i1 = this.e + localPoint.x * (k + this.f);
      i2 = this.b + localPoint.y * (j + this.c);
      i3 = (-1 + localg.a()) * (k + this.f) + this.f;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    if (i > this.g)
    {
      int k = View.MeasureSpec.getMode(paramInt1);
      paramInt1 = View.MeasureSpec.makeMeasureSpec(this.g, k);
      i = this.g;
    }
    super.onMeasure(paramInt1, paramInt2);
    if ((paramInt2 == 0) && (this.a != null))
    {
      int j = this.a.c();
      setMeasuredDimension(i, this.b + j * this.c + 1 * (j - 1) + this.d);
    }
  }

  public void setAdapter(b paramb)
  {
    this.a = paramb;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.view.LauncherGridView
 * JD-Core Version:    0.6.0
 */