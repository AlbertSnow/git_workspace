package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class m extends a
  implements Runnable
{
  private final String e;
  private final String f;
  private final String g;

  public m(String paramString1, String paramString2, String paramString3, String paramString4, com.wandoujia.account.listener.a parama, b paramb)
  {
    super(paramString4, parama, paramb);
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramString3;
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
      b localb = this.d;
      String str1 = this.e;
      String str2 = this.f;
      com.wandoujia.account.a.h();
      a(localb.a(str1, str2, this.g));
      return;
    }
    b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.m
 * JD-Core Version:    0.6.0
 */