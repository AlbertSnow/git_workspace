package com.wandoujia.account.fragment;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.FragmentActivity;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.R.string;
import com.wandoujia.account.widget.AccountEditText;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import java.util.HashMap;

final class ah
  implements DialogInterface.OnClickListener
{
  ah(AccountLoginFragment paramAccountLoginFragment)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.a.c == null)
      this.a.c = new AccountParams("unknown", 0);
    this.a.f.b(AccountLoginFragment.f(this.a).getText().toString(), this.a.c.m(), "", "REGISTER_TAG", AccountLoginFragment.h(this.a));
    AccountLoginFragment.a(this.a, "REGISTER_TAG");
    if (this.a.e != null)
      this.a.e.dismiss();
    this.a.e = ProgressDialog.show(this.a.getActivity(), "", this.a.getActivity().getString(R.string.account_sdk_netop_submitting_register));
    this.a.e.show();
    HashMap localHashMap = new HashMap();
    localHashMap.put("account_button_click_type", "account_login_register");
    String str = "unknown";
    if (this.a.c != null)
      str = this.a.c.m();
    localHashMap.put("account_source", str);
    this.a.getActivity();
    com.wandoujia.account.d.b.a();
    com.wandoujia.account.d.b.a(TaskEvent.Action.SIGN_UP, TaskEvent.Result.SUCCESS, "login_fragment_one_key_register");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.ah
 * JD-Core Version:    0.6.0
 */