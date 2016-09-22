package com.wandoujia.p4.app.upgrade;

public enum UpgradeNotifyCardGenerator$NotificationType
{
  static
  {
    MULTI_APP = new NotificationType("MULTI_APP", 1);
    PRE_DOWNLOADED = new NotificationType("PRE_DOWNLOADED", 2);
    NO_NETWORK = new NotificationType("NO_NETWORK", 3);
    NotificationType[] arrayOfNotificationType = new NotificationType[4];
    arrayOfNotificationType[0] = ONE_APP;
    arrayOfNotificationType[1] = MULTI_APP;
    arrayOfNotificationType[2] = PRE_DOWNLOADED;
    arrayOfNotificationType[3] = NO_NETWORK;
    $VALUES = arrayOfNotificationType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.upgrade.UpgradeNotifyCardGenerator.NotificationType
 * JD-Core Version:    0.6.0
 */