package com.wandoujia.p4.gift.activity;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.AccountParams.Page;

final class a
  implements DialogInterface.OnClickListener
{
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AccountParams localAccountParams = new AccountParams("myGift");
    localAccountParams.a(AccountParams.Page.TEL_REGISTER);
    localAccountParams.n();
    localAccountParams.a(false);
    localAccountParams.a(100);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.activity.a
 * JD-Core Version:    0.6.0
 */