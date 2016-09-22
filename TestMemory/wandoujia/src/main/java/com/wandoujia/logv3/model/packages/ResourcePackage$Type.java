package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum ResourcePackage$Type
  implements ProtoEnum
{
  private final int value;

  static
  {
    PARTNER_COMMON = new Type("PARTNER_COMMON", 1, 1);
    PARTNER_PRIVATE = new Type("PARTNER_PRIVATE", 2, 2);
    USER = new Type("USER", 3, 3);
    Type[] arrayOfType = new Type[4];
    arrayOfType[0] = WDJ_HOSTED;
    arrayOfType[1] = PARTNER_COMMON;
    arrayOfType[2] = PARTNER_PRIVATE;
    arrayOfType[3] = USER;
    $VALUES = arrayOfType;
  }

  private ResourcePackage$Type(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ResourcePackage.Type
 * JD-Core Version:    0.6.0
 */