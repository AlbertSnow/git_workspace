package com.wandoujia.feed;

public enum FeedClient$Filter
{
  static
  {
    NONE = new Filter("NONE", 2);
    LATEST = new Filter("LATEST", 3);
    Filter[] arrayOfFilter = new Filter[4];
    arrayOfFilter[0] = ALL;
    arrayOfFilter[1] = UNREAD;
    arrayOfFilter[2] = NONE;
    arrayOfFilter[3] = LATEST;
    $VALUES = arrayOfFilter;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.feed.FeedClient.Filter
 * JD-Core Version:    0.6.0
 */