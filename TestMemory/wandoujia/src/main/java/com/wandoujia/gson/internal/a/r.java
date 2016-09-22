package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.stream.JsonToken;
import com.wandoujia.gson.stream.a;
import com.wandoujia.gson.stream.c;
import com.wandoujia.gson.u;
import com.wandoujia.gson.v;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class r extends u<java.sql.Date>
{
  public static final v a = new s();
  private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

  private void a(c paramc, java.sql.Date paramDate)
  {
    monitorenter;
    Object localObject2;
    if (paramDate == null)
      localObject2 = null;
    try
    {
      while (true)
      {
        paramc.b((String)localObject2);
        return;
        String str = this.b.format(paramDate);
        localObject2 = str;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }

  private java.sql.Date b(a parama)
  {
    monitorenter;
    try
    {
      java.sql.Date localDate;
      if (parama.f() == JsonToken.NULL)
      {
        parama.j();
        localDate = null;
      }
      while (true)
      {
        return localDate;
        try
        {
          localDate = new java.sql.Date(this.b.parse(parama.h()).getTime());
        }
        catch (ParseException localParseException)
        {
          throw new JsonSyntaxException(localParseException);
        }
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
 * Qualified Name:     com.wandoujia.gson.internal.a.r
 * JD-Core Version:    0.6.0
 */