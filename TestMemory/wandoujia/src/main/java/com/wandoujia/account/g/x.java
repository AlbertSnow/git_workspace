package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class x extends a
  implements Runnable
{
  private final String e;
  private final String f;

  public x(String paramString1, String paramString2, String paramString3, com.wandoujia.account.listener.a parama, b paramb)
  {
    super(paramString3, parama, paramb);
    this.e = paramString2;
    this.f = paramString1;
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
      a(this.d.b(this.f, this.e));
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.x
 * JD-Core Version:    0.6.0
 */