package com.wandoujia.p4.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class a
{
  static
  {
    new b("yyyy-MM-dd");
  }

  public static int a(long paramLong, int paramInt)
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTime(new Date(paramLong));
    return localCalendar.get(paramInt);
  }

  public static int a(long paramLong1, long paramLong2)
  {
    return (int)((paramLong1 - paramLong2) / 86400000L);
  }

  public static String a(Date paramDate, String paramString)
  {
    return new SimpleDateFormat(paramString, Locale.US).format(paramDate);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.a
 * JD-Core Version:    0.6.0
 */