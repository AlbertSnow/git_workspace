package com.tencent.tauth;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.tencent.connect.c.a;
import com.tencent.open.a.f;

public final class c
{
  private static c b;
  private final com.tencent.connect.b.b a;

  private c(String paramString, Context paramContext)
  {
    android.support.v4.app.b.j(paramContext.getApplicationContext());
    this.a = com.tencent.connect.b.b.a(paramString, paramContext);
  }

  public static c a(String paramString, Context paramContext)
  {
    monitorenter;
    while (true)
    {
      try
      {
        android.support.v4.app.b.j(paramContext.getApplicationContext());
        f.c("openSDK_LOG.Tencent", "createInstance()  -- start");
        if (b != null)
          continue;
        b = new c(paramString, paramContext);
        boolean bool = a(paramContext, paramString);
        localc2 = null;
        if (!bool)
        {
          return localc2;
          if (paramString.equals(b.a.a().b()))
            continue;
          c localc1 = b;
          f.c("openSDK_LOG.Tencent", "logout()");
          localc1.a.a().a(null, "0");
          localc1.a.a().a(null);
          b = new c(paramString, paramContext);
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      f.c("openSDK_LOG.Tencent", "createInstance()  -- end");
      c localc2 = b;
    }
  }

  // ERROR //
  private static boolean a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: new 79	android/content/ComponentName
    //   3: dup
    //   4: aload_0
    //   5: invokevirtual 82	android/content/Context:getPackageName	()Ljava/lang/String;
    //   8: ldc 84
    //   10: invokespecial 86	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   13: astore_2
    //   14: aload_0
    //   15: invokevirtual 90	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   18: aload_2
    //   19: iconst_0
    //   20: invokevirtual 96	android/content/pm/PackageManager:getActivityInfo	(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    //   23: pop
    //   24: new 79	android/content/ComponentName
    //   27: dup
    //   28: aload_0
    //   29: invokevirtual 82	android/content/Context:getPackageName	()Ljava/lang/String;
    //   32: ldc 98
    //   34: invokespecial 86	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: astore 7
    //   39: aload_0
    //   40: invokevirtual 90	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   43: aload 7
    //   45: iconst_0
    //   46: invokevirtual 96	android/content/pm/PackageManager:getActivityInfo	(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    //   49: pop
    //   50: iconst_1
    //   51: ireturn
    //   52: astore_3
    //   53: new 100	java/lang/StringBuilder
    //   56: dup
    //   57: ldc 102
    //   59: invokespecial 104	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   62: aload_1
    //   63: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: ldc 110
    //   68: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: astore 4
    //   76: new 100	java/lang/StringBuilder
    //   79: dup
    //   80: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   83: aload 4
    //   85: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: ldc 116
    //   90: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: aload_1
    //   94: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: ldc 118
    //   99: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: astore 5
    //   107: ldc 35
    //   109: new 100	java/lang/StringBuilder
    //   112: dup
    //   113: ldc 120
    //   115: invokespecial 104	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   118: aload 5
    //   120: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   126: invokestatic 123	com/tencent/open/a/f:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   129: iconst_0
    //   130: ireturn
    //   131: astore 8
    //   133: new 100	java/lang/StringBuilder
    //   136: dup
    //   137: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   140: ldc 125
    //   142: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: ldc 127
    //   147: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: astore 9
    //   155: ldc 35
    //   157: new 100	java/lang/StringBuilder
    //   160: dup
    //   161: ldc 129
    //   163: invokespecial 104	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   166: aload 9
    //   168: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   174: invokestatic 123	com/tencent/open/a/f:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   177: iconst_0
    //   178: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	24	52	android/content/pm/PackageManager$NameNotFoundException
    //   24	50	131	android/content/pm/PackageManager$NameNotFoundException
  }

  public final com.tencent.connect.b.c a()
  {
    return this.a.a();
  }

  public final void a(Activity paramActivity, Bundle paramBundle, b paramb)
  {
    f.c("openSDK_LOG.Tencent", "shareToQQ()");
    new a(this.a.a()).a(paramActivity, paramBundle, paramb);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.tauth.c
 * JD-Core Version:    0.6.0
 */