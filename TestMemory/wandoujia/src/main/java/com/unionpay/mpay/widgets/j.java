package com.unionpay.mpay.widgets;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

final class j
  implements AdapterView.OnItemSelectedListener
{
  j(c paramc)
  {
  }

  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    c.a(c.a(this.a).getSelectedItem().toString());
    c.a(this.a, paramInt);
  }

  public final void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.j
 * JD-Core Version:    0.6.0
 */