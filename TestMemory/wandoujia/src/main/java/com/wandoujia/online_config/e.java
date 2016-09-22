package com.wandoujia.online_config;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.wandoujia.base.config.GlobalConfig;
import java.util.Calendar;
import java.util.Random;

final class e
  implements Runnable
{
  public final void run()
  {
    Intent localIntent = new Intent("launcher.intent.action.CHECK_ONLINE_CONFIG");
    if (PendingIntent.getBroadcast(GlobalConfig.getAppContext(), 0, localIntent, 536870912) == null)
    {
      PendingIntent localPendingIntent = PendingIntent.getBroadcast(GlobalConfig.getAppContext(), 0, localIntent, 1073741824);
      Calendar localCalendar = Calendar.getInstance();
      localCalendar.add(6, 1);
      localCalendar.set(11, 15);
      localCalendar.set(12, 0);
      localCalendar.set(13, 0);
      localCalendar.set(14, 0);
      long l = new Random().nextInt(25200000);
      ((AlarmManager)GlobalConfig.getAppContext().getSystemService("alarm")).set(0, l + localCalendar.getTimeInMillis(), localPendingIntent);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.online_config.e
 * JD-Core Version:    0.6.0
 */