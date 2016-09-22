package com.wandoujia.launcher.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.LauncherUtil;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.game_launcher.lib.R.drawable;
import com.wandoujia.game_launcher.lib.R.string;
import com.wandoujia.launcher.LauncherConfig;
import com.wandoujia.launcher.LauncherConfig.LauncherType;
import com.wandoujia.launcher.launcher.models.SimpleAppInfo;
import java.util.ArrayList;
import java.util.List;

public final class a
{
  private static String a = LauncherUtil.getDefaultLauncher(GlobalConfig.getAppContext());

  public static String a(Context paramContext)
  {
    return a(paramContext, LauncherConfig.b());
  }

  public static String a(Context paramContext, LauncherConfig.LauncherType paramLauncherType)
  {
    String str1 = Build.MODEL;
    String str2;
    do
      try
      {
        str2 = paramContext.getString(R.string.game_launcher_title);
        if ((str1 != null) && (com.wandoujia.launcher.launcher.utils.a.a(str1)))
          return str2;
      }
      catch (Exception localException)
      {
        return null;
      }
    while (com.wandoujia.launcher.launcher.utils.a.b(a));
    char c = LauncherConfig.a(paramLauncherType);
    return c + str2 + c;
  }

  public static void a()
  {
    a(null);
  }

  public static void a(e parame)
  {
    ThreadPool.execute(new d(parame));
  }

  public static void a(f paramf)
  {
    ThreadPool.execute(new b(paramf));
  }

  public static void b()
  {
    ThreadPool.execute(new c());
  }

  // ERROR //
  public static boolean b(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 28	com/wandoujia/launcher/LauncherConfig:b	()Lcom/wandoujia/launcher/LauncherConfig$LauncherType;
    //   4: invokestatic 31	com/wandoujia/launcher/e/a:a	(Landroid/content/Context;Lcom/wandoujia/launcher/LauncherConfig$LauncherType;)Ljava/lang/String;
    //   7: astore_1
    //   8: aload_0
    //   9: ldc 161
    //   11: invokestatic 165	com/wandoujia/base/utils/LauncherUtil:getAuthorityFromPermission	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   14: astore_2
    //   15: aload_2
    //   16: invokestatic 171	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   19: ifeq +5 -> 24
    //   22: iconst_0
    //   23: ireturn
    //   24: new 62	java/lang/StringBuilder
    //   27: dup
    //   28: ldc 173
    //   30: invokespecial 174	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   33: aload_2
    //   34: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: ldc 176
    //   39: invokevirtual 72	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   45: invokestatic 126	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   48: astore 6
    //   50: aload_0
    //   51: invokevirtual 180	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   54: aload 6
    //   56: aconst_null
    //   57: ldc 182
    //   59: iconst_1
    //   60: anewarray 184	java/lang/String
    //   63: dup
    //   64: iconst_0
    //   65: aload_1
    //   66: aastore
    //   67: aconst_null
    //   68: invokevirtual 190	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   71: astore 7
    //   73: aload 7
    //   75: ifnull +17 -> 92
    //   78: aload 7
    //   80: ifnull +10 -> 90
    //   83: aload 7
    //   85: invokeinterface 195 1 0
    //   90: iconst_1
    //   91: ireturn
    //   92: aload 7
    //   94: ifnull +10 -> 104
    //   97: aload 7
    //   99: invokeinterface 195 1 0
    //   104: iconst_1
    //   105: ireturn
    //   106: astore 5
    //   108: iconst_0
    //   109: ifeq +9 -> 118
    //   112: aconst_null
    //   113: invokeinterface 195 1 0
    //   118: iconst_0
    //   119: ireturn
    //   120: astore 4
    //   122: iconst_0
    //   123: ifeq +9 -> 132
    //   126: aconst_null
    //   127: invokeinterface 195 1 0
    //   132: iconst_0
    //   133: ireturn
    //   134: astore_3
    //   135: iconst_0
    //   136: ifeq +9 -> 145
    //   139: aconst_null
    //   140: invokeinterface 195 1 0
    //   145: aload_3
    //   146: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   24	73	106	java/lang/SecurityException
    //   24	73	120	java/lang/Exception
    //   24	73	134	finally
  }

  public static Bitmap c()
  {
    return android.support.v4.app.b.a(GlobalConfig.getAppContext(), e(), R.drawable.ic_gl_no_games, R.drawable.launcher_icon_base);
  }

  public static boolean c(Context paramContext)
  {
    return com.wandoujia.launcher_base.utils.f.a(a(paramContext, LauncherConfig.b()));
  }

  public static void d(Context paramContext)
  {
    String str = a(paramContext, LauncherConfig.b());
    if (str == null)
      return;
    com.wandoujia.launcher_base.utils.f.a(str, LauncherConfig.a());
  }

  private static List<Drawable> e()
  {
    Context localContext = GlobalConfig.getAppContext();
    ArrayList localArrayList = new ArrayList();
    List localList = com.wandoujia.launcher.launcher.b.c.a().b();
    int i = Math.min(4, localList.size());
    for (int j = 0; j < i; j++)
      localArrayList.add(com.wandoujia.launcher_base.utils.c.a(localContext, ((SimpleAppInfo)localList.get(j)).getPackageName()));
    return localArrayList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.e.a
 * JD-Core Version:    0.6.0
 */