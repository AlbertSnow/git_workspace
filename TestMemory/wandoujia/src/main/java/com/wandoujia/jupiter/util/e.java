package com.wandoujia.jupiter.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class e
  implements DialogInterface.OnClickListener
{
  e(Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AutoInstallGuideUtil.c(this.a);
    AutoInstallGuideUtil.a("popup_on_terminated", AutoInstallGuideUtil.DialogAction.CLICK_POSITIVE);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.e
 * JD-Core Version:    0.6.0
 */