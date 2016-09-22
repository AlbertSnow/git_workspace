package com.wandoujia.p4.pay.feedback;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.PopupWindow;
import java.util.List;

class FeedbackCategorySpinner$DropdownPopup extends PopupWindow
  implements FeedbackCategorySpinner.SpinnerPopup
{
  private ExpandableListView list;
  private CharSequence mHintText;
  private View parent;

  public FeedbackCategorySpinner$DropdownPopup(FeedbackCategorySpinner paramFeedbackCategorySpinner, View paramView)
  {
    super(paramView);
    this.parent = paramView;
    setOnDismissListener(new FeedbackCategorySpinner.DropdownPopup.1(this, paramFeedbackCategorySpinner));
  }

  public CharSequence getHintText()
  {
    return this.mHintText;
  }

  public void setData(List<String> paramList, List<List<String>> paramList1, String paramString)
  {
    this.list = ((ExpandableListView)this.parent);
    this.list.setGroupIndicator(null);
    this.list.setAdapter(new FeedbackCategorySpinner.DropDownAdapter(this.this$0, paramList, paramList1, this.list, paramString));
    this.list.setOnChildClickListener(new FeedbackCategorySpinner.DropdownPopup.2(this));
    this.list.setOnGroupClickListener(new FeedbackCategorySpinner.DropdownPopup.3(this));
  }

  public void setPromptText(CharSequence paramCharSequence)
  {
    this.mHintText = paramCharSequence;
  }

  public void show()
  {
    setWidth(this.this$0.getWidth());
    setHeight(-1);
    setFocusable(true);
    update();
    setBackgroundDrawable(new BitmapDrawable());
    showAsDropDown(this.this$0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.feedback.FeedbackCategorySpinner.DropdownPopup
 * JD-Core Version:    0.6.0
 */