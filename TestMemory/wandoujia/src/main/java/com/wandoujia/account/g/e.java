package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class e extends a
  implements Runnable
{
  private final String e;
  private final String f;
  private final String g;
  private final String h;

  public e(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, com.wandoujia.account.listener.a parama, b paramb)
  {
    super(paramString5, parama, paramb);
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramString4;
    this.b = false;
    this.h = paramString3;
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
      a(this.d.b(this.e, this.f, this.h, this.g));
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.e
 * JD-Core Version:    0.6.0
 */