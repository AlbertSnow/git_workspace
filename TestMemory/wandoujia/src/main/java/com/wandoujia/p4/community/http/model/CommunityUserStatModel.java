package com.wandoujia.p4.community.http.model;

import java.io.Serializable;

public class CommunityUserStatModel
  implements Serializable
{
  private int repliedTopicsCount;
  private int topicsCount;

  public int getRepliedTopicsCount()
  {
    return this.repliedTopicsCount;
  }

  public int getTopicsCount()
  {
    return this.topicsCount;
  }

  public void setRepliedTopicsCount(int paramInt)
  {
    this.repliedTopicsCount = paramInt;
  }

  public void setTopicsCount(int paramInt)
  {
    this.topicsCount = paramInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunityUserStatModel
 * JD-Core Version:    0.6.0
 */