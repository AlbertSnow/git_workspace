package com.wandoujia.jupiter.notification.notifycard.generator;

public enum INotifyCardGenerator$NotifyPriority
{
  static
  {
    LOW = new NotifyPriority("LOW", 2);
    NotifyPriority[] arrayOfNotifyPriority = new NotifyPriority[3];
    arrayOfNotifyPriority[0] = HIGH;
    arrayOfNotifyPriority[1] = NORMAL;
    arrayOfNotifyPriority[2] = LOW;
    $VALUES = arrayOfNotifyPriority;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.notifycard.generator.INotifyCardGenerator.NotifyPriority
 * JD-Core Version:    0.6.0
 */