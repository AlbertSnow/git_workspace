package com.wandoujia.p4.pay.feedback;

import android.app.AlertDialog;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;

class FeedbackCategorySpinner$CategoryAlertDialog$2
  implements ExpandableListView.OnChildClickListener
{
  public boolean onChildClick(ExpandableListView paramExpandableListView, View paramView, int paramInt1, int paramInt2, long paramLong)
  {
    if (FeedbackCategorySpinner.access$100(this.this$1.this$0) != null)
      FeedbackCategorySpinner.access$100(this.this$1.this$0).onChildClick(paramExpandableListView, paramView, paramInt1, paramInt2, paramLong);
    if (FeedbackCategorySpinner.CategoryAlertDialog.access$200(this.this$1) != null)
      FeedbackCategorySpinner.CategoryAlertDialog.access$200(this.this$1).dismiss();
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.feedback.FeedbackCategorySpinner.CategoryAlertDialog.2
 * JD-Core Version:    0.6.0
 */