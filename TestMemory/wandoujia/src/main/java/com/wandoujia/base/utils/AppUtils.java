package com.wandoujia.base.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import java.io.ByteArrayOutputStream;

public class AppUtils
{
  private static final int BUFFER_SIZE = 131072;
  private static final int MAX_ICON_SIZE = 300;

  private static byte[] bitmapToPNGBytes(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
    }
    return null;
  }

  // ERROR //
  public static String caculateAppMd5(String paramString)
  {
    // Byte code:
    //   0: invokestatic 50	com/wandoujia/base/config/GlobalConfig:getAppContext	()Landroid/content/Context;
    //   3: astore_1
    //   4: new 52	java/io/File
    //   7: dup
    //   8: aload_1
    //   9: invokevirtual 58	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   12: aload_0
    //   13: iconst_0
    //   14: invokevirtual 64	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   17: getfield 70	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   20: getfield 76	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   23: invokespecial 79	java/io/File:<init>	(Ljava/lang/String;)V
    //   26: astore_2
    //   27: aload_2
    //   28: invokevirtual 83	java/io/File:exists	()Z
    //   31: ifeq +58 -> 89
    //   34: aconst_null
    //   35: astore 5
    //   37: ldc 7
    //   39: newarray byte
    //   41: astore 6
    //   43: new 85	java/io/BufferedInputStream
    //   46: dup
    //   47: new 87	java/io/FileInputStream
    //   50: dup
    //   51: aload_2
    //   52: invokespecial 90	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   55: invokespecial 93	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   58: astore 7
    //   60: aload 7
    //   62: aload 6
    //   64: invokestatic 99	com/wandoujia/base/utils/MD5Utils:md5Digest	(Ljava/io/InputStream;[B)Ljava/lang/String;
    //   67: astore 14
    //   69: aload 7
    //   71: invokevirtual 102	java/io/BufferedInputStream:close	()V
    //   74: aload 14
    //   76: areturn
    //   77: astore 18
    //   79: aload 5
    //   81: ifnull +8 -> 89
    //   84: aload 5
    //   86: invokevirtual 102	java/io/BufferedInputStream:close	()V
    //   89: ldc 104
    //   91: areturn
    //   92: astore 17
    //   94: aload 5
    //   96: ifnull -7 -> 89
    //   99: aload 5
    //   101: invokevirtual 102	java/io/BufferedInputStream:close	()V
    //   104: goto -15 -> 89
    //   107: astore 11
    //   109: goto -20 -> 89
    //   112: astore 16
    //   114: aconst_null
    //   115: astore 7
    //   117: aload 16
    //   119: astore 12
    //   121: aload 7
    //   123: ifnull +8 -> 131
    //   126: aload 7
    //   128: invokevirtual 102	java/io/BufferedInputStream:close	()V
    //   131: aload 12
    //   133: athrow
    //   134: astore 4
    //   136: goto -47 -> 89
    //   139: astore 15
    //   141: aload 14
    //   143: areturn
    //   144: astore 9
    //   146: goto -57 -> 89
    //   149: astore 13
    //   151: goto -20 -> 131
    //   154: astore_3
    //   155: goto -66 -> 89
    //   158: astore 12
    //   160: goto -39 -> 121
    //   163: astore 10
    //   165: aload 7
    //   167: astore 5
    //   169: goto -75 -> 94
    //   172: astore 8
    //   174: aload 7
    //   176: astore 5
    //   178: goto -99 -> 79
    //
    // Exception table:
    //   from	to	target	type
    //   43	60	77	java/io/FileNotFoundException
    //   43	60	92	java/io/IOException
    //   99	104	107	java/io/IOException
    //   43	60	112	finally
    //   4	34	134	android/content/pm/PackageManager$NameNotFoundException
    //   37	43	134	android/content/pm/PackageManager$NameNotFoundException
    //   69	74	134	android/content/pm/PackageManager$NameNotFoundException
    //   84	89	134	android/content/pm/PackageManager$NameNotFoundException
    //   99	104	134	android/content/pm/PackageManager$NameNotFoundException
    //   126	131	134	android/content/pm/PackageManager$NameNotFoundException
    //   131	134	134	android/content/pm/PackageManager$NameNotFoundException
    //   69	74	139	java/io/IOException
    //   84	89	144	java/io/IOException
    //   126	131	149	java/io/IOException
    //   4	34	154	java/lang/RuntimeException
    //   37	43	154	java/lang/RuntimeException
    //   69	74	154	java/lang/RuntimeException
    //   84	89	154	java/lang/RuntimeException
    //   99	104	154	java/lang/RuntimeException
    //   126	131	154	java/lang/RuntimeException
    //   131	134	154	java/lang/RuntimeException
    //   60	69	158	finally
    //   60	69	163	java/io/IOException
    //   60	69	172	java/io/FileNotFoundException
  }

  public static String convertFirstCharToPinyin(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    String str1 = paramString.trim();
    if (TextUtils.isEmpty(str1))
      return null;
    if (TextUtil.isChinese(str1.charAt(0)))
    {
      String str2 = TextUtil.convert2Pinyin(GlobalConfig.getAppContext(), str1.substring(0, 1));
      str1 = str2.trim().toUpperCase() + str1.substring(1);
    }
    return str1.trim().replaceAll("^[\\s ]*|[\\s ]*$", "").toUpperCase();
  }

  public static byte[] drawableToBytes(Drawable paramDrawable)
  {
    Bitmap localBitmap = ImageUtil.drawableToBitmap(paramDrawable, new Bitmap.Config[0]);
    if (localBitmap != null)
      return bitmapToPNGBytes(localBitmap);
    return null;
  }

  public static byte[] getIconBytesFromPkgInfo(ApplicationInfo paramApplicationInfo, PackageManager paramPackageManager)
  {
    if (paramApplicationInfo != null)
      try
      {
        Drawable localDrawable = paramApplicationInfo.loadIcon(paramPackageManager);
        if ((localDrawable != null) && (localDrawable.getIntrinsicHeight() <= 300))
        {
          if (localDrawable.getIntrinsicWidth() > 300)
            return null;
          byte[] arrayOfByte = drawableToBytes(localDrawable);
          return arrayOfByte;
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
      }
    return null;
  }

  public static PackageInfo getPackageInfo(Context paramContext, String paramString, int paramInt)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      PackageInfo localPackageInfo = localPackageManager.getPackageInfo(paramString, paramInt);
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

  public static boolean isAppInstalled(Context paramContext, String paramString)
  {
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      int i = 0;
      if (localPackageInfo != null)
        i = 1;
      return i;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.AppUtils
 * JD-Core Version:    0.6.0
 */