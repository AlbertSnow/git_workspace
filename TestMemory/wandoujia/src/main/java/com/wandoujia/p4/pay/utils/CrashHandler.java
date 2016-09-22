package com.wandoujia.p4.pay.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.wandoujia.p4.pay.storage.LocalStorage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;

public class CrashHandler
  implements Thread.UncaughtExceptionHandler
{
  public static final String APPLICATION_CRASH = "paysdk.crash";
  public static final String APPLICATION_LOG_CRASH = "paysdk.log.crash";
  public static final String COUNT = "count";
  public static final String CREATED_DEVICE_INFO = "created_device_info";
  public static final String DETAIL = "detail";
  public static final String IS_LAUNCH = "is_launch";
  private static final String KEY_CRASH_COUNT = "CRASH_COUNT";
  private static final String ROOT_DIR = "wandoujia_paysdk";
  private static final String TAG = CrashHandler.class.getSimpleName();
  private final Context context;
  private final Thread.UncaughtExceptionHandler defaultUEH;

  public CrashHandler(Context paramContext)
  {
    this.context = paramContext;
    this.defaultUEH = Thread.getDefaultUncaughtExceptionHandler();
  }

  public static HashMap<String, String> buildCrashInfo(long paramLong, String paramString)
  {
    HashMap localHashMap = new HashMap();
    if (!TextUtils.isEmpty(paramString))
      localHashMap.put("detail", paramString);
    localHashMap.put("count", String.valueOf(paramLong));
    return localHashMap;
  }

  public static int getCrashCount(Context paramContext)
  {
    if (LocalStorage.getCurrentConfig() != null)
      try
      {
        int i = Integer.parseInt(LocalStorage.getCurrentConfig().get("CRASH_COUNT"));
        return i;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localNumberFormatException.toString();
      }
    return 0;
  }

  public static String getExternalContentDirectory()
  {
    String str = getRootDirectory();
    if (!TextUtils.isEmpty(str))
    {
      File localFile = new File(str);
      if ((localFile.exists()) || (localFile.mkdirs()));
    }
    else
    {
      return null;
    }
    return str;
  }

  public static String getRootDirectory()
  {
    try
    {
      boolean bool = Environment.getExternalStorageState().equals("mounted");
      if (!bool);
      String str;
      File localFile;
      do
      {
        return null;
        str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/wandoujia_paysdk/";
        localFile = new File(str);
      }
      while ((!localFile.exists()) && (!localFile.mkdirs()));
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static void reportCrashDetail(Throwable paramThrowable)
  {
    reportCrashDetailInternal(paramThrowable, "paysdk.crash");
  }

  private static void reportCrashDetailInternal(Throwable paramThrowable, String paramString)
  {
    StackTraceElement[] arrayOfStackTraceElement;
    int i;
    if (paramThrowable != null)
    {
      arrayOfStackTraceElement = paramThrowable.getStackTrace();
      i = arrayOfStackTraceElement.length;
    }
    for (int j = 0; ; j++)
    {
      int k = 0;
      if (j < i)
      {
        StackTraceElement localStackTraceElement = arrayOfStackTraceElement[j];
        if (!localStackTraceElement.getClassName().startsWith("com.wandoujia."))
          continue;
        new StringBuilder("Ads Exception Found: ").append(localStackTraceElement.toString());
        k = 1;
      }
      if (k != 0)
        break;
      return;
    }
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    HashMap localHashMap = buildCrashInfo(1L, localStringWriter.toString().replace("\n", "#").replace("\t", "#"));
    localHashMap.put("created_device_info", Build.DISPLAY);
    localHashMap.toString();
    LogEvent.crash(localHashMap);
  }

  private void saveCrashCount()
  {
    if (this.context != null)
    {
      int i = getCrashCount(this.context);
      setCrashCount(this.context, i + 1);
    }
  }

  private void saveCrashLog(Throwable paramThrowable)
  {
    if (paramThrowable != null);
    try
    {
      String str = getExternalContentDirectory();
      PrintStream localPrintStream = new PrintStream(str + "last_crash_log.txt");
      paramThrowable.printStackTrace(localPrintStream);
      localPrintStream.close();
      return;
    }
    catch (Exception localException)
    {
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
    }
  }

  public static void setCrashCount(Context paramContext, int paramInt)
  {
    if (LocalStorage.getCurrentConfig() != null)
      LocalStorage.getCurrentConfig().put("CRASH_COUNT", String.valueOf(paramInt));
  }

  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    SLog.e(TAG, "Exception found: ", paramThrowable);
    saveCrashCount();
    saveCrashLog(paramThrowable);
    reportCrashDetail(paramThrowable);
    this.defaultUEH.uncaughtException(paramThread, paramThrowable);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.utils.CrashHandler
 * JD-Core Version:    0.6.0
 */