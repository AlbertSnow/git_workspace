package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class w extends a
  implements Runnable
{
  private final String e;
  private final String f;

  public w(String paramString1, String paramString2, String paramString3, com.wandoujia.account.listener.a parama, b paramb)
  {
    super(paramString1, parama, paramb);
    this.f = paramString3;
    this.e = paramString2;
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
      a(this.d.e(this.e, this.f));
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.w
 * JD-Core Version:    0.6.0
 */