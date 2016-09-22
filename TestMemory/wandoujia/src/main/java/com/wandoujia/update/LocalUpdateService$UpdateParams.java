package com.wandoujia.update;

import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.update.protocol.CheckUpdateProtocol;
import java.io.Serializable;

public class LocalUpdateService$UpdateParams
  implements Serializable
{
  private static final long serialVersionUID = 5281314221163148659L;
  public CheckUpdateProtocol checkUpdateProtocol;
  public boolean downloadInstallerOnlyOnWifi = true;
  public int notificationIcon = -1;
  public long updateDelayMs = 120000L;
  public long updateDurationMs = 7200000L;

  public LocalUpdateService$UpdateParams()
  {
    if (GlobalConfig.isInternalPackage())
    {
      this.updateDelayMs = 60000L;
      this.updateDurationMs = 60000L;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.LocalUpdateService.UpdateParams
 * JD-Core Version:    0.6.0
 */