package com.wandoujia.image;

public enum ImageUri$ImageUriType
{
  static
  {
    APP_ICON = new ImageUriType("APP_ICON", 1);
    LOCAL_IMAGE_RES = new ImageUriType("LOCAL_IMAGE_RES", 2);
    VIDEO_THUMBNAIL = new ImageUriType("VIDEO_THUMBNAIL", 3);
    APK_ICON = new ImageUriType("APK_ICON", 4);
    MULTI_ICONS = new ImageUriType("MULTI_ICONS", 5);
    UNSPECIFIED = new ImageUriType("UNSPECIFIED", 6);
    ImageUriType[] arrayOfImageUriType = new ImageUriType[7];
    arrayOfImageUriType[0] = NETWORK;
    arrayOfImageUriType[1] = APP_ICON;
    arrayOfImageUriType[2] = LOCAL_IMAGE_RES;
    arrayOfImageUriType[3] = VIDEO_THUMBNAIL;
    arrayOfImageUriType[4] = APK_ICON;
    arrayOfImageUriType[5] = MULTI_ICONS;
    arrayOfImageUriType[6] = UNSPECIFIED;
    $VALUES = arrayOfImageUriType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.ImageUri.ImageUriType
 * JD-Core Version:    0.6.0
 */