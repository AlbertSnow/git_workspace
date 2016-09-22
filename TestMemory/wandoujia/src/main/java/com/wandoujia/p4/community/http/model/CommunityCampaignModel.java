package com.wandoujia.p4.community.http.model;

import com.wandoujia.mvc.BaseModel;
import java.io.Serializable;

public class CommunityCampaignModel
  implements BaseModel, Serializable
{
  private static final long serialVersionUID = -1632142299650702730L;
  private CommunityImageInfo icon;
  private String id;
  private String title;
  private String url;

  public CommunityImageInfo getIcon()
  {
    return this.icon;
  }

  public String getId()
  {
    return this.id;
  }

  public String getTitle()
  {
    return this.title;
  }

  public String getUrl()
  {
    return this.url;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.model.CommunityCampaignModel
 * JD-Core Version:    0.6.0
 */