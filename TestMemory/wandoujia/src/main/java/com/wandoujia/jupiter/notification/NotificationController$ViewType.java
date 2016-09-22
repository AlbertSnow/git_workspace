package com.wandoujia.jupiter.notification;

 enum NotificationController$ViewType
{
  static
  {
    ONE_BUTTON = new ViewType("ONE_BUTTON", 1);
    ICON_LIST = new ViewType("ICON_LIST", 2);
    ViewType[] arrayOfViewType = new ViewType[3];
    arrayOfViewType[0] = PICTURE_ONLY;
    arrayOfViewType[1] = ONE_BUTTON;
    arrayOfViewType[2] = ICON_LIST;
    $VALUES = arrayOfViewType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.NotificationController.ViewType
 * JD-Core Version:    0.6.0
 */