package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class h extends a
  implements Runnable
{
  private final String e;

  public h(String paramString1, String paramString2, com.wandoujia.account.listener.a parama, b paramb)
  {
    super(paramString2, parama, paramb);
    this.e = paramString1;
    this.b = false;
  }

  public final void run()
  {
    if (a())
    {
      if (this.d == null)
      {
        b();
        return;
      }
      a(this.d.h(this.e));
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.h
 * JD-Core Version:    0.6.0
 */