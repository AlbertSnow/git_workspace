package com.wandoujia.entities.app;

import java.io.Serializable;
import java.util.List;

public class ScreenShotSet
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
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.ScreenShotSet
 * JD-Core Version:    0.6.0
 */