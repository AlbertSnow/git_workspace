package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum DownloadPackage$Type
  implements ProtoEnum
{
  private final int value;

  static
  {
    APP = new Type("APP", 1, 1);
    PLAY_EXP = new Type("PLAY_EXP", 2, 2);
    Type[] arrayOfType = new Type[3];
    arrayOfType[0] = COMMON;
    arrayOfType[1] = APP;
    arrayOfType[2] = PLAY_EXP;
    $VALUES = arrayOfType;
  }

  private DownloadPackage$Type(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.DownloadPackage.Type
 * JD-Core Version:    0.6.0
 */