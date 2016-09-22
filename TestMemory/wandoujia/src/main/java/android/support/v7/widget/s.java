package android.support.v7.widget;

import android.support.v4.view.bg;
import android.support.v4.view.cu;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class s extends ca
{
  private ArrayList<co> a = new ArrayList();
  private ArrayList<co> b = new ArrayList();
  private ArrayList<ac> c = new ArrayList();
  private ArrayList<ab> d = new ArrayList();
  private ArrayList<ArrayList<co>> e = new ArrayList();
  private ArrayList<ArrayList<ac>> f = new ArrayList();
  private ArrayList<ArrayList<ab>> g = new ArrayList();
  private ArrayList<co> h = new ArrayList();
  private ArrayList<co> i = new ArrayList();
  private ArrayList<co> j = new ArrayList();
  private ArrayList<co> k = new ArrayList();

  private void a(ab paramab)
  {
    if (paramab.a != null)
      a(paramab, paramab.a);
    if (paramab.b != null)
      a(paramab, paramab.b);
  }

  private static void a(List<co> paramList)
  {
    for (int m = -1 + paramList.size(); m >= 0; m--)
      bg.q(((co)paramList.get(m)).a).c();
  }

  private void a(List<ab> paramList, co paramco)
  {
    for (int m = -1 + paramList.size(); m >= 0; m--)
    {
      ab localab = (ab)paramList.get(m);
      if ((!a(localab, paramco)) || (localab.a != null) || (localab.b != null))
        continue;
      paramList.remove(localab);
    }
  }

  private boolean a(ab paramab, co paramco)
  {
    if (paramab.b == paramco)
      paramab.b = null;
    while (true)
    {
      bg.c(paramco.a, 1.0F);
      bg.a(paramco.a, 0.0F);
      bg.b(paramco.a, 0.0F);
      g(paramco);
      return true;
      if (paramab.a != paramco)
        break;
      paramab.a = null;
    }
    return false;
  }

  private void m()
  {
    if (!b())
      l();
  }

  public final void a()
  {
    int m;
    int n;
    label24: int i1;
    if (!this.a.isEmpty())
    {
      m = 1;
      if (this.c.isEmpty())
        break label72;
      n = 1;
      if (this.d.isEmpty())
        break label77;
      i1 = 1;
      label36: if (this.b.isEmpty())
        break label82;
    }
    label72: label77: label82: for (int i2 = 1; ; i2 = 0)
    {
      if ((m != 0) || (n != 0) || (i2 != 0) || (i1 != 0))
        break label88;
      return;
      m = 0;
      break;
      n = 0;
      break label24;
      i1 = 0;
      break label36;
    }
    label88: Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      co localco = (co)localIterator.next();
      cu localcu = bg.q(localco.a);
      this.j.add(localco);
      localcu.a(g()).a(0.0F).a(new w(this, localco, localcu)).d();
    }
    this.a.clear();
    t localt;
    label260: u localu;
    label340: ArrayList localArrayList3;
    v localv;
    long l1;
    label415: long l2;
    label425: long l3;
    if (n != 0)
    {
      ArrayList localArrayList1 = new ArrayList();
      localArrayList1.addAll(this.c);
      this.f.add(localArrayList1);
      this.c.clear();
      localt = new t(this, localArrayList1);
      if (m != 0)
        bg.a(((ac)localArrayList1.get(0)).a.a, localt, g());
    }
    else
    {
      if (i1 != 0)
      {
        ArrayList localArrayList2 = new ArrayList();
        localArrayList2.addAll(this.d);
        this.g.add(localArrayList2);
        this.d.clear();
        localu = new u(this, localArrayList2);
        if (m == 0)
          break label477;
        bg.a(((ab)localArrayList2.get(0)).a.a, localu, g());
      }
      if (i2 == 0)
        break label485;
      localArrayList3 = new ArrayList();
      localArrayList3.addAll(this.b);
      this.e.add(localArrayList3);
      this.b.clear();
      localv = new v(this, localArrayList3);
      if ((m == 0) && (n == 0) && (i1 == 0))
        break label505;
      if (m == 0)
        break label487;
      l1 = g();
      if (n == 0)
        break label493;
      l2 = d();
      if (i1 == 0)
        break label499;
      l3 = i();
    }
    while (true)
    {
      long l4 = l1 + Math.max(l2, l3);
      bg.a(((co)localArrayList3.get(0)).a, localv, l4);
      return;
      localt.run();
      break label260;
      label477: localu.run();
      break label340;
      label485: break;
      label487: l1 = 0L;
      break label415;
      label493: l2 = 0L;
      break label425;
      label499: l3 = 0L;
    }
    label505: localv.run();
  }

  public final boolean a(co paramco)
  {
    c(paramco);
    this.a.add(paramco);
    return true;
  }

  public final boolean a(co paramco, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = paramco.a;
    int m = (int)(paramInt1 + bg.m(paramco.a));
    int n = (int)(paramInt2 + bg.n(paramco.a));
    c(paramco);
    int i1 = paramInt3 - m;
    int i2 = paramInt4 - n;
    if ((i1 == 0) && (i2 == 0))
    {
      e(paramco);
      return false;
    }
    if (i1 != 0)
      bg.a(localView, -i1);
    if (i2 != 0)
      bg.b(localView, -i2);
    this.c.add(new ac(paramco, m, n, paramInt3, paramInt4, 0));
    return true;
  }

  public final boolean a(co paramco1, co paramco2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = bg.m(paramco1.a);
    float f2 = bg.n(paramco1.a);
    float f3 = bg.f(paramco1.a);
    c(paramco1);
    int m = (int)(paramInt3 - paramInt1 - f1);
    int n = (int)(paramInt4 - paramInt2 - f2);
    bg.a(paramco1.a, f1);
    bg.b(paramco1.a, f2);
    bg.c(paramco1.a, f3);
    if ((paramco2 != null) && (paramco2.a != null))
    {
      c(paramco2);
      bg.a(paramco2.a, -m);
      bg.b(paramco2.a, -n);
      bg.c(paramco2.a, 0.0F);
    }
    this.d.add(new ab(paramco1, paramco2, paramInt1, paramInt2, paramInt3, paramInt4, 0));
    return true;
  }

  public final boolean b()
  {
    return (!this.b.isEmpty()) || (!this.d.isEmpty()) || (!this.c.isEmpty()) || (!this.a.isEmpty()) || (!this.i.isEmpty()) || (!this.j.isEmpty()) || (!this.h.isEmpty()) || (!this.k.isEmpty()) || (!this.f.isEmpty()) || (!this.e.isEmpty()) || (!this.g.isEmpty());
  }

  public final boolean b(co paramco)
  {
    c(paramco);
    bg.c(paramco.a, 0.0F);
    this.b.add(paramco);
    return true;
  }

  public final void c()
  {
    for (int m = -1 + this.c.size(); m >= 0; m--)
    {
      ac localac2 = (ac)this.c.get(m);
      View localView2 = localac2.a.a;
      bg.b(localView2, 0.0F);
      bg.a(localView2, 0.0F);
      e(localac2.a);
      this.c.remove(m);
    }
    for (int n = -1 + this.a.size(); n >= 0; n--)
    {
      d((co)this.a.get(n));
      this.a.remove(n);
    }
    for (int i1 = -1 + this.b.size(); i1 >= 0; i1--)
    {
      co localco2 = (co)this.b.get(i1);
      bg.c(localco2.a, 1.0F);
      f(localco2);
      this.b.remove(i1);
    }
    for (int i2 = -1 + this.d.size(); i2 >= 0; i2--)
      a((ab)this.d.get(i2));
    this.d.clear();
    if (!b())
      return;
    for (int i3 = -1 + this.f.size(); i3 >= 0; i3--)
    {
      ArrayList localArrayList3 = (ArrayList)this.f.get(i3);
      for (int i8 = -1 + localArrayList3.size(); i8 >= 0; i8--)
      {
        ac localac1 = (ac)localArrayList3.get(i8);
        View localView1 = localac1.a.a;
        bg.b(localView1, 0.0F);
        bg.a(localView1, 0.0F);
        e(localac1.a);
        localArrayList3.remove(i8);
        if (!localArrayList3.isEmpty())
          continue;
        this.f.remove(localArrayList3);
      }
    }
    for (int i4 = -1 + this.e.size(); i4 >= 0; i4--)
    {
      ArrayList localArrayList2 = (ArrayList)this.e.get(i4);
      for (int i7 = -1 + localArrayList2.size(); i7 >= 0; i7--)
      {
        co localco1 = (co)localArrayList2.get(i7);
        bg.c(localco1.a, 1.0F);
        f(localco1);
        localArrayList2.remove(i7);
        if (!localArrayList2.isEmpty())
          continue;
        this.e.remove(localArrayList2);
      }
    }
    for (int i5 = -1 + this.g.size(); i5 >= 0; i5--)
    {
      ArrayList localArrayList1 = (ArrayList)this.g.get(i5);
      for (int i6 = -1 + localArrayList1.size(); i6 >= 0; i6--)
      {
        a((ab)localArrayList1.get(i6));
        if (!localArrayList1.isEmpty())
          continue;
        this.g.remove(localArrayList1);
      }
    }
    a(this.j);
    a(this.i);
    a(this.h);
    a(this.k);
    l();
  }

  public final void c(co paramco)
  {
    View localView = paramco.a;
    bg.q(localView).c();
    for (int m = -1 + this.c.size(); m >= 0; m--)
    {
      if (((ac)this.c.get(m)).a != paramco)
        continue;
      bg.b(localView, 0.0F);
      bg.a(localView, 0.0F);
      e(paramco);
      this.c.remove(m);
    }
    a(this.d, paramco);
    if (this.a.remove(paramco))
    {
      bg.c(localView, 1.0F);
      d(paramco);
    }
    if (this.b.remove(paramco))
    {
      bg.c(localView, 1.0F);
      f(paramco);
    }
    for (int n = -1 + this.g.size(); n >= 0; n--)
    {
      ArrayList localArrayList3 = (ArrayList)this.g.get(n);
      a(localArrayList3, paramco);
      if (!localArrayList3.isEmpty())
        continue;
      this.g.remove(n);
    }
    int i1 = -1 + this.f.size();
    if (i1 >= 0)
    {
      ArrayList localArrayList2 = (ArrayList)this.f.get(i1);
      for (int i3 = -1 + localArrayList2.size(); ; i3--)
      {
        if (i3 >= 0)
        {
          if (((ac)localArrayList2.get(i3)).a != paramco)
            continue;
          bg.b(localView, 0.0F);
          bg.a(localView, 0.0F);
          e(paramco);
          localArrayList2.remove(i3);
          if (localArrayList2.isEmpty())
            this.f.remove(i1);
        }
        i1--;
        break;
      }
    }
    for (int i2 = -1 + this.e.size(); i2 >= 0; i2--)
    {
      ArrayList localArrayList1 = (ArrayList)this.e.get(i2);
      if (!localArrayList1.remove(paramco))
        continue;
      bg.c(localView, 1.0F);
      f(paramco);
      if (!localArrayList1.isEmpty())
        continue;
      this.e.remove(i2);
    }
    this.j.remove(paramco);
    this.h.remove(paramco);
    this.k.remove(paramco);
    this.i.remove(paramco);
    m();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.s
 * JD-Core Version:    0.6.0
 */