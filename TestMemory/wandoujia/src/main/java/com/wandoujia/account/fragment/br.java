package com.wandoujia.account.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.wandoujia.account.d.b;
import com.wandoujia.account.widget.AccountEditText;
import java.util.HashMap;

final class br
  implements DialogInterface.OnClickListener
{
  br(AccountRegisterFragment paramAccountRegisterFragment)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    new HashMap().put("account_username_duplicated", "account_cancel");
    this.a.getActivity();
    b.a();
    AccountRegisterFragment.f(this.a).setText("");
    String str = AccountRegisterFragment.a(this.a).getText().toString();
    if (!TextUtils.isEmpty(str))
      AccountRegisterFragment.a(this.a).setSelection(str.length());
    paramDialogInterface.dismiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.br
 * JD-Core Version:    0.6.0
 */