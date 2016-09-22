package android.support.v7.internal.widget;

import android.view.View;

final class ag
  implements Runnable
{
  ag(ScrollingTabContainerView paramScrollingTabContainerView, View paramView)
  {
  }

  public final void run()
  {
    int i = this.a.getLeft() - (this.b.getWidth() - this.a.getWidth()) / 2;
    this.b.smoothScrollTo(i, 0);
    this.b.a = null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.ag
 * JD-Core Version:    0.6.0
 */