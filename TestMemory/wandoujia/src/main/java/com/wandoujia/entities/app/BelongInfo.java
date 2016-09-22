package com.wandoujia.entities.app;

import java.io.Serializable;

public class BelongInfo
  implements Serializable
{
  private String alias;
  private int level;
  private String name;

  public String getAlias()
  {
    return this.alias;
  }

  public int getLevel()
  {
    return this.level;
  }

  public String getName()
  {
    return this.name;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.app.BelongInfo
 * JD-Core Version:    0.6.0
 */