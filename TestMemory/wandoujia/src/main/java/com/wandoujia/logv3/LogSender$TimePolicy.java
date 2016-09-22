package com.wandoujia.logv3;

public enum LogSender$TimePolicy
{
  static
  {
    TimePolicy[] arrayOfTimePolicy = new TimePolicy[4];
    arrayOfTimePolicy[0] = NONE;
    arrayOfTimePolicy[1] = ON_LAUNCH;
    arrayOfTimePolicy[2] = REAL_TIME;
    arrayOfTimePolicy[3] = SCHEDULE;
    $VALUES = arrayOfTimePolicy;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.LogSender.TimePolicy
 * JD-Core Version:    0.6.0
 */