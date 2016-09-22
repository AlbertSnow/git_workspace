package com.wandoujia.p4.b;

final class f
  implements Runnable
{
  f(e parame)
  {
  }

  public final void run()
  {
    if (System.currentTimeMillis() - b.a(this.a.a) > 1000L)
    {
      this.a.a.c();
      b.a(this.a.a, System.currentTimeMillis());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.b.f
 * JD-Core Version:    0.6.0
 */