package com.wandoujia.p4.feedback;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;

final class u
  implements ExpandableListView.OnChildClickListener
{
  u(s params)
  {
  }

  public final boolean onChildClick(ExpandableListView paramExpandableListView, View paramView, int paramInt1, int paramInt2, long paramLong)
  {
    if (FeedbackCategorySpinner.b(this.a.a) != null)
      FeedbackCategorySpinner.b(this.a.a).onChildClick(paramExpandableListView, paramView, paramInt1, paramInt2, paramLong);
    if (FeedbackCategorySpinner.c(this.a.a) != null)
      FeedbackCategorySpinner.c(this.a.a).dismiss();
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.u
 * JD-Core Version:    0.6.0
 */