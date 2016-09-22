package com.wandoujia.p4.views;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.utils.c;

final class s
  implements View.OnClickListener
{
  s(ViewPager paramViewPager, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    if (paramView.isSelected())
    {
      c.b(paramView.getContext());
      return;
    }
    this.a.a(this.b, false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.s
 * JD-Core Version:    0.6.0
 */