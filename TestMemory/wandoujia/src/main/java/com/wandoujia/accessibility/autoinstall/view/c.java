package com.wandoujia.accessibility.autoinstall.view;

import android.view.View;

final class c
  implements Runnable
{
  public final void run()
  {
    if (a.b() == null)
      return;
    a.b().getContentContainer().clearAnimation();
    a.b().getContentContainer().startAnimation(a.d());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.autoinstall.view.c
 * JD-Core Version:    0.6.0
 */