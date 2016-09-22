package com.wandoujia.ripple_framework.fragment;

final class a
  implements Runnable
{
  a(AsyncLoadFragment paramAsyncLoadFragment)
  {
  }

  public final void run()
  {
    if (!this.a.isAdded())
      return;
    if (this.a.l())
    {
      this.a.d_();
      return;
    }
    AsyncLoadFragment.a(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.fragment.a
 * JD-Core Version:    0.6.0
 */