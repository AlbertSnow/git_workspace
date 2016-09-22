package com.wandoujia.p4.app_launcher.switcher;

import android.database.ContentObserver;
import android.os.Handler;

final class l extends ContentObserver
{
  l(ScreenLightSwitcher paramScreenLightSwitcher, Handler paramHandler)
  {
    super(paramHandler);
  }

  public final void onChange(boolean paramBoolean)
  {
    super.onChange(paramBoolean);
    this.a.f();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.switcher.l
 * JD-Core Version:    0.6.0
 */