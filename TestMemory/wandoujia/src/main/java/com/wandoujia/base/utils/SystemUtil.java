package com.wandoujia.base.utils;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.wandoujia.base.config.GlobalConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class SystemUtil
{
  private static final String BUILD_PROP_FILE = "/system/build.prop";
  private static final String PROP_NAME_MIUI_VERSION_CODE = "ro.miui.ui.version.code";
  private static String compilerMaco;
  private static String cpuFamily;
  private static String cpuFeatures;
  private static int versionCode;
  private static String wandoujiaVersionName = null;

  static
  {
    versionCode = 0;
    cpuFamily = null;
    compilerMaco = null;
    cpuFeatures = null;
  }

  public static boolean aboveApiLevel(int paramInt)
  {
    return getApiLevel() >= paramInt;
  }

  public static void addWandoujiaInUserAgent(WebView paramWebView)
  {
    WebSettings localWebSettings = paramWebView.getSettings();
    String str = localWebSettings.getUserAgentString();
    localWebSettings.setUserAgentString(str + " Wandoujia" + File.separator + getFullVersion());
  }

  public static boolean checkAvailableExternalStorage(long paramLong)
  {
    long l = getAvailableExternalStorage();
    if (paramLong < 0L);
    do
    {
      return true;
      if (l <= 0L)
        return false;
    }
    while (l >= paramLong);
    return false;
  }

  public static boolean checkAvailableInternalStorage(long paramLong)
  {
    long l = getAvailableInternalStorage();
    if (paramLong < 0L);
    do
    {
      return true;
      if (l <= 0L)
        return false;
    }
    while (l >= paramLong);
    return false;
  }

  public static boolean checkAvailableStorage(long paramLong)
  {
    long l = getAvailableExternalStorage();
    if (paramLong < 0L);
    do
    {
      return true;
      if (l <= 0L)
        return false;
    }
    while (l >= paramLong);
    return false;
  }

  public static boolean checkSdCardStatusOk()
  {
    return "mounted".equals(Environment.getExternalStorageState());
  }

  public static boolean checkSpaceEnough(String paramString, SystemUtil.InstallOption paramInstallOption)
  {
    if ((TextUtils.isEmpty(paramString)) || (paramInstallOption == null));
    File localFile;
    do
    {
      return false;
      if (paramInstallOption == SystemUtil.InstallOption.AUTO)
        return true;
      localFile = new File(paramString);
      if (paramInstallOption == SystemUtil.InstallOption.INTERNAL)
        return checkAvailableInternalStorage(localFile.length());
    }
    while (paramInstallOption != SystemUtil.InstallOption.EXTERNAL);
    return checkAvailableStorage(localFile.length());
  }

  public static String getAndroidId(Context paramContext)
  {
    return Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
  }

  public static int getApiLevel()
  {
    return Build.VERSION.SDK_INT;
  }

  public static long getAvailableExternalStorage()
  {
    long l1 = 0L;
    try
    {
      File localFile = Environment.getExternalStorageDirectory();
      if ((localFile != null) && (localFile.exists()))
      {
        StatFs localStatFs = new StatFs(localFile.getPath());
        long l2 = localStatFs.getBlockSize();
        int i = localStatFs.getAvailableBlocks();
        l1 = l2 * i;
      }
      return l1;
    }
    catch (Exception localException)
    {
    }
    return l1;
  }

  public static long getAvailableInternalStorage()
  {
    File localFile = Environment.getDataDirectory();
    if ((localFile != null) && (localFile.exists()))
    {
      StatFs localStatFs = new StatFs(localFile.getPath());
      return localStatFs.getBlockSize() * localStatFs.getAvailableBlocks();
    }
    return 0L;
  }

  public static String getBrand()
  {
    if (TextUtils.isEmpty(Build.BRAND))
      return "";
    return Build.BRAND;
  }

  // ERROR //
  public static String getCPU()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: new 191	java/io/FileReader
    //   5: dup
    //   6: ldc 193
    //   8: invokespecial 194	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   11: astore_1
    //   12: new 196	java/io/BufferedReader
    //   15: dup
    //   16: aload_1
    //   17: sipush 1024
    //   20: invokespecial 199	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   23: astore_2
    //   24: aload_2
    //   25: invokevirtual 202	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   28: astore 9
    //   30: aload_2
    //   31: invokevirtual 205	java/io/BufferedReader:close	()V
    //   34: aload_1
    //   35: invokevirtual 206	java/io/FileReader:close	()V
    //   38: aload 9
    //   40: ifnull +65 -> 105
    //   43: aload 9
    //   45: iconst_1
    //   46: aload 9
    //   48: bipush 58
    //   50: invokevirtual 210	java/lang/String:indexOf	(I)I
    //   53: iadd
    //   54: invokevirtual 214	java/lang/String:substring	(I)Ljava/lang/String;
    //   57: invokevirtual 217	java/lang/String:trim	()Ljava/lang/String;
    //   60: areturn
    //   61: astore 11
    //   63: aload_0
    //   64: ifnull +7 -> 71
    //   67: aload_0
    //   68: invokevirtual 205	java/io/BufferedReader:close	()V
    //   71: aload_1
    //   72: invokevirtual 206	java/io/FileReader:close	()V
    //   75: ldc 219
    //   77: areturn
    //   78: astore 5
    //   80: ldc 219
    //   82: areturn
    //   83: astore 7
    //   85: aload_0
    //   86: ifnull +7 -> 93
    //   89: aload_0
    //   90: invokevirtual 205	java/io/BufferedReader:close	()V
    //   93: aload_1
    //   94: invokevirtual 206	java/io/FileReader:close	()V
    //   97: aload 7
    //   99: athrow
    //   100: astore 4
    //   102: ldc 219
    //   104: areturn
    //   105: ldc 219
    //   107: areturn
    //   108: astore 8
    //   110: goto -13 -> 97
    //   113: astore 6
    //   115: aload_2
    //   116: astore_0
    //   117: aload 6
    //   119: astore 7
    //   121: goto -36 -> 85
    //   124: astore_3
    //   125: aload_2
    //   126: astore_0
    //   127: goto -64 -> 63
    //   130: astore 10
    //   132: goto -94 -> 38
    //
    // Exception table:
    //   from	to	target	type
    //   12	24	61	java/io/IOException
    //   67	71	78	java/lang/Exception
    //   71	75	78	java/lang/Exception
    //   12	24	83	finally
    //   2	12	100	java/io/FileNotFoundException
    //   30	38	100	java/io/FileNotFoundException
    //   67	71	100	java/io/FileNotFoundException
    //   71	75	100	java/io/FileNotFoundException
    //   89	93	100	java/io/FileNotFoundException
    //   93	97	100	java/io/FileNotFoundException
    //   97	100	100	java/io/FileNotFoundException
    //   89	93	108	java/lang/Exception
    //   93	97	108	java/lang/Exception
    //   24	30	113	finally
    //   24	30	124	java/io/IOException
    //   30	38	130	java/lang/Exception
  }

  public static String getCompilerMacro(Context paramContext)
  {
    if ((compilerMaco == null) && (LibraryLoaderHelper.loadLibrarySafety(paramContext, "CpuFeature")));
    try
    {
      compilerMaco = getCompilerMacroNative();
      return compilerMaco;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      while (true)
        compilerMaco = "";
    }
  }

  private static native String getCompilerMacroNative();

  public static String getCpuFamily(Context paramContext)
  {
    if ((cpuFamily == null) && (LibraryLoaderHelper.loadLibrarySafety(paramContext, "CpuFeature")));
    try
    {
      cpuFamily = getCpuFamilyNative();
      return cpuFamily;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      while (true)
        cpuFamily = "";
    }
  }

  private static native String getCpuFamilyNative();

  public static String getCpuFeatures(Context paramContext)
  {
    if ((cpuFeatures == null) && (LibraryLoaderHelper.loadLibrarySafety(paramContext, "CpuFeature")));
    try
    {
      cpuFeatures = getCpuFeaturesNative();
      return cpuFeatures;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      while (true)
        cpuFeatures = "";
    }
  }

  private static native String getCpuFeaturesNative();

  @TargetApi(8)
  public static File getDeviceExternalCacheDir()
  {
    Context localContext = GlobalConfig.getAppContext();
    if (Build.VERSION.SDK_INT >= 8)
      return localContext.getExternalCacheDir();
    return new File(Environment.getExternalStorageDirectory() + "/Android/data/" + localContext.getPackageName() + "/cache/");
  }

  @TargetApi(4)
  public static String getDpi(WindowManager paramWindowManager)
  {
    if (paramWindowManager == null)
      return "";
    switch (getMetricsSize(paramWindowManager))
    {
    default:
      return "xxhdpi";
    case 120:
      return "ldpi";
    case 160:
      return "mdpi";
    case 240:
      return "hdpi";
    case 320:
    }
    return "xhpdi";
  }

  public static String getFullVersion()
  {
    return getVersionName(GlobalConfig.getAppContext()) + "." + getVersionCode(GlobalConfig.getAppContext());
  }

  public static String getImei(Context paramContext)
  {
    try
    {
      String str = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  public static String getImsi(Context paramContext)
  {
    try
    {
      String str = ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  public static Locale getLocale(Context paramContext)
  {
    try
    {
      Configuration localConfiguration = new Configuration();
      Settings.System.getConfiguration(paramContext.getContentResolver(), localConfiguration);
      localLocale = localConfiguration.locale;
      if (localLocale == null)
        localLocale = Locale.getDefault();
      return localLocale;
    }
    catch (Exception localException)
    {
      while (true)
        Locale localLocale = null;
    }
  }

  public static String getMacAddress(Context paramContext)
  {
    try
    {
      localWifiManager = (WifiManager)paramContext.getSystemService("wifi");
      if (localWifiManager == null)
        return null;
    }
    catch (Throwable localThrowable)
    {
      WifiManager localWifiManager;
      while (true)
        localWifiManager = null;
      try
      {
        WifiInfo localWifiInfo2 = localWifiManager.getConnectionInfo();
        localWifiInfo1 = localWifiInfo2;
        if (localWifiInfo1 != null)
          return localWifiInfo1.getMacAddress();
      }
      catch (Exception localException)
      {
        while (true)
          WifiInfo localWifiInfo1 = null;
      }
    }
    return null;
  }

  @TargetApi(4)
  public static int getMetricsSize(WindowManager paramWindowManager)
  {
    if (paramWindowManager == null)
      return 0;
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics.densityDpi;
  }

  public static String getNonNullModel()
  {
    if (TextUtils.isEmpty(Build.MODEL))
      return "";
    return Build.MODEL;
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

  public static String getProcessName(Context paramContext)
  {
    int i = Process.myPid();
    List localList = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (CollectionUtils.isEmpty(localList))
      return "";
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
      if (localRunningAppProcessInfo.pid == i)
        return localRunningAppProcessInfo.processName;
    }
    return "";
  }

  public static int getScreenBrightness(Context paramContext)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    try
    {
      int i = Settings.System.getInt(localContentResolver, "screen_brightness");
      return i;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  public static int getScreenHeight(WindowManager paramWindowManager)
  {
    Display localDisplay = paramWindowManager.getDefaultDisplay();
    if ((aboveApiLevel(14)) && (!aboveApiLevel(17)))
      try
      {
        int i = ((Integer)Display.class.getMethod("getRawHeight", new Class[0]).invoke(localDisplay, new Object[0])).intValue();
        return i;
      }
      catch (Exception localException)
      {
        return 0;
      }
    if (aboveApiLevel(17))
    {
      Point localPoint = new Point();
      localDisplay.getRealSize(localPoint);
      return localPoint.y;
    }
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    return localDisplayMetrics.heightPixels;
  }

  @TargetApi(8)
  public static String getScreenResolution(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
    if ((localWindowManager != null) && (localWindowManager.getDefaultDisplay() != null))
    {
      localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
      if (aboveApiLevel(8))
      {
        switch (localWindowManager.getDefaultDisplay().getRotation())
        {
        case 2:
        default:
          return String.valueOf(localDisplayMetrics.widthPixels) + "*" + String.valueOf(localDisplayMetrics.heightPixels);
        case 1:
        case 3:
        }
        return String.valueOf(localDisplayMetrics.heightPixels) + "*" + String.valueOf(localDisplayMetrics.widthPixels);
      }
      return String.valueOf(localDisplayMetrics.widthPixels) + "*" + String.valueOf(localDisplayMetrics.heightPixels);
    }
    return "unknown";
  }

  public static int getScreenWidth(WindowManager paramWindowManager)
  {
    Display localDisplay = paramWindowManager.getDefaultDisplay();
    if ((aboveApiLevel(14)) && (!aboveApiLevel(17)))
      try
      {
        int i = ((Integer)Display.class.getMethod("getRawWidth", new Class[0]).invoke(localDisplay, new Object[0])).intValue();
        return i;
      }
      catch (Exception localException)
      {
        return 0;
      }
    if (aboveApiLevel(17))
    {
      Point localPoint = new Point();
      localDisplay.getRealSize(localPoint);
      return localPoint.x;
    }
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    return localDisplayMetrics.widthPixels;
  }

  public static String getSdkReleaseVersion()
  {
    try
    {
      String str = Build.VERSION.RELEASE;
      return str;
    }
    catch (Exception localException)
    {
    }
    return getSdkVersion();
  }

  public static String getSdkVersion()
  {
    try
    {
      String str = Build.VERSION.SDK;
      return str;
    }
    catch (Exception localException)
    {
    }
    return String.valueOf(getSdkVersionInt());
  }

  public static int getSdkVersionInt()
  {
    try
    {
      int i = Build.VERSION.SDK_INT;
      return i;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  public static String getSecureAndroidID(Context paramContext)
  {
    return Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
  }

  public static String getSystemDisplayId()
  {
    if (TextUtils.isEmpty(Build.DISPLAY))
      return "";
    return Build.DISPLAY;
  }

  public static long getTotalExternalMemorySize()
  {
    try
    {
      File localFile = Environment.getExternalStorageDirectory();
      if ((localFile != null) && (localFile.exists()))
      {
        StatFs localStatFs = new StatFs(localFile.getPath());
        long l = localStatFs.getBlockSize();
        int i = localStatFs.getBlockCount();
        return l * i;
      }
    }
    catch (Exception localException)
    {
    }
    return 0L;
  }

  public static long getTotalInternalMemorySize()
  {
    File localFile = Environment.getDataDirectory();
    if ((localFile != null) && (localFile.exists()))
    {
      StatFs localStatFs = new StatFs(localFile.getPath());
      return localStatFs.getBlockSize() * localStatFs.getBlockCount();
    }
    return 0L;
  }

  public static int getVersionCode(Context paramContext)
  {
    if (versionCode != 0)
      return versionCode;
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      versionCode = i;
      return i;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      return 0;
    }
    catch (RuntimeException localRuntimeException)
    {
      label33: break label33;
    }
  }

  public static String getVersionName(Context paramContext)
  {
    if ((wandoujiaVersionName == null) && (paramContext != null))
    {
      PackageInfo localPackageInfo = getPackageInfo(paramContext, paramContext.getPackageName(), 0);
      if (localPackageInfo == null)
        break label35;
      wandoujiaVersionName = localPackageInfo.versionName;
    }
    while (true)
    {
      return wandoujiaVersionName;
      label35: wandoujiaVersionName = "";
    }
  }

  public static String getWifiIPAddress(Context paramContext)
  {
    try
    {
      WifiManager localWifiManager = (WifiManager)paramContext.getSystemService("wifi");
      if (localWifiManager == null)
        return null;
      WifiInfo localWifiInfo = localWifiManager.getConnectionInfo();
      if (localWifiInfo == null)
        return null;
      int i = localWifiInfo.getIpAddress();
      if (i == 0)
        return null;
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(i & 0xFF);
      arrayOfObject[1] = Integer.valueOf(0xFF & i >> 8);
      arrayOfObject[2] = Integer.valueOf(0xFF & i >> 16);
      arrayOfObject[3] = Integer.valueOf(0xFF & i >> 24);
      String str = String.format(localLocale, "%d.%d.%d.%d", arrayOfObject);
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String getWifiSSID(Context paramContext)
  {
    WifiManager localWifiManager = (WifiManager)paramContext.getSystemService("wifi");
    String str;
    if (localWifiManager == null)
      str = null;
    do
    {
      return str;
      WifiInfo localWifiInfo = localWifiManager.getConnectionInfo();
      if (localWifiInfo == null)
        return null;
      str = localWifiInfo.getSSID();
    }
    while ((str == null) || (!str.startsWith("\"")) || (!str.endsWith("\"")));
    return str.substring(1, -1 + str.length());
  }

  public static boolean hasSoftKeys(Context paramContext)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 0;
    if (i >= 14)
    {
      boolean bool = ViewConfiguration.get(paramContext).hasPermanentMenuKey();
      j = 0;
      if (!bool)
        j = 1;
    }
    return j;
  }

  // ERROR //
  public static android.os.IBinder invokeGetService(String paramString)
  {
    // Byte code:
    //   0: ldc_w 578
    //   3: invokestatic 582	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   6: ldc_w 584
    //   9: iconst_1
    //   10: anewarray 438	java/lang/Class
    //   13: dup
    //   14: iconst_0
    //   15: ldc 98
    //   17: aastore
    //   18: invokevirtual 442	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   21: astore 4
    //   23: aload 4
    //   25: aconst_null
    //   26: iconst_1
    //   27: anewarray 4	java/lang/Object
    //   30: dup
    //   31: iconst_0
    //   32: aload_0
    //   33: aastore
    //   34: invokevirtual 448	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   37: checkcast 586	android/os/IBinder
    //   40: astore 8
    //   42: aload 8
    //   44: areturn
    //   45: astore_3
    //   46: aconst_null
    //   47: areturn
    //   48: astore_2
    //   49: aconst_null
    //   50: areturn
    //   51: astore_1
    //   52: aconst_null
    //   53: areturn
    //   54: astore 7
    //   56: aconst_null
    //   57: areturn
    //   58: astore 6
    //   60: aconst_null
    //   61: areturn
    //   62: astore 5
    //   64: aconst_null
    //   65: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	23	45	java/lang/SecurityException
    //   0	23	48	java/lang/NoSuchMethodException
    //   0	23	51	java/lang/ClassNotFoundException
    //   23	42	54	java/lang/IllegalArgumentException
    //   23	42	58	java/lang/IllegalAccessException
    //   23	42	62	java/lang/reflect/InvocationTargetException
  }

  public static boolean isBlur()
  {
    try
    {
      boolean bool = Build.BRAND.toLowerCase().contains("blur");
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean isDeviceTablet(Context paramContext)
  {
    if (paramContext == null)
      throw new IllegalArgumentException("context can't be null");
    return (0xF & paramContext.getResources().getConfiguration().screenLayout) >= 3;
  }

  public static boolean isExternalSDCardMounted()
  {
    try
    {
      if (Build.VERSION.SDK_INT < 11)
        return "mounted".equals(Environment.getExternalStorageState());
      if ("mounted".equals(Environment.getExternalStorageState()))
      {
        boolean bool = Environment.isExternalStorageEmulated();
        if (!bool)
          return true;
      }
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean isFlymeOs()
  {
    try
    {
      boolean bool = Build.FINGERPRINT.toLowerCase().contains("flyme");
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean isGLD728()
  {
    try
    {
      boolean bool = Build.MODEL.toUpperCase().contains("LG-D728");
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean isGalaxyS2()
  {
    try
    {
      String str = Build.MODEL.toLowerCase();
      int i;
      if ((!str.contains("gt-i9100")) && (!str.contains("gt-i9108")))
      {
        boolean bool = str.contains("gt-i9103");
        i = 0;
        if (!bool);
      }
      else
      {
        i = 1;
      }
      return i;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean isHuaWeiG520()
  {
    try
    {
      boolean bool = Build.MODEL.toUpperCase().contains("HUAWEI G520");
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean isKindleFire()
  {
    try
    {
      boolean bool = Build.MODEL.toLowerCase().contains("kindle fire");
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean isMIUI()
  {
    File localFile = new File("/system/build.prop");
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader(localFile));
      boolean bool;
      do
      {
        String str = localBufferedReader.readLine();
        if (str == null)
          break;
        bool = str.startsWith("ro.miui.ui.version.code");
      }
      while (!bool);
      return true;
    }
    catch (IOException localIOException)
    {
      return false;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      label54: break label54;
    }
  }

  public static boolean isMX()
  {
    try
    {
      String str = Build.MODEL.toLowerCase();
      int i;
      if ((!str.contains("m353")) && (!str.contains("mx4")))
      {
        boolean bool = str.contains("m040");
        i = 0;
        if (!bool);
      }
      else
      {
        i = 1;
      }
      return i;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean isNexusS()
  {
    try
    {
      boolean bool = Build.MODEL.toLowerCase().contains("nexus s");
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  @TargetApi(9)
  public static boolean isPrimaryExternalStorageRemoveable()
  {
    if (getApiLevel() >= 9)
      return Environment.isExternalStorageRemovable();
    return true;
  }

  public static boolean isRooted()
  {
    int i;
    if (new File("/system/bin/su").exists())
    {
      String.format("ls -l /%s/su", new Object[] { "system/bin" });
      i = 1;
    }
    while (true)
    {
      if (i == 1)
      {
        return true;
        if (new File("/system/xbin/su").exists())
        {
          String.format("ls -l /%s/su", new Object[] { "system/xbin" });
          i = 1;
          continue;
        }
        if (new File("/data/bin/su").exists())
        {
          String.format("ls -l /%s/su", new Object[] { "data/bin" });
          i = 1;
          continue;
        }
      }
      else
      {
        return false;
      }
      i = 0;
    }
  }

  public static boolean isSDCardMounted()
  {
    return Environment.getExternalStorageState().equals("mounted");
  }

  public static boolean isSmartisan()
  {
    try
    {
      boolean bool = Build.BRAND.toLowerCase().contains("smartisan");
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean isZTE()
  {
    try
    {
      boolean bool = Build.BRAND.toLowerCase().contains("zte");
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static void sleepZero()
  {
    try
    {
      Thread.sleep(0L);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.SystemUtil
 * JD-Core Version:    0.6.0
 */