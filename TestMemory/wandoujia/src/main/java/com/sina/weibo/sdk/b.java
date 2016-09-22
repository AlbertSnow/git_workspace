package com.sina.weibo.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import android.os.Environment;
import com.sina.weibo.sdk.net.a;
import java.util.concurrent.CountDownLatch;

public class b
{
  public static final String a;
  private static final String b = b.class.getName();
  private static b d;
  private Context c;
  private CountDownLatch e;
  private e f;
  private String g;
  private boolean h = true;

  static
  {
    a = Environment.getExternalStorageDirectory() + "/Android/org_share_data/";
  }

  private b(Context paramContext, String paramString)
  {
    this.c = paramContext.getApplicationContext();
    this.g = paramString;
  }

  public static b a(Context paramContext, String paramString)
  {
    monitorenter;
    try
    {
      if (d == null)
        d = new b(paramContext, paramString);
      b localb = d;
      return localb;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private static boolean a(PackageInfo paramPackageInfo)
  {
    if (paramPackageInfo == null);
    while (true)
    {
      return false;
      if (paramPackageInfo.signatures != null)
        break;
      if (Build.VERSION.SDK_INT < 11)
        return true;
    }
    String str = "";
    for (int i = 0; ; i++)
    {
      if (i >= paramPackageInfo.signatures.length)
        return "18da2bf10352443a00a5e046d9fca6bd".equals(str);
      byte[] arrayOfByte = paramPackageInfo.signatures[i].toByteArray();
      if (arrayOfByte == null)
        continue;
      str = com.sina.weibo.sdk.a.f.a(arrayOfByte);
    }
  }

  public final void a()
  {
    g localg = f.a(this.c).a();
    if ((localg != null) && (localg.c()));
    for (int i = 0; ; i = 1)
    {
      if ((i != 0) && (this.h))
      {
        this.h = false;
        this.e = new CountDownLatch(1);
        String str1 = this.g;
        Context localContext = this.c;
        d locald = new d(this);
        String str2 = localContext.getPackageName();
        String str3 = android.support.v4.app.b.c(localContext, str2);
        com.sina.weibo.sdk.net.g localg1 = new com.sina.weibo.sdk.net.g(str1);
        localg1.a("appkey", str1);
        localg1.a("packagename", str2);
        localg1.a("key_hash", str3);
        new a(localContext).a("http://api.weibo.cn/2/client/common_config", localg1, "GET", locald);
        new Thread(new c(this, a)).start();
      }
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.b
 * JD-Core Version:    0.6.0
 */