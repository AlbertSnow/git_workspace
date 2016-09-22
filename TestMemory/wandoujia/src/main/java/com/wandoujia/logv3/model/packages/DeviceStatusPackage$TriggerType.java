package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum DeviceStatusPackage$TriggerType
  implements ProtoEnum
{
  private final int value;

  static
  {
    OPEN_APP = new TriggerType("OPEN_APP", 1, 1);
    LOCATION = new TriggerType("LOCATION", 2, 2);
    TIMEOUT = new TriggerType("TIMEOUT", 3, 3);
    TriggerType[] arrayOfTriggerType = new TriggerType[4];
    arrayOfTriggerType[0] = UNKNOWN;
    arrayOfTriggerType[1] = OPEN_APP;
    arrayOfTriggerType[2] = LOCATION;
    arrayOfTriggerType[3] = TIMEOUT;
    $VALUES = arrayOfTriggerType;
  }

  private DeviceStatusPackage$TriggerType(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.DeviceStatusPackage.TriggerType
 * JD-Core Version:    0.6.0
 */