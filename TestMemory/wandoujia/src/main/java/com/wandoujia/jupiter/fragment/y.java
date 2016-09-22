package com.wandoujia.jupiter.fragment;

import android.view.View;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.image.view.AsyncImageView;

final class y
  implements ValueAnimator.AnimatorUpdateListener
{
  y(View paramView, float paramFloat1, AsyncImageView paramAsyncImageView, int paramInt1, int paramInt2, float paramFloat2, float paramFloat3)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f1 = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    ViewHelper.setScaleY(this.a, this.b + f1 * (1.0F - this.b));
    ViewHelper.setTranslationX(this.c, this.d * (1.0F - f1));
    ViewHelper.setTranslationY(this.c, this.e * (1.0F - f1));
    ViewHelper.setScaleX(this.c, f1 * (1.0F - this.f) + this.f);
    ViewHelper.setScaleY(this.c, f1 * (1.0F - this.g) + this.g);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.y
 * JD-Core Version:    0.6.0
 */