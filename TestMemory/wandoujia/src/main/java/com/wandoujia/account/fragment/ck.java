package com.wandoujia.account.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.wandoujia.account.d.b;
import com.wandoujia.base.utils.KeyboardUtils;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

final class ck
  implements View.OnClickListener
{
  ck(AccountResetPasswordFragment paramAccountResetPasswordFragment)
  {
  }

  public final void onClick(View paramView)
  {
    if (AccountResetPasswordFragment.d(this.a).getText().toString().trim().isEmpty())
    {
      AccountResetPasswordFragment.e(this.a).setVisibility(0);
      return;
    }
    String str = AccountResetPasswordFragment.f(this.a).getText().toString().trim();
    if ((str.isEmpty()) || (str.length() < 8) || (str.matches("\\d+")))
    {
      AccountResetPasswordFragment.f(this.a).setText("");
      AccountResetPasswordFragment.g(this.a).setVisibility(0);
      return;
    }
    AccountResetPasswordFragment.h(this.a);
    AccountResetPasswordFragment.i(this.a);
    KeyboardUtils.hideSoftInput(paramView);
    AccountResetPasswordFragment.a(this.a, "reset_password");
    b.a(TaskEvent.Action.RESET, TaskEvent.Result.SUCCESS, this.a.g());
    b.a(AccountResetPasswordFragment.j(this.a), "Account", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "login");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.ck
 * JD-Core Version:    0.6.0
 */