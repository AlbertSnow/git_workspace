package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class o extends a
  implements Runnable
{
  private final String e;
  private final String f;
  private final String g;

  public o(String paramString1, String paramString2, String paramString3, String paramString4, com.wandoujia.account.listener.a parama, b paramb)
  {
    super(paramString4, parama, paramb);
    this.g = paramString1;
    this.e = paramString2;
    this.f = paramString3;
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
      a(this.d.e(this.g, this.e, this.f));
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.o
 * JD-Core Version:    0.6.0
 */