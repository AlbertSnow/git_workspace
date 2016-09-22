package com.wandoujia.p4.tips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class LoadingTipsView extends FrameLayout
{
  private Animation a;
  private ImageView b;

  public LoadingTipsView(Context paramContext)
  {
    super(paramContext);
  }

  public LoadingTipsView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public LoadingTipsView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void a()
  {
    if (isShown())
    {
      this.b.startAnimation(this.a);
      return;
    }
    this.b.clearAnimation();
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    a();
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    clearAnimation();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = AnimationUtils.loadAnimation(getContext(), 2130968588);
    this.a.setInterpolator(new LinearInterpolator());
    this.b = ((ImageView)findViewById(2131493869));
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.tips.LoadingTipsView
 * JD-Core Version:    0.6.0
 */