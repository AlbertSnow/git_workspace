package android.support.v7.widget;

import android.view.View;

final class bf
  implements Runnable
{
  bf(ListPopupWindow paramListPopupWindow)
  {
  }

  public final void run()
  {
    View localView = this.a.e();
    if ((localView != null) && (localView.getWindowToken() != null))
      this.a.c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.bf
 * JD-Core Version:    0.6.0
 */