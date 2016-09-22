package com.wandoujia.base.log;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import com.wandoujia.base.config.GlobalConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Log
{
  private static final Pattern ANONYMOUS_CLASS;
  private static int MAX_MESSAGE_LENGTH;
  private static String tagPrefix = "";

  static
  {
    MAX_MESSAGE_LENGTH = 4000;
    ANONYMOUS_CLASS = Pattern.compile("\\$\\d+$");
  }

  public static void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (GlobalConfig.isDebug())
      println(3, paramString1, formatString(paramString2, paramArrayOfObject), null);
  }

  public static String defaultTag()
  {
    String str = new Throwable().getStackTrace()[5].getClassName();
    Matcher localMatcher = ANONYMOUS_CLASS.matcher(str);
    if (localMatcher.find())
      str = localMatcher.replaceAll("");
    return str.substring(1 + str.lastIndexOf('.'));
  }

  public static void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (GlobalConfig.isDebug())
      println(6, paramString1, paramString2, paramThrowable);
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (GlobalConfig.isDebug())
      println(6, paramString1, formatString(paramString2, paramArrayOfObject), null);
  }

  private static String formatString(String paramString, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length > 0)
      paramString = String.format(paramString, paramArrayOfObject);
    return paramString;
  }

  public static String getStackTraceString(Throwable paramThrowable)
  {
    return android.util.Log.getStackTraceString(paramThrowable);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (GlobalConfig.isDebug())
      println(4, paramString1, formatString(paramString2, paramArrayOfObject), null);
  }

  public static void printStackTrace(Throwable paramThrowable)
  {
    GlobalConfig.isDebug();
  }

  private static void println(int paramInt, String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (!GlobalConfig.isDebug());
    while (true)
    {
      return;
      if ((paramString2 == null) || (paramString2.length() == 0))
        continue;
      if (paramThrowable != null)
        paramString2 = paramString2 + "\n" + android.util.Log.getStackTraceString(paramThrowable);
      if (paramString2.length() < MAX_MESSAGE_LENGTH)
      {
        android.util.Log.println(paramInt, tagPrefix + paramString1, paramString2);
        return;
      }
      for (String str : paramString2.split("\n"))
        android.util.Log.println(paramInt, tagPrefix + paramString1, str);
    }
  }

  public static void setTagPrefix(String paramString)
  {
    tagPrefix = paramString;
  }

  private static List<String> splitLongString(String paramString)
  {
    if (paramString == null)
      return Collections.emptyList();
    ArrayList localArrayList = new ArrayList(1 + paramString.length() / MAX_MESSAGE_LENGTH);
    int i = 0;
    while (i < paramString.length())
    {
      int j = Math.min(MAX_MESSAGE_LENGTH, paramString.length() - i);
      localArrayList.add(paramString.substring(i, i + j));
      i += j;
    }
    return localArrayList;
  }

  public static String tag(Class paramClass)
  {
    return paramClass.getSimpleName();
  }

  public static void v(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (GlobalConfig.isDebug())
      println(2, paramString1, formatString(paramString2, paramArrayOfObject), null);
  }

  public static void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (GlobalConfig.isDebug())
      println(5, paramString1, formatString(paramString2, paramArrayOfObject), null);
  }

  public static void w(String paramString, Throwable paramThrowable)
  {
    if (GlobalConfig.isDebug())
      println(5, paramString, "", paramThrowable);
  }

  @TargetApi(8)
  public static void wtf(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if ((GlobalConfig.isDebug()) && (Build.VERSION.SDK_INT >= 8))
      android.util.Log.wtf(tagPrefix + paramString1, paramString2, paramThrowable);
  }

  @TargetApi(8)
  public static void wtf(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if ((GlobalConfig.isDebug()) && (Build.VERSION.SDK_INT >= 8))
      android.util.Log.wtf(tagPrefix + paramString1, formatString(paramString2, paramArrayOfObject));
  }

  @TargetApi(8)
  public static void wtfStack(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if ((GlobalConfig.isDebug()) && (Build.VERSION.SDK_INT >= 8))
    {
      android.util.Log.wtf(tagPrefix + paramString1, formatString(paramString2, new Object[0]));
      android.util.Log.wtf(tagPrefix + paramString1, android.util.Log.getStackTraceString(paramThrowable));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.log.Log
 * JD-Core Version:    0.6.0
 */