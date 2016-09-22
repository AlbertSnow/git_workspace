package com.wandoujia.launcher_base.view.tips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.wandoujia.launcher_base.R.anim;
import com.wandoujia.launcher_base.R.id;

public class LoadingTipsView extends FrameLayout
{
  private Animation a;
  private ImageView b;

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
    this.a = AnimationUtils.loadAnimation(getContext(), R.anim.cycle_rotate);
    this.a.setInterpolator(new LinearInterpolator());
    this.b = ((ImageView)findViewById(R.id.loading_imageview));
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.tips.LoadingTipsView
 * JD-Core Version:    0.6.0
 */