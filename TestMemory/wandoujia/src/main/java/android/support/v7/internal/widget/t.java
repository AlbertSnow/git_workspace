package android.support.v7.internal.widget;

import android.database.DataSetObserver;

final class t extends DataSetObserver
{
  t(ActivityChooserView paramActivityChooserView)
  {
  }

  public final void onChanged()
  {
    super.onChanged();
    ActivityChooserView.c(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.t
 * JD-Core Version:    0.6.0
 */