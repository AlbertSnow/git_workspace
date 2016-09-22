package com.wandoujia.base.utils;

public enum ThreadPool$Priority
{
  static
  {
    LOW = new Priority("LOW", 1);
    Priority[] arrayOfPriority = new Priority[2];
    arrayOfPriority[0] = NORMAL;
    arrayOfPriority[1] = LOW;
    $VALUES = arrayOfPriority;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ThreadPool.Priority
 * JD-Core Version:    0.6.0
 */