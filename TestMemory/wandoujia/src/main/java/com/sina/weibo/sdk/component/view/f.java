package com.sina.weibo.sdk.component.view;

final class f
  implements Runnable
{
  f(LoadingBar paramLoadingBar)
  {
  }

  public final void run()
  {
    LoadingBar localLoadingBar = this.a;
    LoadingBar.a(localLoadingBar, 1 + LoadingBar.a(localLoadingBar));
    this.a.a(LoadingBar.a(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.component.view.f
 * JD-Core Version:    0.6.0
 */