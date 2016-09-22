package com.wandoujia.p4.feedback;

import android.content.Context;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.TextView;

final class v
  implements ExpandableListView.OnGroupClickListener
{
  v(s params)
  {
  }

  public final boolean onGroupClick(ExpandableListView paramExpandableListView, View paramView, int paramInt, long paramLong)
  {
    String str = ((TextView)paramView).getText().toString();
    int j;
    if (!str.equals(this.a.a.getContext().getString(2131624754)))
    {
      boolean bool = str.equals(this.a.a.getContext().getString(2131624739));
      j = 0;
      if (!bool);
    }
    else
    {
      if (FeedbackCategorySpinner.b(this.a.a) != null)
        FeedbackCategorySpinner.b(this.a.a).onChildClick(paramExpandableListView, paramView, paramInt, -2, paramLong);
      for (int i = 0; i < s.a(this.a).getCount(); i++)
        s.a(this.a).collapseGroup(i);
      if (FeedbackCategorySpinner.c(this.a.a) != null)
        FeedbackCategorySpinner.c(this.a.a).dismiss();
      j = 1;
    }
    return j;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.v
 * JD-Core Version:    0.6.0
 */