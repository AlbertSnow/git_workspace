package com.wandoujia.account.g;

import com.wandoujia.account.f.b;

public final class n
  implements Runnable
{
  private b a;

  public n(b paramb)
  {
    this.a = paramb;
  }

  public final void run()
  {
    if (this.a != null)
      this.a.e();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.g.n
 * JD-Core Version:    0.6.0
 */