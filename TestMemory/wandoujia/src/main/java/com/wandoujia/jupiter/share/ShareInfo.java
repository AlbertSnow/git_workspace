package com.wandoujia.jupiter.share;

import java.io.Serializable;

public class ShareInfo
  implements Serializable
{
  private static final long serialVersionUID = -2619019611358151544L;
  private String description = "";
  private String imageUrl = "";
  private String title = "";
  private String url = "";

  public String getDescription()
  {
    return this.description;
  }

  public String getImageUrl()
  {
    return this.imageUrl;
  }

  public String getTitle()
  {
    return this.title;
  }

  public String getUrl()
  {
    return this.url;
  }

  public void setDescription(String paramString)
  {
    this.description = paramString;
  }

  public void setImageUrl(String paramString)
  {
    this.imageUrl = paramString;
  }

  public void setTitle(String paramString)
  {
    this.title = paramString;
  }

  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.share.ShareInfo
 * JD-Core Version:    0.6.0
 */