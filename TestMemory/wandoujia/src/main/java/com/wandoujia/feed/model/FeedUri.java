package com.wandoujia.feed.model;

import java.io.Serializable;

public class FeedUri
  implements Serializable
{
  private final int typePosition;
  private final String uri;

  public FeedUri(String paramString)
  {
    this.uri = paramString;
    this.typePosition = paramString.indexOf('/');
  }

  public String getUri()
  {
    return this.uri;
  }

  public boolean isValid()
  {
    return this.typePosition > 0;
  }

  public String parseType()
  {
    return this.uri.substring(0, this.typePosition);
  }

  public String parseUrl()
  {
    return this.uri.substring(1 + this.typePosition);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.feed.model.FeedUri
 * JD-Core Version:    0.6.0
 */