package com.wandoujia.jupiter.update;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.p4.views.CommonPopupView;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.view.a.a;
import com.wandoujia.update.protocol.UpdateInfo;
import com.wandoujia.update.protocol.UpdateInfo.SelfUpdatePriority;
import com.wandoujia.update.toolkit.SelfUpdateResult;

final class g extends ClickableSpan
{
  g(UpdateNotification paramUpdateNotification)
  {
  }

  public final void onClick(View paramView)
  {
    UpdateNotification.a(this.a).dismiss();
    i.k().h().a(Logger.Module.SELF_UPGRADE, ViewLogPackage.Action.POPUP, "upgrade_dialog_more_info", Long.valueOf(UpdateNotification.c(this.a).updateInfo.getPriority().ordinal()));
    UpdateNotification.e(this.a);
    UpdateNotification.d(this.a).a();
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.update.g
 * JD-Core Version:    0.6.0
 */