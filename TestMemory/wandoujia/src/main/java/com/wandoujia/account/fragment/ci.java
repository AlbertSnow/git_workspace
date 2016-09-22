package com.wandoujia.account.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.account.d.b;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

final class ci
  implements View.OnClickListener
{
  ci(AccountResetPasswordFragment paramAccountResetPasswordFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AccountResetPasswordFragment.a(this.a);
    AccountResetPasswordFragment.b(this.a);
    b.a(AccountResetPasswordFragment.c(this.a), "Account", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "sendactivation");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.ci
 * JD-Core Version:    0.6.0
 */