package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class k extends a
  implements Runnable
{
  private String e;
  private String f;
  private String g;

  public k(String paramString1, String paramString2, String paramString3, String paramString4, com.wandoujia.account.listener.a parama, b paramb)
  {
    super(paramString1, parama, paramb);
    this.e = paramString4;
    this.f = paramString3;
    this.g = paramString2;
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
      a(this.d.d(this.g, this.f, this.e));
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.k
 * JD-Core Version:    0.6.0
 */