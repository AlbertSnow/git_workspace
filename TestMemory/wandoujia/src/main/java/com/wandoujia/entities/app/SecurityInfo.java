package com.wandoujia.entities.app;

import java.io.Serializable;

public class SecurityInfo
  implements Serializable
{
  private String provider;
  private String status;

  public String getProvider()
  {
    return this.provider;
  }

  public String getStatus()
  {
    return this.status;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.SecurityInfo
 * JD-Core Version:    0.6.0
 */