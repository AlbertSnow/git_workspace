package com.wandoujia.ripple_framework.installer;

public enum AppTaskManager$Status
{
  static
  {
    CANCEL = new Status("CANCEL", 2);
    Status[] arrayOfStatus = new Status[3];
    arrayOfStatus[0] = CREATED;
    arrayOfStatus[1] = PAUSE;
    arrayOfStatus[2] = CANCEL;
    $VALUES = arrayOfStatus;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.AppTaskManager.Status
 * JD-Core Version:    0.6.0
 */