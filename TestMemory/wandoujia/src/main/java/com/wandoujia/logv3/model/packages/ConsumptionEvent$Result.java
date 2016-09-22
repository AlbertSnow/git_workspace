package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum ConsumptionEvent$Result
  implements ProtoEnum
{
  private final int value;

  static
  {
    FAILED = new Result("FAILED", 1, 1);
    Result[] arrayOfResult = new Result[2];
    arrayOfResult[0] = SUCCESS;
    arrayOfResult[1] = FAILED;
    $VALUES = arrayOfResult;
  }

  private ConsumptionEvent$Result(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ConsumptionEvent.Result
 * JD-Core Version:    0.6.0
 */