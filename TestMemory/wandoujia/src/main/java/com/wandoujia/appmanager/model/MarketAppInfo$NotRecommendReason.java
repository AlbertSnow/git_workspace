package com.wandoujia.appmanager.model;

import java.io.Serializable;

public class MarketAppInfo$NotRecommendReason
  implements Serializable
{
  private String description;
  private boolean signatureMatch = true;
  private String type;

  public String getDescription()
  {
    return this.description;
  }

  public String getType()
  {
    return this.type;
  }

  public boolean isSignatureMatch()
  {
    return this.signatureMatch;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.model.MarketAppInfo.NotRecommendReason
 * JD-Core Version:    0.6.0
 */