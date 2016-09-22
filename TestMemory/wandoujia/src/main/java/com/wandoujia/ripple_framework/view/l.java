package com.wandoujia.ripple_framework.view;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class l
  implements Animation.AnimationListener
{
  l(j paramj, o paramo)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
    this.a.k();
    this.a.b();
    this.a.b(this.a.h());
    if (this.b.a)
    {
      this.b.a = false;
      paramAnimation.setDuration(1333L);
      this.a.a(false);
      return;
    }
    j.a(this.b, (1.0F + j.a(this.b)) % 5.0F);
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    j.a(this.b, 0.0F);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.l
 * JD-Core Version:    0.6.0
 */