package com.wandoujia.nirvana.framework.ui;

import android.content.Context;
import android.view.View;

public abstract class b
{
  private com.wandoujia.nirvana.framework.ui.a.a a;
  View b;
  a c;
  int d;
  Object e;

  public void a()
  {
  }

  protected final void a(b paramb, Object paramObject)
  {
    View localView = this.b;
    if (paramb != null)
    {
      if (((paramb.c == null) || (paramb.c == this.c)) && ((paramb.b == null) || (paramb.b == localView)))
      {
        paramb.b = localView;
        paramb.c = this.c;
        paramb.a(paramObject);
      }
    }
    else
      return;
    throw new IllegalArgumentException("Must be in same group!");
  }

  protected abstract void a(Object paramObject);

  public final void b(Object paramObject)
  {
    this.e = paramObject;
  }

  public final a d()
  {
    if (this.c == null)
      throw new IllegalArgumentException("Please ensure this view binder is called bind()!");
    return this.c;
  }

  public final View e()
  {
    if (this.b == null)
      throw new IllegalArgumentException("Please ensure this view binder is called bind()!");
    return this.b;
  }

  public final Context f()
  {
    return e().getContext();
  }

  public final Object g()
  {
    return this.e;
  }

  public final com.wandoujia.nirvana.framework.ui.a.a h()
  {
    if (this.a == null)
      this.a = new com.wandoujia.nirvana.framework.ui.a.a(e());
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.ui.b
 * JD-Core Version:    0.6.0
 */