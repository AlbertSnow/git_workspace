package com.wandoujia.logv3.toolkit;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.logv3.model.packages.ApplicationCrashEvent.Type;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class ae
  implements Thread.UncaughtExceptionHandler
{
  private final Thread.UncaughtExceptionHandler a;
  private final Context b;

  public ae(Context paramContext)
  {
    this.b = paramContext;
    this.a = Thread.getDefaultUncaughtExceptionHandler();
    new ANRWatchDog();
  }

  private static String a()
  {
    return new SimpleDateFormat("yyyyMMdd").format(new Date());
  }

  public static void a(Throwable paramThrowable)
  {
    a(paramThrowable, ApplicationCrashEvent.Type.LOG_CRASH);
  }

  private static void a(Throwable paramThrowable, ApplicationCrashEvent.Type paramType)
  {
    if (paramThrowable != null)
    {
      StringWriter localStringWriter = new StringWriter();
      paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
      String str = localStringWriter.toString().replace("\n", "#").replace("\t", "#");
      v.b().a(paramType, str);
    }
  }

  public static void b(Throwable paramThrowable)
  {
    a(paramThrowable, ApplicationCrashEvent.Type.ANR);
  }

  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    try
    {
      SharedPreferences localSharedPreferences = this.b.getSharedPreferences("log_crash", 0);
      boolean bool1 = a().equals(localSharedPreferences.getString("crash_date", ""));
      i = 0;
      if (bool1)
      {
        int j = localSharedPreferences.getInt("crash_count", 0);
        i = j;
      }
      if (i < 10)
        if (paramThrowable == null);
    }
    catch (Throwable localThrowable)
    {
      try
      {
        int i;
        String str = GlobalConfig.getAppRootDir() + "diagnosis" + File.separator;
        File localFile = new File(str);
        if (!localFile.exists())
        {
          boolean bool2 = localFile.mkdirs();
          if (bool2);
        }
        while (true)
        {
          label126: a(paramThrowable, ApplicationCrashEvent.Type.APP_CRASH);
          int k = i + 1;
          SharedPreferences.Editor localEditor = this.b.getSharedPreferences("log_crash", 0).edit();
          localEditor.putString("crash_date", a());
          localEditor.putInt("crash_count", k);
          localEditor.commit();
          this.a.uncaughtException(paramThread, paramThrowable);
          return;
          PrintStream localPrintStream = new PrintStream(str + "last_crash_log.txt");
          paramThrowable.printStackTrace(localPrintStream);
          localPrintStream.close();
        }
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        while (true)
        {
          continue;
          localThrowable = localThrowable;
        }
      }
      catch (Exception localException)
      {
        break label126;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.ae
 * JD-Core Version:    0.6.0
 */