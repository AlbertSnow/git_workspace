package com.wandoujia.appmanager;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.app.d;
import android.text.TextUtils;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.SystemUtil.InstallOption;
import com.wandoujia.rootkit.exceptions.RootDeniedException;
import com.wandoujia.rootkit.exceptions.RootKitException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;

public final class ai
{
  private static Set<String> d = new HashSet();
  private final Context a;
  private final ExecutorService b;
  private final Handler c;
  private ArrayList<ao> e = new ArrayList();
  private Runnable f = new aj(this);

  public ai(Context paramContext)
  {
    this.a = paramContext;
    this.b = Executors.newSingleThreadExecutor();
    new d(paramContext);
    this.c = new Handler(an.a().getLooper());
  }

  private static int a(String paramString, ah paramah)
  {
    paramah.d(paramString);
    Object localObject = new com.wandoujia.rootkit.a.b();
    int i = 0;
    try
    {
      com.wandoujia.rootkit.a.b localb = com.wandoujia.rootkit.b.a().a(paramString);
      localObject = localb;
      if (((com.wandoujia.rootkit.a.b)localObject).a())
      {
        HashMap localHashMap = new HashMap();
        if (!TextUtils.isEmpty("root.uninstall.sucess"))
          localHashMap.put("root.uninstall.sucess", "0");
        android.support.v4.app.b.a("root.uninstall.sucess", localHashMap);
        if ((i == 0) && (!((com.wandoujia.rootkit.a.b)localObject).a()))
          i = 1000;
        if (i != 0)
          paramah.b(paramString, i);
        return i;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        ((com.wandoujia.rootkit.a.b)localObject).d();
        i = 1004;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ((com.wandoujia.rootkit.a.b)localObject).e();
        i = 1001;
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      while (true)
      {
        ((com.wandoujia.rootkit.a.b)localObject).c();
        i = 1003;
      }
    }
    catch (RootDeniedException localRootDeniedException)
    {
      while (true)
      {
        ((com.wandoujia.rootkit.a.b)localObject).f();
        i = 1002;
        continue;
        android.support.v4.app.b.a("root.uninstall.failed", android.support.v4.app.b.h("root.uninstall.failed", ((com.wandoujia.rootkit.a.b)localObject).b()));
      }
    }
  }

  // ERROR //
  private static int a(String paramString1, String paramString2, ah paramah)
  {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: invokevirtual 87	com/wandoujia/appmanager/ah:d	(Ljava/lang/String;)V
    //   5: invokestatic 95	com/wandoujia/rootkit/b:a	()Lcom/wandoujia/rootkit/b;
    //   8: pop
    //   9: ldc 146
    //   11: ldc 148
    //   13: invokestatic 151	com/wandoujia/rootkit/b:b	(Ljava/lang/String;Ljava/lang/String;)Z
    //   16: istore 4
    //   18: iconst_0
    //   19: istore 5
    //   21: iload 4
    //   23: ifne +8 -> 31
    //   26: sipush 1005
    //   29: istore 5
    //   31: new 89	com/wandoujia/rootkit/a/b
    //   34: dup
    //   35: invokespecial 90	com/wandoujia/rootkit/a/b:<init>	()V
    //   38: astore 6
    //   40: iload 5
    //   42: ifne +298 -> 340
    //   45: new 153	java/io/File
    //   48: dup
    //   49: aload_1
    //   50: invokespecial 155	java/io/File:<init>	(Ljava/lang/String;)V
    //   53: invokevirtual 158	java/io/File:exists	()Z
    //   56: ifeq +185 -> 241
    //   59: invokestatic 95	com/wandoujia/rootkit/b:a	()Lcom/wandoujia/rootkit/b;
    //   62: new 160	java/lang/StringBuilder
    //   65: dup
    //   66: ldc 162
    //   68: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   71: aload_1
    //   72: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: ldc 169
    //   77: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   83: invokevirtual 174	com/wandoujia/rootkit/b:b	(Ljava/lang/String;)Lcom/wandoujia/rootkit/a/b;
    //   86: astore 23
    //   88: iload 5
    //   90: istore 7
    //   92: aload 23
    //   94: astore 8
    //   96: aload 8
    //   98: invokevirtual 101	com/wandoujia/rootkit/a/b:a	()Z
    //   101: ifeq +224 -> 325
    //   104: iload 7
    //   106: ifne +219 -> 325
    //   109: new 89	com/wandoujia/rootkit/a/b
    //   112: dup
    //   113: invokespecial 90	com/wandoujia/rootkit/a/b:<init>	()V
    //   116: astore 12
    //   118: aload_1
    //   119: ldc 176
    //   121: ldc 178
    //   123: invokevirtual 184	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   126: astore 13
    //   128: new 153	java/io/File
    //   131: dup
    //   132: aload 13
    //   134: invokespecial 155	java/io/File:<init>	(Ljava/lang/String;)V
    //   137: invokevirtual 158	java/io/File:exists	()Z
    //   140: ifeq +137 -> 277
    //   143: invokestatic 95	com/wandoujia/rootkit/b:a	()Lcom/wandoujia/rootkit/b;
    //   146: new 160	java/lang/StringBuilder
    //   149: dup
    //   150: ldc 162
    //   152: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   155: aload 13
    //   157: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: ldc 169
    //   162: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   168: invokevirtual 174	com/wandoujia/rootkit/b:b	(Ljava/lang/String;)Lcom/wandoujia/rootkit/a/b;
    //   171: astore 18
    //   173: aload 18
    //   175: invokevirtual 101	com/wandoujia/rootkit/a/b:a	()Z
    //   178: ifne +136 -> 314
    //   181: sipush 1000
    //   184: ireturn
    //   185: astore 22
    //   187: aload 6
    //   189: astore 8
    //   191: sipush 1004
    //   194: istore 7
    //   196: goto -100 -> 96
    //   199: astore 21
    //   201: aload 6
    //   203: astore 8
    //   205: sipush 1001
    //   208: istore 7
    //   210: goto -114 -> 96
    //   213: astore 20
    //   215: aload 6
    //   217: astore 8
    //   219: sipush 1003
    //   222: istore 7
    //   224: goto -128 -> 96
    //   227: astore 19
    //   229: aload 6
    //   231: astore 8
    //   233: sipush 1002
    //   236: istore 7
    //   238: goto -142 -> 96
    //   241: sipush 1008
    //   244: istore 7
    //   246: aload 6
    //   248: astore 8
    //   250: goto -154 -> 96
    //   253: astore 17
    //   255: sipush 1004
    //   258: ireturn
    //   259: astore 16
    //   261: sipush 1001
    //   264: ireturn
    //   265: astore 15
    //   267: sipush 1003
    //   270: ireturn
    //   271: astore 14
    //   273: sipush 1002
    //   276: ireturn
    //   277: sipush 1008
    //   280: istore 10
    //   282: aload 12
    //   284: astore 11
    //   286: iload 10
    //   288: ifne +16 -> 304
    //   291: aload 11
    //   293: invokevirtual 101	com/wandoujia/rootkit/a/b:a	()Z
    //   296: ifne +8 -> 304
    //   299: sipush 1000
    //   302: istore 10
    //   304: aload_2
    //   305: aload_0
    //   306: iload 10
    //   308: invokevirtual 126	com/wandoujia/appmanager/ah:b	(Ljava/lang/String;I)V
    //   311: iload 10
    //   313: ireturn
    //   314: iload 7
    //   316: istore 10
    //   318: aload 18
    //   320: astore 11
    //   322: goto -36 -> 286
    //   325: aload 8
    //   327: astore 9
    //   329: iload 7
    //   331: istore 10
    //   333: aload 9
    //   335: astore 11
    //   337: goto -51 -> 286
    //   340: iload 5
    //   342: istore 7
    //   344: aload 6
    //   346: astore 8
    //   348: goto -252 -> 96
    //
    // Exception table:
    //   from	to	target	type
    //   59	88	185	java/lang/InterruptedException
    //   59	88	199	java/io/IOException
    //   59	88	213	java/util/concurrent/TimeoutException
    //   59	88	227	com/wandoujia/rootkit/exceptions/RootDeniedException
    //   143	173	253	java/lang/InterruptedException
    //   143	173	259	java/io/IOException
    //   143	173	265	java/util/concurrent/TimeoutException
    //   143	173	271	com/wandoujia/rootkit/exceptions/RootDeniedException
  }

  private static PackageInfo a(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      PackageInfo localPackageInfo = localPackageManager.getPackageInfo(paramString, 0);
      return localPackageInfo;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      return null;
    }
    catch (RuntimeException localRuntimeException)
    {
    }
    return null;
  }

  private boolean a(String paramString1, String paramString2, boolean paramBoolean, ah paramah)
  {
    if (paramString1.startsWith("file://"));
    for (String str = paramString1.substring(7); (!str.endsWith(".apk")) || (TextUtils.isEmpty(paramString2)); str = paramString1)
    {
      paramah.a(paramString2, 1009);
      return false;
    }
    if ((paramBoolean) && (com.wandoujia.rootkit.b.a().c()))
    {
      int k = b(paramString2, str, paramah);
      if (k != 0)
      {
        paramah.a(paramString2, k);
        c(paramString1, paramString2, paramah);
      }
    }
    while (true)
    {
      return true;
      int i = d.a(paramString1, new am(paramah, paramString2));
      int j = 0;
      if (i < 0);
      while (j != 0)
      {
        return true;
        paramah.c(paramString2);
        j = 1;
      }
      c(paramString1, paramString2, paramah);
    }
  }

  private static int b(String paramString1, String paramString2, ah paramah)
  {
    paramah.c(paramString1);
    SystemUtil.InstallOption localInstallOption = a.a().a();
    if (!SystemUtil.checkSpaceEnough(paramString2, localInstallOption))
      localInstallOption = SystemUtil.InstallOption.AUTO;
    com.wandoujia.rootkit.a.b localb1 = new com.wandoujia.rootkit.a.b();
    try
    {
      com.wandoujia.rootkit.a.b localb3 = com.wandoujia.rootkit.b.a().a(paramString2, localInstallOption.name());
      localb2 = localb3;
      i = 0;
      if (localb2.a())
      {
        android.support.v4.app.b.a("root.install.sucess", android.support.v4.app.b.h("root.install.sucess", localb2.b()));
        if ((i == 0) && (!localb2.a()))
          i = 1000;
        if (i != 0)
          paramah.a(paramString1, i);
        return i;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        localb1.d();
        i = 1004;
        localb2 = localb1;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        localb1.e();
        i = 1001;
        localb2 = localb1;
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      while (true)
      {
        localb1.c();
        i = 1003;
        localb2 = localb1;
      }
    }
    catch (RootDeniedException localRootDeniedException)
    {
      while (true)
      {
        localb1.f();
        i = 1002;
        localb2 = localb1;
      }
    }
    catch (RootKitException localRootKitException)
    {
      while (true)
      {
        localb1.g();
        int i = 1002;
        com.wandoujia.rootkit.a.b localb2 = localb1;
        continue;
        android.support.v4.app.b.a("root.install.failed", android.support.v4.app.b.h("root.install.failed", localb2.b()));
      }
    }
  }

  private boolean b(String paramString, ah paramah)
  {
    try
    {
      Uri localUri = Uri.parse("package:" + paramString);
      if (localUri == null)
      {
        paramah.b(paramString, 1009);
      }
      else
      {
        Intent localIntent = new Intent("android.intent.action.DELETE", localUri);
        localIntent.setFlags(268435456);
        this.a.startActivity(localIntent);
      }
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      return false;
    }
    return true;
  }

  private void c(String paramString1, String paramString2, ah paramah)
  {
    this.c.removeCallbacks(this.f);
    String str = AppManager.j(paramString1);
    synchronized (this.e)
    {
      this.e.add(new ao(paramString1, paramString2, paramah, str, 0));
      this.c.postDelayed(this.f, 1000L);
      return;
    }
  }

  public final void a(String paramString, boolean paramBoolean, ah paramah)
  {
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return;
      try
      {
        PackageInfo localPackageInfo = this.a.getPackageManager().getPackageArchiveInfo(paramString, 0);
        if (localPackageInfo == null)
          continue;
        paramah.a(localPackageInfo.packageName);
        this.b.execute(new ak(this, paramString, localPackageInfo, paramBoolean, paramah));
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
      }
    }
  }

  public final void b(String paramString, boolean paramBoolean, ah paramah)
  {
    this.b.execute(new al(this, paramString, paramBoolean, paramah));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.ai
 * JD-Core Version:    0.6.0
 */