package com.wandoujia.gson;

import com.wandoujia.gson.stream.a;
import com.wandoujia.gson.stream.c;

final class i<T> extends u<T>
{
  private u<T> a;

  public final T a(a parama)
  {
    if (this.a == null)
      throw new IllegalStateException();
    return this.a.a(parama);
  }

  public final void a(c paramc, T paramT)
  {
    if (this.a == null)
      throw new IllegalStateException();
    this.a.a(paramc, paramT);
  }

  public final void a(u<T> paramu)
  {
    if (this.a != null)
      throw new AssertionError();
    this.a = paramu;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.i
 * JD-Core Version:    0.6.0
 */