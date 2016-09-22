package com.wandoujia.p4.feedback;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.PopupWindow;
import java.util.List;

final class s extends PopupWindow
  implements w
{
  private View b;
  private ExpandableListView c;

  public s(FeedbackCategorySpinner paramFeedbackCategorySpinner, View paramView)
  {
    super(paramView);
    this.b = paramView;
    setOnDismissListener(new t(this));
  }

  public final void a()
  {
    setWidth(-1);
    setHeight(-1);
    setFocusable(true);
    update();
    setBackgroundDrawable(new BitmapDrawable());
    showAsDropDown(this.a);
  }

  public final void a(List<String> paramList, List<List<String>> paramList1, String paramString)
  {
    this.c = ((ExpandableListView)this.b);
    this.c.setGroupIndicator(null);
    this.c.setAdapter(new r(this.a, paramList, paramList1, this.c, paramString));
    this.c.setOnChildClickListener(new u(this));
    this.c.setOnGroupClickListener(new v(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.s
 * JD-Core Version:    0.6.0
 */