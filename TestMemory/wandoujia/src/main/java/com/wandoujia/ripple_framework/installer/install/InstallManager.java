package com.wandoujia.ripple_framework.installer.install;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.wandoujia.gamepacket.GamePacketInstaller;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.v;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.util.HashMap;
import java.util.Map;

public final class InstallManager
{
  private static Handler a = new Handler(Looper.getMainLooper());
  private m b;
  private m c = new com.wandoujia.ripple_framework.installer.install.impl.f();
  private m d;
  private i e;
  private GamePacketInstaller f;
  private Handler g;
  private final de.greenrobot.event.c h;
  private final DownloadManager i;
  private final Map<String, InstallManager.InstallSource> j = new HashMap();
  private final com.wandoujia.gamepacket.m k = new b(this);

  public InstallManager(Context paramContext, DownloadManager paramDownloadManager, de.greenrobot.event.c paramc)
  {
    if (!BadgeUtil.b(com.wandoujia.ripple_framework.i.k().g()));
    for (this.b = this.c; ; this.b = this.d)
    {
      this.f = new GamePacketInstaller(paramContext);
      this.f.a();
      this.f.a(this.k);
      this.e = new i(this, 0);
      HandlerThread localHandlerThread = new HandlerThread("installer_background");
      localHandlerThread.start();
      this.g = new Handler(localHandlerThread.getLooper());
      this.i = paramDownloadManager;
      this.h = paramc;
      this.i.a(new v());
      return;
      this.d = new com.wandoujia.ripple_framework.installer.install.impl.l(this.c);
    }
  }

  private void d(String paramString)
  {
    InstallTaskInfo localInstallTaskInfo = new InstallTaskInfo(paramString, InstallTaskInfo.EventType.INSTALL_START);
    ((AppTaskManager)com.wandoujia.ripple_framework.i.k().a("app_task")).a(paramString, localInstallTaskInfo);
    ((de.greenrobot.event.c)com.wandoujia.ripple_framework.i.k().a("event_bus")).d(new l(this.b instanceof com.wandoujia.ripple_framework.installer.install.impl.l));
  }

  public final GamePacketInstaller a()
  {
    return this.f;
  }

  public final String a(String paramString)
  {
    if (this.j.containsKey(paramString))
      return ((InstallManager.InstallSource)this.j.get(paramString)).name();
    return "";
  }

  public final void a(String paramString, InstallManager.InstallSource paramInstallSource)
  {
    String str = android.support.v4.app.b.M(paramString);
    this.j.put(str, paramInstallSource);
    d(str);
    this.g.post(new c(this, paramString, str));
  }

  public final void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, InstallManager.InstallSource.INITIATIVE);
  }

  public final void a(String paramString1, String paramString2, InstallManager.InstallSource paramInstallSource)
  {
    this.j.put(paramString2, paramInstallSource);
    this.g.post(new d(this, paramString1, paramString2));
  }

  public final void b(String paramString)
  {
    this.g.post(new g(this, paramString));
  }

  public final void b(String paramString1, String paramString2)
  {
    b(paramString1, paramString2, InstallManager.InstallSource.INITIATIVE);
  }

  public final void b(String paramString1, String paramString2, InstallManager.InstallSource paramInstallSource)
  {
    this.j.put(paramString2, paramInstallSource);
    d(paramString2);
    this.g.post(new f(this, paramString1, paramString2));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.InstallManager
 * JD-Core Version:    0.6.0
 */