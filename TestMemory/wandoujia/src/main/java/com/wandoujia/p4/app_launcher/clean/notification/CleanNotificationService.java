package com.wandoujia.p4.app_launcher.clean.notification;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.MemoryUtil;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.logv3.toolkit.v;
import com.wandoujia.p4.app_launcher.activity.AppLauncherActivity;
import com.wandoujia.p4.app_launcher.activity.CleanPopupActivity;
import com.wandoujia.p4.utils.ShortcutUtil;
import com.wandoujia.ripple_framework.log.Logger.Module;

public class CleanNotificationService extends IntentService
{
  private Handler a;

  public CleanNotificationService()
  {
    super("AppLauncher_CleanNotificationService");
  }

  public void onCreate()
  {
    super.onCreate();
    this.a = new Handler(Looper.getMainLooper());
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    TaskEvent.Builder localBuilder = new TaskEvent.Builder().action(TaskEvent.Action.NOTIFICATION_CLICK).status(TaskEvent.Status.END);
    localBuilder.view_log_package(new ViewLogPackage.Builder().module(Logger.Module.NOTIFICATION.name().toLowerCase()).action(ViewLogPackage.Action.REDIRECT).element(ViewLogPackage.Element.NOTIFICATION).name("push_low_raw").build());
    v.b().a(localBuilder, new ExtraPackage.Builder());
    if (OemUtil.isOem())
    {
      Intent localIntent1 = new Intent(this, AppLauncherActivity.class);
      localIntent1.setFlags(268435456);
      startActivity(localIntent1);
    }
    long l1;
    long l2;
    do
    {
      do
        return;
      while (!"CLEAN_MEMORY".equals(paramIntent.getAction()));
      if (ShortcutUtil.a(this, GlobalConfig.getAppContext().getString(2131624289)))
      {
        Intent localIntent2 = new Intent(this, AppLauncherActivity.class);
        localIntent2.setFlags(268435456);
        startActivity(localIntent2);
        return;
      }
      l1 = MemoryUtil.getUsedMemory(GlobalConfig.getAppContext());
      l2 = MemoryUtil.getTotalMemory();
    }
    while (l2 <= 0L);
    int i = (int)(100L * l1 / l2);
    this.a.post(new c(l2, l1, i));
    Intent localIntent3 = new Intent(this, CleanPopupActivity.class);
    localIntent3.setFlags(268435456);
    startActivity(localIntent3);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.clean.notification.CleanNotificationService
 * JD-Core Version:    0.6.0
 */