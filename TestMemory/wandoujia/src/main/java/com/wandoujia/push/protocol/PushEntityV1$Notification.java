package com.wandoujia.push.protocol;

import java.io.Serializable;

public class PushEntityV1$Notification
  implements Serializable
{
  public static final String TYPE_MSG = "msg";
  public static final String TYPE_NOTIFY = "notify";
  public static final String TYPE_TIP = "tip";
  private String desc;
  private String icon;
  private NotificationModel notificationModel;
  private PushEntityV1.Redirect redirect;
  private String srcChannel;
  private String title;
  private String type;

  public String getDesc()
  {
    return this.desc;
  }

  public String getIcon()
  {
    return this.icon;
  }

  public NotificationModel getNotificationModel()
  {
    return this.notificationModel;
  }

  public PushEntityV1.Redirect getRedirect()
  {
    return this.redirect;
  }

  public String getSrcChannel()
  {
    return this.srcChannel;
  }

  public String getTitle()
  {
    return this.title;
  }

  public String getType()
  {
    return this.type;
  }

  public void setDesc(String paramString)
  {
    this.desc = paramString;
  }

  public void setIcon(String paramString)
  {
    this.icon = paramString;
  }

  public void setRedirect(PushEntityV1.Redirect paramRedirect)
  {
    this.redirect = paramRedirect;
  }

  public void setSrcChannel(String paramString)
  {
    this.srcChannel = paramString;
  }

  public void setTitle(String paramString)
  {
    this.title = paramString;
  }

  public void setType(String paramString)
  {
    this.type = paramString;
  }

  public String toString()
  {
    return "[ type is " + this.type + ", title is " + this.title + ", desc is " + this.desc + ", redirect is " + this.redirect + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push.protocol.PushEntityV1.Notification
 * JD-Core Version:    0.6.0
 */