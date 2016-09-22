package com.wandoujia.logv3.toolkit;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateUtils;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.services.AlarmService.Callback;
import com.wandoujia.base.services.AlarmService.ScheduleChecker;

public final class e
  implements AlarmService.ScheduleChecker
{
  private g a;

  public e(g paramg)
  {
    this.a = paramg;
  }

  private static void a(Context paramContext, long paramLong)
  {
    paramContext.getSharedPreferences(paramContext.getPackageName(), 0).edit().putLong("today_active_count", paramLong).commit();
  }

  private static long b(Context paramContext)
  {
    return paramContext.getSharedPreferences(paramContext.getPackageName(), 0).getLong("today_active_count", 0L);
  }

  public final boolean a(Context paramContext)
  {
    long l1 = paramContext.getSharedPreferences(paramContext.getPackageName(), 0).getLong("last_active_time", 0L);
    int i;
    if (!DateUtils.isToday(l1))
    {
      a(paramContext, 0L);
      i = 1;
    }
    while (i == 0)
    {
      return false;
      if (b(paramContext) < 10L)
      {
        i = 1;
        continue;
      }
      long l2 = System.currentTimeMillis() - l1;
      if (l2 < 0L)
      {
        Log.w("Active", "The time has been changed, duration is " + l2, new Object[0]);
        i = 1;
        continue;
      }
      if (l2 > 39600000L)
      {
        i = 1;
        continue;
      }
      i = 0;
    }
    this.a.a();
    paramContext.getSharedPreferences(paramContext.getPackageName(), 0).edit().putLong("last_active_time", System.currentTimeMillis()).commit();
    a(paramContext, 1L + b(paramContext));
    return true;
  }

  public final void scheduleCheck(Context paramContext, AlarmService.Callback paramCallback)
  {
    if (!a(paramContext))
    {
      paramCallback.onCompleted();
      return;
    }
    new Handler(Looper.getMainLooper()).postDelayed(new f(paramCallback), 15000L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.e
 * JD-Core Version:    0.6.0
 */