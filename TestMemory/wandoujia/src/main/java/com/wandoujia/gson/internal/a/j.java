package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.c;
import com.wandoujia.gson.internal.x;
import com.wandoujia.gson.u;
import java.lang.reflect.Type;
import java.util.Map;

final class j<K, V> extends u<Map<K, V>>
{
  private final u<K> a;
  private final u<V> b;
  private final x<? extends Map<K, V>> c;

  public j(c paramc, Type paramType1, u<K> paramu, Type paramType2, u<V> paramu1, x<? extends Map<K, V>> paramx)
  {
    this.a = new v(paramType1, paramType2, paramu);
    this.b = new v(paramType1, paramx, paramu1);
    Object localObject;
    this.c = localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.j
 * JD-Core Version:    0.6.0
 */