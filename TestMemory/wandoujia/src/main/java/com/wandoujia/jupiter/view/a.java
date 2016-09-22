package com.wandoujia.jupiter.view;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.AccountParams.Page;
import com.wandoujia.p4.account.activity.AccountProfileActivity;
import com.wandoujia.p4.account.manager.AccountUtil;
import com.wandoujia.ripple_framework.log.h;

final class a extends h
{
  a(AccountView paramAccountView)
  {
  }

  public final boolean a(View paramView)
  {
    if (TextUtils.isEmpty(com.wandoujia.account.a.i()))
    {
      AccountParams localAccountParams = new AccountParams("account_lib_header", 0);
      if (!com.wandoujia.account.a.w())
        localAccountParams.a(AccountParams.Page.TEL_REGISTER);
      while (true)
      {
        localAccountParams.n();
        localAccountParams.a(true);
        AccountUtil.a(this.a.getContext(), localAccountParams);
        return false;
        localAccountParams.a(AccountParams.Page.LOG_IN);
      }
    }
    Intent localIntent = new Intent(this.a.getContext(), AccountProfileActivity.class);
    this.a.getContext().startActivity(localIntent);
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.a
 * JD-Core Version:    0.6.0
 */