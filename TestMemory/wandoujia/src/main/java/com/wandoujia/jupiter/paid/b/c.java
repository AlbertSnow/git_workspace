package com.wandoujia.jupiter.paid.b;

import android.content.Context;
import com.wandoujia.base.log.Log;
import com.wandoujia.jupiter.paid.model.RecommendAppInfo;
import com.wandoujia.p4.recommand.clean.CleanBroadcastReceiver;

final class c
{
  c(Context paramContext)
  {
  }

  public final void a(int paramInt, long paramLong)
  {
    RecommendAppInfo.get("cleaner", "notification");
    int i = com.wandoujia.jupiter.paid.a.c.a("unused_apk_count_threshold", 5, "recommend_clean_config");
    Log.i("Clean", paramInt + " packages, " + paramLong / 1000L + " KB, threshold: " + i, new Object[0]);
    if (paramInt >= i)
      CleanBroadcastReceiver.a.a(this.a, 2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.paid.b.c
 * JD-Core Version:    0.6.0
 */