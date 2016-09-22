package com.wandoujia.p4.community.http.model;

import com.wandoujia.p4.community.http.b.n;
import java.io.Serializable;
import java.util.List;

public class CommunityTopicInfo
  implements n<CommunityTopicModel>, Serializable
{
  public String hasMore;
  private List<CommunityTopicModel> items;
  private int totalCount;

  public List<CommunityTopicModel> getResult()
  {
    return this.items;
  }

  public int getTotal()
  {
    return this.totalCount;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunityTopicInfo
 * JD-Core Version:    0.6.0
 */