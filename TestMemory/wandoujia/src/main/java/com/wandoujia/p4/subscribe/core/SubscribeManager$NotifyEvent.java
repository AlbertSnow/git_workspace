package com.wandoujia.p4.subscribe.core;

 enum SubscribeManager$NotifyEvent
{
  static
  {
    NOTIFY_SUBSCRIBE_FAILED = new NotifyEvent("NOTIFY_SUBSCRIBE_FAILED", 1);
    NOTIFY_UNSUBSCRIBE_SUCCESS = new NotifyEvent("NOTIFY_UNSUBSCRIBE_SUCCESS", 2);
    NOTIFY_UNSUBSCRIBE_FAILED = new NotifyEvent("NOTIFY_UNSUBSCRIBE_FAILED", 3);
    NotifyEvent[] arrayOfNotifyEvent = new NotifyEvent[4];
    arrayOfNotifyEvent[0] = NOTIFY_SUBSCRIBE_SUCCESS;
    arrayOfNotifyEvent[1] = NOTIFY_SUBSCRIBE_FAILED;
    arrayOfNotifyEvent[2] = NOTIFY_UNSUBSCRIBE_SUCCESS;
    arrayOfNotifyEvent[3] = NOTIFY_UNSUBSCRIBE_FAILED;
    $VALUES = arrayOfNotifyEvent;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.core.SubscribeManager.NotifyEvent
 * JD-Core Version:    0.6.0
 */