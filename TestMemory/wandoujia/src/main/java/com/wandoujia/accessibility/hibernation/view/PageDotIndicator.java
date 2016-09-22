package com.wandoujia.accessibility.hibernation.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import com.wandoujia.ripple_framework.accessibility.R.dimen;

public class PageDotIndicator extends View
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private Paint h;

  public PageDotIndicator(Context paramContext)
  {
    super(paramContext);
    a();
  }

  public PageDotIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }

  private void a()
  {
    this.h = new Paint();
    this.h.setColor(-1);
    this.h.setAntiAlias(true);
    this.h.setStyle(Paint.Style.FILL);
    this.e = getResources().getDimensionPixelSize(R.dimen.indicator_dot_big_radius);
    this.f = getResources().getDimensionPixelSize(R.dimen.indicator_dot_small_radius);
    this.g = getResources().getDimensionPixelSize(R.dimen.indicator_dot_margin);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.a > 0) && (this.b >= 0) && (this.b < this.a))
    {
      float f1 = (this.c - 2 * this.e * this.a - (-1 + this.a) * this.g) / 2;
      for (int i = 0; i < this.a; i++)
      {
        int j = this.f;
        if (i == this.b)
          j = this.e;
        paramCanvas.drawCircle(f1 + i * (this.g + 2 * this.e) + this.e, this.d / 2, j, this.h);
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.c = getMeasuredWidth();
    this.d = getMeasuredHeight();
  }

  public void setCurrentPage(int paramInt)
  {
    this.b = paramInt;
    postInvalidate();
  }

  public void setPageCount(int paramInt)
  {
    this.a = paramInt;
    postInvalidate();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.view.PageDotIndicator
 * JD-Core Version:    0.6.0
 */