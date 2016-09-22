package com.wandoujia.account.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.account.d.b;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

final class cd
  implements View.OnClickListener
{
  cd(AccountResetEmailFragment paramAccountResetEmailFragment)
  {
  }

  public final void onClick(View paramView)
  {
    AccountResetEmailFragment.c(this.a);
    AccountResetEmailFragment.d(this.a);
    b.a(AccountResetEmailFragment.e(this.a), "Account", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "sendactivation");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.cd
 * JD-Core Version:    0.6.0
 */