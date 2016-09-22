package com.wandoujia.clean.monitor;

import android.support.v4.app.b;
import com.wandoujia.clean.http.Config;
import com.wandoujia.clean.http.GarbageFetcher;
import java.util.TimerTask;

final class a extends TimerTask
{
  a(ScreenMonitor paramScreenMonitor)
  {
  }

  public final void run()
  {
    b.y("Background clean task begin.");
    Config.a(System.currentTimeMillis());
    ScreenMonitor.a(this.a);
    GarbageFetcher.a();
    b.y("Background clean task end.");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.monitor.a
 * JD-Core Version:    0.6.0
 */