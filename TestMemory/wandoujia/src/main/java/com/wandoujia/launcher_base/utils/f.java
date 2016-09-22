package com.wandoujia.launcher_base.utils;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.app.i;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.LauncherUtil;
import com.wandoujia.launcher_base.R.dimen;

public final class f
{
  private static String[] a = { "com.android.launcher", "com.sec.android.app.twlauncher", "org.adwfreak.launcher", "org.adw.launcher", "com.fede.launcher", "com.qihoo360.launcher", "net.qihoo.launcher", "com.lge.launcher", "com.huawei.launcher3", "com.sonyericsson.home" };

  // ERROR //
  private static int a(Context paramContext, Uri paramUri, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 41	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: aload_1
    //   5: aconst_null
    //   6: ldc 43
    //   8: iconst_1
    //   9: anewarray 10	java/lang/String
    //   12: dup
    //   13: iconst_0
    //   14: aload_2
    //   15: aastore
    //   16: aconst_null
    //   17: invokevirtual 49	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   20: astore 7
    //   22: aload 7
    //   24: astore 4
    //   26: aload 4
    //   28: ifnull +111 -> 139
    //   31: aload 4
    //   33: invokeinterface 55 1 0
    //   38: iconst_1
    //   39: if_icmpne +100 -> 139
    //   42: aload 4
    //   44: invokeinterface 59 1 0
    //   49: pop
    //   50: aload 4
    //   52: aload 4
    //   54: ldc 61
    //   56: invokeinterface 65 2 0
    //   61: invokeinterface 69 2 0
    //   66: istore 11
    //   68: iload 11
    //   70: istore 8
    //   72: aload 4
    //   74: ifnull +10 -> 84
    //   77: aload 4
    //   79: invokeinterface 72 1 0
    //   84: iload 8
    //   86: ireturn
    //   87: astore 5
    //   89: aconst_null
    //   90: astore 6
    //   92: aload 6
    //   94: ifnull +43 -> 137
    //   97: aload 6
    //   99: invokeinterface 72 1 0
    //   104: iconst_m1
    //   105: ireturn
    //   106: astore_3
    //   107: aconst_null
    //   108: astore 4
    //   110: aload 4
    //   112: ifnull +10 -> 122
    //   115: aload 4
    //   117: invokeinterface 72 1 0
    //   122: aload_3
    //   123: athrow
    //   124: astore_3
    //   125: goto -15 -> 110
    //   128: astore 9
    //   130: aload 4
    //   132: astore 6
    //   134: goto -42 -> 92
    //   137: iconst_m1
    //   138: ireturn
    //   139: iconst_m1
    //   140: istore 8
    //   142: goto -70 -> 72
    //
    // Exception table:
    //   from	to	target	type
    //   0	22	87	java/lang/Exception
    //   0	22	106	finally
    //   31	68	124	finally
    //   31	68	128	java/lang/Exception
  }

  // ERROR //
  public static int a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: invokestatic 79	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: ifeq +9 -> 15
    //   9: iconst_m1
    //   10: istore 11
    //   12: iload 11
    //   14: ireturn
    //   15: aload_0
    //   16: ldc 81
    //   18: invokestatic 87	com/wandoujia/base/utils/LauncherUtil:getAuthorityFromPermission	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   21: astore_3
    //   22: aload_3
    //   23: invokestatic 79	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   26: ifeq +5 -> 31
    //   29: iconst_m1
    //   30: ireturn
    //   31: new 89	java/lang/StringBuilder
    //   34: dup
    //   35: ldc 91
    //   37: invokespecial 95	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   40: aload_3
    //   41: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: ldc 101
    //   46: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   52: invokestatic 111	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   55: astore 7
    //   57: aload_0
    //   58: invokevirtual 41	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   61: aload 7
    //   63: aconst_null
    //   64: ldc 113
    //   66: iconst_1
    //   67: anewarray 10	java/lang/String
    //   70: dup
    //   71: iconst_0
    //   72: aload_1
    //   73: aastore
    //   74: aconst_null
    //   75: invokevirtual 49	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   78: astore 8
    //   80: aload 8
    //   82: ifnull +31 -> 113
    //   85: aload 8
    //   87: invokeinterface 55 1 0
    //   92: istore 10
    //   94: iload 10
    //   96: istore 11
    //   98: aload 8
    //   100: ifnull -88 -> 12
    //   103: aload 8
    //   105: invokeinterface 72 1 0
    //   110: iload 11
    //   112: ireturn
    //   113: aload 8
    //   115: ifnull +10 -> 125
    //   118: aload 8
    //   120: invokeinterface 72 1 0
    //   125: iconst_m1
    //   126: ireturn
    //   127: astore 5
    //   129: aconst_null
    //   130: astore 6
    //   132: aload 6
    //   134: ifnull -9 -> 125
    //   137: aload 6
    //   139: invokeinterface 72 1 0
    //   144: goto -19 -> 125
    //   147: astore 4
    //   149: aload_2
    //   150: ifnull +9 -> 159
    //   153: aload_2
    //   154: invokeinterface 72 1 0
    //   159: aload 4
    //   161: athrow
    //   162: astore 4
    //   164: aload 8
    //   166: astore_2
    //   167: goto -18 -> 149
    //   170: astore 9
    //   172: aload 8
    //   174: astore 6
    //   176: goto -44 -> 132
    //
    // Exception table:
    //   from	to	target	type
    //   31	80	127	java/lang/Exception
    //   31	80	147	finally
    //   85	94	162	finally
    //   85	94	170	java/lang/Exception
  }

  // ERROR //
  private static Intent a(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 89	java/lang/StringBuilder
    //   5: dup
    //   6: ldc 91
    //   8: invokespecial 95	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   11: aload_1
    //   12: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   15: ldc 101
    //   17: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   23: invokestatic 111	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   26: astore 7
    //   28: aload_0
    //   29: invokevirtual 41	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   32: aload 7
    //   34: aconst_null
    //   35: ldc 43
    //   37: iconst_1
    //   38: anewarray 10	java/lang/String
    //   41: dup
    //   42: iconst_0
    //   43: aload_2
    //   44: aastore
    //   45: aconst_null
    //   46: invokevirtual 49	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   49: astore 8
    //   51: aload 8
    //   53: ifnull +115 -> 168
    //   56: aload 8
    //   58: invokeinterface 55 1 0
    //   63: ifle +105 -> 168
    //   66: aload 8
    //   68: invokeinterface 59 1 0
    //   73: pop
    //   74: aload 8
    //   76: aload 8
    //   78: ldc 116
    //   80: invokeinterface 65 2 0
    //   85: invokeinterface 69 2 0
    //   90: istore 11
    //   92: iload 11
    //   94: ifle +21 -> 115
    //   97: aload 8
    //   99: ifnull +10 -> 109
    //   102: aload 8
    //   104: invokeinterface 72 1 0
    //   109: aconst_null
    //   110: astore 14
    //   112: aload 14
    //   114: areturn
    //   115: aload 8
    //   117: aload 8
    //   119: ldc 118
    //   121: invokeinterface 65 2 0
    //   126: invokeinterface 122 2 0
    //   131: astore 12
    //   133: aload 12
    //   135: invokestatic 79	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   138: ifne +30 -> 168
    //   141: aload 12
    //   143: iconst_0
    //   144: invokestatic 128	android/content/Intent:parseUri	(Ljava/lang/String;I)Landroid/content/Intent;
    //   147: astore 13
    //   149: aload 13
    //   151: astore 14
    //   153: aload 8
    //   155: ifnull -43 -> 112
    //   158: aload 8
    //   160: invokeinterface 72 1 0
    //   165: aload 14
    //   167: areturn
    //   168: aload 8
    //   170: ifnull +10 -> 180
    //   173: aload 8
    //   175: invokeinterface 72 1 0
    //   180: aconst_null
    //   181: areturn
    //   182: astore 5
    //   184: aconst_null
    //   185: astore 6
    //   187: aload 6
    //   189: ifnull -9 -> 180
    //   192: aload 6
    //   194: invokeinterface 72 1 0
    //   199: goto -19 -> 180
    //   202: astore 4
    //   204: aload_3
    //   205: ifnull +9 -> 214
    //   208: aload_3
    //   209: invokeinterface 72 1 0
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

  public static Bitmap a(Bitmap paramBitmap, Context paramContext)
  {
    if (paramBitmap == null)
      return null;
    int i;
    if (Build.VERSION.SDK_INT < 11)
      i = GlobalConfig.getAppContext().getResources().getDimensionPixelSize(R.dimen.app_launcher_icon_size);
    try
    {
      while (true)
      {
        Matrix localMatrix = new Matrix();
        localMatrix.postScale(i / paramBitmap.getWidth(), i / paramBitmap.getHeight());
        Bitmap localBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, true);
        return localBitmap;
        i = ((ActivityManager)paramContext.getSystemService("activity")).getLauncherLargeIconSize();
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  // ERROR //
  public static boolean a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokestatic 79	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: ifeq +5 -> 11
    //   9: iconst_0
    //   10: ireturn
    //   11: invokestatic 141	com/wandoujia/base/config/GlobalConfig:getAppContext	()Landroid/content/Context;
    //   14: astore_2
    //   15: aload_2
    //   16: ldc 81
    //   18: invokestatic 87	com/wandoujia/base/utils/LauncherUtil:getAuthorityFromPermission	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   21: astore_3
    //   22: aload_3
    //   23: invokestatic 79	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   26: ifne -17 -> 9
    //   29: new 89	java/lang/StringBuilder
    //   32: dup
    //   33: ldc 91
    //   35: invokespecial 95	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   38: aload_3
    //   39: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: ldc 101
    //   44: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: invokestatic 111	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   53: astore 8
    //   55: aload_2
    //   56: invokevirtual 41	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   59: aload 8
    //   61: aconst_null
    //   62: ldc 113
    //   64: iconst_1
    //   65: anewarray 10	java/lang/String
    //   68: dup
    //   69: iconst_0
    //   70: aload_0
    //   71: aastore
    //   72: aconst_null
    //   73: invokevirtual 49	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   76: astore 9
    //   78: aload 9
    //   80: ifnull +97 -> 177
    //   83: aload 9
    //   85: invokeinterface 55 1 0
    //   90: istore 11
    //   92: iload 11
    //   94: iconst_1
    //   95: if_icmpne +82 -> 177
    //   98: iconst_1
    //   99: istore 7
    //   101: aload 9
    //   103: ifnull +10 -> 113
    //   106: aload 9
    //   108: invokeinterface 72 1 0
    //   113: iload 7
    //   115: ireturn
    //   116: astore 5
    //   118: aconst_null
    //   119: astore 6
    //   121: aload 6
    //   123: ifnull +48 -> 171
    //   126: aload 6
    //   128: invokeinterface 72 1 0
    //   133: iconst_0
    //   134: istore 7
    //   136: goto -23 -> 113
    //   139: astore 4
    //   141: aload_1
    //   142: ifnull +9 -> 151
    //   145: aload_1
    //   146: invokeinterface 72 1 0
    //   151: aload 4
    //   153: athrow
    //   154: astore 4
    //   156: aload 9
    //   158: astore_1
    //   159: goto -18 -> 141
    //   162: astore 10
    //   164: aload 9
    //   166: astore 6
    //   168: goto -47 -> 121
    //   171: iconst_0
    //   172: istore 7
    //   174: goto -61 -> 113
    //   177: iconst_0
    //   178: istore 7
    //   180: goto -79 -> 101
    //
    // Exception table:
    //   from	to	target	type
    //   29	78	116	java/lang/Exception
    //   29	78	139	finally
    //   83	92	154	finally
    //   83	92	162	java/lang/Exception
  }

  public static boolean a(String paramString, Bitmap paramBitmap)
  {
    try
    {
      Context localContext = GlobalConfig.getAppContext();
      String str = LauncherUtil.getAuthorityFromPermission(localContext, "READ_SETTINGS");
      if (TextUtils.isEmpty(str))
        return false;
      Uri localUri1 = Uri.parse("content://" + str + "/favorites?notify=true");
      int i = a(localContext, localUri1, paramString);
      if (i != -1)
      {
        byte[] arrayOfByte = a(paramBitmap);
        if (arrayOfByte != null)
        {
          ContentValues localContentValues = new ContentValues();
          localContentValues.put("icon", arrayOfByte);
          Uri localUri2 = Uri.parse("content://" + str + "/favorites/" + i + "?notify=true");
          ContentResolver localContentResolver = localContext.getContentResolver();
          int j = localContentResolver.update(localUri2, localContentValues, null, null);
          localContentResolver.notifyChange(localUri1, null);
          if (j != -1)
            return true;
        }
      }
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean a(String paramString, Bitmap paramBitmap, int paramInt, Intent paramIntent)
  {
    Context localContext = GlobalConfig.getAppContext();
    String str = LauncherUtil.getAuthorityFromPermission(localContext, "READ_SETTINGS");
    int j;
    int i;
    if (!TextUtils.isEmpty(str))
    {
      String[] arrayOfString = a;
      j = 0;
      if (j < 10)
        if (str.contains(arrayOfString[j]))
        {
          i = 1;
          label53: if (i == 0)
            break label156;
          i.a(true);
        }
    }
    while (true)
    {
      Intent localIntent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
      localIntent.putExtra("duplicate", false);
      localIntent.putExtra("android.intent.extra.shortcut.NAME", paramString);
      localIntent.putExtra("android.intent.extra.shortcut.ICON", paramBitmap);
      localIntent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(localContext, paramInt));
      localIntent.putExtra("launch_from", "shortcut");
      localIntent.putExtra("android.intent.extra.shortcut.INTENT", paramIntent);
      localContext.sendBroadcast(localIntent);
      return true;
      j++;
      break;
      i = 0;
      break label53;
      label156: i.a(false);
    }
  }

  public static boolean a(String paramString1, String paramString2)
  {
    Context localContext = GlobalConfig.getAppContext();
    String str = LauncherUtil.getAuthorityFromPermission(localContext, "READ_SETTINGS");
    if (TextUtils.isEmpty(str));
    Intent localIntent1;
    Intent localIntent2;
    do
    {
      return false;
      localIntent1 = new Intent("com.android.launcher.action.UNINSTALL_SHORTCUT");
      localIntent2 = a(localContext, str, paramString1);
    }
    while ((localIntent2 == null) || ((!TextUtils.isEmpty(localIntent2.getAction())) && (!TextUtils.equals(localIntent2.getAction(), paramString2))));
    localIntent1.putExtra("android.intent.extra.shortcut.NAME", paramString1);
    localIntent1.putExtra("android.intent.extra.shortcut.INTENT", localIntent2);
    localContext.sendBroadcast(localIntent1);
    return true;
  }

  // ERROR //
  private static byte[] a(Bitmap paramBitmap)
  {
    // Byte code:
    //   0: new 279	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: iconst_4
    //   5: aload_0
    //   6: invokevirtual 164	android/graphics/Bitmap:getWidth	()I
    //   9: aload_0
    //   10: invokevirtual 167	android/graphics/Bitmap:getHeight	()I
    //   13: imul
    //   14: imul
    //   15: invokespecial 282	java/io/ByteArrayOutputStream:<init>	(I)V
    //   18: astore_1
    //   19: aload_0
    //   20: getstatic 288	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   23: bipush 100
    //   25: aload_1
    //   26: invokevirtual 292	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   29: pop
    //   30: aload_1
    //   31: invokevirtual 295	java/io/ByteArrayOutputStream:flush	()V
    //   34: aload_1
    //   35: invokevirtual 299	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   38: astore 5
    //   40: aload_1
    //   41: invokestatic 304	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   44: aload 5
    //   46: areturn
    //   47: astore 4
    //   49: aload_1
    //   50: invokestatic 304	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   53: aconst_null
    //   54: areturn
    //   55: astore_3
    //   56: aload_1
    //   57: invokestatic 304	com/wandoujia/base/utils/IOUtils:close	(Ljava/io/Closeable;)V
    //   60: aload_3
    //   61: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   30	40	47	java/io/IOException
    //   30	40	55	finally
  }

  public static boolean b(String paramString)
  {
    Context localContext = GlobalConfig.getAppContext();
    String str = LauncherUtil.getAuthorityFromPermission(localContext, "READ_SETTINGS");
    if (TextUtils.isEmpty(str));
    Intent localIntent1;
    Intent localIntent2;
    do
    {
      return false;
      localIntent1 = new Intent("com.android.launcher.action.UNINSTALL_SHORTCUT");
      localIntent2 = a(localContext, str, paramString);
    }
    while (localIntent2 == null);
    localIntent1.putExtra("android.intent.extra.shortcut.NAME", paramString);
    localIntent1.putExtra("android.intent.extra.shortcut.INTENT", localIntent2);
    localContext.sendBroadcast(localIntent1);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.utils.f
 * JD-Core Version:    0.6.0
 */