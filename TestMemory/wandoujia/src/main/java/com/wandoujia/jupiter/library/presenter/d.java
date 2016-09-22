package com.wandoujia.jupiter.library.presenter;

import android.support.v4.app.b;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.wandoujia.ripple_framework.model.Model;

final class d
  implements AdapterView.OnItemSelectedListener
{
  private Adapter c = null;

  d(c paramc, Model paramModel)
  {
  }

  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (this.c != paramAdapterView.getAdapter())
    {
      this.c = paramAdapterView.getAdapter();
      return;
    }
    b.a(new e(this), new Object[0]);
  }

  public final void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.presenter.d
 * JD-Core Version:    0.6.0
 */