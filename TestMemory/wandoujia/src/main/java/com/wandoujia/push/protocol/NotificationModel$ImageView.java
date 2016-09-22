package com.wandoujia.push.protocol;

import java.io.Serializable;

public class NotificationModel$ImageView
  implements Serializable
{
  private String bigImageIntent;
  private String bigImagePath;
  private String smallImageIntent;
  private String smallImagePath;

  public String getBigImageIntent()
  {
    return this.bigImageIntent;
  }

  public String getBigImagePath()
  {
    return this.bigImagePath;
  }

  public String getSmallImageIntent()
  {
    return this.smallImageIntent;
  }

  public String getSmallImagePath()
  {
    return this.smallImagePath;
  }

  public void setBigImageIntent(String paramString)
  {
    this.bigImageIntent = paramString;
  }

  public void setSmallImageIntent(String paramString)
  {
    this.smallImageIntent = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push.protocol.NotificationModel.ImageView
 * JD-Core Version:    0.6.0
 */