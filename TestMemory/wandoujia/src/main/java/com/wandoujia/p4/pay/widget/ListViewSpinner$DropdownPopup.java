package com.wandoujia.p4.pay.widget;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;

class ListViewSpinner$DropdownPopup extends PopupWindow
  implements ListViewSpinner.ListPopup
{
  private ListView listView;
  private CharSequence mHintText;

  public ListViewSpinner$DropdownPopup(ListViewSpinner paramListViewSpinner, View paramView)
  {
    super(paramView);
    this.listView = ((ListView)paramView);
    setOnDismissListener(new ListViewSpinner.DropdownPopup.1(this, paramListViewSpinner));
  }

  public CharSequence getHintText()
  {
    return this.mHintText;
  }

  public ListView getListView()
  {
    return this.listView;
  }

  public void setAdapter(BaseAdapter paramBaseAdapter)
  {
    this.listView.setAdapter(paramBaseAdapter);
  }

  public void setPromptText(CharSequence paramCharSequence)
  {
    this.mHintText = paramCharSequence;
  }

  public void show()
  {
    setWidth(this.this$0.getWidth());
    setHeight(-2);
    setFocusable(true);
    update();
    setBackgroundDrawable(new BitmapDrawable());
    showAsDropDown(this.this$0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.widget.ListViewSpinner.DropdownPopup
 * JD-Core Version:    0.6.0
 */