package com.wandoujia.p4.netcheck.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.p4.a;

final class h
  implements View.OnClickListener
{
  h(NetCheckHomeFragment paramNetCheckHomeFragment, CheckBox paramCheckBox)
  {
  }

  public final void onClick(View paramView)
  {
    Object localObject;
    if (!NetworkUtil.isNetworkConnected(a.a()))
      localObject = new NetCheckFailedFragment();
    while (true)
    {
      FragmentActivity localFragmentActivity = this.b.getActivity();
      if (localFragmentActivity != null)
        localFragmentActivity.getSupportFragmentManager().a().b(2131493502, (Fragment)localObject).a();
      return;
      if (this.a.isChecked())
      {
        localObject = new NetCheckCheckingFragment();
        ((NetCheckCheckingFragment)localObject).a();
        continue;
      }
      localObject = new NetCheckCheckingFragment();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.fragment.h
 * JD-Core Version:    0.6.0
 */