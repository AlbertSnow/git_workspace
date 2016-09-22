package com.wandoujia.p4.community.http.model;

import com.wandoujia.p4.community.http.b.n;
import java.io.Serializable;
import java.util.List;

public class CommunityReplyInfo
  implements n<CommunityReplyModel>, Serializable
{
  public boolean hasMore;
  private List<CommunityReplyModel> items;
  private int totalCount;

  public List<CommunityReplyModel> getResult()
  {
    return this.items;
  }

  public int getTotal()
  {
    return this.totalCount;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunityReplyInfo
 * JD-Core Version:    0.6.0
 */