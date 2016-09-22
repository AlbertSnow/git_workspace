package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;

final class bj
  implements Runnable
{
  private bj(bi parambi)
  {
  }

  public final void run()
  {
    bi.a(this.a).getParent().requestDisallowInterceptTouchEvent(true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.bj
 * JD-Core Version:    0.6.0
 */