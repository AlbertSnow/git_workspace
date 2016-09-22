package com.wandoujia.ripple_framework.event;

public enum EventBusContent$Type
{
  static
  {
    FOLLOW_APP_CHANGED = new Type("FOLLOW_APP_CHANGED", 2);
    FOLLOW_SYNC_SUCCESS = new Type("FOLLOW_SYNC_SUCCESS", 3);
    FOLLOW_DATA_READY = new Type("FOLLOW_DATA_READY", 4);
    SHARE_ITEM_CHANGED = new Type("SHARE_ITEM_CHANGED", 5);
    FAVORITE_ITEM_CHANGED = new Type("FAVORITE_ITEM_CHANGED", 6);
    WECHAT_SHARE_SUCCESS = new Type("WECHAT_SHARE_SUCCESS", 7);
    Type[] arrayOfType = new Type[8];
    arrayOfType[0] = DOWNLOADING_APP_CHANGED;
    arrayOfType[1] = LOCAL_APP_CHANGED;
    arrayOfType[2] = FOLLOW_APP_CHANGED;
    arrayOfType[3] = FOLLOW_SYNC_SUCCESS;
    arrayOfType[4] = FOLLOW_DATA_READY;
    arrayOfType[5] = SHARE_ITEM_CHANGED;
    arrayOfType[6] = FAVORITE_ITEM_CHANGED;
    arrayOfType[7] = WECHAT_SHARE_SUCCESS;
    $VALUES = arrayOfType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.event.EventBusContent.Type
 * JD-Core Version:    0.6.0
 */