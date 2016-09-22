package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum NetworkPackage$Type
  implements ProtoEnum
{
  private final int value;

  static
  {
    MOBILE = new Type("MOBILE", 2, 2);
    Type[] arrayOfType = new Type[3];
    arrayOfType[0] = UNKNOWN_TYPE;
    arrayOfType[1] = WIFI;
    arrayOfType[2] = MOBILE;
    $VALUES = arrayOfType;
  }

  private NetworkPackage$Type(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.NetworkPackage.Type
 * JD-Core Version:    0.6.0
 */