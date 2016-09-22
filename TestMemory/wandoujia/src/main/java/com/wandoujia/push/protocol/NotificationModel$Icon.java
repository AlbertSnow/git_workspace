package com.wandoujia.push.protocol;

import java.io.Serializable;

public class NotificationModel$Icon
  implements Serializable
{
  private String largeIconPath;
  private String[] smallIconList;

  public String getLargeIconPath()
  {
    return this.largeIconPath;
  }

  public String[] getSmallIconList()
  {
    return this.smallIconList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push.protocol.NotificationModel.Icon
 * JD-Core Version:    0.6.0
 */