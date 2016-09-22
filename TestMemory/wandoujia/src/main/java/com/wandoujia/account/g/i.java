package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class i extends a
  implements Runnable
{
  private String e;
  private String f;

  public i(String paramString1, String paramString2, String paramString3, com.wandoujia.account.listener.a parama, b paramb)
  {
    super(paramString1, parama, paramb);
    this.e = paramString3;
    this.f = paramString2;
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
      a(this.d.f(this.f, this.e));
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.i
 * JD-Core Version:    0.6.0
 */