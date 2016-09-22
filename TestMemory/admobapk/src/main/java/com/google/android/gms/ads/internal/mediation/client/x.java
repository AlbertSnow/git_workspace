package com.google.android.gms.ads.internal.mediation.client;

import android.os.Bundle;
import android.view.View;
import apj;
import apn;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@com.google.android.gms.ads.internal.report.client.a
public final class x extends r
{
  private final l a;

  public x(l paraml)
  {
    this.a = paraml;
  }

  public final String a()
  {
    return this.a.d;
  }

  public final void a(apj paramapj)
  {
    apn.a(paramapj);
  }

  public final List b()
  {
    List localList = this.a.e;
    if (localList != null)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        localArrayList.add(new c(localb.a(), localb.b(), localb.c()));
      }
      return localArrayList;
    }
    return null;
  }

  public final void b(apj paramapj)
  {
    this.a.a((View)apn.a(paramapj));
  }

  public final String c()
  {
    return this.a.f;
  }

  public final void c(apj paramapj)
  {
    apn.a(paramapj);
  }

  public final com.google.android.gms.ads.internal.formats.client.a d()
  {
    b localb = this.a.g;
    if (localb != null)
      return new c(localb.a(), localb.b(), localb.c());
    return null;
  }

  public final String e()
  {
    return this.a.h;
  }

  public final String f()
  {
    return this.a.i;
  }

  public final void g()
  {
  }

  public final boolean h()
  {
    return this.a.a;
  }

  public final boolean i()
  {
    return this.a.b;
  }

  public final Bundle j()
  {
    return this.a.c;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.client.x
 * JD-Core Version:    0.6.0
 */