package com.wandoujia.p4.community.views;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.utils.c;

final class d
  implements View.OnClickListener
{
  d(ViewPager paramViewPager, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    if (paramView.isSelected())
    {
      c.b(paramView.getContext());
      return;
    }
    this.a.setCurrentItem(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.d
 * JD-Core Version:    0.6.0
 */