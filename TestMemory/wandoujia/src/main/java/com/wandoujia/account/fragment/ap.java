package com.wandoujia.account.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.account.d.b;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import java.util.HashMap;

final class ap
  implements View.OnClickListener
{
  ap(AccountLoginFragment paramAccountLoginFragment)
  {
  }

  public final void onClick(View paramView)
  {
    new HashMap().put("account_button_click_type", "account_login_page_register");
    this.a.getActivity();
    b.a();
    b.a(AccountLoginFragment.b(this.a), "Account", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "register");
    AccountLoginFragment.c(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.ap
 * JD-Core Version:    0.6.0
 */