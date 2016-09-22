package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.AccountParams.Page;
import com.wandoujia.account.a;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.p4.account.manager.AccountUtil;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class du extends h
{
  public final boolean a(View paramView)
  {
    AccountParams localAccountParams = new AccountParams("login card", 0);
    if (!a.w())
      localAccountParams.a(AccountParams.Page.TEL_REGISTER);
    while (true)
    {
      localAccountParams.n();
      localAccountParams.a(true);
      AccountUtil.a(paramView.getContext(), localAccountParams);
      a(paramView, Logger.Module.UI, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "register_button_presenter", null);
      return true;
      localAccountParams.a(AccountParams.Page.LOG_IN);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.du
 * JD-Core Version:    0.6.0
 */