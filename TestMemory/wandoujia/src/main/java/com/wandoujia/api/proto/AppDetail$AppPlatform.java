package com.wandoujia.api.proto;

import com.squareup.wire.ProtoEnum;

public enum AppDetail$AppPlatform
  implements ProtoEnum
{
  private final int value;

  static
  {
    BOTH = new AppPlatform("BOTH", 2, 2);
    MEDIA_PRESS = new AppPlatform("MEDIA_PRESS", 3, 3);
    AppPlatform[] arrayOfAppPlatform = new AppPlatform[4];
    arrayOfAppPlatform[0] = ANDROID;
    arrayOfAppPlatform[1] = IOS;
    arrayOfAppPlatform[2] = BOTH;
    arrayOfAppPlatform[3] = MEDIA_PRESS;
    $VALUES = arrayOfAppPlatform;
  }

  private AppDetail$AppPlatform(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.AppDetail.AppPlatform
 * JD-Core Version:    0.6.0
 */