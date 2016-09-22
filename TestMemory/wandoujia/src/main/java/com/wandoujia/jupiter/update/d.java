package com.wandoujia.jupiter.update;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.p4.views.CommonPopupView;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.view.a.a;
import com.wandoujia.update.protocol.UpdateInfo;
import com.wandoujia.update.protocol.UpdateInfo.SelfUpdatePriority;
import com.wandoujia.update.toolkit.SelfUpdateResult;

final class d extends h
{
  d(UpdateNotification paramUpdateNotification)
  {
  }

  public final boolean a(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return false;
    case 2131492866:
      if (UpdateNotification.a(this.a).isShowing())
        a(paramView, Logger.Module.SELF_UPGRADE, ViewLogPackage.Element.POPUP_BUTTON, ViewLogPackage.Action.UPGRADE, null, null);
      while (true)
      {
        UpdateNotification.b(this.a);
        if (UpdateNotification.c(this.a).updateInfo.getPriority() != UpdateInfo.SelfUpdatePriority.EXTREME)
          UpdateNotification.d(this.a).b();
        return true;
        a(paramView, Logger.Module.SELF_UPGRADE, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.UPGRADE, null, null);
      }
    case 2131492885:
    }
    a(paramView, Logger.Module.SELF_UPGRADE, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.CLOSE, null, null);
    UpdateNotification.d(this.a).b();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.update.d
 * JD-Core Version:    0.6.0
 */