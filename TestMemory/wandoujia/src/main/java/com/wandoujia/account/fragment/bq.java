package com.wandoujia.account.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.d.b;
import com.wandoujia.account.widget.AccountEditText;
import java.util.HashMap;

final class bq
  implements DialogInterface.OnClickListener
{
  bq(AccountRegisterFragment paramAccountRegisterFragment)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    new HashMap().put("account_username_duplicated", "account_login");
    this.a.getActivity();
    b.a();
    if (this.a.b == null)
      this.a.b = new Bundle();
    if (this.a.c == null)
      this.a.c = new AccountParams("unknown", 0);
    this.a.c.a(AccountRegisterFragment.a(this.a).getText().toString());
    this.a.b.putParcelable("account.intent.extra.ACCOUNT_PARAMS", this.a.c);
    AccountRegisterFragment.d(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.bq
 * JD-Core Version:    0.6.0
 */