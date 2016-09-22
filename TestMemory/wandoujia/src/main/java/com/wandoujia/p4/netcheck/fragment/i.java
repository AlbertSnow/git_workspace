package com.wandoujia.p4.netcheck.fragment;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.netcheck.controller.NetCheckController;
import com.wandoujia.p4.netcheck.controller.NetCheckController.NetcheckType;

final class i
  implements View.OnClickListener
{
  i(NetCheckPostFailedFragment paramNetCheckPostFailedFragment)
  {
  }

  public final void onClick(View paramView)
  {
    FragmentActivity localFragmentActivity = this.a.getActivity();
    if (localFragmentActivity != null)
      localFragmentActivity.getSupportFragmentManager().a().a(this.a).b();
    NetCheckPostFailedFragment.a(this.a).a(NetCheckController.NetcheckType.RETRY_POST);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.fragment.i
 * JD-Core Version:    0.6.0
 */