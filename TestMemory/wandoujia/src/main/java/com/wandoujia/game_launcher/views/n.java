package com.wandoujia.game_launcher.views;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class n
  implements Animation.AnimationListener
{
  n(l paraml, q paramq)
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
    l.a(this.b, (1.0F + l.a(this.b)) % 5.0F);
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    l.a(this.b, 0.0F);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.n
 * JD-Core Version:    0.6.0
 */