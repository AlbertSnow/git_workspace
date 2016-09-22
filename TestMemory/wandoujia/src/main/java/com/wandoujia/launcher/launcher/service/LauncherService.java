package com.wandoujia.launcher.launcher.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.app.d;

public class LauncherService extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (paramIntent == null);
    do
      return 1;
    while ((paramIntent == null) || (paramIntent.getAction() == null));
    if ("launcher.intent.action.CREATE_SHORTCUT".equals(paramIntent.getAction()))
    {
      if (paramIntent.getBooleanExtra("launcher.intent.extra.CREATE_ALWARYS", false))
        d.d(false);
      com.wandoujia.launcher.e.a.a(new a(this));
      return 1;
    }
    "launcher.intent.action.LAUNCH_GL".equals(paramIntent.getAction());
    return 1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.service.LauncherService
 * JD-Core Version:    0.6.0
 */