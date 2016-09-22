package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum OpenTypePackage$OpenType
  implements ProtoEnum
{
  private final int value;

  static
  {
    SYSTEM = new OpenType("SYSTEM", 1, 1);
    IAS_APP = new OpenType("IAS_APP", 2, 2);
    IAS_HTML5 = new OpenType("IAS_HTML5", 3, 3);
    OpenType[] arrayOfOpenType = new OpenType[4];
    arrayOfOpenType[0] = WDJ;
    arrayOfOpenType[1] = SYSTEM;
    arrayOfOpenType[2] = IAS_APP;
    arrayOfOpenType[3] = IAS_HTML5;
    $VALUES = arrayOfOpenType;
  }

  private OpenTypePackage$OpenType(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.OpenTypePackage.OpenType
 * JD-Core Version:    0.6.0
 */