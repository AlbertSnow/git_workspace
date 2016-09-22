package com.wandoujia.push.protocol;

import java.io.Serializable;

public class NotificationModel$Button
  implements Serializable
{
  private String iconPath;
  private String intent;
  private String text;

  public String getIconPath()
  {
    return this.iconPath;
  }

  public String getIntent()
  {
    return this.intent;
  }

  public String getText()
  {
    return this.text;
  }

  public void setIntent(String paramString)
  {
    this.intent = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push.protocol.NotificationModel.Button
 * JD-Core Version:    0.6.0
 */