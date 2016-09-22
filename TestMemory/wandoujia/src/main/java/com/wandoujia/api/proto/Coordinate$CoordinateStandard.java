package com.wandoujia.api.proto;

import com.squareup.wire.ProtoEnum;

public enum Coordinate$CoordinateStandard
  implements ProtoEnum
{
  private final int value;

  static
  {
    GCJ_02 = new CoordinateStandard("GCJ_02", 1, 1);
    CoordinateStandard[] arrayOfCoordinateStandard = new CoordinateStandard[2];
    arrayOfCoordinateStandard[0] = WGS_84;
    arrayOfCoordinateStandard[1] = GCJ_02;
    $VALUES = arrayOfCoordinateStandard;
  }

  private Coordinate$CoordinateStandard(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.Coordinate.CoordinateStandard
 * JD-Core Version:    0.6.0
 */