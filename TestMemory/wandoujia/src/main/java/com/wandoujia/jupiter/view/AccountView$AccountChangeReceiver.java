package com.wandoujia.jupiter.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

class AccountView$AccountChangeReceiver extends BroadcastReceiver
{
  private WeakReference<AccountView> a;

  public AccountView$AccountChangeReceiver(AccountView paramAccountView)
  {
    this.a = new WeakReference(paramAccountView);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AccountView localAccountView = (AccountView)this.a.get();
    if (localAccountView == null);
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
      AccountView.b(localAccountView);
      return;
    }
    while (!str.equals("pheonix.intent.action.LOGOUT_SUCCESS"));
    AccountView.c(localAccountView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.AccountView.AccountChangeReceiver
 * JD-Core Version:    0.6.0
 */