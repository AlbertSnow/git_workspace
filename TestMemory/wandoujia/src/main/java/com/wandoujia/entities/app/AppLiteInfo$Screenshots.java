package com.wandoujia.entities.app;

import java.io.Serializable;
import java.util.List;

public class AppLiteInfo$Screenshots
  implements Serializable
{
  private List<String> normal;
  private List<String> small;

  public List<String> getNormal()
  {
    return this.normal;
  }

  public List<String> getSmall()
  {
    return this.small;
  }

  public void setNormal(List<String> paramList)
  {
    this.normal = paramList;
  }

  public void setSmall(List<String> paramList)
  {
    this.small = paramList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.AppLiteInfo.Screenshots
 * JD-Core Version:    0.6.0
 */