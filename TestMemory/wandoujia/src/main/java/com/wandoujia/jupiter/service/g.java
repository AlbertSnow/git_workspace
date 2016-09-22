package com.wandoujia.jupiter.service;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.aw;
import com.wandoujia.base.services.AlarmService.Callback;
import com.wandoujia.base.services.AlarmService.ScheduleChecker;
import com.wandoujia.jupiter.notification.e;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.online_config.c;
import com.wandoujia.p4.app_launcher.activity.AppLauncherActivity;
import com.wandoujia.p4.app_launcher.c.a;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import java.util.Calendar;

public final class g
  implements AlarmService.ScheduleChecker
{
  public final void scheduleCheck(Context paramContext, AlarmService.Callback paramCallback)
  {
    c.a();
    int i;
    long l3;
    Object[] arrayOfObject2;
    if ((ConfigStorage.a("disk_clean_is_enable", true)) && (Config.ad() < 3L))
    {
      long l4 = System.currentTimeMillis();
      if (l4 - Config.ac() >= 604800000L)
      {
        Calendar localCalendar2 = Calendar.getInstance();
        localCalendar2.setTimeInMillis(l4);
        localCalendar2.get(10);
        if ((localCalendar2.get(10) >= 20) && (localCalendar2.get(10) <= 22))
        {
          i = 1;
          if (i != 0)
          {
            long l1 = a.a();
            long l2 = a.b();
            if (l2 != 0L)
            {
              float f = 100.0F * (float)l1 / (float)l2;
              l3 = l1 / 1024L / 1024L;
              c.a();
              if (f >= (float)c.n())
                break label462;
              arrayOfObject2 = new Object[1];
              arrayOfObject2[0] = Long.valueOf(c.n());
            }
          }
        }
      }
    }
    label462: Object[] arrayOfObject1;
    for (String str1 = String.format("%d%%", arrayOfObject2); ; str1 = String.format("%dM", arrayOfObject1))
    {
      Intent localIntent = new Intent(paramContext, AppLauncherActivity.class);
      localIntent.putExtra("type", "show_disk_clean_alert_dialog");
      localIntent.putExtra("value", str1);
      PendingIntent localPendingIntent = PendingIntent.getActivity(paramContext, 0, localIntent, 134217728);
      aw localaw = new aw(paramContext);
      String str2 = String.format(paramContext.getResources().getString(2131624628), new Object[] { str1 });
      String str3 = paramContext.getResources().getString(2131624627);
      localaw.a().c(str2).a(str2).b(str3).a(System.currentTimeMillis()).a(2130838369).a(localPendingIntent);
      e.a().a(1, localaw.b());
      TaskEvent.Builder localBuilder = new TaskEvent.Builder().action(TaskEvent.Action.PUSH).status(TaskEvent.Status.START).result(TaskEvent.Result.SUCCESS);
      localBuilder.view_log_package(new ViewLogPackage.Builder().module(Logger.Module.NOTIFICATION.name().toLowerCase()).action(ViewLogPackage.Action.REDIRECT).element(ViewLogPackage.Element.NOTIFICATION).name("push_al_no_enough_space").build());
      ExtraPackage.Builder localBuilder1 = new ExtraPackage.Builder();
      i.k().h().a(localBuilder, localBuilder1);
      Calendar localCalendar1 = Calendar.getInstance();
      localCalendar1.set(10, 20);
      localCalendar1.set(12, 0);
      localCalendar1.set(14, 0);
      Config.i(localCalendar1.getTimeInMillis());
      Config.j(1L + Config.ad());
      do
      {
        paramCallback.onCompleted();
        return;
        i = 0;
        break;
      }
      while (l3 >= c.o());
      arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Long.valueOf(c.o());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.service.g
 * JD-Core Version:    0.6.0
 */