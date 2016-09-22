package com.wandoujia.p4.settings;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.base.utils.ThreadPool;

final class t
  implements DialogInterface.OnClickListener
{
  t(MainSettingActivity paramMainSettingActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ThreadPool.execute(new u(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.t
 * JD-Core Version:    0.6.0
 */