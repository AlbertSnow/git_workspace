package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class LinearLayoutCompat$LayoutParams extends ViewGroup.MarginLayoutParams
{
  public float g;
  public int h = -1;

  public LinearLayoutCompat$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.g = 0.0F;
  }

  public LinearLayoutCompat$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.LinearLayoutCompat_Layout);
    this.g = localTypedArray.getFloat(R.styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
    this.h = localTypedArray.getInt(R.styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
    localTypedArray.recycle();
  }

  public LinearLayoutCompat$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.LinearLayoutCompat.LayoutParams
 * JD-Core Version:    0.6.0
 */