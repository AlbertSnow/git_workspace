package com.wandoujia.accessibility.autoinstall.view;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.wandoujia.base.config.GlobalConfig;

final class b
  implements Animation.AnimationListener
{
  public final void onAnimationEnd(Animation paramAnimation)
  {
    android.support.v4.app.b.a(GlobalConfig.getAppContext(), a.b());
    a.c();
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.autoinstall.view.b
 * JD-Core Version:    0.6.0
 */