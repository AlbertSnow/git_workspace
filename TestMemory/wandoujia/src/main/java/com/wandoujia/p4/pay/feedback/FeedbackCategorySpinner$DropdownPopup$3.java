package com.wandoujia.p4.pay.feedback;

import android.content.Context;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.TextView;

class FeedbackCategorySpinner$DropdownPopup$3
  implements ExpandableListView.OnGroupClickListener
{
  public boolean onGroupClick(ExpandableListView paramExpandableListView, View paramView, int paramInt, long paramLong)
  {
    String str = ((TextView)paramView).getText().toString();
    int j;
    if (!str.equals(this.this$1.this$0.getContext().getString(2131625729)))
    {
      boolean bool = str.equals(this.this$1.this$0.getContext().getString(2131625728));
      j = 0;
      if (!bool);
    }
    else
    {
      if (FeedbackCategorySpinner.access$100(this.this$1.this$0) != null)
        FeedbackCategorySpinner.access$100(this.this$1.this$0).onChildClick(paramExpandableListView, paramView, paramInt, -2, paramLong);
      for (int i = 0; i < FeedbackCategorySpinner.DropdownPopup.access$500(this.this$1).getCount(); i++)
        FeedbackCategorySpinner.DropdownPopup.access$500(this.this$1).collapseGroup(i);
      if (FeedbackCategorySpinner.access$400(this.this$1.this$0) != null)
        FeedbackCategorySpinner.access$400(this.this$1.this$0).dismiss();
      j = 1;
    }
    return j;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.feedback.FeedbackCategorySpinner.DropdownPopup.3
 * JD-Core Version:    0.6.0
 */