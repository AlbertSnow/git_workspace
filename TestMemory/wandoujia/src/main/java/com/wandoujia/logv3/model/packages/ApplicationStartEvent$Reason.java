package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum ApplicationStartEvent$Reason
  implements ProtoEnum
{
  private final int value;

  static
  {
    Reason[] arrayOfReason = new Reason[3];
    arrayOfReason[0] = NEW;
    arrayOfReason[1] = RELOAD;
    arrayOfReason[2] = RESTART;
    $VALUES = arrayOfReason;
  }

  private ApplicationStartEvent$Reason(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ApplicationStartEvent.Reason
 * JD-Core Version:    0.6.0
 */