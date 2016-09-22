package com.wandoujia.p4.community.http.model;

import java.io.Serializable;
import java.util.List;

public class CommunityTopicLikedUsersInfo
  implements Serializable
{
  private static final long serialVersionUID = 8940675037580507458L;
  public String hasMore;
  public List<CommunityUserModel> items;
  public int totalCount;
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunityTopicLikedUsersInfo
 * JD-Core Version:    0.6.0
 */