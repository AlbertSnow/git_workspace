package com.wandoujia.jupiter.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class f
  implements DialogInterface.OnCancelListener
{
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AutoInstallGuideUtil.a("first_install_dialog", AutoInstallGuideUtil.DialogAction.CANCEL);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.f
 * JD-Core Version:    0.6.0
 */