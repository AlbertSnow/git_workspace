package com.google.android.gms.internal;

import android.support.v4.app.d;
import android.support.v7.app.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class y<T extends y>
{
  private final z a;
  private w b;
  private final List<f> c;

  protected y(z paramz, r paramr)
  {
    d.a(paramz);
    this.a = paramz;
    this.c = new ArrayList();
    w localw = new w(this, paramr);
    localw.j();
    this.b = localw;
  }

  protected void a(w paramw)
  {
  }

  public w f()
  {
    w localw = this.b.a();
    i();
    return localw;
  }

  public final w g()
  {
    return this.b;
  }

  public final List<af> h()
  {
    return this.b.c();
  }

  protected final void i()
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
      localIterator.next();
  }

  protected final z j()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.y
 * JD-Core Version:    0.6.0
 */