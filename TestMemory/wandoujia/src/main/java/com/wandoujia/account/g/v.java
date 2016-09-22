package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class v extends a
  implements Runnable
{
  private String e;
  private String f;
  private String g;

  public v(String paramString1, String paramString2, String paramString3, String paramString4, com.wandoujia.account.listener.a parama, b paramb)
  {
    super(paramString4, parama, paramb);
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramString3;
    this.b = false;
  }

  public final void run()
  {
    if ((a()) && (this.d != null))
    {
      a(this.d.b(this.e, this.f, this.g));
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.v
 * JD-Core Version:    0.6.0
 */