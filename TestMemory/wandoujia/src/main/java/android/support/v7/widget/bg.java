package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class bg
  implements AdapterView.OnItemSelectedListener
{
  bg(ListPopupWindow paramListPopupWindow)
  {
  }

  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt != -1)
    {
      bh localbh = ListPopupWindow.a(this.a);
      if (localbh != null)
        bh.a(localbh, false);
    }
  }

  public final void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.bg
 * JD-Core Version:    0.6.0
 */