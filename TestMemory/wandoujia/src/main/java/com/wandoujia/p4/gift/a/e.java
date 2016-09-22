package com.wandoujia.p4.gift.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.AccountParams.Page;
import com.wandoujia.p4.account.manager.AccountUtil;

final class e
  implements DialogInterface.OnClickListener
{
  e(c paramc)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AccountParams localAccountParams = new AccountParams("giftBean");
    localAccountParams.a(AccountParams.Page.LOG_IN);
    localAccountParams.n();
    localAccountParams.a(false);
    localAccountParams.a(100);
    AccountUtil.a(c.a(this.a), localAccountParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.a.e
 * JD-Core Version:    0.6.0
 */