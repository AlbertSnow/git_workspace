package com.wandoujia.log;

public enum LogEventModel$Priority
{
  private int level;

  static
  {
    Priority[] arrayOfPriority = new Priority[2];
    arrayOfPriority[0] = NORMAL;
    arrayOfPriority[1] = REAL_TIME;
    $VALUES = arrayOfPriority;
  }

  private LogEventModel$Priority(int paramInt)
  {
    this.level = paramInt;
  }

  public final int getLevel()
  {
    return this.level;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.LogEventModel.Priority
 * JD-Core Version:    0.6.0
 */