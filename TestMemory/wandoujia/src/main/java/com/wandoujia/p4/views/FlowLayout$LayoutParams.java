package com.wandoujia.p4.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import com.wandoujia.phoenix2.R.styleable;

public class FlowLayout$LayoutParams extends ViewGroup.LayoutParams
{
  private static int a = -1;
  private int b;
  private int c;
  private int d = a;
  private int e = a;
  private boolean f = false;

  public FlowLayout$LayoutParams()
  {
    super(-2, -2);
  }

  public FlowLayout$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.FlowLayout_LayoutParams);
    try
    {
      this.d = localTypedArray.getDimensionPixelSize(2, a);
      this.e = localTypedArray.getDimensionPixelSize(3, a);
      this.f = localTypedArray.getBoolean(1, false);
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
    throw localObject;
  }

  public FlowLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramInt2;
  }

  public final boolean a()
  {
    return this.d != a;
  }

  public final boolean b()
  {
    return this.e != a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.FlowLayout.LayoutParams
 * JD-Core Version:    0.6.0
 */