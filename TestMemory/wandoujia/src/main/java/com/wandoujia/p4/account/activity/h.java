package com.wandoujia.p4.account.activity;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class h
  implements DialogInterface.OnClickListener
{
  h(g paramg)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AccountBindActivity.a(this.a.a.a, false);
    paramDialogInterface.dismiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.h
 * JD-Core Version:    0.6.0
 */