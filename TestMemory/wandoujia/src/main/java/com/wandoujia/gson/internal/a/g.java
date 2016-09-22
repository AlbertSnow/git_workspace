package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.l;
import com.wandoujia.gson.n;
import com.wandoujia.gson.o;
import com.wandoujia.gson.p;
import com.wandoujia.gson.q;
import com.wandoujia.gson.stream.JsonToken;
import com.wandoujia.gson.stream.a;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class g extends a
{
  private static final Reader a = new h();
  private static final Object b = new Object();
  private final List<Object> c = new ArrayList();

  public g(n paramn)
  {
    super(a);
    this.c.add(paramn);
  }

  private void a(JsonToken paramJsonToken)
  {
    if (f() != paramJsonToken)
      throw new IllegalStateException("Expected " + paramJsonToken + " but was " + f());
  }

  private Object q()
  {
    return this.c.get(-1 + this.c.size());
  }

  private Object r()
  {
    return this.c.remove(-1 + this.c.size());
  }

  public final void a()
  {
    a(JsonToken.BEGIN_ARRAY);
    l locall = (l)q();
    this.c.add(locall.iterator());
  }

  public final void b()
  {
    a(JsonToken.END_ARRAY);
    r();
    r();
  }

  public final void c()
  {
    a(JsonToken.BEGIN_OBJECT);
    p localp = (p)q();
    this.c.add(localp.h().iterator());
  }

  public final void close()
  {
    this.c.clear();
    this.c.add(b);
  }

  public final void d()
  {
    a(JsonToken.END_OBJECT);
    r();
    r();
  }

  public final boolean e()
  {
    JsonToken localJsonToken = f();
    return (localJsonToken != JsonToken.END_OBJECT) && (localJsonToken != JsonToken.END_ARRAY);
  }

  public final JsonToken f()
  {
    Object localObject;
    while (true)
    {
      if (this.c.isEmpty())
        return JsonToken.END_DOCUMENT;
      localObject = q();
      if (!(localObject instanceof Iterator))
        break;
      boolean bool = this.c.get(-2 + this.c.size()) instanceof p;
      Iterator localIterator = (Iterator)localObject;
      if (localIterator.hasNext())
      {
        if (bool)
          return JsonToken.NAME;
        this.c.add(localIterator.next());
        continue;
      }
      if (bool)
        return JsonToken.END_OBJECT;
      return JsonToken.END_ARRAY;
    }
    if ((localObject instanceof p))
      return JsonToken.BEGIN_OBJECT;
    if ((localObject instanceof l))
      return JsonToken.BEGIN_ARRAY;
    if ((localObject instanceof q))
    {
      q localq = (q)localObject;
      if (localq.j())
        return JsonToken.STRING;
      if (localq.h())
        return JsonToken.BOOLEAN;
      if (localq.i())
        return JsonToken.NUMBER;
      throw new AssertionError();
    }
    if ((localObject instanceof o))
      return JsonToken.NULL;
    if (localObject == b)
      throw new IllegalStateException("JsonReader is closed");
    throw new AssertionError();
  }

  public final String g()
  {
    a(JsonToken.NAME);
    Map.Entry localEntry = (Map.Entry)((Iterator)q()).next();
    this.c.add(localEntry.getValue());
    return (String)localEntry.getKey();
  }

  public final String h()
  {
    JsonToken localJsonToken = f();
    if ((localJsonToken != JsonToken.STRING) && (localJsonToken != JsonToken.NUMBER))
      throw new IllegalStateException("Expected " + JsonToken.STRING + " but was " + localJsonToken);
    return ((q)r()).b();
  }

  public final boolean i()
  {
    a(JsonToken.BOOLEAN);
    return ((q)r()).f();
  }

  public final void j()
  {
    a(JsonToken.NULL);
    r();
  }

  public final double k()
  {
    JsonToken localJsonToken = f();
    if ((localJsonToken != JsonToken.NUMBER) && (localJsonToken != JsonToken.STRING))
      throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + localJsonToken);
    double d = ((q)q()).c();
    if ((!p()) && ((Double.isNaN(d)) || (Double.isInfinite(d))))
      throw new NumberFormatException("JSON forbids NaN and infinities: " + d);
    r();
    return d;
  }

  public final long l()
  {
    JsonToken localJsonToken = f();
    if ((localJsonToken != JsonToken.NUMBER) && (localJsonToken != JsonToken.STRING))
      throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + localJsonToken);
    long l = ((q)q()).d();
    r();
    return l;
  }

  public final int m()
  {
    JsonToken localJsonToken = f();
    if ((localJsonToken != JsonToken.NUMBER) && (localJsonToken != JsonToken.STRING))
      throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + localJsonToken);
    int i = ((q)q()).e();
    r();
    return i;
  }

  public final void n()
  {
    if (f() == JsonToken.NAME)
    {
      g();
      return;
    }
    r();
  }

  public final void o()
  {
    a(JsonToken.NAME);
    Map.Entry localEntry = (Map.Entry)((Iterator)q()).next();
    this.c.add(localEntry.getValue());
    this.c.add(new q((String)localEntry.getKey()));
  }

  public final String toString()
  {
    return getClass().getSimpleName();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.g
 * JD-Core Version:    0.6.0
 */