package com.wandoujia.feed.model;

import java.io.Serializable;

public class Author
  implements Serializable
{
  private String name;
  private String uri;

  public String getName()
  {
    return this.name;
  }

  public String getUri()
  {
    return this.uri;
  }

  public void setName(String paramString)
  {
    this.name = paramString;
  }

  public void setUri(String paramString)
  {
    this.uri = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.feed.model.Author
 * JD-Core Version:    0.6.0
 */