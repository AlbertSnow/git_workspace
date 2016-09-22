package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum ClientPackage$Platform
  implements ProtoEnum
{
  private final int value;

  static
  {
    IPAD = new Platform("IPAD", 3, 3);
    PC = new Platform("PC", 4, 4);
    Platform[] arrayOfPlatform = new Platform[5];
    arrayOfPlatform[0] = ANDROID_PHONE;
    arrayOfPlatform[1] = ANDROID_TABLET;
    arrayOfPlatform[2] = IPHONE;
    arrayOfPlatform[3] = IPAD;
    arrayOfPlatform[4] = PC;
    $VALUES = arrayOfPlatform;
  }

  private ClientPackage$Platform(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ClientPackage.Platform
 * JD-Core Version:    0.6.0
 */