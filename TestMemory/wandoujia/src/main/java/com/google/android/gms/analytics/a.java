package com.google.android.gms.analytics;

import android.os.Handler;
import com.google.android.gms.analytics.internal.ay;
import com.google.android.gms.analytics.internal.g;

final class a
  implements ay
{
  a(AnalyticsService paramAnalyticsService, int paramInt, g paramg)
  {
  }

  public final void a()
  {
    AnalyticsService.a(this.c).post(new b(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.a
 * JD-Core Version:    0.6.0
 */