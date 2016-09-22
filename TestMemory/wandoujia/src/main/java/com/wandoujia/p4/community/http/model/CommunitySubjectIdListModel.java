package com.wandoujia.p4.community.http.model;

import java.io.Serializable;
import java.util.List;

public class CommunitySubjectIdListModel
  implements Serializable
{
  private static final long serialVersionUID = -8505647783625769236L;
  private String hasMore;
  private List<String> items;
  private int totalCount;

  public List<String> getItems()
  {
    return this.items;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunitySubjectIdListModel
 * JD-Core Version:    0.6.0
 */