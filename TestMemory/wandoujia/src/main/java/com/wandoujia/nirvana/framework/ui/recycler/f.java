package com.wandoujia.nirvana.framework.ui.recycler;

import android.view.ViewGroup;
import com.wandoujia.nirvana.framework.ui.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class f extends i<g>
  implements h
{
  private Map<Integer, g> c = new HashMap();
  private List<g> d = new ArrayList();

  public final int a(int paramInt)
  {
    List localList = f();
    if ((localList != null) && (localList.get(paramInt) != null))
      return g.a((g)localList.get(paramInt));
    return 0;
  }

  public final void a(g paramg)
  {
    g.a(paramg, this.d.size());
    this.c.put(Integer.valueOf(g.a(paramg)), paramg);
    g.a(paramg, this);
    this.d.add(paramg);
    if (g.b(paramg))
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(paramg);
      a(a(), localArrayList);
    }
  }

  public final void a(j paramj, int paramInt)
  {
    this.a.add(paramj);
    paramj.i.a(g.c((g)f().get(paramInt)));
  }

  public final boolean a(List<g> paramList)
  {
    this.d.clear();
    this.d.addAll(paramList);
    this.c.clear();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      g localg2 = (g)localIterator.next();
      this.c.put(Integer.valueOf(g.a(localg2)), localg2);
    }
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.d.size(); i++)
    {
      g localg1 = (g)this.d.get(i);
      g.a(localg1, i);
      g.a(localg1, this);
      if (!g.b(localg1))
        continue;
      localArrayList.add(localg1);
    }
    return super.a(localArrayList);
  }

  protected final a b(ViewGroup paramViewGroup, int paramInt)
  {
    return ((g)this.c.get(Integer.valueOf(paramInt))).a(paramViewGroup);
  }

  public final void b(g paramg)
  {
    for (int i = 0; i < a(); i++)
    {
      if (g.a((g)this.b.get(i)) != g.a(paramg))
        continue;
      c(i);
    }
  }

  public final void c(g paramg)
  {
    if (g.b(paramg))
    {
      int i = 0;
      int j = 0;
      while ((i < this.d.size()) && (g.a((g)this.d.get(i)) != g.a(paramg)))
      {
        if (g.b((g)this.d.get(i)))
          j++;
        i++;
      }
      a(j, paramg);
    }
    while (true)
    {
      Iterator localIterator = g.d(paramg).iterator();
      while (localIterator.hasNext())
        localIterator.next();
      a(paramg);
    }
  }

  public final void g(int paramInt)
  {
    this.b.get(paramInt);
  }

  public final void h(int paramInt)
  {
    this.b.get(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.ui.recycler.f
 * JD-Core Version:    0.6.0
 */