package com.wandoujia.launcher_base.launcher.a;

import java.util.ArrayList;
import java.util.List;

public final class a
{
  private List<com.wandoujia.launcher_base.launcher.c.a> a = new ArrayList();
  private b b;
  private boolean c = false;

  public final com.wandoujia.launcher_base.launcher.c.a a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < c()))
      return (com.wandoujia.launcher_base.launcher.c.a)this.a.get(paramInt);
    return null;
  }

  public final List<com.wandoujia.launcher_base.launcher.c.a> a()
  {
    return this.a;
  }

  public final void a(b paramb)
  {
    this.b = paramb;
  }

  public final boolean a(com.wandoujia.launcher_base.launcher.c.a parama)
  {
    if (!this.a.contains(parama))
    {
      this.a.add(parama);
      if (parama.e() == -3)
        this.c = true;
      return true;
    }
    return false;
  }

  public final boolean b()
  {
    return this.c;
  }

  public final int c()
  {
    return this.a.size();
  }

  public final void d()
  {
    this.a.clear();
    e();
  }

  public final void e()
  {
    if (this.b != null)
      this.b.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.a.a
 * JD-Core Version:    0.6.0
 */