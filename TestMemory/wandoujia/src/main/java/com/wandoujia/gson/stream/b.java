package com.wandoujia.gson.stream;

import com.wandoujia.gson.internal.a.g;
import com.wandoujia.gson.internal.p;

final class b extends p
{
  public final void a(a parama)
  {
    if ((parama instanceof g))
    {
      ((g)parama).o();
      return;
    }
    int i = a.a(parama);
    if (i == 0)
      i = a.b(parama);
    if (i == 13)
    {
      a.a(parama, 9);
      return;
    }
    if (i == 12)
    {
      a.a(parama, 8);
      return;
    }
    if (i == 14)
    {
      a.a(parama, 10);
      return;
    }
    throw new IllegalStateException("Expected a name but was " + parama.f() + "  at line " + a.c(parama) + " column " + a.d(parama));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.stream.b
 * JD-Core Version:    0.6.0
 */