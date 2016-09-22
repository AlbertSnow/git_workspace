package com.wandoujia.p4.feedback;

import android.view.View;
import android.widget.ExpandableListView;
import com.wandoujia.ripple_framework.view.a.a;
import com.wandoujia.ripple_framework.view.a.h;
import java.util.List;

final class n
  implements w
{
  private a b;
  private ExpandableListView c;

  public n(FeedbackCategorySpinner paramFeedbackCategorySpinner, View paramView)
  {
    this.c = ((ExpandableListView)paramView);
  }

  public final void a()
  {
    if (this.b != null)
    {
      this.b.show();
      return;
    }
    FeedbackCategorySpinner.a(this.a, new h(this.a.getContext()));
    FeedbackCategorySpinner.a(this.a).a(this.c);
    this.b = FeedbackCategorySpinner.a(this.a).b();
    this.b.setOnDismissListener(new o(this));
  }

  public final void a(List<String> paramList, List<List<String>> paramList1, String paramString)
  {
    this.c.setGroupIndicator(null);
    this.c.setAdapter(new r(this.a, paramList, paramList1, this.c, paramString));
    this.c.setOnChildClickListener(new p(this));
    this.c.setOnGroupClickListener(new q(this));
  }

  public final void dismiss()
  {
    this.b.dismiss();
    this.b = null;
  }

  public final boolean isShowing()
  {
    if (this.b != null)
      return this.b.isShowing();
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.n
 * JD-Core Version:    0.6.0
 */