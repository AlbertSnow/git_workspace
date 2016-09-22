package com.wandoujia.jupiter.homepage.splashwindow;

import android.os.CountDownTimer;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

final class a extends CountDownTimer
{
  a(SplashView paramSplashView)
  {
    super(4000L, 1000L);
  }

  public final void onFinish()
  {
    SplashView.a(this.a, this.a.getScrollY());
    SplashView.a(this.a);
    if (SplashView.b(this.a) != null)
      i.k().h().a(Logger.Module.SPLASH, ViewLogPackage.Action.WIPE, "splash_auto_splash_up", Long.valueOf(1L), SplashView.b(this.a).a());
  }

  public final void onTick(long paramLong)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.splashwindow.a
 * JD-Core Version:    0.6.0
 */