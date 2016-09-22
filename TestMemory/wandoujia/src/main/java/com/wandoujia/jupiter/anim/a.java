package com.wandoujia.jupiter.anim;

import android.support.v4.view.bg;
import android.support.v4.view.cu;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ca;
import android.support.v7.widget.ch;
import android.support.v7.widget.co;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.base.utils.SystemUtil;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends ca
{
  private ArrayList<co> a = new ArrayList();
  private ArrayList<co> b = new ArrayList();
  private ArrayList<k> c = new ArrayList();
  private ArrayList<j> d = new ArrayList();
  private ArrayList<ArrayList<co>> e = new ArrayList();
  private ArrayList<ArrayList<k>> f = new ArrayList();
  private ArrayList<ArrayList<j>> g = new ArrayList();
  private ArrayList<co> h = new ArrayList();
  private ArrayList<co> i = new ArrayList();
  private ArrayList<co> j = new ArrayList();
  private ArrayList<co> k = new ArrayList();
  private ArrayList<Animator> l = new ArrayList();
  private RecyclerView m;

  public a(RecyclerView paramRecyclerView)
  {
    j();
    e();
    h();
    this.m = paramRecyclerView;
  }

  private void a(j paramj)
  {
    if (paramj.a != null)
      a(paramj, paramj.a);
    if (paramj.b != null)
      a(paramj, paramj.b);
  }

  private static void a(List<co> paramList)
  {
    for (int n = -1 + paramList.size(); n >= 0; n--)
      bg.q(((co)paramList.get(n)).a).c();
  }

  private void a(List<j> paramList, co paramco)
  {
    for (int n = -1 + paramList.size(); n >= 0; n--)
    {
      j localj = (j)paramList.get(n);
      if ((!a(localj, paramco)) || (localj.a != null) || (localj.b != null))
        continue;
      paramList.remove(localj);
    }
  }

  private boolean a(j paramj, co paramco)
  {
    if (paramj.b == paramco)
      paramj.b = null;
    while (true)
    {
      ViewHelper.setAlpha(paramco.a, 1.0F);
      ViewHelper.setRotationY(paramco.a, 0.0F);
      ViewHelper.setScaleX(paramco.a, 1.0F);
      ViewHelper.setScaleY(paramco.a, 1.0F);
      bg.c(paramco.a, 1.0F);
      bg.a(paramco.a, 0.0F);
      bg.b(paramco.a, 0.0F);
      g(paramco);
      return true;
      if (paramj.a != paramco)
        break;
      paramj.a = null;
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
    int n;
    int i1;
    label24: int i2;
    label36: int i3;
    if (!this.a.isEmpty())
    {
      n = 1;
      if (this.c.isEmpty())
        break label72;
      i1 = 1;
      if (this.d.isEmpty())
        break label77;
      i2 = 1;
      if (this.b.isEmpty())
        break label82;
      i3 = 1;
      label49: if ((n != 0) || (i1 != 0) || (i3 != 0) || (i2 != 0))
        break label88;
    }
    label72: label77: label82: label88: label503: label767: 
    do
    {
      return;
      n = 0;
      break;
      i1 = 0;
      break label24;
      i2 = 0;
      break label36;
      i3 = 0;
      break label49;
      Iterator localIterator1 = this.a.iterator();
      while (localIterator1.hasNext())
      {
        co localco4 = (co)localIterator1.next();
        cu localcu4 = bg.q(localco4.a);
        localcu4.a(g()).a(0.0F).a().a(new DecelerateInterpolator()).a(new c(this, localco4, localcu4)).d();
        this.j.add(localco4);
      }
      this.a.clear();
      if (i1 != 0)
      {
        ArrayList localArrayList1 = new ArrayList();
        localArrayList1.addAll(this.c);
        this.f.add(localArrayList1);
        this.c.clear();
        Iterator localIterator2 = localArrayList1.iterator();
        while (localIterator2.hasNext())
        {
          k localk = (k)localIterator2.next();
          co localco3 = localk.a;
          int i5 = localk.b;
          int i6 = localk.c;
          int i7 = localk.d;
          int i8 = localk.e;
          View localView3 = localco3.a;
          int i9 = i7 - i5;
          int i10 = i8 - i6;
          if (i9 != 0)
            bg.q(localView3).b(0.0F);
          if (i10 != 0)
            bg.q(localView3).c(0.0F);
          this.i.add(localco3);
          cu localcu3 = bg.q(localView3);
          localcu3.a(d()).a(new e(this, localco3, i9, i10, localcu3)).d();
        }
        localArrayList1.clear();
        this.f.remove(localArrayList1);
      }
      if (i2 == 0)
        continue;
      ArrayList localArrayList2 = new ArrayList();
      localArrayList2.addAll(this.d);
      this.g.add(localArrayList2);
      this.d.clear();
      Iterator localIterator3 = localArrayList2.iterator();
      while (localIterator3.hasNext())
      {
        j localj = (j)localIterator3.next();
        if (localj == null)
          continue;
        co localco1 = localj.a;
        View localView1;
        View localView2;
        int i4;
        if (localco1 == null)
        {
          localView1 = null;
          co localco2 = localj.b;
          if (localco2 == null)
            break label767;
          localView2 = localco2.a;
          long l5 = i();
          ChangeAnimType localChangeAnimType = (ChangeAnimType)localView1.getTag(2131492884);
          if ((localChangeAnimType != ChangeAnimType.FLIP_LEFT) && (localChangeAnimType != ChangeAnimType.FLIP_RIGHT))
            break label779;
          if (localChangeAnimType != ChangeAnimType.FLIP_LEFT)
            break label773;
          i4 = 1;
          if ((localView1 != null) && (localView2 != null))
          {
            if (SystemUtil.aboveApiLevel(11))
            {
              localView1.setLayerType(2, null);
              localView2.setLayerType(2, null);
            }
            ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 1.0F });
            this.l.add(localValueAnimator);
            localValueAnimator.setDuration(l5);
            localValueAnimator.addUpdateListener(new h(localView1, i4, localView2.getHeight() / localView1.getHeight(), localj, localView2));
            localValueAnimator.start();
            localValueAnimator.addListener(new i(this, localj, localView1, localView2, localValueAnimator));
          }
        }
        while (true)
        {
          try
          {
            Field localField1 = RecyclerView.class.getDeclaredField("a");
            localField1.setAccessible(true);
            ch localch = (ch)localField1.get(this.m);
            Field localField2 = ch.class.getDeclaredField("b");
            localField2.setAccessible(true);
            ((ArrayList)localField2.get(localch)).clear();
          }
          catch (Exception localException)
          {
          }
          break;
          localView1 = localco1.a;
          break label503;
          localView2 = null;
          break label522;
          i4 = -1;
          break label567;
          if (localView1 != null)
          {
            this.k.add(localj.a);
            cu localcu2 = bg.q(localView1).a(i());
            localcu2.b(localj.e - localj.c);
            localcu2.c(localj.f - localj.d);
            localcu2.a(0.0F).a(new f(this, localj, localcu2)).d();
          }
          if (localView2 == null)
            continue;
          this.k.add(localj.b);
          cu localcu1 = bg.q(localView2);
          localcu1.b(0.0F).c(0.0F).a(i()).a(1.0F).a(new g(this, localj, localcu1, localView2)).d();
        }
      }
      localArrayList2.clear();
      this.g.remove(localArrayList2);
    }
    while (i3 == 0);
    label522: label567: ArrayList localArrayList3 = new ArrayList();
    label773: label779: localArrayList3.addAll(this.b);
    this.e.add(localArrayList3);
    this.b.clear();
    b localb = new b(this, localArrayList3);
    if ((n != 0) || (i1 != 0) || (i2 != 0))
    {
      long l1;
      long l2;
      label1044: long l3;
      if (n != 0)
      {
        l1 = 75L + g();
        if (i1 == 0)
          break label1094;
        l2 = d();
        if (i2 == 0)
          break label1100;
        l3 = i();
      }
      while (true)
      {
        long l4 = Math.max(l1, Math.max(l2, l3));
        bg.a(((co)localArrayList3.get(0)).a, localb, l4);
        return;
        l1 = 0L;
        break;
        label1094: l2 = 0L;
        break label1044;
        label1100: l3 = 0L;
      }
    }
    localb.run();
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
    int n = (int)(paramInt1 + bg.m(paramco.a));
    int i1 = (int)(paramInt2 + bg.n(paramco.a));
    c(paramco);
    int i2 = paramInt3 - n;
    int i3 = paramInt4 - i1;
    if ((i2 == 0) && (i3 == 0))
    {
      e(paramco);
      return false;
    }
    if (i2 != 0)
      bg.a(localView, -i2);
    if (i3 != 0)
      bg.b(localView, -i3);
    this.c.add(new k(paramco, n, i1, paramInt3, paramInt4, 0));
    return true;
  }

  public final boolean a(co paramco1, co paramco2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = bg.m(paramco1.a);
    float f2 = bg.n(paramco1.a);
    float f3 = bg.f(paramco1.a);
    c(paramco1);
    int n = (int)(paramInt3 - paramInt1 - f1);
    int i1 = (int)(paramInt4 - paramInt2 - f2);
    bg.a(paramco1.a, f1);
    bg.b(paramco1.a, f2);
    bg.c(paramco1.a, f3);
    if ((paramco2 != null) && (paramco2.a != null))
    {
      c(paramco2);
      bg.a(paramco2.a, -n);
      bg.b(paramco2.a, -i1);
      bg.c(paramco2.a, 0.0F);
    }
    this.d.add(new j(paramco1, paramco2, paramInt1, paramInt2, paramInt3, paramInt4, 0));
    return true;
  }

  public final boolean b()
  {
    return (!this.b.isEmpty()) || (!this.d.isEmpty()) || (!this.c.isEmpty()) || (!this.a.isEmpty()) || (!this.i.isEmpty()) || (!this.j.isEmpty()) || (!this.h.isEmpty()) || (!this.k.isEmpty()) || (!this.l.isEmpty()) || (!this.f.isEmpty()) || (!this.e.isEmpty()) || (!this.g.isEmpty());
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
    for (int n = -1 + this.c.size(); n >= 0; n--)
    {
      k localk2 = (k)this.c.get(n);
      View localView2 = localk2.a.a;
      bg.b(localView2, 0.0F);
      bg.a(localView2, 0.0F);
      e(localk2.a);
      this.c.remove(n);
    }
    for (int i1 = -1 + this.a.size(); i1 >= 0; i1--)
    {
      d((co)this.a.get(i1));
      this.a.remove(i1);
    }
    for (int i2 = -1 + this.b.size(); i2 >= 0; i2--)
    {
      co localco2 = (co)this.b.get(i2);
      bg.c(localco2.a, 1.0F);
      f(localco2);
      this.b.remove(i2);
    }
    for (int i3 = -1 + this.d.size(); i3 >= 0; i3--)
      a((j)this.d.get(i3));
    this.d.clear();
    if (!b())
      return;
    for (int i4 = -1 + this.f.size(); i4 >= 0; i4--)
    {
      ArrayList localArrayList3 = (ArrayList)this.f.get(i4);
      for (int i9 = -1 + localArrayList3.size(); i9 >= 0; i9--)
      {
        k localk1 = (k)localArrayList3.get(i9);
        View localView1 = localk1.a.a;
        bg.b(localView1, 0.0F);
        bg.a(localView1, 0.0F);
        e(localk1.a);
        localArrayList3.remove(i9);
        if (!localArrayList3.isEmpty())
          continue;
        this.f.remove(localArrayList3);
      }
    }
    for (int i5 = -1 + this.e.size(); i5 >= 0; i5--)
    {
      ArrayList localArrayList2 = (ArrayList)this.e.get(i5);
      for (int i8 = -1 + localArrayList2.size(); i8 >= 0; i8--)
      {
        co localco1 = (co)localArrayList2.get(i8);
        bg.c(localco1.a, 1.0F);
        f(localco1);
        localArrayList2.remove(i8);
        if (!localArrayList2.isEmpty())
          continue;
        this.e.remove(localArrayList2);
      }
    }
    for (int i6 = -1 + this.g.size(); i6 >= 0; i6--)
    {
      ArrayList localArrayList1 = (ArrayList)this.g.get(i6);
      for (int i7 = -1 + localArrayList1.size(); i7 >= 0; i7--)
      {
        a((j)localArrayList1.get(i7));
        if (!localArrayList1.isEmpty())
          continue;
        this.g.remove(localArrayList1);
      }
    }
    a(this.j);
    a(this.i);
    a(this.h);
    a(this.k);
    Iterator localIterator = this.l.iterator();
    while (localIterator.hasNext())
      ((Animator)localIterator.next()).cancel();
    l();
  }

  public final void c(co paramco)
  {
    View localView = paramco.a;
    bg.q(localView).c();
    for (int n = -1 + this.c.size(); n >= 0; n--)
    {
      if (((k)this.c.get(n)).a != paramco)
        continue;
      bg.b(localView, 0.0F);
      bg.a(localView, 0.0F);
      e(paramco);
      this.c.remove(n);
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
    for (int i1 = -1 + this.g.size(); i1 >= 0; i1--)
    {
      ArrayList localArrayList3 = (ArrayList)this.g.get(i1);
      a(localArrayList3, paramco);
      if (!localArrayList3.isEmpty())
        continue;
      this.g.remove(i1);
    }
    int i2 = -1 + this.f.size();
    if (i2 >= 0)
    {
      ArrayList localArrayList2 = (ArrayList)this.f.get(i2);
      for (int i4 = -1 + localArrayList2.size(); ; i4--)
      {
        if (i4 >= 0)
        {
          if (((k)localArrayList2.get(i4)).a != paramco)
            continue;
          bg.b(localView, 0.0F);
          bg.a(localView, 0.0F);
          e(paramco);
          localArrayList2.remove(i4);
          if (localArrayList2.isEmpty())
            this.f.remove(i2);
        }
        i2--;
        break;
      }
    }
    for (int i3 = -1 + this.e.size(); i3 >= 0; i3--)
    {
      ArrayList localArrayList1 = (ArrayList)this.e.get(i3);
      if (!localArrayList1.remove(paramco))
        continue;
      bg.c(localView, 1.0F);
      f(paramco);
      if (!localArrayList1.isEmpty())
        continue;
      this.e.remove(i3);
    }
    this.j.remove(paramco);
    this.h.remove(paramco);
    this.k.remove(paramco);
    this.i.remove(paramco);
    m();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.anim.a
 * JD-Core Version:    0.6.0
 */