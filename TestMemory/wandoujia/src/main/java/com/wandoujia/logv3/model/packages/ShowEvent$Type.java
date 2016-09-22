package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum ShowEvent$Type
  implements ProtoEnum
{
  private final int value;

  static
  {
    CARD = new Type("CARD", 1, 1);
    Type[] arrayOfType = new Type[2];
    arrayOfType[0] = PAGE;
    arrayOfType[1] = CARD;
    $VALUES = arrayOfType;
  }

  private ShowEvent$Type(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ShowEvent.Type
 * JD-Core Version:    0.6.0
 */