package com.wandoujia.nirvana.framework.network;

import com.android.volley.j;
import com.android.volley.k;
import com.wandoujia.gson.c;
import java.lang.reflect.Type;
import java.util.Map;

public final class e<T> extends b<T>
{
  private static final c a = new c();
  private final Type b;

  public e(String paramString, Map<String, String> paramMap, a parama, com.wandoujia.gson.b.a<T> parama1, k<T> paramk, j paramj)
  {
    super(0, paramString, paramMap, parama, paramk, paramj);
    this.b = parama1.getType();
  }

  protected final T b(com.wandoujia.nirvana.framework.network.a.a parama)
  {
    String str = new String(parama.a, android.support.v4.app.b.a(parama.b));
    return a.a(str, this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.e
 * JD-Core Version:    0.6.0
 */