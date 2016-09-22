package com.wandoujia.p4.pay.widget;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.text.TextUtils;
import android.widget.BaseAdapter;
import android.widget.ListView;

class ListViewSpinner$CategoryAlertDialog
  implements ListViewSpinner.ListPopup
{
  private AlertDialog.Builder builder;
  private ListView list;
  private AlertDialog mPopup;
  private CharSequence mPrompt;

  public ListViewSpinner$CategoryAlertDialog(ListViewSpinner paramListViewSpinner, ListView paramListView)
  {
    this.builder = new AlertDialog.Builder(paramListViewSpinner.getContext());
    this.list = paramListView;
  }

  public void dismiss()
  {
    if (this.mPopup != null)
      this.mPopup.dismiss();
  }

  public CharSequence getHintText()
  {
    return this.mPrompt;
  }

  public ListView getListView()
  {
    return this.list;
  }

  public boolean isShowing()
  {
    return (this.mPopup != null) && (this.mPopup.isShowing());
  }

  public void setAdapter(BaseAdapter paramBaseAdapter)
  {
    this.list.setAdapter(paramBaseAdapter);
  }

  public void setPromptText(CharSequence paramCharSequence)
  {
    this.mPrompt = paramCharSequence;
  }

  public void show()
  {
    if (!TextUtils.isEmpty(this.mPrompt))
      this.builder.setTitle(this.mPrompt);
    if (this.mPopup != null)
    {
      this.mPopup.show();
      return;
    }
    this.builder.setView(this.list);
    this.mPopup = this.builder.show();
    this.mPopup.setOnDismissListener(new ListViewSpinner.CategoryAlertDialog.1(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.widget.ListViewSpinner.CategoryAlertDialog
 * JD-Core Version:    0.6.0
 */