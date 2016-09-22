package com.wandoujia.p4.pay.widget;

import android.widget.BaseAdapter;
import android.widget.ListView;

abstract interface ListViewSpinner$ListPopup
{
  public abstract void dismiss();

  public abstract CharSequence getHintText();

  public abstract ListView getListView();

  public abstract boolean isShowing();

  public abstract void setAdapter(BaseAdapter paramBaseAdapter);

  public abstract void setPromptText(CharSequence paramCharSequence);

  public abstract void show();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.widget.ListViewSpinner.ListPopup
 * JD-Core Version:    0.6.0
 */