package com.wandoujia.p4.community.http.model;

import java.io.Serializable;
import java.util.List;

public class CommunityActivityListModel
  implements Serializable
{
  private static final long serialVersionUID = -6942297704674709199L;
  private String hasMore;
  private List<CommunityCampaignModel> items;
  private int totalCount;

  public List<CommunityCampaignModel> getItems()
  {
    return this.items;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunityActivityListModel
 * JD-Core Version:    0.6.0
 */