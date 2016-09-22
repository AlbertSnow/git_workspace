package com.wandoujia.p4.account.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

class AccountBasicInfoView$AccountChangeReceiver extends BroadcastReceiver
{
  private WeakReference<AccountBasicInfoView> a;

  public AccountBasicInfoView$AccountChangeReceiver(AccountBasicInfoView paramAccountBasicInfoView)
  {
    this.a = new WeakReference(paramAccountBasicInfoView);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AccountBasicInfoView localAccountBasicInfoView = (AccountBasicInfoView)this.a.get();
    if (localAccountBasicInfoView == null);
    String str;
    do
    {
      do
      {
        do
          return;
        while (paramIntent == null);
        str = paramIntent.getAction();
      }
      while (TextUtils.isEmpty(str));
      if ((!str.equals("pheonix.intent.action.LOGIN_SUCCESS")) && (!str.equals("pheonix.intent.action.REGISTER_SUCCESS")) && (!str.equals("account.intent.action.MODIFY_SUCCESS")))
        continue;
      AccountBasicInfoView.a(localAccountBasicInfoView);
      return;
    }
    while (!str.equals("pheonix.intent.action.LOGOUT_SUCCESS"));
    AccountBasicInfoView.b(localAccountBasicInfoView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.view.AccountBasicInfoView.AccountChangeReceiver
 * JD-Core Version:    0.6.0
 */