package com.wandoujia.p4.app.upgrade;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.p4.a;

class UpgradeNotifyCardGenerator$DefaultUpgradeNotificationConfig extends UpgradeNotificationConfig
{
  public UpgradeNotifyCardGenerator$DefaultUpgradeNotificationConfig()
  {
    Resources localResources = a.a().getResources();
    this.oneAppText = new NotificationTextConfig();
    this.oneAppText.title = localResources.getString(2131625576);
    this.oneAppText.message = localResources.getString(2131625575);
    this.oneAppText.leftButton = localResources.getString(2131625580);
    this.oneAppText.rightButton = localResources.getString(2131625698);
    this.multiAppText = new NotificationTextConfig();
    this.multiAppText.title = localResources.getString(2131625572);
    this.multiAppText.message = localResources.getString(2131625571);
    this.multiAppText.leftButton = localResources.getString(2131625580);
    this.multiAppText.rightButton = localResources.getString(2131625698);
    this.preDownloadText = new NotificationTextConfig();
    this.preDownloadText.title = localResources.getString(2131625578);
    this.preDownloadText.message = localResources.getString(2131625577);
    this.preDownloadText.leftButton = localResources.getString(2131625580);
    this.preDownloadText.rightButton = localResources.getString(2131625698);
    this.noNetworkText = new NotificationTextConfig();
    this.noNetworkText.title = localResources.getString(2131625574);
    this.noNetworkText.message = localResources.getString(2131625573);
    this.noNetworkText.leftButton = localResources.getString(2131625580);
    this.noNetworkText.rightButton = localResources.getString(2131625698);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.upgrade.UpgradeNotifyCardGenerator.DefaultUpgradeNotificationConfig
 * JD-Core Version:    0.6.0
 */