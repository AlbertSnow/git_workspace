package com.wandoujia.p4;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.StatFs;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.launcher.LauncherConfig;
import com.wandoujia.launcher.LauncherConfig.LauncherType;
import com.wandoujia.p4.app_launcher.manager.ALManager;
import com.wandoujia.ripple_framework.AppMd5Manager;
import com.wandoujia.ripple_framework.e;
import com.wandoujia.ripple_framework.i;
import java.io.File;

public final class a
{
  private static com.wandoujia.p4.http.a.a a;
  private static com.wandoujia.launcher.d b;
  private static ALManager c;
  private static final e d = new b();

  public static Context a()
  {
    return JupiterApplication.e();
  }

  public static com.wandoujia.p4.http.a.a b()
  {
    monitorenter;
    try
    {
      int i;
      Object localObject2;
      if (a == null)
      {
        new com.wandoujia.ripple_framework.a.a.a();
        StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
        if ((localStatFs.getAvailableBlocks() * localStatFs.getBlockSize() >= 268435456L) || (!"mounted".equals(Environment.getExternalStorageState())))
          break label124;
        i = 1;
        if (i == 0)
          break label158;
        File localFile = SystemUtil.getDeviceExternalCacheDir();
        if (localFile == null)
          break label129;
        localObject2 = localFile.getAbsolutePath() + "/DataCache";
      }
      while (true)
      {
        a = new com.wandoujia.p4.http.a.a((String)localObject2);
        com.wandoujia.p4.http.a.a locala = a;
        return locala;
        label124: i = 0;
        break;
        label129: localObject2 = JupiterApplication.e().getCacheDir() + "/DataCache";
        continue;
        label158: String str = JupiterApplication.e().getCacheDir() + "/DataCache";
        localObject2 = str;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }

  public static void c()
  {
    new Handler().postDelayed(new c(), 1000L);
    ((AppMd5Manager)i.k().a("app_md5")).a(d);
    new Thread(new d()).start();
  }

  public static Handler d()
  {
    return JupiterApplication.a();
  }

  public static ALManager e()
  {
    if (c == null)
      g();
    return c;
  }

  private static void g()
  {
    if (c != null)
      return;
    com.wandoujia.launcher_base.b.a.b();
    com.wandoujia.launcher_base.b.a.i();
    b = new com.wandoujia.launcher.d();
    LauncherConfig.b(LauncherConfig.LauncherType.NATIVE_GL);
    b.a();
    com.wandoujia.launcher_base.b.a.a(b());
    c = new ALManager();
    ThreadPool.execute(new f());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.a
 * JD-Core Version:    0.6.0
 */