package com.wandoujia.p4.pay.fragment;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.p4.pay.utils.LogEvent;

class PayFragment$11
  implements DialogInterface.OnClickListener
{
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    LogEvent.click(this.val$page, "yes");
    this.val$ok.onClick(paramDialogInterface, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.fragment.PayFragment.11
 * JD-Core Version:    0.6.0
 */