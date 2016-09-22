package com.wandoujia.jupiter.a;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.ch;
import android.support.v7.widget.cm;
import android.view.View;
import android.view.View.MeasureSpec;

public final class h extends LinearLayoutManager
{
  private final int[] h = new int[2];
  private int i = 100;

  public h()
  {
    super(0);
  }

  private void a(ch paramch, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    View localView = paramch.c(paramInt1);
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
    int j = s() + u();
    int k = t() + v();
    int m = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
    int n = localLayoutParams.topMargin + localLayoutParams.bottomMargin;
    int i1 = o(localView) + n(localView);
    int i2 = l(localView) + m(localView);
    localView.measure(a(paramInt2, i1 + (j + m), localLayoutParams.width, f()), a(paramInt3, i2 + (k + n), localLayoutParams.height, g()));
    paramArrayOfInt[0] = (f(localView) + localLayoutParams.leftMargin + localLayoutParams.rightMargin);
    paramArrayOfInt[1] = (g(localView) + localLayoutParams.bottomMargin + localLayoutParams.topMargin);
    paramch.a(localView);
  }

  public final void a(int paramInt)
  {
    if (h() != paramInt)
    {
      this.h[0] = 0;
      this.h[1] = 0;
    }
    super.a(paramInt);
  }

  public final void a(ch paramch, cm paramcm, int paramInt1, int paramInt2)
  {
    int j = View.MeasureSpec.getMode(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    int m = View.MeasureSpec.getSize(paramInt1);
    int n = View.MeasureSpec.getSize(paramInt2);
    int i1;
    if (j == 1073741824)
    {
      i1 = 1;
      if (k != 1073741824)
        break label79;
    }
    int i3;
    label79: for (int i2 = 1; ; i2 = 0)
    {
      i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
      if ((i1 == 0) || (i2 == 0))
        break label85;
      super.a(paramch, paramcm, paramInt1, paramInt2);
      return;
      i1 = 0;
      break;
    }
    label85: int i4;
    label114: int i5;
    int i6;
    int i7;
    int i9;
    int i15;
    int i11;
    label196: int i10;
    if (h() == 1)
    {
      i4 = 1;
      if ((this.h[0] == 0) && (this.h[1] == 0))
        break label289;
      i5 = 0;
      i6 = 0;
      paramch.a();
      i7 = paramcm.e();
      int i8 = w();
      i9 = 0;
      if (i9 >= i8)
        break label478;
      if (i4 == 0)
        break label336;
      if (i9 < i7)
        a(paramch, i9, paramInt1, i3, this.h);
      i15 = i6 + this.h[1];
      if (i9 != 0)
        break label471;
      i11 = this.h[0];
      if (i15 < n)
        break label393;
      i10 = i15;
    }
    while (true)
    {
      label207: int i12;
      label239: int i13;
      label265: int i14;
      if (((i4 != 0) && (i10 < n)) || ((i4 == 0) && ((i11 < m) || (n == 0))))
      {
        i12 = 1;
        if (i12 == 0)
          break label447;
        if ((i1 == 0) && ((i11 <= m) || (m <= 0)))
          break label413;
        i13 = m;
        if (i2 == 0)
          break label430;
        i14 = n;
        label274: f(i13, i14);
        return;
        i4 = 0;
        break;
        label289: if (i4 != 0)
        {
          this.h[0] = m;
          this.h[1] = this.i;
          break label114;
        }
        this.h[0] = this.i;
        this.h[1] = n;
        break label114;
        label336: if (i9 < i7)
        {
          int[] arrayOfInt = this.h;
          a(paramch, i9, i3, paramInt2, arrayOfInt);
        }
        i11 = i5 + this.h[0];
        if (i9 != 0)
          break label464;
      }
      label393: label413: label430: label447: label464: for (i15 = this.h[1]; ; i15 = i6)
      {
        if (i11 < m)
        {
          i9++;
          i6 = i15;
          i5 = i11;
          break;
          i12 = 0;
          break label239;
          i13 = i11 + (s() + u());
          break label265;
          i14 = i10 + (t() + v());
          break label274;
          super.a(paramch, paramcm, paramInt1, paramInt2);
          return;
        }
        i10 = i15;
        break label207;
      }
      label471: i11 = i5;
      break label196;
      label478: i10 = i6;
      i11 = i5;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.a.h
 * JD-Core Version:    0.6.0
 */