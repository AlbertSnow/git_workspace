package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.internal.LinkedTreeMap;
import com.wandoujia.gson.stream.JsonToken;
import com.wandoujia.gson.stream.a;
import com.wandoujia.gson.u;
import com.wandoujia.gson.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class k extends u<Object>
{
  public static final v a = new l();
  private final com.wandoujia.gson.c b;

  private k(com.wandoujia.gson.c paramc)
  {
    this.b = paramc;
  }

  public final Object a(a parama)
  {
    JsonToken localJsonToken = parama.f();
    switch (m.a[localJsonToken.ordinal()])
    {
    default:
      throw new IllegalStateException();
    case 1:
      ArrayList localArrayList = new ArrayList();
      parama.a();
      while (parama.e())
        localArrayList.add(a(parama));
      parama.b();
      return localArrayList;
    case 2:
      LinkedTreeMap localLinkedTreeMap = new LinkedTreeMap();
      parama.c();
      while (parama.e())
        localLinkedTreeMap.put(parama.g(), a(parama));
      parama.d();
      return localLinkedTreeMap;
    case 3:
      return parama.h();
    case 4:
      return Double.valueOf(parama.k());
    case 5:
      return Boolean.valueOf(parama.i());
    case 6:
    }
    parama.j();
    return null;
  }

  public final void a(com.wandoujia.gson.stream.c paramc, Object paramObject)
  {
    if (paramObject == null)
    {
      paramc.h();
      return;
    }
    u localu = this.b.a(paramObject.getClass());
    if ((localu instanceof k))
    {
      paramc.f();
      paramc.g();
      return;
    }
    localu.a(paramc, paramObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.k
 * JD-Core Version:    0.6.0
 */