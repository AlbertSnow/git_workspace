package com.wandoujia.p4.pay.callback;

public enum CallbackWrapper$Status
{
  static
  {
    FAIL = new Status("FAIL", 2);
    Status[] arrayOfStatus = new Status[3];
    arrayOfStatus[0] = CANCEL;
    arrayOfStatus[1] = SUCCESS;
    arrayOfStatus[2] = FAIL;
    $VALUES = arrayOfStatus;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.callback.CallbackWrapper.Status
 * JD-Core Version:    0.6.0
 */