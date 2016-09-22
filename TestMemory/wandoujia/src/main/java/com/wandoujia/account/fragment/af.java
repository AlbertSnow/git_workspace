package com.wandoujia.account.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.R.id;
import com.wandoujia.account.f.b;
import com.wandoujia.account.widget.AccountEditText;
import com.wandoujia.account.widget.a;

final class af
  implements DialogInterface.OnClickListener
{
  af(AccountLoginFragment paramAccountLoginFragment)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = ((EditText)((a)paramDialogInterface).findViewById(R.id.account_captcha_edit)).getText().toString();
    this.a.f.a(AccountLoginFragment.f(this.a).getText().toString(), AccountLoginFragment.g(this.a).getText().toString(), str, this.a.c.m(), "LOGIN_TAG", AccountLoginFragment.h(this.a));
    AccountLoginFragment.a(this.a, "LOGIN_TAG");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.af
 * JD-Core Version:    0.6.0
 */