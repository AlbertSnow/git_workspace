package com.wandoujia.jupiter.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.wandoujia.launcher_base.app_usage_stats.a.a;

public class SpeedUpService extends Service
{
  private static final int a = SpeedUpService.class.getName().hashCode();
  private HandlerThread b;
  private Handler c;
  private a d;
  private boolean e;
  private boolean f;
  private boolean g = false;

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
    this.b = new HandlerThread("speed_up_thread");
    this.b.start();
    this.c = new Handler(this.b.getLooper());
  }

  public void onDestroy()
  {
    this.b.quit();
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if ((paramIntent == null) || (paramIntent.getAction() == null));
    do
      return 1;
    while ((!"phoenix.intent.action.START_SPEEDUP_SERVICE".equalsIgnoreCase(paramIntent.getAction())) || (this.g) || (this.b == null) || (!this.b.isAlive()));
    this.c.postDelayed(new m(this, 0), 5000L);
    this.g = true;
    return 1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.service.SpeedUpService
 * JD-Core Version:    0.6.0
 */