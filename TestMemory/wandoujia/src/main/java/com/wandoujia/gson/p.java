package com.wandoujia.gson;

import com.wandoujia.gson.internal.LinkedTreeMap;
import java.util.Map.Entry;
import java.util.Set;

public final class p extends n
{
  private final LinkedTreeMap<String, n> a = new LinkedTreeMap();

  public final void a(String paramString, n paramn)
  {
    if (paramn == null)
      paramn = o.a;
    this.a.put(paramString, paramn);
  }

  public final boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof p)) && (((p)paramObject).a.equals(this.a)));
  }

  public final Set<Map.Entry<String, n>> h()
  {
    return this.a.entrySet();
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.p
 * JD-Core Version:    0.6.0
 */