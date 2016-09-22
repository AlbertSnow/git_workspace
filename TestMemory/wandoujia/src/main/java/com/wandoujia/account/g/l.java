package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class l extends a
  implements Runnable
{
  private String e;

  public l(String paramString1, String paramString2, com.wandoujia.account.listener.a parama, b paramb)
  {
    super(paramString2, parama, paramb);
    this.e = paramString1;
    this.b = false;
  }

  public final void run()
  {
    if ((a()) && (this.d != null))
    {
      a(this.d.b(this.e));
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.l
 * JD-Core Version:    0.6.0
 */