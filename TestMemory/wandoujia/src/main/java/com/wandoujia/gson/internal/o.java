package com.wandoujia.gson.internal;

import com.wandoujia.gson.u;

final class o extends u<T>
{
  private u<T> a;

  o(n paramn, boolean paramBoolean1, boolean paramBoolean2, com.wandoujia.gson.c paramc, com.wandoujia.gson.b.a parama)
  {
  }

  private u<T> a()
  {
    u localu1 = this.a;
    if (localu1 != null)
      return localu1;
    u localu2 = this.d.a(this.f, this.e);
    this.a = localu2;
    return localu2;
  }

  public final T a(com.wandoujia.gson.stream.a parama)
  {
    if (this.b)
    {
      parama.n();
      return null;
    }
    return a().a(parama);
  }

  public final void a(com.wandoujia.gson.stream.c paramc, T paramT)
  {
    if (this.c)
    {
      paramc.h();
      return;
    }
    a().a(paramc, paramT);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.o
 * JD-Core Version:    0.6.0
 */