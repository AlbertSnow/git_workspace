package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum TaskEvent$Status
  implements ProtoEnum
{
  private final int value;

  static
  {
    RETRY = new Status("RETRY", 1, 1);
    END = new Status("END", 2, 2);
    PAUSE = new Status("PAUSE", 3, 3);
    READY = new Status("READY", 4, 4);
    PENDING = new Status("PENDING", 5, 5);
    TRIGGER = new Status("TRIGGER", 6, 6);
    Status[] arrayOfStatus = new Status[7];
    arrayOfStatus[0] = START;
    arrayOfStatus[1] = RETRY;
    arrayOfStatus[2] = END;
    arrayOfStatus[3] = PAUSE;
    arrayOfStatus[4] = READY;
    arrayOfStatus[5] = PENDING;
    arrayOfStatus[6] = TRIGGER;
    $VALUES = arrayOfStatus;
  }

  private TaskEvent$Status(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.TaskEvent.Status
 * JD-Core Version:    0.6.0
 */