package com.wandoujia.jupiter.presenter;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.wandoujia.ripple_framework.model.Model;

final class ck
  implements AdapterView.OnItemSelectedListener
{
  ck(Model paramModel)
  {
  }

  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.a(2131492965, Integer.valueOf(paramInt));
  }

  public final void onNothingSelected(AdapterView<?> paramAdapterView)
  {
    this.a.a(2131492965, Integer.valueOf(0));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ck
 * JD-Core Version:    0.6.0
 */