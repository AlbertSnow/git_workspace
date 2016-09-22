package com.wandoujia.ripple_framework.c;

import com.wandoujia.nirvana.framework.ui.b;
import com.wandoujia.ripple_framework.k;
import com.wandoujia.ripple_framework.model.Model;

public abstract class c extends b
{
  private Model a;
  protected boolean f = false;

  public void a()
  {
    super.a();
    this.a = null;
    this.f = false;
  }

  protected abstract void a(Model paramModel);

  protected final void a(Object paramObject)
  {
    if (this.f)
      a();
    this.a = ((Model)paramObject);
    a((Model)paramObject);
    this.f = true;
  }

  public final Model i()
  {
    return this.a;
  }

  public final k j()
  {
    if (g() != null)
      return (k)g();
    return new k();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.c
 * JD-Core Version:    0.6.0
 */