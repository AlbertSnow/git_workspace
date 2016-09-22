package com.wandoujia.accessibility.autoinstall.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.ripple_framework.accessibility.R.dimen;
import com.wandoujia.ripple_framework.accessibility.R.layout;

public final class a
{
  private static AppAutoInstallTipsView a = (AppAutoInstallTipsView)android.support.v4.app.b.a(GlobalConfig.getAppContext(), R.layout.app_auto_install_tips);
  private static Handler b = new Handler(Looper.getMainLooper());
  private static Animation c;
  private static Animation d;
  private static boolean e = false;
  private static boolean f = true;
  private static Runnable g = new c();

  public static void a()
  {
    com.wandoujia.accessibility.a.a.b();
    if (!e)
    {
      android.support.v4.app.b.a(GlobalConfig.getAppContext(), a, false, 17, GlobalConfig.getAppContext().getResources().getDimensionPixelOffset(R.dimen.app_auto_install_tips_width), GlobalConfig.getAppContext().getResources().getDimensionPixelOffset(R.dimen.app_auto_install_tips_height));
      e = true;
      if (!f)
        break label153;
      AlphaAnimation localAlphaAnimation2 = new AlphaAnimation(0.0F, 1.0F);
      d = localAlphaAnimation2;
      localAlphaAnimation2.setDuration(0L);
      f = false;
    }
    while (true)
    {
      a.setNum(String.valueOf(com.wandoujia.accessibility.a.a.a()));
      b.removeCallbacks(g);
      b.postDelayed(g, 5000L);
      if (c == null)
      {
        AlphaAnimation localAlphaAnimation1 = new AlphaAnimation(1.0F, 0.0F);
        c = localAlphaAnimation1;
        localAlphaAnimation1.setDuration(500L);
        c.setAnimationListener(new b());
      }
      return;
      label153: a.getContentContainer().clearAnimation();
      a.getContentContainer().startAnimation(d);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.autoinstall.view.a
 * JD-Core Version:    0.6.0
 */