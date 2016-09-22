package com.wandoujia.entities.game;

import java.io.Serializable;

public class GameBasicBean
  implements Serializable
{
  private static final long serialVersionUID = -7028353207810933873L;
  private int crashWithoutGsf;
  private long gameId;
  private int inAppPurchase;
  private int isOnlineGame;
  private String language;
  private int needNetwork;
  private String packageName;

  public String getLanguage()
  {
    return this.language;
  }

  public String getPackageName()
  {
    return this.packageName;
  }

  public void setPackageName(String paramString)
  {
    this.packageName = paramString;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.entities.game.GameBasicBean
 * JD-Core Version:    0.6.0
 */