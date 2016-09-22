package com.wandoujia.p4.pay;

import android.os.CountDownTimer;
import com.wandoujia.p4.pay.utils.SLog;

class PayImpl$PayCoolDown
{
  static final int COUNT_DOWN_LENGTH = 2000;
  boolean coolDown = false;
  String lastAction = "none";
  CountDownTimer payCountDown;

  boolean inCD(String paramString)
  {
    SLog.d("PayImpl", "inCD: " + this.coolDown);
    if ((this.coolDown) && (this.lastAction.equals(paramString)))
      return this.coolDown;
    if (this.payCountDown == null)
      this.payCountDown = new PayImpl.PayCoolDown.1(this, 2000L, 2000L);
    this.payCountDown.start();
    SLog.d("PayImpl", "Start to CD... to Avoid duplicated click.");
    this.coolDown = true;
    this.lastAction = paramString;
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.PayImpl.PayCoolDown
 * JD-Core Version:    0.6.0
 */