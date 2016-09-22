package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class f extends a
  implements Runnable
{
  private final String e;
  private final String f;

  public f(String paramString1, String paramString2, String paramString3, com.wandoujia.account.listener.a parama, b paramb)
  {
    super(paramString3, parama, paramb);
    this.e = paramString1;
    this.f = paramString2;
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
      a(this.d.a(this.e, this.f));
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.f
 * JD-Core Version:    0.6.0
 */