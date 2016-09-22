package com.wandoujia.p4.c;

public final class l<T>
{
  protected int a;
  private final int b;
  private final int c;
  private final boolean d;
  private final a<T> e;
  private j<T> f;
  private final j<T> g;

  public l(a<T> parama, j<T> paramj)
  {
    this(parama, paramj, 40, 20, false);
  }

  public l(a<T> parama, j<T> paramj, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.e = parama;
    this.f = paramj;
    this.b = paramInt1;
    this.c = paramInt2;
    this.g = new m(this, 0);
    this.d = paramBoolean;
  }

  public final void a()
  {
    if (this.a != 0);
    for (int i = this.c; ; i = this.b)
    {
      this.e.a(0, i, this.g, this.d);
      return;
    }
  }

  public final void b()
  {
    if (this.a == 0);
    for (int i = this.b; ; i = this.c)
    {
      this.e.a(this.a, i, this.g);
      return;
    }
  }

  public final void c()
  {
    this.a = 0;
  }

  public final a<T> d()
  {
    return this.e;
  }

  public final void e()
  {
    this.f = null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.c.l
 * JD-Core Version:    0.6.0
 */