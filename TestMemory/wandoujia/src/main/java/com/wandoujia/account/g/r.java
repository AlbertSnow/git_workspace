package com.wandoujia.account.g;

import android.content.ContentResolver;
import android.content.Context;
import android.os.CountDownTimer;
import android.support.v4.app.b;

final class r extends CountDownTimer
{
  r(q paramq)
  {
    super(600000L, 1000L);
  }

  public final void onFinish()
  {
    b.A().getContentResolver().unregisterContentObserver(p.a(this.a.a));
    p.a(this.a.a, null);
  }

  public final void onTick(long paramLong)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.r
 * JD-Core Version:    0.6.0
 */