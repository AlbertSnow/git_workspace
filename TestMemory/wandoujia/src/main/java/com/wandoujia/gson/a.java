package com.wandoujia.gson;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

final class a
  implements m<Date>, r<Date>
{
  private final DateFormat a;
  private final DateFormat b;
  private final DateFormat c;

  a()
  {
    this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
  }

  public a(int paramInt1, int paramInt2)
  {
    this(DateFormat.getDateTimeInstance(paramInt1, paramInt2, Locale.US), DateFormat.getDateTimeInstance(paramInt1, paramInt2));
  }

  private a(DateFormat paramDateFormat1, DateFormat paramDateFormat2)
  {
    this.a = paramDateFormat1;
    this.b = paramDateFormat2;
    this.c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
    this.c.setTimeZone(TimeZone.getTimeZone("UTC"));
  }

  private n a(Date paramDate)
  {
    synchronized (this.b)
    {
      q localq = new q(this.a.format(paramDate));
      return localq;
    }
  }

  private Date a(n paramn)
  {
    synchronized (this.b)
    {
      try
      {
        Date localDate3 = this.b.parse(paramn.b());
        return localDate3;
      }
      catch (ParseException localParseException1)
      {
      }
    }
    try
    {
      Date localDate2 = this.a.parse(paramn.b());
      monitorexit;
      return localDate2;
      localObject = finally;
      monitorexit;
      throw localObject;
    }
    catch (ParseException localParseException2)
    {
      try
      {
        Date localDate1 = this.c.parse(paramn.b());
        monitorexit;
        return localDate1;
      }
      catch (ParseException localParseException3)
      {
      }
    }
    throw new JsonSyntaxException(paramn.b(), localParseException3);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a.class.getSimpleName());
    localStringBuilder.append('(').append(this.b.getClass().getSimpleName()).append(')');
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.a
 * JD-Core Version:    0.6.0
 */