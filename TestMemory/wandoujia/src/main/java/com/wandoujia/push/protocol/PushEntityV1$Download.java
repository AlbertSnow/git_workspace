package com.wandoujia.push.protocol;

import java.io.Serializable;

public class PushEntityV1$Download
  implements Serializable
{
  private String channel;
  private String detail;
  private String icon;
  private String id;
  private long size;
  private String title;
  private String type;
  private String url;

  public String getChannel()
  {
    return this.channel;
  }

  public String getDetail()
  {
    return this.detail;
  }

  public String getIcon()
  {
    return this.icon;
  }

  public String getId()
  {
    return this.id;
  }

  public long getSize()
  {
    return this.size;
  }

  public String getTitle()
  {
    return this.title;
  }

  public String getType()
  {
    return this.type;
  }

  public String getUrl()
  {
    return this.url;
  }

  public void setChannel(String paramString)
  {
    this.channel = paramString;
  }

  public void setDetail(String paramString)
  {
    this.detail = paramString;
  }

  public void setIcon(String paramString)
  {
    this.icon = paramString;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setSize(long paramLong)
  {
    this.size = paramLong;
  }

  public void setTitle(String paramString)
  {
    this.title = paramString;
  }

  public void setType(String paramString)
  {
    this.type = paramString;
  }

  public void setUrl(String paramString)
  {
    this.url = paramString;
  }

  public String toString()
  {
    return "[ id is " + this.id + ", type is " + this.type + ", title is " + this.title + ", icon is " + this.icon + ", size is " + this.size + ", url is " + this.url + ", detail is " + this.detail + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push.protocol.PushEntityV1.Download
 * JD-Core Version:    0.6.0
 */