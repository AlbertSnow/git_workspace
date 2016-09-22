package com.wandoujia.jupiter.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.p4.configs.Config;

final class j
  implements DialogInterface.OnClickListener
{
  j(int paramInt, n paramn)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Config.d(1 + this.a);
    paramDialogInterface.dismiss();
    AutoInstallGuideUtil.a("batch_update_dialog", AutoInstallGuideUtil.DialogAction.CLICK_NEGATIVE);
    if (this.b != null)
      this.b.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.j
 * JD-Core Version:    0.6.0
 */