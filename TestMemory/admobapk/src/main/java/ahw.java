import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class ahw
{

  @Deprecated
  public static final int a = amj.b;
  static final AtomicBoolean b;
  private static boolean c = false;
  private static boolean d = false;
  private static boolean e = false;
  private static int f = 0;
  private static boolean g = false;
  private static final AtomicBoolean h;

  static
  {
    b = new AtomicBoolean();
    h = new AtomicBoolean();
  }

  private static void a(Context paramContext)
  {
    if (!g);
    try
    {
      paramContext.getPackageName();
      aov localaov = aow.a.a(paramContext);
      f = ant.a(paramContext);
      PackageInfo localPackageInfo = localaov.a.getPackageManager().getPackageInfo("com.google.android.gms", 64);
      if (localPackageInfo != null)
      {
        ahx.a(paramContext);
        pa[] arrayOfpa = new pa[1];
        arrayOfpa[0] = pd.a[1];
        if (ahx.a(localPackageInfo, arrayOfpa) != null)
          e = true;
      }
      while (true)
      {
        return;
        e = false;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", localNameNotFoundException);
      return;
    }
    finally
    {
      g = true;
    }
    throw localObject;
  }

  @Deprecated
  public static boolean a(Context paramContext, int paramInt)
  {
    return aos.a(paramContext, paramInt);
  }

  @TargetApi(21)
  static boolean a(Context paramContext, String paramString)
  {
    if ((paramString.equals("com.google.android.gms")) && (aol.a()))
      return false;
    if (aoq.a(21))
    {
      Iterator localIterator = paramContext.getPackageManager().getPackageInstaller().getAllSessions().iterator();
      while (localIterator.hasNext())
        if (paramString.equals(((PackageInstaller.SessionInfo)localIterator.next()).getAppPackageName()))
          return true;
    }
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      if (localPackageManager.getApplicationInfo(paramString, 8192).enabled)
      {
        if (aoq.a(18))
        {
          Bundle localBundle = ((UserManager)paramContext.getSystemService("user")).getApplicationRestrictions(paramContext.getPackageName());
          if (localBundle != null)
          {
            boolean bool = "true".equals(localBundle.getString("restricted_profile"));
            if (!bool);
          }
        }
        for (int i = 1; i == 0; i = 0)
          return true;
      }
      return false;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return false;
  }

  // ERROR //
  @Deprecated
  public static int b(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 196	amj:c	Z
    //   3: ifeq +5 -> 8
    //   6: iconst_0
    //   7: ireturn
    //   8: aload_0
    //   9: invokevirtual 74	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   12: astore_1
    //   13: aload_0
    //   14: invokevirtual 200	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   17: getstatic 205	mb:common_google_play_services_unknown_issue	I
    //   20: invokevirtual 210	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   23: pop
    //   24: ldc 76
    //   26: aload_0
    //   27: invokevirtual 52	android/content/Context:getPackageName	()Ljava/lang/String;
    //   30: invokevirtual 122	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   33: ifne +136 -> 169
    //   36: getstatic 43	ahw:h	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   39: invokevirtual 213	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   42: ifne +127 -> 169
    //   45: aload_0
    //   46: invokestatic 215	ahw:a	(Landroid/content/Context;)V
    //   49: getstatic 32	ahw:f	I
    //   52: ifne +25 -> 77
    //   55: new 217	java/lang/IllegalStateException
    //   58: dup
    //   59: ldc 219
    //   61: invokespecial 222	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   64: athrow
    //   65: astore_2
    //   66: ldc 99
    //   68: ldc 224
    //   70: invokestatic 227	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   73: pop
    //   74: goto -50 -> 24
    //   77: getstatic 32	ahw:f	I
    //   80: getstatic 24	ahw:a	I
    //   83: if_icmpeq +86 -> 169
    //   86: getstatic 24	ahw:a	I
    //   89: istore 25
    //   91: getstatic 32	ahw:f	I
    //   94: istore 26
    //   96: ldc 229
    //   98: invokestatic 233	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   101: astore 27
    //   103: new 217	java/lang/IllegalStateException
    //   106: dup
    //   107: new 235	java/lang/StringBuilder
    //   110: dup
    //   111: sipush 290
    //   114: aload 27
    //   116: invokestatic 233	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   119: invokevirtual 239	java/lang/String:length	()I
    //   122: iadd
    //   123: invokespecial 242	java/lang/StringBuilder:<init>	(I)V
    //   126: ldc 244
    //   128: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: iload 25
    //   133: invokevirtual 251	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   136: ldc 253
    //   138: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: iload 26
    //   143: invokevirtual 251	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   146: ldc 255
    //   148: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: aload 27
    //   153: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: ldc_w 257
    //   159: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   165: invokespecial 222	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   168: athrow
    //   169: aload_0
    //   170: invokestatic 265	aoo:a	(Landroid/content/Context;)Z
    //   173: ifne +77 -> 250
    //   176: iconst_1
    //   177: istore 4
    //   179: aconst_null
    //   180: astore 5
    //   182: iload 4
    //   184: ifeq +19 -> 203
    //   187: aload_1
    //   188: ldc_w 267
    //   191: sipush 8256
    //   194: invokevirtual 82	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   197: astore 24
    //   199: aload 24
    //   201: astore 5
    //   203: aload_1
    //   204: ldc 76
    //   206: bipush 64
    //   208: invokevirtual 82	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   211: astore 8
    //   213: aload_0
    //   214: invokestatic 87	ahx:a	(Landroid/content/Context;)Lahx;
    //   217: pop
    //   218: iload 4
    //   220: ifeq +92 -> 312
    //   223: aload 5
    //   225: getstatic 94	pd:a	[Lpa;
    //   228: invokestatic 97	ahx:a	(Landroid/content/pm/PackageInfo;[Lpa;)Lpa;
    //   231: astore 19
    //   233: aload 19
    //   235: ifnonnull +48 -> 283
    //   238: ldc 99
    //   240: ldc_w 269
    //   243: invokestatic 271	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   246: pop
    //   247: bipush 9
    //   249: ireturn
    //   250: iconst_0
    //   251: istore 4
    //   253: goto -74 -> 179
    //   256: astore 22
    //   258: ldc 99
    //   260: ldc_w 273
    //   263: invokestatic 271	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   266: pop
    //   267: bipush 9
    //   269: ireturn
    //   270: astore 6
    //   272: ldc 99
    //   274: ldc_w 275
    //   277: invokestatic 271	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   280: pop
    //   281: iconst_1
    //   282: ireturn
    //   283: aload 8
    //   285: iconst_1
    //   286: anewarray 89	pa
    //   289: dup
    //   290: iconst_0
    //   291: aload 19
    //   293: aastore
    //   294: invokestatic 97	ahx:a	(Landroid/content/pm/PackageInfo;[Lpa;)Lpa;
    //   297: ifnonnull +38 -> 335
    //   300: ldc 99
    //   302: ldc_w 277
    //   305: invokestatic 271	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   308: pop
    //   309: bipush 9
    //   311: ireturn
    //   312: aload 8
    //   314: getstatic 94	pd:a	[Lpa;
    //   317: invokestatic 97	ahx:a	(Landroid/content/pm/PackageInfo;[Lpa;)Lpa;
    //   320: ifnonnull +15 -> 335
    //   323: ldc 99
    //   325: ldc_w 277
    //   328: invokestatic 271	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   331: pop
    //   332: bipush 9
    //   334: ireturn
    //   335: getstatic 24	ahw:a	I
    //   338: sipush 1000
    //   341: idiv
    //   342: istore 10
    //   344: aload 8
    //   346: getfield 282	android/content/pm/PackageInfo:versionCode	I
    //   349: sipush 1000
    //   352: idiv
    //   353: iload 10
    //   355: if_icmpge +56 -> 411
    //   358: getstatic 24	ahw:a	I
    //   361: istore 15
    //   363: aload 8
    //   365: getfield 282	android/content/pm/PackageInfo:versionCode	I
    //   368: istore 16
    //   370: ldc 99
    //   372: new 235	java/lang/StringBuilder
    //   375: dup
    //   376: bipush 77
    //   378: invokespecial 242	java/lang/StringBuilder:<init>	(I)V
    //   381: ldc_w 284
    //   384: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: iload 15
    //   389: invokevirtual 251	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   392: ldc 253
    //   394: invokevirtual 248	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: iload 16
    //   399: invokevirtual 251	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   402: invokevirtual 260	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   405: invokestatic 271	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   408: pop
    //   409: iconst_2
    //   410: ireturn
    //   411: aload 8
    //   413: getfield 288	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   416: astore 11
    //   418: aload 11
    //   420: ifnonnull +16 -> 436
    //   423: aload_1
    //   424: ldc 76
    //   426: iconst_0
    //   427: invokevirtual 166	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   430: astore 14
    //   432: aload 14
    //   434: astore 11
    //   436: aload 11
    //   438: getfield 171	android/content/pm/ApplicationInfo:enabled	Z
    //   441: ifne +20 -> 461
    //   444: iconst_3
    //   445: ireturn
    //   446: astore 12
    //   448: ldc 99
    //   450: ldc_w 290
    //   453: aload 12
    //   455: invokestatic 293	android/util/Log:wtf	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   458: pop
    //   459: iconst_1
    //   460: ireturn
    //   461: iconst_0
    //   462: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   13	24	65	java/lang/Throwable
    //   187	199	256	android/content/pm/PackageManager$NameNotFoundException
    //   203	213	270	android/content/pm/PackageManager$NameNotFoundException
    //   423	432	446	android/content/pm/PackageManager$NameNotFoundException
  }

  @Deprecated
  public static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    default:
      return false;
    case 1:
    case 2:
    case 3:
    case 9:
    }
    return true;
  }

  @Deprecated
  public static boolean b(Context paramContext, int paramInt)
  {
    if (paramInt == 18)
      return true;
    if (paramInt == 1)
      return a(paramContext, "com.google.android.gms");
    return false;
  }

  public static boolean c(Context paramContext)
  {
    a(paramContext);
    return (e) || (!"user".equals(Build.TYPE));
  }

  public static Context d(Context paramContext)
  {
    try
    {
      Context localContext = paramContext.createPackageContext("com.google.android.gms", 3);
      return localContext;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return null;
  }

  public static String e(Context paramContext)
  {
    String str = paramContext.getApplicationInfo().name;
    PackageManager localPackageManager;
    if (TextUtils.isEmpty(str))
    {
      str = paramContext.getPackageName();
      localPackageManager = paramContext.getApplicationContext().getPackageManager();
    }
    try
    {
      ApplicationInfo localApplicationInfo2 = aow.a.a(paramContext).a(paramContext.getPackageName(), 0);
      localApplicationInfo1 = localApplicationInfo2;
      if (localApplicationInfo1 != null)
        str = localPackageManager.getApplicationLabel(localApplicationInfo1).toString();
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
        ApplicationInfo localApplicationInfo1 = null;
    }
  }

  @Deprecated
  public static int f(Context paramContext)
  {
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo("com.google.android.gms", 0);
      return localPackageInfo.versionCode;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
    }
    return 0;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ahw
 * JD-Core Version:    0.6.0
 */