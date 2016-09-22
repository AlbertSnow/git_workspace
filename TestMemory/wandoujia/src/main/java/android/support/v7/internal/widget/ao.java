package android.support.v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

final class ao
  implements AdapterView.OnItemClickListener
{
  ao(an paraman)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.a.setSelection(paramInt);
    if (this.a.a.l != null)
    {
      SpinnerCompat localSpinnerCompat = this.a.a;
      an.a(this.a).getItemId(paramInt);
      localSpinnerCompat.a(paramView);
    }
    this.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.ao
 * JD-Core Version:    0.6.0
 */