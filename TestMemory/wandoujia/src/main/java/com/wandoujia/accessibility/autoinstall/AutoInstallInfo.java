package com.wandoujia.accessibility.autoinstall;

import java.io.Serializable;

public class AutoInstallInfo
  implements Serializable
{
  private static final long serialVersionUID = 5799558217064626766L;
  private boolean isBlocked = false;

  public boolean getIsBlocked()
  {
    return this.isBlocked;
  }

  public void setIsBlocked(boolean paramBoolean)
  {
    this.isBlocked = paramBoolean;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.autoinstall.AutoInstallInfo
 * JD-Core Version:    0.6.0
 */