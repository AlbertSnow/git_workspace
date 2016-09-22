package com.wandoujia.account.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.d.b;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import java.util.HashMap;

final class al
  implements DialogInterface.OnClickListener
{
  al(AccountLoginFragment paramAccountLoginFragment)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramDialogInterface != null)
      paramDialogInterface.dismiss();
    HashMap localHashMap = new HashMap();
    localHashMap.put("account_button_click_type", "account_login_try_again");
    String str = "unknown";
    if (this.a.c != null)
      str = this.a.c.m();
    localHashMap.put("account_source", str);
    this.a.getActivity();
    b.a();
    b.a("Account", ViewLogPackage.Action.REDIRECT, "input_again", Long.valueOf(0L));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.al
 * JD-Core Version:    0.6.0
 */