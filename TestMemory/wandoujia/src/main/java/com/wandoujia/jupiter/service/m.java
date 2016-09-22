package com.wandoujia.jupiter.service;

import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.wandoujia.launcher.launcher.b.c;
import com.wandoujia.launcher_base.app_usage_stats.a.a;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.p4.configs.Config;

final class m
  implements Runnable
{
  private m(SpeedUpService paramSpeedUpService)
  {
  }

  public final void run()
  {
    boolean bool = true;
    a locala = b.L();
    if (locala != null)
    {
      if (SpeedUpService.a(this.a) == null)
        break label256;
      if (TextUtils.equals(SpeedUpService.a(this.a).a(), locala.a()))
        break label217;
      if ((SpeedUpService.b(this.a)) && (SpeedUpService.c(this.a)))
      {
        SpeedUpService.a(this.a, SpeedUpService.a(this.a));
        Config.l(System.currentTimeMillis());
        b.a(TaskEvent.Status.END, TaskEvent.Result.SUCCESS, TaskEvent.Action.OPEN, b.a("speed_up", ViewLogPackage.Element.NOTIFICATION, ViewLogPackage.Action.DOWNLOAD, "speedup_notification"), "");
        this.a.stopSelf();
        return;
      }
      SpeedUpService.b(this.a, locala);
      SpeedUpService.a(this.a, c.a().a(locala.a()));
      SpeedUpService localSpeedUpService3 = this.a;
      if (SpeedUpService.a() < 80)
        break label212;
      SpeedUpService.b(localSpeedUpService3, bool);
    }
    label163: label212: label217: 
    do
    {
      if ((SpeedUpService.d(this.a) == null) || (!SpeedUpService.d(this.a).isAlive()))
        break label305;
      SpeedUpService.e(this.a).postDelayed(new m(this.a), 5000L);
      return;
      bool = false;
      break;
    }
    while (SpeedUpService.c(this.a));
    SpeedUpService localSpeedUpService2 = this.a;
    if (SpeedUpService.a() >= 80);
    while (true)
    {
      SpeedUpService.b(localSpeedUpService2, bool);
      break;
      bool = false;
    }
    label256: SpeedUpService.b(this.a, locala);
    SpeedUpService.a(this.a, c.a().a(locala.a()));
    SpeedUpService localSpeedUpService1 = this.a;
    if (SpeedUpService.a() >= 80);
    while (true)
    {
      SpeedUpService.b(localSpeedUpService1, bool);
      break label163;
      label305: break;
      bool = false;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.service.m
 * JD-Core Version:    0.6.0
 */