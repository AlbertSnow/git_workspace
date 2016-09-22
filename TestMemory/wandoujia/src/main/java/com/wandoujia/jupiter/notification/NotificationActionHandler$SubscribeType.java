package com.wandoujia.jupiter.notification;

 enum NotificationActionHandler$SubscribeType
{
  static
  {
    EBOOK = new SubscribeType("EBOOK", 1);
    MUSIC = new SubscribeType("MUSIC", 2);
    SubscribeType[] arrayOfSubscribeType = new SubscribeType[3];
    arrayOfSubscribeType[0] = VIDEO;
    arrayOfSubscribeType[1] = EBOOK;
    arrayOfSubscribeType[2] = MUSIC;
    $VALUES = arrayOfSubscribeType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.NotificationActionHandler.SubscribeType
 * JD-Core Version:    0.6.0
 */