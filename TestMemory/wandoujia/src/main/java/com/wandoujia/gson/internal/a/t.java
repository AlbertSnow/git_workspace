package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.stream.JsonToken;
import com.wandoujia.gson.stream.a;
import com.wandoujia.gson.stream.c;
import com.wandoujia.gson.v;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class t extends com.wandoujia.gson.u<Time>
{
  public static final v a = new u();
  private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

  private void a(c paramc, Time paramTime)
  {
    monitorenter;
    Object localObject2;
    if (paramTime == null)
      localObject2 = null;
    try
    {
      while (true)
      {
        paramc.b((String)localObject2);
        return;
        String str = this.b.format(paramTime);
        localObject2 = str;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }

  private Time b(a parama)
  {
    monitorenter;
    try
    {
      Time localTime;
      if (parama.f() == JsonToken.NULL)
      {
        parama.j();
        localTime = null;
      }
      while (true)
      {
        return localTime;
        try
        {
          localTime = new Time(this.b.parse(parama.h()).getTime());
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
 * Qualified Name:     com.wandoujia.gson.internal.a.t
 * JD-Core Version:    0.6.0
 */