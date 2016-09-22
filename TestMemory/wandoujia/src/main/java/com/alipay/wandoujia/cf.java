package com.alipay.wandoujia;

import android.content.Context;
import android.os.CountDownTimer;
import android.support.v4.app.d;
import android.widget.Button;

final class cf extends CountDownTimer
{
  cf(cc paramcc, long paramLong1, long paramLong2)
  {
    super(paramLong1, paramLong2);
  }

  public final void onFinish()
  {
    if (cc.b(this.a) == null);
    do
    {
      return;
      cc.b(this.a).setEnabled(true);
    }
    while (this.a.n() == null);
    cc.b(this.a).setText(this.a.n().toString());
  }

  public final void onTick(long paramLong)
  {
    if (cc.b(this.a) == null)
      return;
    Context localContext = cc.b(this.a).getContext();
    cc.b(this.a).setText(localContext.getString(d.g("mini_countdown_info")) + "\r\n(" + paramLong / 1000L + ")");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.cf
 * JD-Core Version:    0.6.0
 */