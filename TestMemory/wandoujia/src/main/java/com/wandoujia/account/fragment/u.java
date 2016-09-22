package com.wandoujia.account.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.wandoujia.account.AccountErrorType;
import com.wandoujia.account.R.string;
import com.wandoujia.base.utils.KeyboardUtils;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

final class u
  implements View.OnClickListener
{
  u(AccountForgetPasswordFragment paramAccountForgetPasswordFragment)
  {
  }

  public final void onClick(View paramView)
  {
    String str = AccountForgetPasswordFragment.a(this.a).getText().toString().trim();
    if (str.isEmpty())
    {
      AccountForgetPasswordFragment.b(this.a).setText(R.string.account_sdk_forget_password_user_name_hit);
      AccountForgetPasswordFragment.b(this.a).setVisibility(0);
      return;
    }
    AccountForgetPasswordFragment.a(this.a, str);
    if (android.support.v4.app.b.t(str) == AccountErrorType.OK)
    {
      AccountForgetPasswordFragment.b(this.a, str);
      AccountForgetPasswordFragment.c(this.a).setEnabled(false);
      com.wandoujia.account.d.b.a(AccountForgetPasswordFragment.c(this.a), "Account", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "telephone");
    }
    while (true)
    {
      KeyboardUtils.hideSoftInput(AccountForgetPasswordFragment.c(this.a));
      return;
      if (android.support.v4.app.b.s(str) == AccountErrorType.OK)
      {
        AccountForgetPasswordFragment.b(this.a, str);
        AccountForgetPasswordFragment.c(this.a).setEnabled(false);
        com.wandoujia.account.d.b.a(AccountForgetPasswordFragment.c(this.a), "Account", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "email");
        continue;
      }
      AccountForgetPasswordFragment.b(this.a).setText(R.string.account_sdk_forget_password_user_name_hit);
      AccountForgetPasswordFragment.b(this.a).setVisibility(0);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.u
 * JD-Core Version:    0.6.0
 */