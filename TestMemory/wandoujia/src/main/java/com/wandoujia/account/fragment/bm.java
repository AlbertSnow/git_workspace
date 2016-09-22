package com.wandoujia.account.fragment;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.FragmentActivity;
import android.widget.EditText;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.string;
import com.wandoujia.account.f.b;
import com.wandoujia.account.widget.AccountEditText;
import com.wandoujia.account.widget.a;

final class bm
  implements DialogInterface.OnClickListener
{
  bm(AccountRegisterFragment paramAccountRegisterFragment)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = ((EditText)((a)paramDialogInterface).findViewById(R.id.account_captcha_edit)).getText().toString();
    if (!AccountRegisterFragment.g(this.a))
      this.a.f.a(AccountRegisterFragment.a(this.a).getText().toString(), AccountRegisterFragment.f(this.a).getText().toString(), str, this.a.c.m(), AccountRegisterFragment.j(this.a));
    while (true)
    {
      if (this.a.e != null)
        this.a.e.dismiss();
      this.a.e = ProgressDialog.show(this.a.getActivity(), "", this.a.getActivity().getString(R.string.account_sdk_netop_submitting_register));
      this.a.e.show();
      return;
      this.a.f.b(AccountRegisterFragment.a(this.a).getText().toString(), this.a.c.m(), str, "REGISTER_TAG", AccountRegisterFragment.j(this.a));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.bm
 * JD-Core Version:    0.6.0
 */