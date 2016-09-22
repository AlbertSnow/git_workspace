package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum Location$Standard
  implements ProtoEnum
{
  private final int value;

  static
  {
    GCJ_02 = new Standard("GCJ_02", 1, 1);
    Standard[] arrayOfStandard = new Standard[2];
    arrayOfStandard[0] = WGS_84;
    arrayOfStandard[1] = GCJ_02;
    $VALUES = arrayOfStandard;
  }

  private Location$Standard(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.Location.Standard
 * JD-Core Version:    0.6.0
 */