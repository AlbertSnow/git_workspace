package com.wandoujia.push.protocol;

import java.io.Serializable;

public class NotificationModel$Content
  implements Serializable
{
  private String contentIntent;
  private String detail;
  private String summary;

  public String getContentIntent()
  {
    return this.contentIntent;
  }

  public String getDetail()
  {
    return this.detail;
  }

  public String getSummary()
  {
    return this.summary;
  }

  public void setContentIntent(String paramString)
  {
    this.contentIntent = paramString;
  }

  public void setDetail(String paramString)
  {
    this.detail = paramString;
  }

  public void setSummary(String paramString)
  {
    this.summary = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push.protocol.NotificationModel.Content
 * JD-Core Version:    0.6.0
 */