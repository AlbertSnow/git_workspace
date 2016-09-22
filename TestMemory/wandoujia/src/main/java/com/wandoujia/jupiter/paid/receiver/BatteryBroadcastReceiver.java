package com.wandoujia.jupiter.paid.receiver;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.preference.PreferenceManager;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.jupiter.notification.NotificationActionHandler;
import com.wandoujia.jupiter.paid.a.c;
import com.wandoujia.jupiter.paid.model.RecommendAppInfo;
import com.wandoujia.ripple_framework.Config;

public class BatteryBroadcastReceiver extends BroadcastReceiver
{
  private static final int a = "BatteryNotification".hashCode();
  private static final int[] b = { 20, 30, 40 };
  private static BatteryBroadcastReceiver c;
  private int d = 0;
  private RecommendAppInfo e;
  private boolean f = false;
  private Bitmap g;

  private static BatteryBroadcastReceiver a()
  {
    if (c == null)
      monitorenter;
    try
    {
      if (c == null)
        c = new BatteryBroadcastReceiver();
      return c;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static void a(Context paramContext)
  {
    BatteryBroadcastReceiver localBatteryBroadcastReceiver = a();
    localBatteryBroadcastReceiver.e = RecommendAppInfo.get("battery", "notification");
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.BATTERY_CHANGED");
    localIntentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
    localIntentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
    localIntentFilter.addAction("com.wandoujia.p4.ACTION_CLICK_SAVE_BATTERY_BUTTON");
    localIntentFilter.addAction("com.wandoujia.p4.ACTION_CLICK_BATTERY_NOTIFICATION");
    localIntentFilter.addAction("com.wandoujia.p4.ACTION_BATTERY_NOTIFICATION_DELETE");
    paramContext.registerReceiver(localBatteryBroadcastReceiver, localIntentFilter);
  }

  private void a(Context paramContext, int paramInt1, int paramInt2)
  {
    if ((!PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean("setting_enable_battery_notify", OemUtil.enableBatteryNotification())) || (!Config.e()) || (!OemUtil.isOemOrPaid()));
    a locala;
    do
    {
      do
      {
        do
        {
          return;
          this.e = RecommendAppInfo.get("battery", "notification");
        }
        while ((this.e == null) || (com.wandoujia.jupiter.paid.d.a.c(paramContext, this.e.packageName)));
        locala = new a(this, paramContext, paramInt1, paramInt2);
      }
      while (this.e == null);
      if (this.g == null)
        continue;
      locala.run();
      return;
    }
    while (this.f);
    this.f = true;
    com.wandoujia.jupiter.paid.d.a.a(this.e.iconUrl, new b(this, locala));
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = 0;
    int i1;
    String str;
    if (paramIntent.getAction().equals("android.intent.action.BATTERY_CHANGED"))
    {
      int j = paramIntent.getIntExtra("level", 0);
      int k = paramIntent.getIntExtra("scale", 100);
      int m = j * 100 / k;
      int n = paramIntent.getIntExtra("status", -1);
      if ((n == 2) || (n == 5))
      {
        i1 = 1;
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(this.d);
        arrayOfObject[1] = Integer.valueOf(m);
        if (i1 == 0)
          break label200;
        str = "";
        label106: arrayOfObject[2] = str;
        Log.d("BatteryBroadcastReceiver", "%d%% -> %d%%, %scharging", arrayOfObject);
        if ((c.a("low_battery_notification_enabled", true, "recommend_battery_config")) && (i1 == 0) && (m < this.d) && (m > 10))
        {
          int[] arrayOfInt = b;
          label161: if (i < 3)
          {
            int i2 = arrayOfInt[i];
            if (m >= i2)
              break label208;
            a(paramContext, 1, i2);
          }
        }
        this.d = m;
      }
    }
    label200: label208: 
    do
    {
      do
      {
        do
        {
          return;
          i1 = 0;
          break;
          str = "not ";
          break label106;
          i++;
          break label161;
          if (!paramIntent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED"))
            break label259;
          Log.d("BatteryBroadcastReceiver", "Power connected", new Object[0]);
        }
        while (!c.a("charging_notification_enabled", true, "recommend_battery_config"));
        a(paramContext, 2, 0);
        return;
        if (!paramIntent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED"))
          break label304;
        Log.d("BatteryBroadcastReceiver", "Power disconnected", new Object[0]);
      }
      while (!c.a("discharging_notification_enabled", true, "recommend_battery_config"));
      a(paramContext, 3, 0);
      return;
      if (paramIntent.getAction().equals("com.wandoujia.p4.ACTION_BATTERY_NOTIFICATION_DELETE"))
      {
        com.wandoujia.jupiter.paid.d.a.a(paramContext, 0, "com.wandoujia.p4.recommand.battery");
        return;
      }
      if (!paramIntent.getAction().equals("com.wandoujia.p4.ACTION_CLICK_SAVE_BATTERY_BUTTON"))
        continue;
      Log.d("BatteryBroadcastReceiver", "Loop Broadcast", new Object[0]);
      ((NotificationManager)paramContext.getSystemService("notification")).cancel(a);
      NotificationActionHandler.a(paramContext);
      com.wandoujia.jupiter.paid.d.a.a(paramContext, 0, "com.wandoujia.p4.recommand.battery");
      com.wandoujia.jupiter.paid.d.a.a(RecommendAppInfo.get("battery", "notification"));
      return;
    }
    while (!paramIntent.getAction().equals("com.wandoujia.p4.ACTION_CLICK_BATTERY_NOTIFICATION"));
    label259: label304: Log.d("BatteryBroadcastReceiver", "Loop Broadcast", new Object[0]);
    com.wandoujia.jupiter.paid.d.a.a(paramContext, 0, "com.wandoujia.p4.recommand.battery");
    com.wandoujia.jupiter.paid.d.a.a(RecommendAppInfo.get("battery", "notification"));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.paid.receiver.BatteryBroadcastReceiver
 * JD-Core Version:    0.6.0
 */