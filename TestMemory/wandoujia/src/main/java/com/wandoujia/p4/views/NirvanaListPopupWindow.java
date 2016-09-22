package com.wandoujia.p4.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.ListViewCompat;
import android.support.v7.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import com.wandoujia.phoenix2.R.styleable;

public class NirvanaListPopupWindow extends ListPopupWindow
{
  private final Context a;
  private int c = -2;
  private ListAdapter d;
  private View e;

  public NirvanaListPopupWindow(Context paramContext)
  {
    this(paramContext, null, 2130772285);
  }

  public NirvanaListPopupWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772285);
  }

  public NirvanaListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.Spinner, paramInt, 0);
    this.c = localTypedArray.getLayoutDimension(4, this.c);
    int i = localTypedArray.getDimensionPixelOffset(6, 0);
    int j = localTypedArray.getDimensionPixelOffset(5, 0);
    Drawable localDrawable = localTypedArray.getDrawable(3);
    d(this.c);
    b(i);
    a(j);
    a(localDrawable);
    localTypedArray.recycle();
    d();
  }

  public final void a(View paramView)
  {
    super.a(paramView);
    this.e = paramView;
  }

  public final void a(ListAdapter paramListAdapter)
  {
    this.d = paramListAdapter;
    super.a(paramListAdapter);
  }

  public final void c()
  {
    while (true)
    {
      int i;
      try
      {
        i = this.c;
        if ((i == -2) && (this.d != null))
        {
          ListAdapter localListAdapter = this.d;
          j = 0;
          if (localListAdapter != null)
            continue;
          super.d(j);
          super.c();
          ((ListViewCompat)i()).setTag(2131492908, this);
          return;
          View localView = null;
          int k = View.MeasureSpec.makeMeasureSpec(0, 0);
          int m = View.MeasureSpec.makeMeasureSpec(0, 0);
          int n = Math.min(localListAdapter.getCount(), 15);
          int i1 = Math.max(0, 0 - (15 - (n + 0)));
          FrameLayout localFrameLayout = new FrameLayout(this.a);
          if (i1 >= n)
            continue;
          localView = localListAdapter.getView(i1, localView, localFrameLayout);
          if (localView.getLayoutParams() != null)
            continue;
          localView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
          localView.measure(k, m);
          int i2 = Math.max(j, localView.getMeasuredWidth());
          i1++;
          j = i2;
          continue;
          continue;
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        return;
      }
      int j = i;
    }
  }

  public final void d(int paramInt)
  {
    this.c = paramInt;
    super.d(paramInt);
  }

  public final View e()
  {
    return this.e;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.NirvanaListPopupWindow
 * JD-Core Version:    0.6.0
 */