package android.support.v4.widget;

import android.database.DataSetObserver;

final class j extends DataSetObserver
{
  private j(h paramh)
  {
  }

  public final void onChanged()
  {
    this.a.a = true;
    this.a.notifyDataSetChanged();
  }

  public final void onInvalidated()
  {
    this.a.a = false;
    this.a.notifyDataSetInvalidated();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.j
 * JD-Core Version:    0.6.0
 */