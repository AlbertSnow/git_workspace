package com.wandoujia.p4.pay;

import android.os.CountDownTimer;
import com.wandoujia.p4.pay.utils.SLog;

class PayImpl$PayCoolDown$1 extends CountDownTimer
{
  public void onFinish()
  {
    this.this$0.coolDown = false;
    SLog.d("PayImpl", "CD finished.");
  }

  public void onTick(long paramLong)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.PayImpl.PayCoolDown.1
 * JD-Core Version:    0.6.0
 */