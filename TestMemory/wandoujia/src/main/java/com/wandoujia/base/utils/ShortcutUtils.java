package com.wandoujia.base.utils;

import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.graphics.BitmapFactory;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

public class ShortcutUtils
{
  private static final String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
  private static final String ACTION_UNINSTALL_SHORTCUT = "com.android.launcher.action.UNINSTALL_SHORTCUT";
  private static ThreadPoolExecutor EXECUTOR = new ScheduledThreadPoolExecutor(3);
  private static final String KEY_DUPLICATE = "duplicate";
  private static final int POOL_SIZE = 3;
  private static final String TAG = "ShortcutUtil";

  private static boolean addShortcut(Context paramContext, String paramString, int paramInt, Intent paramIntent)
  {
    paramIntent.setAction("android.intent.action.MAIN");
    paramIntent.addFlags(65536);
    Intent localIntent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
    localIntent.putExtra("android.intent.extra.shortcut.INTENT", paramIntent);
    localIntent.putExtra("android.intent.extra.shortcut.NAME", paramString);
    localIntent.putExtra("android.intent.extra.shortcut.ICON", BitmapFactory.decodeResource(paramContext.getResources(), paramInt));
    localIntent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(paramContext, paramInt));
    localIntent.putExtra("duplicate", false);
    paramContext.sendBroadcast(localIntent);
    return true;
  }

  // ERROR //
  public static boolean hasShortcut(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: invokestatic 110	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: ifeq +16 -> 22
    //   9: ldc 22
    //   11: ldc 112
    //   13: iconst_0
    //   14: anewarray 4	java/lang/Object
    //   17: invokestatic 118	com/wandoujia/base/log/Log:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   20: iconst_0
    //   21: ireturn
    //   22: aload_0
    //   23: ldc 120
    //   25: invokestatic 126	com/wandoujia/base/utils/LauncherUtil:getAuthorityFromPermission	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   28: astore_3
    //   29: aload_3
    //   30: invokestatic 110	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   33: ifne -13 -> 20
    //   36: ldc 22
    //   38: aload_3
    //   39: iconst_0
    //   40: anewarray 4	java/lang/Object
    //   43: invokestatic 129	com/wandoujia/base/log/Log:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   46: new 131	java/lang/StringBuilder
    //   49: dup
    //   50: ldc 133
    //   52: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   55: aload_3
    //   56: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: ldc 140
    //   61: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: invokestatic 150	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   70: astore 8
    //   72: aload_0
    //   73: invokevirtual 154	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   76: aload 8
    //   78: aconst_null
    //   79: ldc 156
    //   81: iconst_1
    //   82: anewarray 158	java/lang/String
    //   85: dup
    //   86: iconst_0
    //   87: aload_1
    //   88: aastore
    //   89: aconst_null
    //   90: invokevirtual 164	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   93: astore 9
    //   95: aload 9
    //   97: ifnull +96 -> 193
    //   100: aload 9
    //   102: invokeinterface 170 1 0
    //   107: istore 11
    //   109: iload 11
    //   111: ifle +82 -> 193
    //   114: iconst_1
    //   115: istore 7
    //   117: aload 9
    //   119: ifnull +10 -> 129
    //   122: aload 9
    //   124: invokeinterface 173 1 0
    //   129: iload 7
    //   131: ireturn
    //   132: astore 5
    //   134: aconst_null
    //   135: astore 6
    //   137: aload 6
    //   139: ifnull +48 -> 187
    //   142: aload 6
    //   144: invokeinterface 173 1 0
    //   149: iconst_0
    //   150: istore 7
    //   152: goto -23 -> 129
    //   155: astore 4
    //   157: aload_2
    //   158: ifnull +9 -> 167
    //   161: aload_2
    //   162: invokeinterface 173 1 0
    //   167: aload 4
    //   169: athrow
    //   170: astore 4
    //   172: aload 9
    //   174: astore_2
    //   175: goto -18 -> 157
    //   178: astore 10
    //   180: aload 9
    //   182: astore 6
    //   184: goto -47 -> 137
    //   187: iconst_0
    //   188: istore 7
    //   190: goto -61 -> 129
    //   193: iconst_0
    //   194: istore 7
    //   196: goto -79 -> 117
    //
    // Exception table:
    //   from	to	target	type
    //   46	95	132	java/lang/Exception
    //   46	95	155	finally
    //   100	109	170	finally
    //   100	109	178	java/lang/Exception
  }

  public static void installShortcut(Context paramContext, String paramString, int paramInt, Intent paramIntent)
  {
    installShortcut(paramContext, paramString, paramInt, paramIntent, null);
  }

  public static void installShortcut(Context paramContext, String paramString, int paramInt, Intent paramIntent, ShortcutUtils.ActionListener paramActionListener)
  {
    EXECUTOR.execute(new h(paramContext, paramString, paramInt, paramIntent, paramActionListener));
  }

  private static void removeShortcut(Context paramContext, String paramString, Intent paramIntent)
  {
    paramIntent.setAction("android.intent.action.MAIN");
    Intent localIntent = new Intent("com.android.launcher.action.UNINSTALL_SHORTCUT");
    localIntent.putExtra("android.intent.extra.shortcut.INTENT", paramIntent);
    localIntent.putExtra("android.intent.extra.shortcut.NAME", paramString);
    paramContext.sendBroadcast(localIntent);
  }

  public static void uninstallShortcut(Context paramContext, String paramString, Intent paramIntent)
  {
    uninstallShortcut(paramContext, paramString, paramIntent, null);
  }

  public static void uninstallShortcut(Context paramContext, String paramString, Intent paramIntent, ShortcutUtils.ActionListener paramActionListener)
  {
    EXECUTOR.execute(new i(paramContext, paramString, paramIntent, paramActionListener));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ShortcutUtils
 * JD-Core Version:    0.6.0
 */