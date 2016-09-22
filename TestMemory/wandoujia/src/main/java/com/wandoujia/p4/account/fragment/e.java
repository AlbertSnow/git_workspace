package com.wandoujia.p4.account.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.pay.activity.RechargeActivity;

final class e
  implements View.OnClickListener
{
  e(AccountProfileFragment paramAccountProfileFragment)
  {
  }

  public final void onClick(View paramView)
  {
    RechargeActivity.launch(this.a.getActivity());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.fragment.e
 * JD-Core Version:    0.6.0
 */