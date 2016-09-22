package com.wandoujia.p4.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.text.TextUtils;
import com.wandoujia.base.concurrent.CachedThreadPoolExecutorWithCapacity;
import com.wandoujia.base.utils.LauncherUtil;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.p4.app_launcher.f.b;
import com.wandoujia.p4.configs.Config;

public class ShortcutUtil
{
  private static final CachedThreadPoolExecutorWithCapacity a;

  static
  {
    ShortcutUtil.class.getSimpleName();
    new String[] { "com.android.launcher", "com.sec.android.app.twlauncher", "org.adwfreak.launcher", "org.adw.launcher", "com.fede.launcher", "com.qihoo360.launcher", "net.qihoo.launcher", "com.lge.launcher", "com.huawei.launcher3", "com.sonyericsson.home" };
    a = new CachedThreadPoolExecutorWithCapacity(1);
  }

  public static void a()
  {
    if (!Config.O())
    {
      b.a(true);
      Config.N();
    }
  }

  public static void a(Context paramContext)
  {
    if (!Config.K())
      ThreadPool.execute(new p(paramContext));
  }

  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    if (a(paramContext, paramString1))
      return;
    Intent localIntent1 = new Intent("android.intent.action.MAIN");
    if (!TextUtils.isEmpty(paramString2))
      localIntent1.putExtra("launch_from", "shortcut");
    while (true)
    {
      Intent localIntent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
      localIntent2.putExtra("android.intent.extra.shortcut.NAME", paramString1);
      localIntent2.putExtra("duplicate", false);
      localIntent2.putExtra("android.intent.extra.shortcut.INTENT", localIntent1);
      localIntent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(paramContext, 2130838369));
      paramContext.sendBroadcast(localIntent2);
      return;
      localIntent1.setComponent(new ComponentName(paramContext, "com.wandoujia.jupiter.activity.HomeActivity"));
      localIntent1.putExtra("launch_from", "welcome");
    }
  }

  public static void a(Context paramContext, boolean paramBoolean)
  {
    a.execute(new q(paramBoolean, paramContext));
  }

  // ERROR //
  public static boolean a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: invokestatic 91	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: ifeq +5 -> 11
    //   9: iconst_0
    //   10: ireturn
    //   11: aload_0
    //   12: ldc 152
    //   14: invokestatic 158	com/wandoujia/base/utils/LauncherUtil:getAuthorityFromPermission	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   17: astore_3
    //   18: aload_3
    //   19: invokestatic 91	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   22: ifne -13 -> 9
    //   25: new 160	java/lang/StringBuilder
    //   28: dup
    //   29: ldc 162
    //   31: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   34: aload_3
    //   35: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: ldc 169
    //   40: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: invokestatic 178	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   49: astore 8
    //   51: aload_0
    //   52: invokevirtual 182	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   55: aload 8
    //   57: aconst_null
    //   58: ldc 184
    //   60: iconst_1
    //   61: anewarray 16	java/lang/String
    //   64: dup
    //   65: iconst_0
    //   66: aload_1
    //   67: aastore
    //   68: aconst_null
    //   69: invokevirtual 190	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   72: astore 9
    //   74: aload 9
    //   76: ifnull +97 -> 173
    //   79: aload 9
    //   81: invokeinterface 196 1 0
    //   86: istore 11
    //   88: iload 11
    //   90: iconst_1
    //   91: if_icmpne +82 -> 173
    //   94: iconst_1
    //   95: istore 7
    //   97: aload 9
    //   99: ifnull +10 -> 109
    //   102: aload 9
    //   104: invokeinterface 199 1 0
    //   109: iload 7
    //   111: ireturn
    //   112: astore 5
    //   114: aconst_null
    //   115: astore 6
    //   117: aload 6
    //   119: ifnull +48 -> 167
    //   122: aload 6
    //   124: invokeinterface 199 1 0
    //   129: iconst_0
    //   130: istore 7
    //   132: goto -23 -> 109
    //   135: astore 4
    //   137: aload_2
    //   138: ifnull +9 -> 147
    //   141: aload_2
    //   142: invokeinterface 199 1 0
    //   147: aload 4
    //   149: athrow
    //   150: astore 4
    //   152: aload 9
    //   154: astore_2
    //   155: goto -18 -> 137
    //   158: astore 10
    //   160: aload 9
    //   162: astore 6
    //   164: goto -47 -> 117
    //   167: iconst_0
    //   168: istore 7
    //   170: goto -61 -> 109
    //   173: iconst_0
    //   174: istore 7
    //   176: goto -79 -> 97
    //
    // Exception table:
    //   from	to	target	type
    //   25	74	112	java/lang/Exception
    //   25	74	135	finally
    //   79	88	150	finally
    //   79	88	158	java/lang/Exception
  }

  // ERROR //
  private static Intent b(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 160	java/lang/StringBuilder
    //   5: dup
    //   6: ldc 162
    //   8: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   11: aload_1
    //   12: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   15: ldc 169
    //   17: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   23: invokestatic 178	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   26: astore 7
    //   28: aload_0
    //   29: invokevirtual 182	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   32: aload 7
    //   34: aconst_null
    //   35: ldc 203
    //   37: iconst_1
    //   38: anewarray 16	java/lang/String
    //   41: dup
    //   42: iconst_0
    //   43: aload_2
    //   44: aastore
    //   45: aconst_null
    //   46: invokevirtual 190	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   49: astore 8
    //   51: aload 8
    //   53: ifnull +115 -> 168
    //   56: aload 8
    //   58: invokeinterface 196 1 0
    //   63: ifle +105 -> 168
    //   66: aload 8
    //   68: invokeinterface 206 1 0
    //   73: pop
    //   74: aload 8
    //   76: aload 8
    //   78: ldc 208
    //   80: invokeinterface 212 2 0
    //   85: invokeinterface 216 2 0
    //   90: istore 11
    //   92: iload 11
    //   94: ifle +21 -> 115
    //   97: aload 8
    //   99: ifnull +10 -> 109
    //   102: aload 8
    //   104: invokeinterface 199 1 0
    //   109: aconst_null
    //   110: astore 14
    //   112: aload 14
    //   114: areturn
    //   115: aload 8
    //   117: aload 8
    //   119: ldc 218
    //   121: invokeinterface 212 2 0
    //   126: invokeinterface 222 2 0
    //   131: astore 12
    //   133: aload 12
    //   135: invokestatic 91	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   138: ifne +30 -> 168
    //   141: aload 12
    //   143: iconst_0
    //   144: invokestatic 226	android/content/Intent:parseUri	(Ljava/lang/String;I)Landroid/content/Intent;
    //   147: astore 13
    //   149: aload 13
    //   151: astore 14
    //   153: aload 8
    //   155: ifnull -43 -> 112
    //   158: aload 8
    //   160: invokeinterface 199 1 0
    //   165: aload 14
    //   167: areturn
    //   168: aload 8
    //   170: ifnull +10 -> 180
    //   173: aload 8
    //   175: invokeinterface 199 1 0
    //   180: aconst_null
    //   181: areturn
    //   182: astore 5
    //   184: aconst_null
    //   185: astore 6
    //   187: aload 6
    //   189: ifnull -9 -> 180
    //   192: aload 6
    //   194: invokeinterface 199 1 0
    //   199: goto -19 -> 180
    //   202: astore 4
    //   204: aload_3
    //   205: ifnull +9 -> 214
    //   208: aload_3
    //   209: invokeinterface 199 1 0
    //   214: aload 4
    //   216: athrow
    //   217: astore 4
    //   219: aload 8
    //   221: astore_3
    //   222: goto -18 -> 204
    //   225: astore 9
    //   227: aload 8
    //   229: astore 6
    //   231: goto -44 -> 187
    //
    // Exception table:
    //   from	to	target	type
    //   2	51	182	java/lang/Exception
    //   2	51	202	finally
    //   56	92	217	finally
    //   115	149	217	finally
    //   56	92	225	java/lang/Exception
    //   115	149	225	java/lang/Exception
  }

  public static boolean b(Context paramContext, String paramString)
  {
    String str = LauncherUtil.getAuthorityFromPermission(paramContext, "READ_SETTINGS");
    if (TextUtils.isEmpty(str));
    Intent localIntent1;
    Intent localIntent2;
    do
    {
      return false;
      localIntent1 = new Intent("com.android.launcher.action.UNINSTALL_SHORTCUT");
      localIntent2 = b(paramContext, str, paramString);
    }
    while (localIntent2 == null);
    new StringBuilder("remove ").append(paramString).append("  ").append(localIntent2);
    localIntent1.putExtra("android.intent.extra.shortcut.NAME", paramString);
    localIntent1.putExtra("android.intent.extra.shortcut.INTENT", localIntent2);
    paramContext.sendBroadcast(localIntent1);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.ShortcutUtil
 * JD-Core Version:    0.6.0
 */