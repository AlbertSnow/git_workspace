package com.wandoujia.p4.account.manager;

import android.content.Context;
import android.text.TextUtils;
import com.wandoujia.base.services.AlarmService.Callback;
import com.wandoujia.base.services.AlarmService.ScheduleChecker;
import com.wandoujia.base.utils.NetworkUtil;
import java.util.Random;

public final class a
  implements AlarmService.ScheduleChecker
{
  private static final Long a = Long.valueOf(86400000L);

  public final void scheduleCheck(Context paramContext, AlarmService.Callback paramCallback)
  {
    int i;
    if (!TextUtils.isEmpty(com.wandoujia.account.a.i()))
      i = 1;
    while (i != 0)
    {
      long l = com.wandoujia.account.a.A();
      int j = new Random().nextInt(1440000000);
      if (System.currentTimeMillis() - a.longValue() - j < l)
      {
        return;
        i = 0;
        continue;
      }
      if (NetworkUtil.isNetworkConnected(com.wandoujia.p4.a.a()))
      {
        com.wandoujia.account.a.B();
        d.a().a(new b(paramCallback));
        return;
      }
      paramCallback.onCompleted();
      return;
    }
    paramCallback.onCompleted();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.manager.a
 * JD-Core Version:    0.6.0
 */