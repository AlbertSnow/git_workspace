package com.wandoujia.p4.views;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class IndeterminateProgressView extends ImageView
{
  public IndeterminateProgressView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public IndeterminateProgressView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if ((getDrawable() != null) && ((getDrawable() instanceof AnimationDrawable)))
      ((AnimationDrawable)getDrawable()).start();
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((getDrawable() != null) && ((getDrawable() instanceof AnimationDrawable)))
      ((AnimationDrawable)getDrawable()).stop();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.IndeterminateProgressView
 * JD-Core Version:    0.6.0
 */