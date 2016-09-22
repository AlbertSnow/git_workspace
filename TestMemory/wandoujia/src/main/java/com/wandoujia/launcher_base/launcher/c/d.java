package com.wandoujia.launcher_base.launcher.c;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v4.view.at;
import android.support.v4.view.ck;
import android.view.View;
import com.wandoujia.launcher_base.R.id;
import com.wandoujia.launcher_base.launcher.view.SlidingTabDot;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
{
  private static final int a = R.id.card_controller;
  private List<n> b = new ArrayList();
  private at c;
  private ViewPager d;
  private SlidingTabDot e;
  private boolean f;
  private Handler g;
  private com.wandoujia.launcher_base.launcher.a.a h;
  private int i = -1;
  private WeakReference<m> j;
  private ck k = new l(this);

  private boolean b(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.b.size()))
    {
      n localn = (n)this.b.get(paramInt);
      this.b.remove(localn);
      this.c.d();
      this.e.a(e());
      return true;
    }
    return false;
  }

  private n c(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.b.size()))
      return (n)this.b.get(paramInt);
    return null;
  }

  private n d()
  {
    n localn = new n();
    localn.a(this.b.size());
    this.b.add(localn);
    this.c.d();
    this.d.setOffscreenPageLimit(e());
    this.e.a(e());
    return localn;
  }

  private int e()
  {
    return this.b.size();
  }

  public final void a()
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      ((n)localIterator.next()).e();
    this.d = null;
    this.e = null;
  }

  public final void a(int paramInt)
  {
    this.g.post(new e(this, paramInt));
  }

  public final void a(View paramView)
  {
    this.g = new Handler();
    paramView.setTag(a, this);
    this.c = new j(this);
    this.d = ((ViewPager)paramView.findViewById(R.id.view_pager));
    this.d.setAdapter(this.c);
    this.d.a(this.k);
    this.e = ((SlidingTabDot)paramView.findViewById(R.id.sliding_tab_dot));
  }

  public final void a(com.wandoujia.launcher_base.launcher.a.a parama)
  {
    parama.a(new f(this));
    this.h = parama;
  }

  public final void a(m paramm)
  {
    this.j = new WeakReference(paramm);
  }

  public final void b()
  {
    for (int m = 0; m < this.h.c(); m++)
      this.h.a(m).i();
  }

  public final com.wandoujia.launcher_base.launcher.a.a c()
  {
    return this.h;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.c.d
 * JD-Core Version:    0.6.0
 */