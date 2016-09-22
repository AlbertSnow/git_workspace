package com.wandoujia.image.view;

 enum AsyncImageView$ImageRequestType
{
  static
  {
    APP_ICON = new ImageRequestType("APP_ICON", 1);
    LOCAL_IMAGE = new ImageRequestType("LOCAL_IMAGE", 2);
    VIDEO_THUMBNAIL = new ImageRequestType("VIDEO_THUMBNAIL", 3);
    APK_ICON = new ImageRequestType("APK_ICON", 4);
    ImageRequestType[] arrayOfImageRequestType = new ImageRequestType[5];
    arrayOfImageRequestType[0] = NETWORK;
    arrayOfImageRequestType[1] = APP_ICON;
    arrayOfImageRequestType[2] = LOCAL_IMAGE;
    arrayOfImageRequestType[3] = VIDEO_THUMBNAIL;
    arrayOfImageRequestType[4] = APK_ICON;
    $VALUES = arrayOfImageRequestType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.view.AsyncImageView.ImageRequestType
 * JD-Core Version:    0.6.0
 */