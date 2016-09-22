package com.wandoujia.jupiter.downloadreminder;

import android.support.v4.view.bg;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.ch;
import android.support.v7.widget.cm;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public final class m extends GridLayoutManager
{
  private int[] h = new int[2];
  private View i;

  public m(View paramView)
  {
    super(3);
    this.i = paramView;
  }

  public final void a(ch paramch, cm paramcm, int paramInt1, int paramInt2)
  {
    if (h() != 1)
    {
      super.a(paramch, paramcm, paramInt1, paramInt2);
      return;
    }
    int j = View.MeasureSpec.getMode(paramInt1);
    int k = View.MeasureSpec.getSize(paramInt1);
    paramch.a();
    int m = (int)Math.ceil(w() / c());
    int n = 0;
    int i5;
    for (int i1 = 0; n < m; i1 = i5)
    {
      int i3 = 0;
      for (int i4 = 0; (i4 < c()) && (i4 + n * c() < w()); i4++)
      {
        int i6 = i4 + n * c();
        int i7 = View.MeasureSpec.makeMeasureSpec(i4 + n * c(), 0);
        int[] arrayOfInt = this.h;
        View localView = paramch.c(i6);
        paramch.a(localView, i6);
        if (localView != null)
        {
          RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
          localView.measure(ViewGroup.getChildMeasureSpec(paramInt1, s() + u(), localLayoutParams.width), ViewGroup.getChildMeasureSpec(i7, t() + v(), localLayoutParams.height));
          arrayOfInt[0] = (localView.getMeasuredWidth() + localLayoutParams.leftMargin + localLayoutParams.rightMargin);
          arrayOfInt[1] = (localView.getMeasuredHeight() + localLayoutParams.bottomMargin + localLayoutParams.topMargin);
          paramch.a(localView);
        }
        i3 = Math.max(i3, this.h[1]);
      }
      i5 = i1 + i3;
      n++;
    }
    switch (j)
    {
    default:
    case 1073741824:
    case -2147483648:
    }
    for (int i2 = bg.o(this.i); ; i2 = k)
    {
      f(i2, i1);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.downloadreminder.m
 * JD-Core Version:    0.6.0
 */