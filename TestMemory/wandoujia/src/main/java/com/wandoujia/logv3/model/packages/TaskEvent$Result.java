package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum TaskEvent$Result
  implements ProtoEnum
{
  private final int value;

  static
  {
    FAIL = new Result("FAIL", 1, 1);
    CANCEL = new Result("CANCEL", 2, 2);
    Result[] arrayOfResult = new Result[3];
    arrayOfResult[0] = SUCCESS;
    arrayOfResult[1] = FAIL;
    arrayOfResult[2] = CANCEL;
    $VALUES = arrayOfResult;
  }

  private TaskEvent$Result(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.TaskEvent.Result
 * JD-Core Version:    0.6.0
 */