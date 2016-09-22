package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum ApplicationCrashEvent$Type
  implements ProtoEnum
{
  private final int value;

  static
  {
    ANR = new Type("ANR", 3, 3);
    Type[] arrayOfType = new Type[4];
    arrayOfType[0] = APP_CRASH;
    arrayOfType[1] = LOG_CRASH;
    arrayOfType[2] = PLUGIN_CRASH;
    arrayOfType[3] = ANR;
    $VALUES = arrayOfType;
  }

  private ApplicationCrashEvent$Type(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ApplicationCrashEvent.Type
 * JD-Core Version:    0.6.0
 */