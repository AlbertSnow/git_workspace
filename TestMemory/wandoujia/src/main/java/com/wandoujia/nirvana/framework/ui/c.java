package com.wandoujia.nirvana.framework.ui;

public final class c extends b
{
  private final b[] a;

  public c(b[] paramArrayOfb)
  {
    this.a = paramArrayOfb;
  }

  public final void a()
  {
    if ((this.a == null) || (this.a.length == 0));
    while (true)
    {
      return;
      for (int i = 0; i < this.a.length; i++)
        this.a[i].a();
    }
  }

  protected final void a(Object paramObject)
  {
    if ((this.a == null) || (this.a.length == 0));
    while (true)
    {
      return;
      for (int i = 0; i < this.a.length; i++)
        a(this.a[i], paramObject);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.ui.c
 * JD-Core Version:    0.6.0
 */