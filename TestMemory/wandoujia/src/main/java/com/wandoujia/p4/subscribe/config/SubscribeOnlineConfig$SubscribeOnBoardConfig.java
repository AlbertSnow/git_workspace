package com.wandoujia.p4.subscribe.config;

import java.io.Serializable;

public class SubscribeOnlineConfig$SubscribeOnBoardConfig
  implements Serializable
{
  private static final long serialVersionUID = 1716547846425168767L;
  private boolean login;
  private boolean notification;
  private boolean register;
  private boolean update;

  public boolean showWhenLogined()
  {
    return this.login;
  }

  public boolean showWhenNotificationClicked()
  {
    return this.notification;
  }

  public boolean showWhenRegisterd()
  {
    return this.register;
  }

  public boolean showWhenUpdated()
  {
    return this.update;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.config.SubscribeOnlineConfig.SubscribeOnBoardConfig
 * JD-Core Version:    0.6.0
 */