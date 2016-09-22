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

final class ce
  implements View.OnClickListener
{
  ce(AccountResetEmailFragment paramAccountResetEmailFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.a.c != null);
    for (AccountParams localAccountParams = this.a.c; ; localAccountParams = new AccountParams("RESET_EMAIL", 0))
    {
      localAccountParams.a(AccountResetEmailFragment.f(this.a));
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
      b.a(AccountResetEmailFragment.g(this.a), "Account", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "relogin");
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.ce
 * JD-Core Version:    0.6.0
 */