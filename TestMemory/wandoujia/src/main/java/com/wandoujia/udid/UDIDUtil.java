package com.wandoujia.udid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.wandoujia.base.utils.DigestUtils;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.base.utils.LibraryLoaderHelper;
import com.wandoujia.base.utils.SystemUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

public class UDIDUtil
{
  private static final String a = b(".udid");
  private static final String b = b(".channel");
  private static Handler c = new Handler(Looper.getMainLooper());
  private static String d = null;

  public static String a(Context paramContext)
  {
    monitorenter;
    int i;
    while (true)
    {
      try
      {
        if (TextUtils.isEmpty(d))
          continue;
        i = 0;
        break;
        return d;
        String str1 = c(paramContext);
        d = str1;
        if ((TextUtils.isEmpty(str1)) || (!b(paramContext, d)))
          continue;
        i = 1;
        break;
        String str2 = PreferenceManager.getDefaultSharedPreferences(paramContext).getString("udid", "");
        d = str2;
        if ((TextUtils.isEmpty(str2)) || (!b(paramContext, d)))
          continue;
        i = 2;
        break;
        String str3 = b(paramContext);
        d = str3;
        if ((TextUtils.isEmpty(str3)) || (!b(paramContext, d)))
          continue;
        i = 3;
        break;
        String str4 = UUID.randomUUID().toString().replaceAll("-", "");
        LibraryLoaderHelper.loadLibrarySafety(paramContext, "wdj_udid");
        d = generateUDIDNative(str4);
        i = 5;
        break;
        a(paramContext, "udid", d);
        c(paramContext.getApplicationContext(), d);
        continue;
      }
      finally
      {
        monitorexit;
      }
      c(d);
      c(paramContext.getApplicationContext(), d);
      continue;
      c(d);
      a(paramContext, "udid", d);
      continue;
      c(d);
      a(paramContext, "udid", d);
      c(paramContext.getApplicationContext(), d);
    }
    switch (i)
    {
    case 4:
    default:
    case 1:
    case 2:
    case 3:
    case 5:
    }
  }

  private static void a(Context paramContext, String paramString1, String paramString2)
  {
    new a(paramString2, paramContext, paramString1).start();
  }

  private static String b(Context paramContext)
  {
    String str1 = a;
    if ((!TextUtils.isEmpty(str1)) && (FileUtil.exists(str1)));
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader(str1));
      String str2 = localBufferedReader.readLine();
      localBufferedReader.close();
      if (TextUtils.isEmpty(str2))
        return "";
      String[] arrayOfString = str2.split("\t");
      if (arrayOfString.length >= 2)
      {
        String str3 = SystemUtil.getImei(paramContext);
        if (TextUtils.isEmpty(str3))
        {
          if ((TextUtils.isEmpty(arrayOfString[1])) && (!TextUtils.isEmpty(arrayOfString[0])))
            return arrayOfString[0];
        }
        else if ((arrayOfString[1].equals(DigestUtils.getStringMD5(str3))) && (!TextUtils.isEmpty(arrayOfString[0])))
        {
          String str4 = arrayOfString[0];
          return str4;
        }
      }
      else
      {
        return str2;
      }
    }
    catch (Exception localException)
    {
      return "";
    }
    catch (IOException localIOException)
    {
      break label149;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      label149: break label149;
    }
    return "";
  }

  private static String b(String paramString)
  {
    if (SystemUtil.isSDCardMounted())
      return Environment.getExternalStorageDirectory().getAbsolutePath() + "/wandoujia/.config/" + paramString;
    return "";
  }

  private static boolean b(Context paramContext, String paramString)
  {
    LibraryLoaderHelper.loadLibrarySafety(paramContext, "wdj_udid");
    return isUDIDValidNative(paramString);
  }

  private static String c(Context paramContext)
  {
    d();
    if (FileUtil.exists("/data/local/tmp/.wdj_config/.udid"))
    {
      c();
      FileUtil.deletePath("/data/local/tmp/.config");
      return FileUtil.readFileFirstLine("/data/local/tmp/.wdj_config/.udid");
    }
    if (FileUtil.exists("/data/local/tmp/.config/.udid"))
    {
      String str = FileUtil.readFileFirstLine("/data/local/tmp/.config/.udid");
      if ((!TextUtils.isEmpty(d)) && (b(paramContext, str)))
      {
        c(str);
        return str;
      }
      FileUtil.deletePath("/data/local/tmp/.config");
    }
    return "";
  }

  private static void c()
  {
    try
    {
      Runtime.getRuntime().exec("chmod 777 /data/local/tmp/.wdj_config");
      Runtime.getRuntime().exec("chmod 666 /data/local/tmp/.wdj_config/.udid");
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private static void c(Context paramContext, String paramString)
  {
    c.postDelayed(new b(paramContext, paramString), 5000L);
  }

  private static void c(String paramString)
  {
    new Thread(new d(paramString)).start();
  }

  private static void d()
  {
    try
    {
      Runtime.getRuntime().exec("chmod 777 /data/local/tmp");
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private static native String generateUDIDNative(String paramString);

  private static native boolean isUDIDValidNative(String paramString);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.udid.UDIDUtil
 * JD-Core Version:    0.6.0
 */