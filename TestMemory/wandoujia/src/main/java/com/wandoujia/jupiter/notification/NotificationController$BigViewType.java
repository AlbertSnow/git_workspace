package com.wandoujia.jupiter.notification;

 enum NotificationController$BigViewType
{
  static
  {
    BIG_PICTURE = new BigViewType("BIG_PICTURE", 1);
    BIG_TEXT = new BigViewType("BIG_TEXT", 2);
    BigViewType[] arrayOfBigViewType = new BigViewType[3];
    arrayOfBigViewType[0] = PICTURE_ONLY;
    arrayOfBigViewType[1] = BIG_PICTURE;
    arrayOfBigViewType[2] = BIG_TEXT;
    $VALUES = arrayOfBigViewType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.NotificationController.BigViewType
 * JD-Core Version:    0.6.0
 */