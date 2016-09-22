package com.wandoujia.account.fragment;

import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.R.id;
import com.wandoujia.account.d.b;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

final class cp
  implements View.OnClickListener
{
  cp(AccountResetPasswordFragment paramAccountResetPasswordFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.a.c != null);
    for (AccountParams localAccountParams = this.a.c; ; localAccountParams = new AccountParams("reset_password", 0))
    {
      localAccountParams.a(AccountResetPasswordFragment.m(this.a));
      localAccountParams.n();
      localAccountParams.a(false);
      Bundle localBundle = new Bundle(this.a.getArguments());
      localBundle.putParcelable("account.intent.extra.ACCOUNT_PARAMS", localAccountParams);
      AccountLoginFragment localAccountLoginFragment = AccountLoginFragment.a(localBundle);
      ac localac = this.a.d().a();
      if (this.a.d().e() > 0)
        this.a.d().d();
      localac.b(R.id.account_fragment_layout, localAccountLoginFragment, "login");
      localac.a();
      b.a(AccountResetPasswordFragment.n(this.a), "Account", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "rememberpassword");
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.cp
 * JD-Core Version:    0.6.0
 */