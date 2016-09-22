package com.squareup.wire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

final class f<T extends ExtendableMessage<?>>
{
  private final Map<Extension<T, ?>, Object> a = new TreeMap();

  public f()
  {
  }

  public f(f<T> paramf)
  {
    this.a.putAll(paramf.a);
  }

  public final <E> E a(Extension<T, E> paramExtension)
  {
    return this.a.get(paramExtension);
  }

  public final List<Extension<T, ?>> a()
  {
    return Collections.unmodifiableList(new ArrayList(this.a.keySet()));
  }

  public final <E> void a(Extension<T, E> paramExtension, E paramE)
  {
    this.a.put(paramExtension, paramE);
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof f)) && (this.a.equals(((f)paramObject).a));
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{");
    Iterator localIterator = this.a.entrySet().iterator();
    for (String str = ""; localIterator.hasNext(); str = ", ")
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuilder.append(str);
      localStringBuilder.append(((Extension)localEntry.getKey()).getTag());
      localStringBuilder.append("=");
      localStringBuilder.append(localEntry.getValue());
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.f
 * JD-Core Version:    0.6.0
 */