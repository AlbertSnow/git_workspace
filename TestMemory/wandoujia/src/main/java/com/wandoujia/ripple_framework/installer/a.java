package com.wandoujia.ripple_framework.installer;

import com.wandoujia.gamepacket.GamePacketInstaller;
import com.wandoujia.ripple_framework.installer.install.InstallManager;
import com.wandoujia.ripple_framework.installer.install.InstallTaskInfo;
import com.wandoujia.ripple_framework.installer.install.InstallTaskInfo.EventType;
import java.util.Map;

final class a
  implements Runnable
{
  a(AppTaskManager paramAppTaskManager, String paramString, InstallTaskInfo paramInstallTaskInfo)
  {
  }

  public final void run()
  {
    if (!AppTaskManager.a(this.c).a().b(this.a))
    {
      if (this.b.b() != InstallTaskInfo.EventType.INSTALLED)
        break label66;
      AppTaskManager.b(this.c).remove(this.a);
    }
    while (true)
    {
      AppTaskManager.a(this.c, this.b, this.a);
      return;
      label66: AppTaskManager.b(this.c).put(this.a, this.b.b());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.a
 * JD-Core Version:    0.6.0
 */