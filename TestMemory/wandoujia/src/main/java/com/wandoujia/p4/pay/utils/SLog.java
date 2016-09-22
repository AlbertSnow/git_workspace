package com.wandoujia.p4.pay.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public class SLog
{
  private static final String GLOBAL_PREFIX = "Wandoujia-PaySdk_";
  private static final boolean IN_DEBUG_MODE = true;
  private static volatile int error_times = 0;
  static final int max_upload_times = 20;

  public static void d(String paramString1, String paramString2)
  {
    new StringBuilder().append(paramString2);
  }

  public static void e(String paramString1, String paramString2)
  {
    new StringBuilder().append(paramString2);
  }

  public static void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    new StringBuilder().append(paramString2);
    report("Wandoujia-PaySdk_" + paramString1, paramString2, paramThrowable);
  }

  public static void e(String paramString, Throwable paramThrowable)
  {
    e(paramString, paramThrowable.getMessage(), paramThrowable);
  }

  public static String filter(String paramString)
  {
    return paramString.replace("\n", "##");
  }

  public static String getStackTrace(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter, true);
    paramThrowable.printStackTrace(localPrintWriter);
    localPrintWriter.flush();
    localStringWriter.flush();
    return localStringWriter.toString();
  }

  public static void i(String paramString1, String paramString2)
  {
    new StringBuilder().append(paramString2);
  }

  private static void report(String paramString1, String paramString2, Throwable paramThrowable)
  {
  }

  public static void w(String paramString1, String paramString2)
  {
    new StringBuilder().append(paramString2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.utils.SLog
 * JD-Core Version:    0.6.0
 */