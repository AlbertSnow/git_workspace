package com.wandoujia.jupiter.search.fragment;

import android.view.View;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.ripple_framework.view.ab;

final class b
  implements ab
{
  b(SearchHomeFragment paramSearchHomeFragment)
  {
  }

  public final void a(View paramView)
  {
    View localView = paramView.findViewById(2131493769);
    if (localView == null)
      return;
    if (!OemUtil.canShowFeedbackEntry())
    {
      localView.setVisibility(8);
      return;
    }
    localView.setOnClickListener(new c(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.fragment.b
 * JD-Core Version:    0.6.0
 */