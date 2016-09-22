package com.wandoujia.nirvana.framework.network;

import com.android.volley.j;
import com.android.volley.k;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;
import java.util.Map;

public class f<T extends Message> extends b<T>
{
  private static final Wire b = new Wire(new Class[0]);
  private final Class<T> a;

  public f(int paramInt, String paramString, Map<String, String> paramMap, a parama, Class<T> paramClass, k<T> paramk, j paramj)
  {
    super(paramInt, paramString, paramMap, parama, paramk, paramj);
    this.a = paramClass;
    a("Accept-Encoding", "gzip");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.f
 * JD-Core Version:    0.6.0
 */