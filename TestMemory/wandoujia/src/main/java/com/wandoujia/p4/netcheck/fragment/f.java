package com.wandoujia.p4.netcheck.fragment;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.view.View;
import android.view.View.OnClickListener;

final class f
  implements View.OnClickListener
{
  f(NetCheckFailedFragment paramNetCheckFailedFragment)
  {
  }

  public final void onClick(View paramView)
  {
    FragmentActivity localFragmentActivity = this.a.getActivity();
    if (localFragmentActivity != null)
      localFragmentActivity.getSupportFragmentManager().a().b(2131493502, new NetCheckHomeFragment()).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.fragment.f
 * JD-Core Version:    0.6.0
 */