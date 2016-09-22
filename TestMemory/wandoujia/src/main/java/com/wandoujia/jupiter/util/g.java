package com.wandoujia.jupiter.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class g
  implements DialogInterface.OnClickListener
{
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    AutoInstallGuideUtil.a("first_install_dialog", AutoInstallGuideUtil.DialogAction.CLICK_NEGATIVE);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.g
 * JD-Core Version:    0.6.0
 */