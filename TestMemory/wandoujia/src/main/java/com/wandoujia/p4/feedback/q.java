package com.wandoujia.p4.feedback;

import android.content.Context;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.TextView;
import com.wandoujia.ripple_framework.view.a.a;

final class q
  implements ExpandableListView.OnGroupClickListener
{
  q(n paramn)
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
      for (int i = 0; i < n.b(this.a).getCount(); i++)
        n.b(this.a).collapseGroup(i);
      if (n.a(this.a) != null)
        n.a(this.a).dismiss();
      j = 1;
    }
    return j;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.q
 * JD-Core Version:    0.6.0
 */