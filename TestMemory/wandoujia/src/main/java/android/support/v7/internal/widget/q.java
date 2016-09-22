package android.support.v7.internal.widget;

import android.database.DataSetObserver;

final class q extends DataSetObserver
{
  q(ActivityChooserView paramActivityChooserView)
  {
  }

  public final void onChanged()
  {
    super.onChanged();
    ActivityChooserView.a(this.a).notifyDataSetChanged();
  }

  public final void onInvalidated()
  {
    super.onInvalidated();
    ActivityChooserView.a(this.a).notifyDataSetInvalidated();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.q
 * JD-Core Version:    0.6.0
 */