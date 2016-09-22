package com.tencent.connect.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.widget.Toast;
import com.tencent.open.a.f;

public final class b
{
  private c a;

  private b(String paramString, Context paramContext)
  {
    f.c("openSDK_LOG.QQAuth", "new QQAuth() --start");
    this.a = new c(paramString);
    new a(this.a);
    com.tencent.connect.a.a.a(paramContext, this.a);
    f.c("openSDK_LOG.QQAuth", "new QQAuth() --end");
  }

  public static b a(String paramString, Context paramContext)
  {
    android.support.v4.app.b.j(paramContext.getApplicationContext());
    f.c("openSDK_LOG.QQAuth", "QQAuth -- createInstance() --start");
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      localPackageManager.getActivityInfo(new ComponentName(paramContext.getPackageName(), "com.tencent.tauth.AuthActivity"), 0);
      localPackageManager.getActivityInfo(new ComponentName(paramContext.getPackageName(), "com.tencent.connect.common.AssistActivity"), 0);
      b localb = new b(paramString, paramContext);
      f.c("openSDK_LOG.QQAuth", "QQAuth -- createInstance()  --end");
      return localb;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      f.b("openSDK_LOG.QQAuth", "createInstance() error --end", localNameNotFoundException);
      Toast.makeText(paramContext.getApplicationContext(), "请参照文档在Androidmanifest.xml加上AuthActivity和AssitActivity的定义 ", 1).show();
    }
    return null;
  }

  public final c a()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.b.b
 * JD-Core Version:    0.6.0
 */