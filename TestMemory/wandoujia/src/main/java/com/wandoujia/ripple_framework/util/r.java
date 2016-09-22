package com.wandoujia.ripple_framework.util;

import android.content.Context;
import com.wandoujia.ripple_framework.R.string;
import com.wandoujia.ripple_framework.i;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public final class r
{
  private static TimeZone a = TimeZone.getTimeZone("GMT+8:00");

  private static long a(long paramLong)
  {
    return (paramLong + a.getOffset(paramLong)) / 86400000L;
  }

  public static String a(Long paramLong)
  {
    Context localContext = i.k().g();
    long l1 = System.currentTimeMillis();
    long l2 = l1 - paramLong.longValue();
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTime(new Date(paramLong.longValue()));
    long l3 = paramLong.longValue();
    int i;
    if (a(l1) == a(l3))
      i = 1;
    while (i != 0)
    {
      if (l2 < 600000L)
      {
        return localContext.getString(R.string.just_now);
        i = 0;
        continue;
      }
      if (l2 < 3600000L)
      {
        String str4 = localContext.getString(R.string.minutes_ago);
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Long.valueOf(l2 / 60000L);
        return String.format(str4, arrayOfObject4);
      }
      if (l2 >= 86400000L)
        break label316;
      String str3 = localContext.getString(R.string.hours_ago);
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Long.valueOf(l2 / 3600000L);
      return String.format(str3, arrayOfObject3);
    }
    if (a(l1) - a(paramLong.longValue()) == 1L)
      return localContext.getString(R.string.last_day);
    if (l2 < 31536000000L)
    {
      String str2 = localContext.getString(R.string.month_day);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(1 + localCalendar.get(2));
      arrayOfObject2[1] = Integer.valueOf(localCalendar.get(5));
      return String.format(str2, arrayOfObject2);
    }
    String str1 = localContext.getString(R.string.year_month);
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(localCalendar.get(1));
    arrayOfObject1[1] = Integer.valueOf(1 + localCalendar.get(2));
    return String.format(str1, arrayOfObject1);
    label316: return "";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.util.r
 * JD-Core Version:    0.6.0
 */