package com.wandoujia.p4.app.upgrade;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.wandoujia.p4.configs.Config;

final class d
  implements Runnable
{
  d(boolean paramBoolean)
  {
  }

  public final void run()
  {
    AlarmManager localAlarmManager = (AlarmManager)a.d().getSystemService("alarm");
    Intent localIntent = new Intent("phoenix.intent.action.APP_CHECK_UPGRADE");
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(a.d(), 0, localIntent, 134217728);
    long l;
    if (this.a)
      l = 600000L;
    while (true)
    {
      localAlarmManager.setRepeating(1, l + Config.b(), l, localPendingIntent);
      return;
      l = 21600000L;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.upgrade.d
 * JD-Core Version:    0.6.0
 */