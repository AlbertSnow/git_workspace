package com.wandoujia.accessibility.hibernation.view;

final class k
  implements Runnable
{
  k(j paramj)
  {
  }

  public final void run()
  {
    if (m.b(this.a.a) != null)
      m.b(this.a.a).c();
    this.a.b.postDelayed(new l(this), 400L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.view.k
 * JD-Core Version:    0.6.0
 */