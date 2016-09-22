package android.support.v7.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.PopupWindow;

final class bn
  implements AbsListView.OnScrollListener
{
  private bn(ListPopupWindow paramListPopupWindow)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 1) && (!this.a.h()) && (ListPopupWindow.b(this.a).getContentView() != null))
    {
      ListPopupWindow.d(this.a).removeCallbacks(ListPopupWindow.c(this.a));
      ListPopupWindow.c(this.a).run();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.bn
 * JD-Core Version:    0.6.0
 */