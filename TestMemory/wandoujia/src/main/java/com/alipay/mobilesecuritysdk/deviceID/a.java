package com.alipay.mobilesecuritysdk.deviceID;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class a
{
  private static a a = new a();

  public static a a()
  {
    return a;
  }

  public static String a(Context paramContext)
  {
    return ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
  }

  public static String b()
  {
    String str = null;
    try
    {
      FileReader localFileReader = new FileReader("/proc/cpuinfo");
      try
      {
        BufferedReader localBufferedReader = new BufferedReader(localFileReader, 1024);
        str = localBufferedReader.readLine();
        localBufferedReader.close();
        localFileReader.close();
        label37: if (str != null)
          return str.substring(1 + str.indexOf(':')).trim();
      }
      catch (IOException localIOException)
      {
        while (true)
          new StringBuilder("getCpuNum").append(localIOException.getLocalizedMessage());
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      break label37;
    }
    return "";
  }

  public static String b(Context paramContext)
  {
    if (paramContext != null)
      try
      {
        TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
        if (localTelephonyManager != null)
        {
          String str = localTelephonyManager.getDeviceId();
          return str;
        }
      }
      catch (Exception localException)
      {
        new StringBuilder("getImei").append(localException.getLocalizedMessage());
      }
    return null;
  }

  public static String c()
  {
    try
    {
      int k = Build.VERSION.class.getField("SDK_INT").getInt(null);
      i = k;
      return Integer.toString(i);
    }
    catch (Exception localException1)
    {
      while (true)
        try
        {
          int j = Integer.parseInt((String)Build.VERSION.class.getField("SDK").get(null));
          i = j;
        }
        catch (Exception localException2)
        {
          int i = 2;
          new StringBuilder("getSDKVer").append(localException1.getLocalizedMessage());
        }
    }
  }

  public static String c(Context paramContext)
  {
    if (paramContext != null)
      try
      {
        TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
        if (localTelephonyManager != null)
        {
          String str = localTelephonyManager.getSubscriberId();
          return str;
        }
      }
      catch (Exception localException)
      {
        new StringBuilder("getImsi").append(localException.getLocalizedMessage());
      }
    return null;
  }

  public static String d()
  {
    return Build.VERSION.RELEASE;
  }

  public static String d(Context paramContext)
  {
    try
    {
      DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
      String str = Integer.toString(localDisplayMetrics.widthPixels) + "*" + Integer.toString(localDisplayMetrics.heightPixels);
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String e()
  {
    return Build.MODEL;
  }

  public static String e(Context paramContext)
  {
    return paramContext.getPackageName();
  }

  public static String f()
  {
    int i = 2;
    String[] arrayOfString1 = new String[i];
    arrayOfString1[0] = "";
    arrayOfString1[1] = "";
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"), 8192);
      String[] arrayOfString2 = localBufferedReader.readLine().split("\\s+");
      while (true)
      {
        if (i >= arrayOfString2.length)
        {
          String[] arrayOfString3 = localBufferedReader.readLine().split("\\s+");
          arrayOfString1[1] = (arrayOfString1[1] + arrayOfString3[2]);
          localBufferedReader.close();
          return arrayOfString1[1];
        }
        arrayOfString1[0] = (arrayOfString1[0] + arrayOfString2[i] + " ");
        i++;
      }
    }
    catch (IOException localIOException)
    {
      new StringBuilder("getCpuFre").append(localIOException.getLocalizedMessage());
    }
    return null;
  }

  // ERROR //
  public static long g()
  {
    // Byte code:
    //   0: new 50	java/io/BufferedReader
    //   3: dup
    //   4: new 43	java/io/FileReader
    //   7: dup
    //   8: ldc 194
    //   10: invokespecial 48	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   13: sipush 8192
    //   16: invokespecial 53	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   19: astore_0
    //   20: aload_0
    //   21: invokevirtual 56	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   24: ldc 182
    //   26: invokevirtual 186	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   29: iconst_1
    //   30: aaload
    //   31: invokestatic 197	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   34: invokevirtual 201	java/lang/Integer:intValue	()I
    //   37: istore 6
    //   39: iload 6
    //   41: i2l
    //   42: lstore_2
    //   43: aload_0
    //   44: invokevirtual 59	java/io/BufferedReader:close	()V
    //   47: lload_2
    //   48: lreturn
    //   49: astore_1
    //   50: lconst_0
    //   51: lstore_2
    //   52: aload_1
    //   53: astore 4
    //   55: new 75	java/lang/StringBuilder
    //   58: dup
    //   59: ldc 203
    //   61: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   64: aload 4
    //   66: invokevirtual 81	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   69: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: lload_2
    //   74: lreturn
    //   75: astore 4
    //   77: goto -22 -> 55
    //
    // Exception table:
    //   from	to	target	type
    //   0	39	49	java/io/IOException
    //   43	47	75	java/io/IOException
  }

  public static long h()
  {
    long[] arrayOfLong = new long[2];
    try
    {
      if ("mounted".equals(Environment.getExternalStorageState()))
      {
        StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long l1 = localStatFs.getBlockSize();
        long l2 = localStatFs.getBlockCount();
        long l3 = localStatFs.getAvailableBlocks();
        arrayOfLong[0] = (l2 * l1);
        arrayOfLong[1] = (l3 * l1);
      }
      label63: return arrayOfLong[0];
    }
    catch (Exception localException)
    {
      break label63;
    }
  }

  public static String i()
  {
    return Build.DISPLAY;
  }

  public static String j()
  {
    try
    {
      BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
      if (localBluetoothAdapter != null)
      {
        boolean bool = localBluetoothAdapter.isEnabled();
        if (!bool)
          return "";
      }
      String str = localBluetoothAdapter.getAddress();
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String k()
  {
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      Object localObject = localClass.newInstance();
      String str = (String)localClass.getMethod("get", new Class[] { String.class, String.class }).invoke(localObject, new Object[] { "gsm.version.baseband", "no message" });
      return str;
    }
    catch (Exception localException)
    {
      new StringBuilder("getBandVer").append(localException.getLocalizedMessage());
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.mobilesecuritysdk.deviceID.a
 * JD-Core Version:    0.6.0
 */