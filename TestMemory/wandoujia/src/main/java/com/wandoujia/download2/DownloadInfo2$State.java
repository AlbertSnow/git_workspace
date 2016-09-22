package com.wandoujia.download2;

public enum DownloadInfo2$State
{
  static
  {
    CANCELED = new State("CANCELED", 2);
    SUCCEED = new State("SUCCEED", 3);
    FAILED = new State("FAILED", 4);
    State[] arrayOfState = new State[5];
    arrayOfState[0] = PENDING;
    arrayOfState[1] = RUNNING;
    arrayOfState[2] = CANCELED;
    arrayOfState[3] = SUCCEED;
    arrayOfState[4] = FAILED;
    $VALUES = arrayOfState;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.DownloadInfo2.State
 * JD-Core Version:    0.6.0
 */