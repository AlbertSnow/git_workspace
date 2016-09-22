package com.wandoujia.accessibility.hibernation.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import com.wandoujia.ripple_framework.accessibility.R.styleable;

class FlowLayout$LayoutParams extends ViewGroup.LayoutParams
{
  private int a;
  private int b;
  private int c = -1;
  private int d = -1;
  private boolean e = false;

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
      this.c = localTypedArray.getDimensionPixelSize(R.styleable.FlowLayout_LayoutParams_layout_horizontalSpacing, -1);
      this.d = localTypedArray.getDimensionPixelSize(R.styleable.FlowLayout_LayoutParams_layout_verticalSpacing, -1);
      this.e = localTypedArray.getBoolean(R.styleable.FlowLayout_LayoutParams_layout_newLine, false);
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
    this.a = paramInt1;
    this.b = paramInt2;
  }

  public final boolean a()
  {
    return this.c != -1;
  }

  public final boolean b()
  {
    return this.d != -1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.view.FlowLayout.LayoutParams
 * JD-Core Version:    0.6.0
 */