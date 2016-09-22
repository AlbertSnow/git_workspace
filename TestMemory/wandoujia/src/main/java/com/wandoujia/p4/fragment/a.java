package com.wandoujia.p4.fragment;

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
    if (AsyncLoadFragment.access$000(this.a))
    {
      this.a.onStartLoading();
      return;
    }
    AsyncLoadFragment.access$102(this.a, true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.fragment.a
 * JD-Core Version:    0.6.0
 */