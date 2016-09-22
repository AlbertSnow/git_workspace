package com.wandoujia.jupiter.anim;

import android.support.v4.view.bg;
import android.view.View;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.base.utils.SystemUtil;

final class h
  implements ValueAnimator.AnimatorUpdateListener
{
  h(View paramView1, int paramInt, float paramFloat, j paramj, View paramView2)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    if (f < 0.5D)
    {
      if (SystemUtil.aboveApiLevel(12))
        this.a.setCameraDistance(15000.0F);
      ViewHelper.setRotationY(this.a, f * 180.0F * this.b);
      ViewHelper.setScaleY(this.a, 1.0F + f * (this.c - 1.0F));
      bg.b(this.a, f * (this.d.f - this.d.d));
      return;
    }
    if (SystemUtil.aboveApiLevel(12))
      this.e.setCameraDistance(15000.0F);
    ViewHelper.setAlpha(this.a, 0.0F);
    ViewHelper.setAlpha(this.e, 1.0F);
    ViewHelper.setRotationY(this.e, 180.0F * (f - 1.0F) * this.b);
    ViewHelper.setScaleY(this.e, (1.0F + f * (this.c - 1.0F)) / this.c);
    bg.b(this.e, (this.d.d - this.d.f) * (1.0F - f));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.anim.h
 * JD-Core Version:    0.6.0
 */