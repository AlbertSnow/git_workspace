package com.wandoujia.jupiter.presenter;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;

final class cz
  implements DialogInterface.OnClickListener
{
  cz(String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ((AppTaskManager)i.k().a("app_task")).b(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.cz
 * JD-Core Version:    0.6.0
 */