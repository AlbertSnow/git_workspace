package com.wandoujia.jupiter.homepage.splashwindow;

import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;

final class i
  implements ValueAnimator.AnimatorUpdateListener
{
  i(h paramh, int paramInt)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
    if (i == this.a)
      SplashView.j(this.b.a);
    while (true)
    {
      this.b.a.scrollTo(0, i);
      return;
      SplashView.d(this.b.a, -i);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.splashwindow.i
 * JD-Core Version:    0.6.0
 */