package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.internal.LazilyParsedNumber;
import com.wandoujia.gson.l;
import com.wandoujia.gson.n;
import com.wandoujia.gson.o;
import com.wandoujia.gson.p;
import com.wandoujia.gson.q;
import com.wandoujia.gson.stream.a;
import com.wandoujia.gson.stream.c;
import com.wandoujia.gson.u;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class ap extends u<n>
{
  private void a(c paramc, n paramn)
  {
    if ((paramn == null) || ((paramn instanceof o)))
    {
      paramc.h();
      return;
    }
    if ((paramn instanceof q))
    {
      q localq = paramn.g();
      if (localq.i())
      {
        paramc.a(localq.a());
        return;
      }
      if (localq.h())
      {
        paramc.d(localq.f());
        return;
      }
      paramc.b(localq.b());
      return;
    }
    if ((paramn instanceof l))
    {
      paramc.d();
      if ((paramn instanceof l))
      {
        Iterator localIterator2 = ((l)paramn).iterator();
        while (localIterator2.hasNext())
          a(paramc, (n)localIterator2.next());
      }
      throw new IllegalStateException("This is not a JSON Array.");
      paramc.e();
      return;
    }
    if ((paramn instanceof p))
    {
      paramc.f();
      if ((paramn instanceof p))
      {
        Iterator localIterator1 = ((p)paramn).h().iterator();
        while (localIterator1.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator1.next();
          paramc.a((String)localEntry.getKey());
          a(paramc, (n)localEntry.getValue());
        }
      }
      throw new IllegalStateException("Not a JSON Object: " + paramn);
      paramc.g();
      return;
    }
    throw new IllegalArgumentException("Couldn't write " + paramn.getClass());
  }

  private n b(a parama)
  {
    switch (ax.a[parama.f().ordinal()])
    {
    default:
      throw new IllegalArgumentException();
    case 3:
      return new q(parama.h());
    case 1:
      return new q(new LazilyParsedNumber(parama.h()));
    case 2:
      return new q(Boolean.valueOf(parama.i()));
    case 4:
      parama.j();
      return o.a;
    case 5:
      l locall = new l();
      parama.a();
      while (parama.e())
        locall.a(b(parama));
      parama.b();
      return locall;
    case 6:
    }
    p localp = new p();
    parama.c();
    while (parama.e())
      localp.a(parama.g(), b(parama));
    parama.d();
    return localp;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.ap
 * JD-Core Version:    0.6.0
 */