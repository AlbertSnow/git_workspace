package com.wandoujia.ripple_framework.installer.install;

import com.wandoujia.gamepacket.GamePacketInstaller.InstallStatus;
import com.wandoujia.gamepacket.m;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.j;
import de.greenrobot.event.c;

final class b
  implements m
{
  b(InstallManager paramInstallManager)
  {
  }

  public final void a(String paramString, int paramInt)
  {
    InstallTaskInfo localInstallTaskInfo = new InstallTaskInfo(paramString, InstallTaskInfo.EventType.UNZIPPING);
    localInstallTaskInfo.a(paramInt);
    ((AppTaskManager)i.k().a("app_task")).a(paramString, localInstallTaskInfo);
    ((c)i.k().a("event_bus")).d(new j(EventBusManager.Type.PACKET_UNZIPPING, paramString));
  }

  public final void a(String paramString, GamePacketInstaller.InstallStatus paramInstallStatus)
  {
    switch (h.a[paramInstallStatus.ordinal()])
    {
    default:
      return;
    case 1:
      ((AppTaskManager)i.k().a("app_task")).a(paramString, new InstallTaskInfo(paramString, InstallTaskInfo.EventType.GAME_PACKET_PENDING));
      return;
    case 2:
      ((AppTaskManager)i.k().a("app_task")).a(paramString, new InstallTaskInfo(paramString, InstallTaskInfo.EventType.UNZIPPING));
      return;
    case 3:
    }
    ((AppTaskManager)i.k().a("app_task")).a(paramString, new InstallTaskInfo(paramString, InstallTaskInfo.EventType.GAME_PACKET_FAILED));
  }

  public final void a(String paramString1, String paramString2)
  {
    this.a.b(paramString2, paramString1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.b
 * JD-Core Version:    0.6.0
 */