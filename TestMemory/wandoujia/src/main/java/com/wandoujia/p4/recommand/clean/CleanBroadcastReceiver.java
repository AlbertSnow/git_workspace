package com.wandoujia.p4.recommand.clean;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.MemoryUtil;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.jupiter.notification.NotificationActionHandler;
import com.wandoujia.jupiter.paid.a.c;
import com.wandoujia.jupiter.paid.model.RecommendAppInfo;
import com.wandoujia.ripple_framework.Config;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CleanBroadcastReceiver extends BroadcastReceiver
{
  public static final CleanBroadcastReceiver a;
  private static final int b = CleanBroadcastReceiver.class.getName().hashCode();
  private boolean c = false;
  private Bitmap d;
  private RecommendAppInfo e;

  static
  {
    a = new CleanBroadcastReceiver();
  }

  public static void a(Context paramContext)
  {
    Log.d("CleanBroadcastReceiver", "add receiver", new Object[0]);
    CleanBroadcastReceiver localCleanBroadcastReceiver = a;
    localCleanBroadcastReceiver.e = RecommendAppInfo.get("cleaner", "notification");
    IntentFilter localIntentFilter1 = new IntentFilter();
    localIntentFilter1.addAction("com.wandoujia.p4.recommand.clean.ACTION_CLICK_CLEAN_NOTIFICATION_BUTTON");
    localIntentFilter1.addAction("com.wandoujia.p4.recommand.clean.ACTION_CLICK_CLEAN_NOTIFICATION");
    localIntentFilter1.addAction("com.wandoujia.p4.recommand.clean.ACTION_DELETE_NOTIFICATION");
    paramContext.registerReceiver(localCleanBroadcastReceiver, localIntentFilter1);
    IntentFilter localIntentFilter2 = new IntentFilter();
    localIntentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
    localIntentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
    localIntentFilter2.addDataScheme("package");
    paramContext.registerReceiver(localCleanBroadcastReceiver, localIntentFilter2);
    a(paramContext, true);
  }

  private static void a(Context paramContext, boolean paramBoolean)
  {
    long l1 = 0L;
    long l2 = c.b("background_app_check_interval", "recommend_clean_config");
    if (l2 == l1)
    {
      Log.d("CleanBroadcastReceiver", "Online config not valid.", new Object[0]);
      Log.d("CleanBroadcastReceiver", "Start check online config.", new Object[0]);
      AlarmManager localAlarmManager2 = (AlarmManager)paramContext.getSystemService("alarm");
      Intent localIntent2 = new Intent(paramContext, CleanBroadcastReceiver.class);
      localIntent2.setAction("com.wandoujia.p4.recommand.clean.ACTION_CHECK_ONLINE_CONFIG");
      PendingIntent localPendingIntent2 = PendingIntent.getBroadcast(paramContext, 0, localIntent2, 0);
      localAlarmManager2.set(3, 10000L + SystemClock.elapsedRealtime(), localPendingIntent2);
      return;
    }
    if (!paramBoolean)
      l1 = l2;
    AlarmManager localAlarmManager1 = (AlarmManager)paramContext.getSystemService("alarm");
    Intent localIntent1 = new Intent(paramContext, CleanBroadcastReceiver.class);
    localIntent1.setAction("com.wandoujia.p4.recommand.clean.ACTION_CHECK_BACKGROUND_APP");
    PendingIntent localPendingIntent1 = PendingIntent.getBroadcast(paramContext, 0, localIntent1, 268435456);
    localAlarmManager1.setInexactRepeating(3, l1 + SystemClock.elapsedRealtime(), l2, localPendingIntent1);
    Log.d("CleanBroadcastReceiver", "start or update timer", new Object[0]);
  }

  public final void a(Context paramContext, int paramInt)
  {
    if ((!PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean("setting_enable_clean_notify", OemUtil.enableCleanNotification())) || (!Config.e()));
    while (true)
    {
      return;
      this.e = RecommendAppInfo.get("cleaner", "notification");
      if (this.e == null)
        continue;
      try
      {
        boolean bool = com.wandoujia.jupiter.paid.d.a.c(paramContext, this.e.packageName);
        if (bool)
          continue;
        a locala = new a(this, paramContext, paramInt);
        if (this.e == null)
          continue;
        if (this.d != null)
        {
          locala.run();
          return;
        }
        if (this.c)
          continue;
        this.c = true;
        com.wandoujia.jupiter.paid.d.a.a(this.e.iconUrl, new b(this, locala));
        return;
      }
      catch (Exception localException)
      {
      }
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str1 = paramIntent.getAction();
    if (str1.equals("com.wandoujia.p4.recommand.clean.ACTION_CHECK_ONLINE_CONFIG"))
    {
      Log.d("CleanBroadcastReceiver", "Check online config", new Object[0]);
      a(paramContext, true);
    }
    label208: 
    do
    {
      do
      {
        while (true)
        {
          return;
          if (str1.equals("com.wandoujia.p4.recommand.clean.ACTION_CHECK_BACKGROUND_APP"))
          {
            Log.d("CleanBroadcastReceiver", "Check background app", new Object[0]);
            if (!c.a("background_app_notification_enabled", false, "recommend_clean_config"))
              continue;
            HashSet localHashSet = new HashSet();
            List localList = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
            if (localList != null)
            {
              Iterator localIterator = localList.iterator();
              while (localIterator.hasNext())
              {
                ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
                if ((localRunningAppProcessInfo == null) || (localRunningAppProcessInfo.pkgList == null))
                  continue;
                String[] arrayOfString = localRunningAppProcessInfo.pkgList;
                if (localRunningAppProcessInfo.importance < 300)
                  continue;
                int k = arrayOfString.length;
                int m = 0;
                int n = 1;
                while (m < k)
                {
                  if (!MemoryUtil.isAppKillable(paramContext, arrayOfString[m]))
                    n = 0;
                  m++;
                }
                if (n == 0)
                  continue;
                int i1 = arrayOfString.length;
                int i2 = 0;
                String str2;
                if (i2 < i1)
                {
                  str2 = arrayOfString[i2];
                  PackageInfo localPackageInfo = AppManager.a(paramContext, str2, 0);
                  if ((localPackageInfo != null) && (localPackageInfo.applicationInfo != null))
                    if ((0x1 & localPackageInfo.applicationInfo.flags) != 1)
                      break label282;
                }
                for (int i3 = 1; ; i3 = 0)
                {
                  if (i3 == 0)
                    localHashSet.add(str2);
                  i2++;
                  break label208;
                  break;
                }
              }
            }
            int i = localHashSet.size();
            RecommendAppInfo.get("cleaner", "notification");
            int j = c.a("background_app_count_threshold", 5, "recommend_clean_config");
            Log.i("Clean", i + " background apps, threshold: " + j, new Object[0]);
            if (i < j)
              continue;
            a.a(paramContext, 1);
            return;
          }
          if (str1.equals("android.intent.action.PACKAGE_ADDED"))
          {
            Log.d("CleanBroadcastReceiver", "App added", new Object[0]);
            if (!c.a("unused_apk_notification_enabled", false, "recommend_clean_config"))
              continue;
            com.wandoujia.jupiter.paid.b.a.a(paramContext);
            return;
          }
          if (!str1.equals("android.intent.action.PACKAGE_REMOVED"))
            break;
          if (paramIntent.getBooleanExtra("android.intent.extra.REPLACING", false))
            continue;
          Log.d("CleanBroadcastReceiver", "App removed", new Object[0]);
          if (!c.a("uninstall_app_notification_enabled", false, "recommend_clean_config"))
            continue;
          a(paramContext, 3);
          return;
        }
        if (str1.equals("com.wandoujia.p4.recommand.clean.ACTION_CLICK_CLEAN_NOTIFICATION"))
        {
          Log.d("CleanBroadcastReceiver", "Notification clicked", new Object[0]);
          com.wandoujia.jupiter.paid.d.a.a(paramContext, 0, "com.wandoujia.p4.recommand.clean");
          com.wandoujia.jupiter.paid.d.a.a(RecommendAppInfo.get("cleaner", "notification"));
          return;
        }
        if (!str1.equals("com.wandoujia.p4.recommand.clean.ACTION_CLICK_CLEAN_NOTIFICATION_BUTTON"))
          continue;
        Log.d("CleanBroadcastReceiver", "Notification button clicked", new Object[0]);
        com.wandoujia.jupiter.paid.d.a.a(paramContext, 0, "com.wandoujia.p4.recommand.clean");
        ((NotificationManager)paramContext.getSystemService("notification")).cancel(b);
        NotificationActionHandler.a(paramContext);
        com.wandoujia.jupiter.paid.d.a.a(RecommendAppInfo.get("cleaner", "notification"));
        return;
      }
      while (!paramIntent.getAction().equals("com.wandoujia.p4.recommand.clean.ACTION_DELETE_NOTIFICATION"));
      Log.d("CleanBroadcastReceiver", "Notification deleted", new Object[0]);
      com.wandoujia.jupiter.paid.d.a.a(paramContext, 0, "com.wandoujia.p4.recommand.clean");
    }
    while (paramIntent.getIntExtra("com.wandoujia.p4.recommand.clean.EXTRA_NOTIFICATION_TYPE", 0) != 1);
    label282: Log.d("CleanBroadcastReceiver", "Reset background app detect timer", new Object[0]);
    Log.d("CleanBroadcastReceiver", "Cancel timer", new Object[0]);
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    Intent localIntent = new Intent(paramContext, CleanBroadcastReceiver.class);
    localIntent.setAction("com.wandoujia.p4.recommand.clean.ACTION_CHECK_BACKGROUND_APP");
    localAlarmManager.cancel(PendingIntent.getBroadcast(paramContext, 0, localIntent, 0));
    a(paramContext, false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.recommand.clean.CleanBroadcastReceiver
 * JD-Core Version:    0.6.0
 */