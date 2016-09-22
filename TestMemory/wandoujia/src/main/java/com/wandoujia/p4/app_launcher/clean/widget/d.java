package com.wandoujia.p4.app_launcher.clean.widget;

import android.os.Handler;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;
import com.wandoujia.jupiter.JupiterApplication;

final class d
  implements ValueAnimator.AnimatorUpdateListener
{
  d(c paramc)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    b.a(this.a.a, Math.max(((Integer)paramValueAnimator.getAnimatedValue()).intValue(), b.a(this.a.a)));
    JupiterApplication.a().post(new e(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.clean.widget.d
 * JD-Core Version:    0.6.0
 */