package com.wandoujia.p4.connection.a;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.widget.Toast;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.AppUtils;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.connection.IConnectionService;
import com.wandoujia.connection.IConnectionServiceCallback;
import com.wandoujia.download2.DownloadRequestParam.Type;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.ripple_framework.ReceiverMonitor;
import com.wandoujia.ripple_framework.ReceiverMonitor.AppActionType;
import com.wandoujia.ripple_framework.download.q;
import com.wandoujia.ripple_framework.download.r;
import com.wandoujia.ripple_framework.l;
import java.util.List;

public final class a
  implements l
{
  private static a a = null;
  private IConnectionService b;
  private ServiceConnection c = new b(this);
  private IConnectionServiceCallback d = new c();

  private a()
  {
    ReceiverMonitor.a().a(this);
  }

  public static a a()
  {
    if (a == null)
      a = new a();
    return a;
  }

  public static void a(Context paramContext, Intent paramIntent)
  {
    if (b(paramContext));
    try
    {
      paramIntent.setClassName("com.wandoujia.phoenix2.usbproxy", "com.wandoujia.phoenix2.services.ConnectionService");
      paramContext.startService(paramIntent);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static boolean a(Context paramContext)
  {
    PackageInfo localPackageInfo = AppUtils.getPackageInfo(paramContext, "com.wandoujia.phoenix2.usbproxy", 0);
    if (localPackageInfo != null);
    for (int i = localPackageInfo.versionCode; ; i = 0)
    {
      int j = 0;
      if (6210 > i)
        j = 1;
      return j;
    }
  }

  public static boolean b(Context paramContext)
  {
    try
    {
      Intent localIntent = new Intent();
      localIntent.setClassName("com.wandoujia.phoenix2.usbproxy", "com.wandoujia.phoenix2.services.ConnectionService");
      int i = paramContext.getPackageManager().queryIntentServices(localIntent, 0).size();
      int j = 0;
      if (i > 0)
        j = 1;
      return j;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static void c()
  {
    r localr = new r();
    localr.a(DownloadRequestParam.Type.APP);
    localr.b("http://dl.wandoujia.com/download-files/windows/conn_3.52.2.6210.apk");
    localr.h("com.wandoujia.phoenix2.usbproxy");
    localr.a(ContentTypeEnum.ContentType.APP);
    localr.f(GlobalConfig.getAppContext().getString(2131624297));
    localr.g("http://upload.cdn.wandoujia.com/phoenix/notification/wdj_icon_192_192.png");
    localr.e("com.wandoujia.phoenix2.usbproxy");
    localr.l("wdj://download/conn_apk");
    q localq = localr.b();
    JupiterApplication.a().post(new e(localq));
    Toast.makeText(com.wandoujia.p4.a.a(), 2131625509, 0).show();
  }

  public final void a(ReceiverMonitor.AppActionType paramAppActionType, List<String> paramList)
  {
    ThreadPool.execute(new d(paramList, paramAppActionType));
  }

  // ERROR //
  public final void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 59	android/content/Intent
    //   5: dup
    //   6: invokespecial 83	android/content/Intent:<init>	()V
    //   9: astore_1
    //   10: aload_1
    //   11: ldc 55
    //   13: ldc 57
    //   15: invokevirtual 63	android/content/Intent:setClassName	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   18: pop
    //   19: invokestatic 133	com/wandoujia/base/config/GlobalConfig:getAppContext	()Landroid/content/Context;
    //   22: aload_1
    //   23: aload_0
    //   24: getfield 28	com/wandoujia/p4/connection/a/a:c	Landroid/content/ServiceConnection;
    //   27: iconst_1
    //   28: invokevirtual 228	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   31: pop
    //   32: aload_0
    //   33: monitorexit
    //   34: return
    //   35: astore_3
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_3
    //   39: athrow
    //   40: astore_2
    //   41: goto -9 -> 32
    //
    // Exception table:
    //   from	to	target	type
    //   2	32	35	finally
    //   2	32	40	java/lang/Throwable
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.connection.a.a
 * JD-Core Version:    0.6.0
 */