package com.wandoujia.entities.app;

import java.io.Serializable;

public class DownloadUrl
  implements Serializable
{
  private int aggrWeight;
  private String market;
  private String referUrl;
  private String url;

  public int getAggrWeight()
  {
    return this.aggrWeight;
  }

  public String getMarket()
  {
    return this.market;
  }

  public String getReferUrl()
  {
    return this.referUrl;
  }

  public String getUrl()
  {
    return this.url;
  }

  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.DownloadUrl
 * JD-Core Version:    0.6.0
 */