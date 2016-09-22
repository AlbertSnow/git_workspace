package com.wandoujia.clean.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.wandoujia.clean.http.Config;
import com.wandoujia.clean.http.GarbageFetcher;
import com.wandoujia.clean.reporter.PeriodReporter;
import java.util.Timer;

public class ScreenMonitor extends BroadcastReceiver
{
  private GarbageFetcher a;
  private Timer b;

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("off".equalsIgnoreCase(Config.a("xibaibai_clean_switcher")));
    do
      while (true)
      {
        return;
        long l = Config.e();
        if (System.currentTimeMillis() - l < 43200000L)
          continue;
        PeriodReporter.a();
        if (!"android.intent.action.SCREEN_ON".equals(paramIntent.getAction()))
          break;
        if (this.b == null)
          continue;
        this.b.cancel();
        this.b = null;
        return;
      }
    while (!"android.intent.action.SCREEN_OFF".equals(paramIntent.getAction()));
    if (this.b == null)
      this.b = new Timer();
    this.b.schedule(new a(this), 15000L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.monitor.ScreenMonitor
 * JD-Core Version:    0.6.0
 */