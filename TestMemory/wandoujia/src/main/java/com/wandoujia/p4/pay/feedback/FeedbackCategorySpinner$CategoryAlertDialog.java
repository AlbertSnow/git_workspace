package com.wandoujia.p4.pay.feedback;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.ExpandableListView;
import java.util.List;

class FeedbackCategorySpinner$CategoryAlertDialog
  implements FeedbackCategorySpinner.SpinnerPopup
{
  private ExpandableListView list;
  private AlertDialog mPopup;
  private CharSequence mPrompt;

  public FeedbackCategorySpinner$CategoryAlertDialog(FeedbackCategorySpinner paramFeedbackCategorySpinner, View paramView)
  {
    this.list = ((ExpandableListView)paramView);
  }

  public void dismiss()
  {
    this.mPopup.dismiss();
    this.mPopup = null;
  }

  public CharSequence getHintText()
  {
    return this.mPrompt;
  }

  public boolean isShowing()
  {
    if (this.mPopup != null)
      return this.mPopup.isShowing();
    return false;
  }

  public void setData(List<String> paramList, List<List<String>> paramList1, String paramString)
  {
    this.list.setGroupIndicator(null);
    this.list.setAdapter(new FeedbackCategorySpinner.DropDownAdapter(this.this$0, paramList, paramList1, this.list, paramString));
    this.list.setOnChildClickListener(new FeedbackCategorySpinner.CategoryAlertDialog.2(this));
    this.list.setOnGroupClickListener(new FeedbackCategorySpinner.CategoryAlertDialog.3(this));
  }

  public void setPromptText(CharSequence paramCharSequence)
  {
    this.mPrompt = paramCharSequence;
  }

  public void show()
  {
    if (this.mPrompt != null)
      FeedbackCategorySpinner.access$000(this.this$0).setTitle(this.mPrompt);
    if (this.mPopup != null)
    {
      this.mPopup.show();
      return;
    }
    FeedbackCategorySpinner.access$002(this.this$0, new AlertDialog.Builder(this.this$0.getContext()));
    FeedbackCategorySpinner.access$000(this.this$0).setView(this.list);
    this.mPopup = FeedbackCategorySpinner.access$000(this.this$0).show();
    this.mPopup.setOnDismissListener(new FeedbackCategorySpinner.CategoryAlertDialog.1(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.feedback.FeedbackCategorySpinner.CategoryAlertDialog
 * JD-Core Version:    0.6.0
 */