package com.wandoujia.logv3.toolkit;

 enum ANRWatchDog$ACKStatus
{
  static
  {
    ACK_RESPONDED = new ACKStatus("ACK_RESPONDED", 1);
    ANR = new ACKStatus("ANR", 2);
    ACKStatus[] arrayOfACKStatus = new ACKStatus[3];
    arrayOfACKStatus[0] = ACK_WAITING;
    arrayOfACKStatus[1] = ACK_RESPONDED;
    arrayOfACKStatus[2] = ANR;
    $VALUES = arrayOfACKStatus;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.ANRWatchDog.ACKStatus
 * JD-Core Version:    0.6.0
 */