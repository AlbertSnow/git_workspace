package com.wandoujia.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class l extends n
  implements Iterable<n>
{
  private final List<n> a = new ArrayList();

  public final Number a()
  {
    if (this.a.size() == 1)
      return ((n)this.a.get(0)).a();
    throw new IllegalStateException();
  }

  public final void a(n paramn)
  {
    if (paramn == null)
      paramn = o.a;
    this.a.add(paramn);
  }

  public final String b()
  {
    if (this.a.size() == 1)
      return ((n)this.a.get(0)).b();
    throw new IllegalStateException();
  }

  public final double c()
  {
    if (this.a.size() == 1)
      return ((n)this.a.get(0)).c();
    throw new IllegalStateException();
  }

  public final long d()
  {
    if (this.a.size() == 1)
      return ((n)this.a.get(0)).d();
    throw new IllegalStateException();
  }

  public final int e()
  {
    if (this.a.size() == 1)
      return ((n)this.a.get(0)).e();
    throw new IllegalStateException();
  }

  public final boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof l)) && (((l)paramObject).a.equals(this.a)));
  }

  public final boolean f()
  {
    if (this.a.size() == 1)
      return ((n)this.a.get(0)).f();
    throw new IllegalStateException();
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }

  public final Iterator<n> iterator()
  {
    return this.a.iterator();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.l
 * JD-Core Version:    0.6.0
 */