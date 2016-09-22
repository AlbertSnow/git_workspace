package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.stream.c;
import com.wandoujia.gson.u;
import com.wandoujia.gson.v;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class e extends u<Date>
{
  public static final v a = new f();
  private final DateFormat b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
  private final DateFormat c = DateFormat.getDateTimeInstance(2, 2);
  private final DateFormat d;

  public e()
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
    localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    this.d = localSimpleDateFormat;
  }

  private Date a(String paramString)
  {
    monitorenter;
    try
    {
      Date localDate3 = this.c.parse(paramString);
      localObject2 = localDate3;
      return localObject2;
    }
    catch (ParseException localParseException1)
    {
      try
      {
        Date localDate2 = this.b.parse(paramString);
        localObject2 = localDate2;
      }
      catch (ParseException localParseException2)
      {
        try
        {
          Date localDate1 = this.d.parse(paramString);
          Object localObject2 = localDate1;
        }
        catch (ParseException localParseException3)
        {
          throw new JsonSyntaxException(paramString, localParseException3);
        }
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }

  private void a(c paramc, Date paramDate)
  {
    monitorenter;
    if (paramDate == null);
    try
    {
      paramc.h();
      while (true)
      {
        return;
        paramc.b(this.b.format(paramDate));
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.e
 * JD-Core Version:    0.6.0
 */