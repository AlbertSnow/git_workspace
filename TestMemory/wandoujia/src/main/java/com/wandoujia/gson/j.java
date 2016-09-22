package com.wandoujia.gson;

import com.wandoujia.gson.internal.a.w;
import com.wandoujia.gson.internal.n;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class j
{
  private n a = n.a;
  private LongSerializationPolicy b = LongSerializationPolicy.DEFAULT;
  private b c = FieldNamingPolicy.IDENTITY;
  private final Map<Type, k<?>> d = new HashMap();
  private final List<v> e = new ArrayList();
  private final List<v> f = new ArrayList();
  private int g = 2;
  private int h = 2;
  private boolean i = true;

  public final c a()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.e);
    Collections.reverse(localArrayList);
    localArrayList.addAll(this.f);
    int j = this.g;
    int k = this.h;
    if ((j != 2) && (k != 2))
    {
      a locala = new a(j, k);
      localArrayList.add(s.a(com.wandoujia.gson.b.a.get(java.util.Date.class), locala));
      localArrayList.add(s.a(com.wandoujia.gson.b.a.get(Timestamp.class), locala));
      localArrayList.add(s.a(com.wandoujia.gson.b.a.get(java.sql.Date.class), locala));
    }
    return new c(this.a, this.c, this.d, this.i, this.b, localArrayList);
  }

  public final j a(Type paramType, Object paramObject)
  {
    android.support.v4.app.b.a(true);
    if ((paramObject instanceof k))
      this.d.put(paramType, (k)paramObject);
    com.wandoujia.gson.b.a locala = com.wandoujia.gson.b.a.get(paramType);
    List localList = this.e;
    if (locala.getType() == locala.getRawType());
    for (boolean bool = true; ; bool = false)
    {
      localList.add(new t(paramObject, locala, bool, 0));
      if ((paramObject instanceof u))
        this.e.add(w.a(com.wandoujia.gson.b.a.get(paramType), (u)paramObject));
      return this;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.j
 * JD-Core Version:    0.6.0
 */