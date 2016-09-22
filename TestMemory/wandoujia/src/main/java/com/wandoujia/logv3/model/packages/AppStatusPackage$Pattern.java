package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum AppStatusPackage$Pattern
  implements ProtoEnum
{
  private final int value;

  static
  {
    Pattern[] arrayOfPattern = new Pattern[2];
    arrayOfPattern[0] = AUTO;
    arrayOfPattern[1] = MANUAL;
    $VALUES = arrayOfPattern;
  }

  private AppStatusPackage$Pattern(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.AppStatusPackage.Pattern
 * JD-Core Version:    0.6.0
 */