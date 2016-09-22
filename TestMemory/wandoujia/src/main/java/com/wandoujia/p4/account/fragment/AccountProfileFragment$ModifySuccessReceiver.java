package com.wandoujia.p4.account.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class AccountProfileFragment$ModifySuccessReceiver extends BroadcastReceiver
{
  AccountProfileFragment$ModifySuccessReceiver(AccountProfileFragment paramAccountProfileFragment)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("account.intent.action.MODIFY_SUCCESS".equals(paramIntent.getAction()))
    {
      this.a.a();
      AccountProfileFragment.j(this.a);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.fragment.AccountProfileFragment.ModifySuccessReceiver
 * JD-Core Version:    0.6.0
 */