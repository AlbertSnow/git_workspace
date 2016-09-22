package com.alipay.wandoujia;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;

public final class x
{
  private static x e = null;
  private String a;
  private String b;
  private String c;
  private String d;

  // ERROR //
  private x(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 21	java/lang/Object:<init>	()V
    //   4: aload_1
    //   5: invokevirtual 27	android/content/Context:getPackageName	()Ljava/lang/String;
    //   8: astore 9
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual 31	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   15: aload 9
    //   17: iconst_1
    //   18: invokevirtual 37	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   21: getfield 42	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   24: putfield 44	com/alipay/wandoujia/x:c	Ljava/lang/String;
    //   27: aload_1
    //   28: ldc 46
    //   30: invokevirtual 50	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   33: checkcast 52	android/telephony/TelephonyManager
    //   36: astore 6
    //   38: aload_0
    //   39: aload 6
    //   41: invokevirtual 55	android/telephony/TelephonyManager:getDeviceId	()Ljava/lang/String;
    //   44: invokespecial 58	com/alipay/wandoujia/x:b	(Ljava/lang/String;)V
    //   47: invokestatic 63	com/wandoujia/image/c/a:a	()Lcom/wandoujia/image/c/a;
    //   50: invokevirtual 66	com/wandoujia/image/c/a:c	()Lcom/alipay/android/app/d;
    //   53: invokeinterface 72 1 0
    //   58: istore 7
    //   60: invokestatic 63	com/wandoujia/image/c/a:a	()Lcom/wandoujia/image/c/a;
    //   63: invokevirtual 66	com/wandoujia/image/c/a:c	()Lcom/alipay/android/app/d;
    //   66: invokeinterface 75 1 0
    //   71: istore 8
    //   73: iload 7
    //   75: ifeq +53 -> 128
    //   78: aload_0
    //   79: ldc 77
    //   81: invokespecial 79	com/alipay/wandoujia/x:a	(Ljava/lang/String;)V
    //   84: aload_0
    //   85: aload_1
    //   86: ldc 81
    //   88: invokevirtual 50	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   91: checkcast 83	android/net/wifi/WifiManager
    //   94: invokevirtual 87	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   97: invokevirtual 92	android/net/wifi/WifiInfo:getMacAddress	()Ljava/lang/String;
    //   100: putfield 94	com/alipay/wandoujia/x:d	Ljava/lang/String;
    //   103: aload_0
    //   104: getfield 94	com/alipay/wandoujia/x:d	Ljava/lang/String;
    //   107: invokestatic 100	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   110: ifeq +9 -> 119
    //   113: aload_0
    //   114: ldc 102
    //   116: putfield 94	com/alipay/wandoujia/x:d	Ljava/lang/String;
    //   119: return
    //   120: astore_2
    //   121: aload_2
    //   122: invokestatic 107	android/support/v4/app/b:b	(Ljava/lang/Object;)V
    //   125: goto -98 -> 27
    //   128: iload 8
    //   130: ifeq +20 -> 150
    //   133: aload_0
    //   134: ldc 109
    //   136: invokespecial 79	com/alipay/wandoujia/x:a	(Ljava/lang/String;)V
    //   139: goto -55 -> 84
    //   142: astore_3
    //   143: aload_3
    //   144: invokestatic 107	android/support/v4/app/b:b	(Ljava/lang/Object;)V
    //   147: goto -63 -> 84
    //   150: aload_0
    //   151: aload 6
    //   153: invokevirtual 112	android/telephony/TelephonyManager:getSubscriberId	()Ljava/lang/String;
    //   156: invokespecial 79	com/alipay/wandoujia/x:a	(Ljava/lang/String;)V
    //   159: goto -75 -> 84
    //   162: astore 5
    //   164: aload 5
    //   166: invokestatic 107	android/support/v4/app/b:b	(Ljava/lang/Object;)V
    //   169: aload_0
    //   170: getfield 94	com/alipay/wandoujia/x:d	Ljava/lang/String;
    //   173: invokestatic 100	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   176: ifeq -57 -> 119
    //   179: aload_0
    //   180: ldc 102
    //   182: putfield 94	com/alipay/wandoujia/x:d	Ljava/lang/String;
    //   185: return
    //   186: astore 4
    //   188: aload_0
    //   189: getfield 94	com/alipay/wandoujia/x:d	Ljava/lang/String;
    //   192: invokestatic 100	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   195: ifeq +9 -> 204
    //   198: aload_0
    //   199: ldc 102
    //   201: putfield 94	com/alipay/wandoujia/x:d	Ljava/lang/String;
    //   204: aload 4
    //   206: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   4	27	120	java/lang/Exception
    //   27	73	142	java/lang/Exception
    //   78	84	142	java/lang/Exception
    //   133	139	142	java/lang/Exception
    //   150	159	142	java/lang/Exception
    //   84	103	162	java/lang/Exception
    //   84	103	186	finally
    //   164	169	186	finally
  }

  public static x a(Context paramContext)
  {
    if (e == null)
      e = new x(paramContext);
    return e;
  }

  private void a(String paramString)
  {
    if (paramString != null)
      paramString = (paramString + "000000000000000").substring(0, 15);
    this.a = paramString;
  }

  private static boolean a(Context paramContext, String paramString)
  {
    if (!f())
      return true;
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      localPackageManager.getPackageGids(paramString);
      return true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return false;
  }

  public static id b(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo != null) && (localNetworkInfo.getType() == 0))
      return id.a(localNetworkInfo.getSubtype());
    if ((localNetworkInfo != null) && (localNetworkInfo.getType() == 1))
      return id.a;
    return id.o;
  }

  private void b(String paramString)
  {
    byte[] arrayOfByte;
    if (paramString != null)
      arrayOfByte = paramString.getBytes();
    for (int i = 0; ; i++)
    {
      if (i >= arrayOfByte.length)
      {
        paramString = (new String(arrayOfByte) + "000000000000000").substring(0, 15);
        this.b = paramString;
        return;
      }
      if ((arrayOfByte[i] >= 48) && (arrayOfByte[i] <= 57))
        continue;
      arrayOfByte[i] = 48;
    }
  }

  public static boolean c(Context paramContext)
  {
    return a(paramContext, "com.eg.android.AlipayGphone");
  }

  public static boolean d(Context paramContext)
  {
    return a(paramContext, "com.alipay.android.app");
  }

  public static String e(Context paramContext)
  {
    return a(paramContext).d().substring(0, 8);
  }

  public static boolean f()
  {
    boolean bool1 = "mounted".equals(Environment.getExternalStorageState());
    int i = 0;
    if (bool1)
    {
      StatFs localStatFs = new StatFs(new File(Environment.getExternalStorageDirectory().getPath()).getPath());
      boolean bool2 = localStatFs.getBlockSize() * (localStatFs.getAvailableBlocks() - 4L) < 33554432.0D;
      i = 0;
      if (bool2)
        i = 1;
    }
    return i;
  }

  public static String g()
  {
    return "android " + Build.VERSION.RELEASE;
  }

  public final String a()
  {
    return this.c;
  }

  public final String b()
  {
    if (TextUtils.isEmpty(this.a))
      this.a = "000000000000000";
    return this.a;
  }

  public final String c()
  {
    if (TextUtils.isEmpty(this.b))
      this.b = "000000000000000";
    return this.b;
  }

  public final String d()
  {
    String str1 = c() + "|";
    String str2 = b();
    if (TextUtils.isEmpty(str2))
      return str1 + "000000000000000";
    return str1 + str2;
  }

  public final String e()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.x
 * JD-Core Version:    0.6.0
 */