package com.wandoujia.p4.community.http.model;

import java.io.Serializable;

public class CommunityRankingModel
  implements Serializable
{
  private long likesCount;
  private long rank;
  private CommunityUserModel user;

  public long getLikesCount()
  {
    return this.likesCount;
  }

  public long getRank()
  {
    return this.rank;
  }

  public CommunityUserModel getUser()
  {
    return this.user;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunityRankingModel
 * JD-Core Version:    0.6.0
 */