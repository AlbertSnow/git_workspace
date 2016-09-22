package com.wandoujia.p4.subscribe.config;

import java.io.Serializable;

public class SubscribeOnlineConfig
  implements Serializable
{
  private static final long serialVersionUID = -6444420656883361353L;
  private SubscribeOnlineConfig.SubscribeOnBoardConfig onBoard;

  public SubscribeOnlineConfig.SubscribeOnBoardConfig getOnBoard()
  {
    return this.onBoard;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.config.SubscribeOnlineConfig
 * JD-Core Version:    0.6.0
 */