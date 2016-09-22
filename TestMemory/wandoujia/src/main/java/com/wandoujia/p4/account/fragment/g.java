package com.wandoujia.p4.account.fragment;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.p4.pay.activity.MyBonusActivity;

final class g
  implements View.OnClickListener
{
  g(AccountProfileFragment paramAccountProfileFragment)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.a.getActivity(), MyBonusActivity.class);
    this.a.startActivity(localIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.fragment.g
 * JD-Core Version:    0.6.0
 */