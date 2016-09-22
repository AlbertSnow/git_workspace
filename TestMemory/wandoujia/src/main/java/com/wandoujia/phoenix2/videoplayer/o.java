package com.wandoujia.phoenix2.videoplayer;

final class o
  implements Runnable
{
  o(n paramn)
  {
  }

  public final void run()
  {
    if (!BasePlayerFragment.p(this.a.a));
    int i;
    do
    {
      return;
      i = this.a.a.i();
    }
    while (BasePlayerFragment.q(this.a.a) == i);
    BasePlayerFragment.a(this.a.a, i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.o
 * JD-Core Version:    0.6.0
 */