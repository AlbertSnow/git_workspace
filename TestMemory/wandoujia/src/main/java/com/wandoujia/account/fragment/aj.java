package com.wandoujia.account.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.AccountParams.Page;
import com.wandoujia.account.widget.AccountEditText;

final class aj
  implements DialogInterface.OnClickListener
{
  aj(AccountLoginFragment paramAccountLoginFragment)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.a.c == null)
      this.a.c = new AccountParams("unknown", 0);
    this.a.c.a(AccountLoginFragment.f(this.a).getText().toString());
    this.a.c.a(AccountParams.Page.EMAIL_REGISTER);
    AccountLoginFragment.c(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.aj
 * JD-Core Version:    0.6.0
 */