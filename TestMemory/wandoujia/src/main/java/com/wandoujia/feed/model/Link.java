package com.wandoujia.feed.model;

import java.io.Serializable;

public class Link
  implements Serializable
{
  private String href;
  private String rel;
  private String title;
  private String type;

  public String getHref()
  {
    return this.href;
  }

  public String getRel()
  {
    return this.rel;
  }

  public String getTitle()
  {
    return this.title;
  }

  public String getType()
  {
    return this.type;
  }

  public void setHref(String paramString)
  {
    this.href = paramString;
  }

  public void setRel(String paramString)
  {
    this.rel = paramString;
  }

  public void setTitle(String paramString)
  {
    this.title = paramString;
  }

  public void setType(String paramString)
  {
    this.type = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.feed.model.Link
 * JD-Core Version:    0.6.0
 */