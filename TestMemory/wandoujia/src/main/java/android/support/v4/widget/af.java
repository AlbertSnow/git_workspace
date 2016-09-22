package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class af
  implements Animation.AnimationListener
{
  af(ad paramad, ah paramah)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
    this.a.l();
    this.a.b();
    this.a.b(this.a.i());
    if (this.b.a)
    {
      this.b.a = false;
      paramAnimation.setDuration(1332L);
      this.a.a(false);
      return;
    }
    ad.a(this.b, (1.0F + ad.a(this.b)) % 5.0F);
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    ad.a(this.b, 0.0F);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.af
 * JD-Core Version:    0.6.0
 */