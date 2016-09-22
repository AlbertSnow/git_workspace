package com.wandoujia.jupiter.service;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.services.AlarmService.Callback;
import com.wandoujia.base.services.AlarmService.ScheduleChecker;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.online_config.c;
import com.wandoujia.p4.configs.Config;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class h
  implements AlarmService.ScheduleChecker
{
  private Handler a;
  private List<String> b;
  private long c = 0L;
  private String d;
  private String e;

  public final void scheduleCheck(Context paramContext, AlarmService.Callback paramCallback)
  {
    c.a();
    int i;
    Context localContext;
    if (!ConfigStorage.a("enable_mm_clean", false))
    {
      i = 0;
      if (i != 0)
      {
        int j = Config.V();
        localContext = JupiterApplication.d().getApplicationContext();
        switch (j)
        {
        default:
          this.d = localContext.getString(2131625084);
          this.e = localContext.getString(2131625081);
        case 0:
        case 1:
        case 2:
        }
      }
    }
    while (true)
    {
      if (this.a == null)
      {
        HandlerThread localHandlerThread = new HandlerThread("taskThread");
        localHandlerThread.start();
        this.a = new Handler(localHandlerThread.getLooper());
      }
      if (this.b == null)
        this.b = new ArrayList();
      this.b.clear();
      List localList = this.b;
      String str = Environment.getExternalStorageDirectory().getAbsolutePath();
      localList.add(str + "/tencent/MicroMsg/");
      this.c = 0L;
      this.a.post(new j(this));
      Config.g(System.currentTimeMillis());
      Config.X();
      paramCallback.onCompleted();
      return;
      AppManager localAppManager = (AppManager)com.wandoujia.jupiter.j.a().a("app");
      if ((localAppManager.h("com.wandoujia.ymir")) || (!localAppManager.h("com.tencent.mm")))
      {
        i = 0;
        break;
      }
      long l1 = Config.U();
      if (System.currentTimeMillis() - l1 < 86400000L)
      {
        i = 0;
        break;
      }
      if (Config.V() >= 3)
      {
        c.a();
        long l2 = ConfigStorage.a("mm_clean_min_duration", 30L);
        if ((System.currentTimeMillis() - l1) / 86400000L < l2)
        {
          i = 0;
          break;
        }
        Config.W();
      }
      i = 1;
      break;
      this.d = localContext.getString(2131625084);
      this.e = localContext.getString(2131625081);
      continue;
      this.d = localContext.getString(2131625085);
      this.e = localContext.getString(2131625082);
      continue;
      this.d = localContext.getString(2131625086);
      this.e = localContext.getString(2131625083);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.service.h
 * JD-Core Version:    0.6.0
 */