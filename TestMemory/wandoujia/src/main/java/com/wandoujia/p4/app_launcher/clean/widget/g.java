package com.wandoujia.p4.app_launcher.clean.widget;

import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;
import java.lang.ref.WeakReference;

final class g
  implements ValueAnimator.AnimatorUpdateListener
{
  g(f paramf)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    b.a(this.a.a, Math.max(((Integer)paramValueAnimator.getAnimatedValue()).intValue(), b.a(this.a.a)));
    if (b.e(this.a.a).get() != null)
      ((i)b.e(this.a.a).get()).a(b.a(this.a.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.clean.widget.g
 * JD-Core Version:    0.6.0
 */