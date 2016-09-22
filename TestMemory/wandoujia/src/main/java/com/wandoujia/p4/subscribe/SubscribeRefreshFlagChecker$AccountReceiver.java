package com.wandoujia.p4.subscribe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.wandoujia.account.a;
import com.wandoujia.account.dto.Role;
import com.wandoujia.account.listener.IAccountListener.LoginType;
import java.io.Serializable;

class SubscribeRefreshFlagChecker$AccountReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getAction();
    if (TextUtils.isEmpty(str));
    do
      while (true)
      {
        return;
        if (!"pheonix.intent.action.LOGIN_SUCCESS".equals(str))
          break;
        Serializable localSerializable = paramIntent.getExtras().getSerializable("pheonix.intent.action.ACCOUNT_LOGIN_TYPE");
        if ((localSerializable == null) || ((IAccountListener.LoginType)localSerializable != IAccountListener.LoginType.LOGIN) || (!a.a(Role.ROLE_SUBSCRIBER)))
          continue;
        SubscribeRefreshFlagChecker.b("SUBSCRIBE");
        return;
      }
    while (!"pheonix.intent.action.LOGOUT_SUCCESS".equals(str));
    SubscribeRefreshFlagChecker.b("SUBSCRIBE");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.SubscribeRefreshFlagChecker.AccountReceiver
 * JD-Core Version:    0.6.0
 */