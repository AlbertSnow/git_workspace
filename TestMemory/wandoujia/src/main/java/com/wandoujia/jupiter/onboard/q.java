package com.wandoujia.jupiter.onboard;

import android.view.View;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;

final class q
  implements ValueAnimator.AnimatorUpdateListener
{
  q(StoryFragment paramStoryFragment)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    StoryFragment.b(this.a, ((Integer)paramValueAnimator.getAnimatedValue()).intValue());
    StoryFragment.f(this.a).setBackgroundColor(StoryFragment.e(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.q
 * JD-Core Version:    0.6.0
 */