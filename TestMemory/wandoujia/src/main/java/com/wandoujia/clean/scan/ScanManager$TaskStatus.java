package com.wandoujia.clean.scan;

public enum ScanManager$TaskStatus
{
  private final int priority;

  static
  {
    RUNNING = new TaskStatus("RUNNING", 1, 1);
    FINISH = new TaskStatus("FINISH", 2, 2);
    TaskStatus[] arrayOfTaskStatus = new TaskStatus[3];
    arrayOfTaskStatus[0] = START;
    arrayOfTaskStatus[1] = RUNNING;
    arrayOfTaskStatus[2] = FINISH;
    $VALUES = arrayOfTaskStatus;
  }

  private ScanManager$TaskStatus(int paramInt)
  {
    this.priority = paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.scan.ScanManager.TaskStatus
 * JD-Core Version:    0.6.0
 */