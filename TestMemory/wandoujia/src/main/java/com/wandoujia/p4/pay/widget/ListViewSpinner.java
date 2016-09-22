package com.wandoujia.p4.pay.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewSpinner extends TextView
  implements View.OnClickListener
{
  private Context context;
  private View.OnClickListener mOnClickListener;
  private ListViewSpinner.ListPopup mPopup;

  public ListViewSpinner(Context paramContext)
  {
    super(paramContext);
    initView(paramContext);
  }

  public ListViewSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initView(paramContext);
  }

  public ListViewSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    initView(paramContext);
  }

  private void initView(Context paramContext)
  {
    this.context = paramContext;
    ListView localListView = new ListView(paramContext);
    localListView.setBackgroundColor(paramContext.getResources().getColor(17170443));
    if (Integer.parseInt(Build.VERSION.SDK) < 11);
    for (this.mPopup = new ListViewSpinner.CategoryAlertDialog(this, localListView); ; this.mPopup = new ListViewSpinner.DropdownPopup(this, localListView))
    {
      setClickable(true);
      setSelected(false);
      setOnClickListener(this);
      return;
    }
  }

  public void disMiss()
  {
    this.mPopup.dismiss();
  }

  public ListView getListView()
  {
    return this.mPopup.getListView();
  }

  public void onClick(View paramView)
  {
    if (paramView.isSelected())
      disMiss();
    while (true)
    {
      if (this.mOnClickListener != null)
        this.mOnClickListener.onClick(paramView);
      return;
      show();
    }
  }

  public void setAdapter(BaseAdapter paramBaseAdapter)
  {
    this.mPopup.setAdapter(paramBaseAdapter);
  }

  public void setCustomOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mOnClickListener = paramOnClickListener;
  }

  public void setLabel(String paramString)
  {
    this.mPopup.setPromptText(paramString);
  }

  public void show()
  {
    this.mPopup.show();
    setSelected(true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.widget.ListViewSpinner
 * JD-Core Version:    0.6.0
 */