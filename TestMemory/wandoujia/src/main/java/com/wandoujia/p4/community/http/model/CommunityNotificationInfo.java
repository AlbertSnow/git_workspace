package com.wandoujia.p4.community.http.model;

import com.wandoujia.p4.community.http.b.n;
import java.io.Serializable;
import java.util.List;

public class CommunityNotificationInfo
  implements n<CommunityNotificationModel>, Serializable
{
  private boolean hasMore;
  private List<CommunityNotificationModel> items;
  private int totalCount;

  public List<CommunityNotificationModel> getResult()
  {
    return this.items;
  }

  public int getTotal()
  {
    return this.totalCount;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunityNotificationInfo
 * JD-Core Version:    0.6.0
 */