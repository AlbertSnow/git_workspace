package com.wandoujia.jupiter.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class h
  implements DialogInterface.OnClickListener
{
  h(Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AutoInstallGuideUtil.c(this.a);
    AutoInstallGuideUtil.a("first_install_dialog", AutoInstallGuideUtil.DialogAction.CLICK_POSITIVE);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.h
 * JD-Core Version:    0.6.0
 */