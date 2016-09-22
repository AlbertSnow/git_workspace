package com.wandoujia.entities.game;

import java.io.Serializable;

public class GameTag
  implements Serializable
{
  private GameTag.TagColor color;
  private String configureUrl;
  private String icon;
  private long tagId;
  private String tagName;
  private int tagType;

  public GameTag.TagColor getColor()
  {
    return this.color;
  }

  public String getIcon()
  {
    return this.icon;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.game.GameTag
 * JD-Core Version:    0.6.0
 */