package com.wandoujia.accessibility.hibernation.fragment;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.q;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.accessibility.hibernation.activity.b;

final class l
  implements View.OnClickListener
{
  l(OnBoardFragment paramOnBoardFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (OnBoardFragment.d(this.a).getCurrentItem() < -1 + OnBoardFragment.b(this.a).length)
      OnBoardFragment.d(this.a).a(1 + OnBoardFragment.d(this.a).getCurrentItem(), true);
    do
    {
      return;
      this.a.getActivity().getSupportFragmentManager().c();
    }
    while (OnBoardFragment.e(this.a) == null);
    OnBoardFragment.e(this.a).b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.fragment.l
 * JD-Core Version:    0.6.0
 */