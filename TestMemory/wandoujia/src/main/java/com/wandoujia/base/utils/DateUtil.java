package com.wandoujia.base.utils;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.base.R.array;
import com.wandoujia.base.R.string;
import com.wandoujia.base.config.GlobalConfig;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil
{
  public static long DAY;
  private static int DAYS_OF_WEEK;
  public static long HOUR;
  public static long MINUTE;
  public static long MIN_MICROSECOND_LONG;
  public static long MIN_MILLISECOND_LONG;
  public static long MIN_SECOND_LONG = 1000000000L;
  public static long MONTH;
  private static int MONTHS_OF_YEAR;
  public static long WEEK;

  static
  {
    MIN_MILLISECOND_LONG = 1000000000000L;
    MIN_MICROSECOND_LONG = 1000000000000000L;
    MINUTE = 60000L;
    HOUR = 3600000L;
    DAY = 86400000L;
    WEEK = 7L * DAY;
    MONTH = 30L * DAY;
    MONTHS_OF_YEAR = 12;
    DAYS_OF_WEEK = 7;
  }

  public static long checkLongIsMillisecond(long paramLong)
  {
    if (isMillisecond(paramLong))
      return paramLong;
    if (isMicrosecond(paramLong))
      return paramLong / 1000L;
    return paramLong * 1000L;
  }

  public static long checkLongIsSecond(long paramLong)
  {
    if (isSecond(paramLong))
      return paramLong;
    if (isMillisecond(paramLong))
      return paramLong / 1000L;
    return paramLong * 1000L;
  }

  public static int distanceToToday(long paramLong)
  {
    Calendar localCalendar1 = Calendar.getInstance();
    Date localDate = new Date(paramLong);
    Calendar localCalendar2 = Calendar.getInstance();
    localCalendar2.setTime(localDate);
    trimCalendar(localCalendar1);
    trimCalendar(localCalendar2);
    return (int)((localCalendar2.getTimeInMillis() - localCalendar1.getTimeInMillis()) / 86400000L);
  }

  public static String distanceToTodayString(long paramLong)
  {
    int i = distanceToToday(paramLong);
    if (i == 0)
      return GlobalConfig.getAppContext().getString(R.string.today);
    if (i == -1)
      return GlobalConfig.getAppContext().getString(R.string.yesterday);
    if (i < 0)
    {
      String str2 = GlobalConfig.getAppContext().getString(R.string.days_ago);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(Math.abs(i));
      return String.format(str2, arrayOfObject2);
    }
    String str1 = GlobalConfig.getAppContext().getString(R.string.days_later);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(i);
    return String.format(str1, arrayOfObject1);
  }

  public static String formatDistanceToToday(long paramLong)
  {
    return formatDistanceToToday(paramLong, false);
  }

  public static String formatDistanceToToday(long paramLong, boolean paramBoolean)
  {
    Calendar localCalendar1 = Calendar.getInstance();
    Date localDate = new Date(paramLong);
    Calendar localCalendar2 = Calendar.getInstance();
    localCalendar2.setTime(localDate);
    trimCalendar(localCalendar1);
    trimCalendar(localCalendar2);
    int i = distanceToToday(paramLong);
    if (i > 0)
    {
      String str = GlobalConfig.getAppContext().getString(R.string.days_later);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      return String.format(str, arrayOfObject);
    }
    if (i == 0)
      return GlobalConfig.getAppContext().getString(R.string.today);
    if (i == -1)
      return GlobalConfig.getAppContext().getString(R.string.yesterday);
    if (getMonthDistance(localCalendar2, localCalendar1) == 0)
    {
      if (Math.abs(i) < DAYS_OF_WEEK)
      {
        if (localCalendar2.get(3) == localCalendar1.get(3))
          return getWeekString(localCalendar2);
        return GlobalConfig.getAppContext().getString(R.string.last_week_prefix) + getWeekString(localCalendar2);
      }
      if (Math.abs(i) < 2 * DAYS_OF_WEEK)
        return GlobalConfig.getAppContext().getString(R.string.one_week) + GlobalConfig.getAppContext().getString(R.string.ago);
      return GlobalConfig.getAppContext().getString(R.string.two_weeks) + GlobalConfig.getAppContext().getString(R.string.ago);
    }
    if (paramBoolean)
      return timeStamp2Date(String.valueOf(paramLong));
    return GlobalConfig.getAppContext().getString(R.string.one_month) + GlobalConfig.getAppContext().getString(R.string.ago);
  }

  private static int getMonthDistance(Calendar paramCalendar1, Calendar paramCalendar2)
  {
    int i = -1;
    int j;
    if (paramCalendar1.after(paramCalendar2))
      j = i;
    while (true)
    {
      int k = paramCalendar1.get(1) - paramCalendar2.get(1);
      int m = paramCalendar1.get(2) - paramCalendar2.get(2);
      int n = paramCalendar1.get(5) - paramCalendar2.get(5);
      int i1 = m + k * MONTHS_OF_YEAR;
      if (n >= 0)
        i = 0;
      return j * (i + i1);
      j = 1;
      Calendar localCalendar = paramCalendar2;
      paramCalendar2 = paramCalendar1;
      paramCalendar1 = localCalendar;
    }
  }

  public static String getMonthStringChinese(Calendar paramCalendar)
  {
    String[] arrayOfString = GlobalConfig.getAppContext().getResources().getStringArray(R.array.month_array);
    int i = paramCalendar.get(2);
    if ((i >= 0) && (i < arrayOfString.length))
      return arrayOfString[i];
    return "";
  }

  public static String getMonthStringEng(Calendar paramCalendar)
  {
    Context localContext = GlobalConfig.getAppContext();
    switch (paramCalendar.get(2))
    {
    default:
      return "";
    case 0:
      return localContext.getString(R.string.january);
    case 1:
      return localContext.getString(R.string.february);
    case 2:
      return localContext.getString(R.string.march);
    case 3:
      return localContext.getString(R.string.april);
    case 4:
      return localContext.getString(R.string.may);
    case 5:
      return localContext.getString(R.string.june);
    case 6:
      return localContext.getString(R.string.july);
    case 7:
      return localContext.getString(R.string.august);
    case 8:
      return localContext.getString(R.string.september);
    case 9:
      return localContext.getString(R.string.october);
    case 10:
      return localContext.getString(R.string.november);
    case 11:
    }
    return localContext.getString(R.string.december);
  }

  private static String getWeekString(Calendar paramCalendar)
  {
    Context localContext = GlobalConfig.getAppContext();
    switch (paramCalendar.get(7))
    {
    default:
      return "";
    case 1:
      return localContext.getString(R.string.sunday);
    case 2:
      return localContext.getString(R.string.monday);
    case 3:
      return localContext.getString(R.string.tuesday);
    case 4:
      return localContext.getString(R.string.wednesday);
    case 5:
      return localContext.getString(R.string.thursday);
    case 6:
      return localContext.getString(R.string.friday);
    case 7:
    }
    return localContext.getString(R.string.saturday);
  }

  public static boolean isCurrentYear(long paramLong)
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTimeInMillis(paramLong);
    int i = localCalendar.get(1);
    localCalendar.setTimeInMillis(System.currentTimeMillis());
    return i == localCalendar.get(1);
  }

  private static boolean isMicrosecond(long paramLong)
  {
    return paramLong >= MIN_MICROSECOND_LONG;
  }

  private static boolean isMillisecond(long paramLong)
  {
    return (paramLong >= MIN_MILLISECOND_LONG) && (paramLong <= MIN_MICROSECOND_LONG);
  }

  private static boolean isSecond(long paramLong)
  {
    return (paramLong >= MIN_SECOND_LONG) && (paramLong <= MIN_MILLISECOND_LONG);
  }

  public static String timeStamp2Date(long paramLong, SimpleDateFormat paramSimpleDateFormat)
  {
    return paramSimpleDateFormat.format(new Date(paramLong));
  }

  public static String timeStamp2Date(String paramString)
  {
    return timeStamp2Date(paramString, new SimpleDateFormat("yyyy-MM-dd"));
  }

  public static String timeStamp2Date(String paramString, SimpleDateFormat paramSimpleDateFormat)
  {
    return timeStamp2Date(Long.valueOf(Long.parseLong(paramString)).longValue(), paramSimpleDateFormat);
  }

  public static void trimCalendar(Calendar paramCalendar)
  {
    paramCalendar.set(11, 0);
    paramCalendar.set(9, 0);
    paramCalendar.set(10, 0);
    paramCalendar.set(12, 0);
    paramCalendar.set(13, 0);
    paramCalendar.set(14, 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.DateUtil
 * JD-Core Version:    0.6.0
 */