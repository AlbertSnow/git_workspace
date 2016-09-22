package com.wandoujia.feed.model;

import java.io.Serializable;

public class FeedUser
  implements Serializable
{
  private final String cookie;

  public FeedUser(String paramString)
  {
    this.cookie = paramString;
  }

  public static FeedUser createAsUdid(String paramString)
  {
    return new FeedUser("wdj_udid=" + paramString);
  }

  public static FeedUser createAsWdjUser(String paramString)
  {
    return new FeedUser("wdj_auth=" + paramString);
  }

  public String getCookie()
  {
    return this.cookie;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.feed.model.FeedUser
 * JD-Core Version:    0.6.0
 */