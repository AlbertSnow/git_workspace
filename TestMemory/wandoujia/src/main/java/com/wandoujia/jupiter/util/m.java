package com.wandoujia.jupiter.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class m
  implements DialogInterface.OnCancelListener
{
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AutoInstallGuideUtil.a("popup_on_terminated", AutoInstallGuideUtil.DialogAction.CANCEL);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.m
 * JD-Core Version:    0.6.0
 */