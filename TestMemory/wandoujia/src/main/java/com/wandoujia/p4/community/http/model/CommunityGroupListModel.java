package com.wandoujia.p4.community.http.model;

import com.wandoujia.p4.community.http.b.n;
import java.io.Serializable;
import java.util.List;

public class CommunityGroupListModel
  implements n<CommunityGroupModel>, Serializable
{
  private static final long serialVersionUID = 6257928697041919395L;
  public String hasMore;
  private List<CommunityGroupModel> items;
  private int totalCount;

  public List<CommunityGroupModel> getResult()
  {
    return this.items;
  }

  public int getTotal()
  {
    return this.totalCount;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunityGroupListModel
 * JD-Core Version:    0.6.0
 */