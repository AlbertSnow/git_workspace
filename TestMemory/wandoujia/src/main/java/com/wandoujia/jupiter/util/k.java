package com.wandoujia.jupiter.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.p4.configs.Config;

final class k
  implements DialogInterface.OnClickListener
{
  k(Context paramContext, n paramn)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AutoInstallGuideUtil.c(this.a);
    Config.d(0);
    paramDialogInterface.dismiss();
    AutoInstallGuideUtil.a("batch_update_dialog", AutoInstallGuideUtil.DialogAction.CLICK_POSITIVE);
    if (this.b != null)
      this.b.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.k
 * JD-Core Version:    0.6.0
 */