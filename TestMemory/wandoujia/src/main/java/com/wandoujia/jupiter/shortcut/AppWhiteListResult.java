package com.wandoujia.jupiter.shortcut;

import java.io.Serializable;
import java.util.List;

public class AppWhiteListResult
  implements Serializable
{
  private List<AppWhiteListResult.Entity> entity;

  public List<AppWhiteListResult.Entity> getEntity()
  {
    return this.entity;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.shortcut.AppWhiteListResult
 * JD-Core Version:    0.6.0
 */