package com.google.android.gms.tagmanager;

import android.support.v7.app.f;
import com.google.android.gms.internal.ap;
import com.google.android.gms.internal.aq;
import com.google.android.gms.internal.zzae;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class x
{
  private static final s<com.google.android.gms.internal.a> a = new s(ah.a(), true);
  private final f b;
  private final Map<String, n> c;
  private final Map<String, n> d;
  private final Map<String, n> e;
  private final f<ap, s<com.google.android.gms.internal.a>> f;
  private final f<String, ab> g;
  private final Set<aq> h;
  private final b i;
  private final Map<String, a> j;
  private volatile String k;
  private int l;

  private s<Boolean> a(ap paramap, Set<String> paramSet)
  {
    s locals = a(this.d, paramap, paramSet);
    Boolean localBoolean = ah.b((com.google.android.gms.internal.a)locals.a());
    ah.a(localBoolean);
    return new s(localBoolean, locals.b());
  }

  private s<Boolean> a(aq paramaq, Set<String> paramSet)
  {
    Iterator localIterator1 = paramaq.b().iterator();
    boolean bool1 = true;
    if (localIterator1.hasNext())
    {
      ap localap2 = (ap)localIterator1.next();
      new t();
      s locals2 = a(localap2, paramSet);
      if (((Boolean)locals2.a()).booleanValue())
      {
        ah.a(Boolean.valueOf(false));
        return new s(Boolean.valueOf(false), locals2.b());
      }
      if ((bool1) && (locals2.b()));
      for (boolean bool2 = true; ; bool2 = false)
      {
        bool1 = bool2;
        break;
      }
    }
    Iterator localIterator2 = paramaq.a().iterator();
    while (localIterator2.hasNext())
    {
      ap localap1 = (ap)localIterator2.next();
      new t();
      s locals1 = a(localap1, paramSet);
      if (!((Boolean)locals1.a()).booleanValue())
      {
        ah.a(Boolean.valueOf(false));
        return new s(Boolean.valueOf(false), locals1.b());
      }
      if ((bool1) && (locals1.b()))
      {
        bool1 = true;
        continue;
      }
      bool1 = false;
    }
    ah.a(Boolean.valueOf(true));
    return new s(Boolean.valueOf(true), bool1);
  }

  private s<com.google.android.gms.internal.a> a(String paramString, Set<String> paramSet)
  {
    this.l = (1 + this.l);
    ab localab = (ab)this.g.j();
    if ((localab != null) && (!this.b.i()))
    {
      a(localab.b(), paramSet);
      this.l = (-1 + this.l);
      return localab.a();
    }
    a locala = (a)this.j.get(paramString);
    if (locala == null)
    {
      new StringBuilder().append(a()).append("Invalid macro: ").append(paramString);
      q.a();
      this.l = (-1 + this.l);
      return a;
    }
    Set localSet = locala.c();
    Map localMap1 = locala.d();
    Map localMap2 = locala.e();
    Map localMap3 = locala.g();
    Map localMap4 = locala.f();
    new w();
    s locals1 = a(localSet, localMap1, localMap2, localMap3, localMap4, paramSet);
    if (((Set)locals1.a()).isEmpty());
    for (ap localap = null; localap == null; localap = (ap)((Set)locals1.a()).iterator().next())
    {
      this.l = (-1 + this.l);
      return a;
      if (((Set)locals1.a()).size() <= 1)
        continue;
      new StringBuilder().append(a()).append("Multiple macros active for macroName ").append(paramString);
      q.c();
    }
    Map localMap5 = this.e;
    new t();
    s locals2 = a(localMap5, localap, paramSet);
    boolean bool;
    if ((locals1.b()) && (locals2.b()))
    {
      bool = true;
      if (locals2 != a)
        break label402;
    }
    label402: for (s locals3 = a; ; locals3 = new s(locals2.a(), bool))
    {
      com.google.android.gms.internal.a locala1 = localap.b();
      if (locals3.b())
        new ab(locals3, locala1);
      a(locala1, paramSet);
      this.l = (-1 + this.l);
      return locals3;
      bool = false;
      break;
    }
  }

  private s<com.google.android.gms.internal.a> a(Map<String, n> paramMap, ap paramap, Set<String> paramSet)
  {
    boolean bool1 = true;
    com.google.android.gms.internal.a locala1 = (com.google.android.gms.internal.a)paramap.a().get(zzae.zzfg.toString());
    s locals1;
    if (locala1 == null)
    {
      q.a();
      locals1 = a;
    }
    String str;
    n localn;
    do
    {
      return locals1;
      str = locala1.g;
      localn = (n)paramMap.get(str);
      if (localn == null)
      {
        new StringBuilder().append(str).append(" has no backing implementation.");
        q.a();
        return a;
      }
      locals1 = (s)this.f.j();
    }
    while ((locals1 != null) && (!this.b.i()));
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramap.a().entrySet().iterator();
    boolean bool2 = bool1;
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localEntry.getKey();
      new u();
      com.google.android.gms.internal.a locala2 = (com.google.android.gms.internal.a)localEntry.getValue();
      localEntry.getValue();
      new ai();
      s locals2 = b(locala2, paramSet);
      if (locals2 == a)
        return a;
      if (locals2.b())
        paramap.a((String)localEntry.getKey(), (com.google.android.gms.internal.a)locals2.a());
      for (boolean bool3 = bool2; ; bool3 = false)
      {
        localHashMap.put(localEntry.getKey(), locals2.a());
        bool2 = bool3;
        break;
      }
    }
    if (!localn.a(localHashMap.keySet()))
    {
      new StringBuilder("Incorrect keys for function ").append(str).append(" required ").append(localn.a()).append(" had ").append(localHashMap.keySet());
      q.a();
      return a;
    }
    if (bool2);
    while (true)
    {
      return new s(localn.a(localHashMap), bool1);
      bool1 = false;
    }
  }

  private s<Set<ap>> a(Set<aq> paramSet, Map<aq, List<ap>> paramMap1, Map<aq, List<String>> paramMap2, Map<aq, List<ap>> paramMap3, Map<aq, List<String>> paramMap4, Set<String> paramSet1)
  {
    return a(paramSet, paramSet1, new y(paramMap1, paramMap2, paramMap3, paramMap4));
  }

  private s<Set<ap>> a(Set<aq> paramSet, Set<String> paramSet1, aa paramaa)
  {
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    Iterator localIterator = paramSet.iterator();
    boolean bool1 = true;
    if (localIterator.hasNext())
    {
      aq localaq = (aq)localIterator.next();
      new v();
      s locals = a(localaq, paramSet1);
      if (((Boolean)locals.a()).booleanValue())
        paramaa.a(localaq, localHashSet1, localHashSet2);
      if ((bool1) && (locals.b()));
      for (boolean bool2 = true; ; bool2 = false)
      {
        bool1 = bool2;
        break;
      }
    }
    localHashSet1.removeAll(localHashSet2);
    return new s(localHashSet1, bool1);
  }

  private String a()
  {
    if (this.l <= 1)
      return "";
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Integer.toString(this.l));
    for (int m = 2; m < this.l; m++)
      localStringBuilder.append(' ');
    localStringBuilder.append(": ");
    return localStringBuilder.toString();
  }

  private void a(com.google.android.gms.internal.a parama, Set<String> paramSet)
  {
    if (parama == null);
    while (true)
    {
      return;
      new ai();
      s locals = b(parama, paramSet);
      if (locals == a)
        continue;
      Object localObject1 = ah.c((com.google.android.gms.internal.a)locals.a());
      if ((localObject1 instanceof Map))
      {
        Map localMap2 = (Map)localObject1;
        this.i.a(localMap2);
        return;
      }
      if (!(localObject1 instanceof List))
        break;
      Iterator localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = localIterator.next();
        if ((localObject2 instanceof Map))
        {
          Map localMap1 = (Map)localObject2;
          this.i.a(localMap1);
          continue;
        }
        q.c();
      }
    }
    q.c();
  }

  private s<com.google.android.gms.internal.a> b(com.google.android.gms.internal.a parama, Set<String> paramSet)
  {
    if (!parama.l)
      return new s(parama, true);
    switch (parama.a)
    {
    case 5:
    case 6:
    default:
      new StringBuilder("Unknown type: ").append(parama.a);
      q.a();
      return a;
    case 2:
      com.google.android.gms.internal.a locala6 = com.google.android.gms.internal.s.a(parama);
      locala6.c = new com.google.android.gms.internal.a[parama.c.length];
      for (int i1 = 0; i1 < parama.c.length; i1++)
      {
        com.google.android.gms.internal.a locala7 = parama.c[i1];
        new ai();
        s locals5 = b(locala7, paramSet);
        if (locals5 == a)
          return a;
        locala6.c[i1] = ((com.google.android.gms.internal.a)locals5.a());
      }
      return new s(locala6, false);
    case 3:
      com.google.android.gms.internal.a locala3 = com.google.android.gms.internal.s.a(parama);
      if (parama.d.length != parama.e.length)
      {
        new StringBuilder("Invalid serving value: ").append(parama.toString());
        q.a();
        return a;
      }
      locala3.d = new com.google.android.gms.internal.a[parama.d.length];
      locala3.e = new com.google.android.gms.internal.a[parama.d.length];
      for (int n = 0; n < parama.d.length; n++)
      {
        com.google.android.gms.internal.a locala4 = parama.d[n];
        new ai();
        s locals3 = b(locala4, paramSet);
        com.google.android.gms.internal.a locala5 = parama.e[n];
        new ai();
        s locals4 = b(locala5, paramSet);
        if ((locals3 == a) || (locals4 == a))
          return a;
        locala3.d[n] = ((com.google.android.gms.internal.a)locals3.a());
        locala3.e[n] = ((com.google.android.gms.internal.a)locals4.a());
      }
      return new s(locala3, false);
    case 4:
      if (paramSet.contains(parama.f))
      {
        new StringBuilder("Macro cycle detected.  Current macro reference: ").append(parama.f).append(".  Previous macro references: ").append(paramSet.toString()).append(".");
        q.a();
        return a;
      }
      paramSet.add(parama.f);
      String str = parama.f;
      new r();
      s locals2 = a.a(a(str, paramSet), parama.k);
      paramSet.remove(parama.f);
      return locals2;
    case 7:
    }
    com.google.android.gms.internal.a locala1 = com.google.android.gms.internal.s.a(parama);
    locala1.j = new com.google.android.gms.internal.a[parama.j.length];
    for (int m = 0; m < parama.j.length; m++)
    {
      com.google.android.gms.internal.a locala2 = parama.j[m];
      new ai();
      s locals1 = b(locala2, paramSet);
      if (locals1 == a)
        return a;
      locala1.j[m] = ((com.google.android.gms.internal.a)locals1.a());
    }
    return new s(locala1, false);
  }

  private void b(String paramString)
  {
    monitorenter;
    try
    {
      this.k = paramString;
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void a(String paramString)
  {
    monitorenter;
    try
    {
      b(paramString);
      Iterator localIterator = ((Set)a(this.h, new HashSet(), new z()).a()).iterator();
      while (localIterator.hasNext())
      {
        ap localap = (ap)localIterator.next();
        a(this.c, localap, new HashSet());
      }
    }
    finally
    {
      monitorexit;
    }
    b(null);
    monitorexit;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.x
 * JD-Core Version:    0.6.0
 */