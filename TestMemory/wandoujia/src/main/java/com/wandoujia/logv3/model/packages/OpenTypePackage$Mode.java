package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum OpenTypePackage$Mode
  implements ProtoEnum
{
  private final int value;

  static
  {
    LOCAL = new Mode("LOCAL", 1, 1);
    Mode[] arrayOfMode = new Mode[2];
    arrayOfMode[0] = ONLINE;
    arrayOfMode[1] = LOCAL;
    $VALUES = arrayOfMode;
  }

  private OpenTypePackage$Mode(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.OpenTypePackage.Mode
 * JD-Core Version:    0.6.0
 */