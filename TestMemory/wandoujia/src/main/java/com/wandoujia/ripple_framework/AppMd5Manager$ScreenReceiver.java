package com.wandoujia.ripple_framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Timer;

final class AppMd5Manager$ScreenReceiver extends BroadcastReceiver
{
  private Timer b;
  private Thread c;
  private byte[] d = new byte[0];

  private AppMd5Manager$ScreenReceiver(AppMd5Manager paramAppMd5Manager)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    synchronized (this.d)
    {
      if ("android.intent.action.SCREEN_OFF".equals(paramIntent.getAction()))
        if (this.b == null)
        {
          this.b = new Timer();
          this.b.schedule(new g(this), 30000L);
        }
      do
      {
        do
          return;
        while (!"android.intent.action.SCREEN_ON".equals(paramIntent.getAction()));
        if (this.b == null)
          continue;
        this.b.cancel();
        this.b = null;
      }
      while (this.c == null);
      this.c.interrupt();
      this.c = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.AppMd5Manager.ScreenReceiver
 * JD-Core Version:    0.6.0
 */