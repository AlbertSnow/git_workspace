package com.wandoujia.account.fragment;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.account.d.b;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

final class cc
  implements View.OnClickListener
{
  cc(AccountResetEmailFragment paramAccountResetEmailFragment)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(AccountResetEmailFragment.a(this.a)));
    this.a.startActivity(localIntent);
    b.a(AccountResetEmailFragment.b(this.a), "Account", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REDIRECT, "openbrowser");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.cc
 * JD-Core Version:    0.6.0
 */