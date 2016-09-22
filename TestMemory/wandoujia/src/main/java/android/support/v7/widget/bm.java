package android.support.v7.widget;

import android.database.DataSetObserver;

final class bm extends DataSetObserver
{
  private bm(ListPopupWindow paramListPopupWindow)
  {
  }

  public final void onChanged()
  {
    if (this.a.b())
      this.a.c();
  }

  public final void onInvalidated()
  {
    this.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.bm
 * JD-Core Version:    0.6.0
 */