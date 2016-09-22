package com.wandoujia.account.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.d.b;
import java.util.HashMap;

final class ai
  implements DialogInterface.OnClickListener
{
  ai(AccountLoginFragment paramAccountLoginFragment)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramDialogInterface != null)
      paramDialogInterface.dismiss();
    HashMap localHashMap = new HashMap();
    localHashMap.put("account_button_click_type", "account_login_cancel");
    String str = "unknown";
    if (this.a.c != null)
      str = this.a.c.m();
    localHashMap.put("account_source", str);
    this.a.getActivity();
    b.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.ai
 * JD-Core Version:    0.6.0
 */