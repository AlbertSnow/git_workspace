package com.wandoujia.accessibility.hibernation.view;

import java.util.Queue;

final class l
  implements Runnable
{
  l(k paramk)
  {
  }

  public final void run()
  {
    if ((AppIconsView.b(this.a.a.b) != null) && (!AppIconsView.b(this.a.a.b).isEmpty()))
    {
      AppIconsView.a(this.a.a.b, (m)AppIconsView.b(this.a.a.b).poll());
      return;
    }
    AppIconsView.c(this.a.a.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.view.l
 * JD-Core Version:    0.6.0
 */