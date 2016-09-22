package com.wandoujia.p4.pay.callback;

public enum CallbackWrapper$Type
{
  static
  {
    PAY = new Type("PAY", 3);
    CHECKPAY = new Type("CHECKPAY", 4);
    SINGLEPAY = new Type("SINGLEPAY", 5);
    RECHARGE = new Type("RECHARGE", 6);
    Type[] arrayOfType = new Type[7];
    arrayOfType[0] = LOGIN;
    arrayOfType[1] = LOGOUT;
    arrayOfType[2] = RELOGIN;
    arrayOfType[3] = PAY;
    arrayOfType[4] = CHECKPAY;
    arrayOfType[5] = SINGLEPAY;
    arrayOfType[6] = RECHARGE;
    $VALUES = arrayOfType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.callback.CallbackWrapper.Type
 * JD-Core Version:    0.6.0
 */