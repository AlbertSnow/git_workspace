package com.wandoujia.entities.game;

import java.io.Serializable;
import java.util.List;

public class GameDetailInfo
  implements Serializable
{
  private static final long serialVersionUID = -5929264870601334376L;
  private GameBasicBean basic;
  private List<GameTag> tags;

  public GameBasicBean getBasic()
  {
    return this.basic;
  }

  public List<GameTag> getTags()
  {
    return this.tags;
  }

  public void setBasic(GameBasicBean paramGameBasicBean)
  {
    this.basic = paramGameBasicBean;
  }

  public void setTags(List<GameTag> paramList)
  {
    this.tags = paramList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.game.GameDetailInfo
 * JD-Core Version:    0.6.0
 */