package com.wandoujia.p4.feedback.model;

import java.io.Serializable;

public class NetworkInfo
  implements Serializable
{
  private String provider;
  private String type;

  public String getProvider()
  {
    return this.provider;
  }

  public String getType()
  {
    return this.type;
  }

  public void setProvider(String paramString)
  {
    this.provider = paramString;
  }

  public void setType(String paramString)
  {
    this.type = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.model.NetworkInfo
 * JD-Core Version:    0.6.0
 */