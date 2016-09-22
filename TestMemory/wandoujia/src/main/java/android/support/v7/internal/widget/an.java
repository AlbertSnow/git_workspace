package android.support.v7.internal.widget;

import android.content.Context;
import android.support.v7.widget.ListPopupWindow;
import android.widget.ListAdapter;

final class an extends ListPopupWindow
  implements aq
{
  private ListAdapter c;

  public an(SpinnerCompat paramSpinnerCompat, Context paramContext, int paramInt)
  {
    super(paramContext, null, paramInt);
    a(paramSpinnerCompat);
    d();
    a(new ao(this));
  }

  public final void a(ListAdapter paramListAdapter)
  {
    super.a(paramListAdapter);
    this.c = paramListAdapter;
  }

  public final void a(CharSequence paramCharSequence)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.an
 * JD-Core Version:    0.6.0
 */