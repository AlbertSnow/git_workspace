package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class u extends a
  implements Runnable
{
  private final String e;
  private final String f;
  private final String g;
  private final String h;

  public u(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, com.wandoujia.account.listener.a parama, b paramb)
  {
    super(paramString5, parama, paramb);
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramString3;
    this.h = paramString4;
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
      a(this.d.a(this.e, this.f, this.g, this.h));
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.u
 * JD-Core Version:    0.6.0
 */