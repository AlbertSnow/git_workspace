package com.wandoujia.p4.feedback;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import com.wandoujia.ripple_framework.view.a.a;

final class p
  implements ExpandableListView.OnChildClickListener
{
  p(n paramn)
  {
  }

  public final boolean onChildClick(ExpandableListView paramExpandableListView, View paramView, int paramInt1, int paramInt2, long paramLong)
  {
    if (FeedbackCategorySpinner.b(this.a.a) != null)
      FeedbackCategorySpinner.b(this.a.a).onChildClick(paramExpandableListView, paramView, paramInt1, paramInt2, paramLong);
    if (n.a(this.a) != null)
      n.a(this.a).dismiss();
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.p
 * JD-Core Version:    0.6.0
 */