package com.wandoujia.logv3.model.packages;

import com.squareup.wire.ProtoEnum;

public enum ClientPackage$Product
  implements ProtoEnum
{
  private final int value;

  static
  {
    ANDROID = new Product("ANDROID", 1, 1);
    USB_CONNECTION = new Product("USB_CONNECTION", 2, 2);
    GAME_SDK = new Product("GAME_SDK", 3, 3);
    MARIO_SDK = new Product("MARIO_SDK", 4, 4);
    IOS = new Product("IOS", 5, 5);
    ADS = new Product("ADS", 6, 6);
    IOS_EYEPETIZER = new Product("IOS_EYEPETIZER", 7, 7);
    RIPPLE = new Product("RIPPLE", 8, 8);
    MUSIC_X = new Product("MUSIC_X", 9, 9);
    SNAPLOCK = new Product("SNAPLOCK", 10, 10);
    ANDROID_EYEPETIZER = new Product("ANDROID_EYEPETIZER", 11, 11);
    IOS_RIPPLE = new Product("IOS_RIPPLE", 12, 12);
    JUPITER = new Product("JUPITER", 13, 13);
    GAME_LAUNCHER = new Product("GAME_LAUNCHER", 14, 14);
    PUSH_SDK = new Product("PUSH_SDK", 15, 15);
    CLEAN = new Product("CLEAN", 16, 16);
    TEKKEN = new Product("TEKKEN", 17, 17);
    YOLO = new Product("YOLO", 18, 18);
    SHUFFLE = new Product("SHUFFLE", 19, 19);
    ANDROID_LAUNCHER_LITE = new Product("ANDROID_LAUNCHER_LITE", 20, 20);
    Product[] arrayOfProduct = new Product[21];
    arrayOfProduct[0] = WINDOWS;
    arrayOfProduct[1] = ANDROID;
    arrayOfProduct[2] = USB_CONNECTION;
    arrayOfProduct[3] = GAME_SDK;
    arrayOfProduct[4] = MARIO_SDK;
    arrayOfProduct[5] = IOS;
    arrayOfProduct[6] = ADS;
    arrayOfProduct[7] = IOS_EYEPETIZER;
    arrayOfProduct[8] = RIPPLE;
    arrayOfProduct[9] = MUSIC_X;
    arrayOfProduct[10] = SNAPLOCK;
    arrayOfProduct[11] = ANDROID_EYEPETIZER;
    arrayOfProduct[12] = IOS_RIPPLE;
    arrayOfProduct[13] = JUPITER;
    arrayOfProduct[14] = GAME_LAUNCHER;
    arrayOfProduct[15] = PUSH_SDK;
    arrayOfProduct[16] = CLEAN;
    arrayOfProduct[17] = TEKKEN;
    arrayOfProduct[18] = YOLO;
    arrayOfProduct[19] = SHUFFLE;
    arrayOfProduct[20] = ANDROID_LAUNCHER_LITE;
    $VALUES = arrayOfProduct;
  }

  private ClientPackage$Product(int paramInt)
  {
    this.value = paramInt;
  }

  public final int getValue()
  {
    return this.value;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.model.packages.ClientPackage.Product
 * JD-Core Version:    0.6.0
 */