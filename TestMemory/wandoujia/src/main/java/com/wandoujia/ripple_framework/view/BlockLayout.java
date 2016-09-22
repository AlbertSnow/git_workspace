package com.wandoujia.ripple_framework.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.wandoujia.ripple_framework.R.styleable;

public class BlockLayout extends ViewGroup
{
  static
  {
    new d().a(new b());
    new d().a(new b());
    new d().a(new b()).a(new b());
    new d().a(new b());
    new d().a(new b()).a(new b()).a(new b());
    new d().a(new b()).a(new b());
  }

  public BlockLayout(Context paramContext)
  {
    super(paramContext);
  }

  public BlockLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.BlockLayout, 0, 0);
    localTypedArray.getDimensionPixelOffset(R.styleable.BlockLayout_spacing, 0);
    localTypedArray.recycle();
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof c;
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new c();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new c();
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new c();
  }

  protected void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    getChildCount();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    getChildCount();
    setMeasuredDimension(i, 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.BlockLayout
 * JD-Core Version:    0.6.0
 */