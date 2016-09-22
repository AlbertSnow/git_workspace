package com.wandoujia.jupiter.update;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.update.protocol.UpdateInfo;
import com.wandoujia.update.protocol.UpdateInfo.SelfUpdatePriority;
import com.wandoujia.update.toolkit.SelfUpdateResult;

final class h
  implements DialogInterface.OnClickListener
{
  h(UpdateNotification paramUpdateNotification)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    i.k().h().a(Logger.Module.SELF_UPGRADE, ViewLogPackage.Action.POPUP, "upgrade_dialog_ignore", Long.valueOf(UpdateNotification.c(this.a).updateInfo.getPriority().ordinal()));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.update.h
 * JD-Core Version:    0.6.0
 */