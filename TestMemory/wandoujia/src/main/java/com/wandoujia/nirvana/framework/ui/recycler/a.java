package com.wandoujia.nirvana.framework.ui.recycler;

import android.view.ViewGroup;
import java.util.List;

public abstract class a<T> extends i<T>
{
  private f c = new f();
  private f d = new f();

  public a()
  {
    this.c.a(new d(this, new b()));
    this.d.a(new d(this, new c(this)));
  }

  private boolean h(int paramInt)
  {
    return (paramInt >= 0) && (paramInt < this.c.a());
  }

  private boolean i(int paramInt)
  {
    int i = paramInt - this.c.a();
    return (i >= 0) && (i < d());
  }

  private boolean j(int paramInt)
  {
    int i = k(paramInt);
    return (i >= 0) && (i < this.d.a());
  }

  private int k(int paramInt)
  {
    return paramInt - this.c.a() - d();
  }

  public final int a()
  {
    return this.c.a() + this.d.a() + d();
  }

  public final int a(int paramInt)
  {
    if (h(paramInt))
      return 0x20000 | this.c.a(paramInt);
    if (i(paramInt))
    {
      int i = g(paramInt - this.c.a());
      if (i > 65535)
        throw new IllegalStateException("item view type can not exceed 0xffff");
      return i | 0x0;
    }
    return 0x10000 | this.d.a(k(paramInt));
  }

  public final void a(g paramg)
  {
    this.c.a(paramg);
  }

  public void a(j paramj)
  {
    super.a(paramj);
    int i = paramj.c();
    if (h(i))
      this.c.g(i);
    do
      return;
    while (!j(i));
    this.d.g(k(i));
  }

  public final void a(j paramj, int paramInt)
  {
    if (h(paramInt))
    {
      this.c.a(paramj, paramInt);
      return;
    }
    if (i(paramInt))
    {
      super.a(paramj, paramInt - this.c.a());
      return;
    }
    this.d.a(paramj, k(paramInt));
  }

  protected final com.wandoujia.nirvana.framework.ui.a b(ViewGroup paramViewGroup, int paramInt)
  {
    int i = 0xFFFF & paramInt;
    int j = 0x30000 & paramInt;
    if (j == 131072)
      return this.c.b(paramViewGroup, i);
    if (j == 0)
      return c(paramViewGroup, paramInt);
    return this.d.b(paramViewGroup, i);
  }

  public final void b(g paramg)
  {
    this.d.a(paramg);
  }

  public final void b(j paramj)
  {
    super.b(paramj);
    int i = paramj.c();
    if (h(i))
      this.c.h(i);
    do
      return;
    while (!j(i));
    this.d.h(k(i));
  }

  public final int c()
  {
    return this.c.a();
  }

  protected abstract com.wandoujia.nirvana.framework.ui.a c(ViewGroup paramViewGroup, int paramInt);

  public final int d()
  {
    if (this.b == null)
      return 0;
    return this.b.size();
  }

  public void e()
  {
    super.e();
    this.c.e();
    this.d.e();
  }

  protected final int f(int paramInt)
  {
    return paramInt + this.c.a();
  }

  protected abstract int g(int paramInt);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.ui.recycler.a
 * JD-Core Version:    0.6.0
 */