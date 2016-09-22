package com.squareup.wire;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class k
{
  private final Map<Integer, List<Object>> a = new LinkedHashMap();

  final List<Object> a(int paramInt)
  {
    return (List)this.a.get(Integer.valueOf(paramInt));
  }

  final Set<Integer> a()
  {
    return this.a.keySet();
  }

  final void a(int paramInt, Object paramObject)
  {
    Object localObject = (List)this.a.get(Integer.valueOf(paramInt));
    if (localObject == null)
    {
      localObject = new ArrayList();
      this.a.put(Integer.valueOf(paramInt), localObject);
    }
    ((List)localObject).add(paramObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.k
 * JD-Core Version:    0.6.0
 */