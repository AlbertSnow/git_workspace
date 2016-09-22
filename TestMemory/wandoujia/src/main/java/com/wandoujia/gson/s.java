package com.wandoujia.gson;

import com.wandoujia.gson.internal.b;

final class s<T> extends u<T>
{
  private final r<T> a;
  private final m<T> b;
  private final c c;
  private final com.wandoujia.gson.b.a<T> d;
  private final v e;
  private u<T> f;

  private s(r<T> paramr, m<T> paramm, c paramc, com.wandoujia.gson.b.a<T> parama, v paramv)
  {
    this.a = paramr;
    this.b = paramm;
    this.c = paramc;
    this.d = parama;
    this.e = paramv;
  }

  private u<T> a()
  {
    u localu1 = this.f;
    if (localu1 != null)
      return localu1;
    u localu2 = this.c.a(this.e, this.d);
    this.f = localu2;
    return localu2;
  }

  public static v a(com.wandoujia.gson.b.a<?> parama, Object paramObject)
  {
    return new t(paramObject, parama, false, 0);
  }

  public final T a(com.wandoujia.gson.stream.a parama)
  {
    if (this.b == null)
      return a().a(parama);
    n localn = b.a(parama);
    if ((localn instanceof o))
      return null;
    return this.b.a(localn, this.d.getType());
  }

  public final void a(com.wandoujia.gson.stream.c paramc, T paramT)
  {
    if (this.a == null)
    {
      a().a(paramc, paramT);
      return;
    }
    if (paramT == null)
    {
      paramc.h();
      return;
    }
    r localr = this.a;
    this.d.getType();
    b.a(localr.a(paramT), paramc);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.s
 * JD-Core Version:    0.6.0
 */