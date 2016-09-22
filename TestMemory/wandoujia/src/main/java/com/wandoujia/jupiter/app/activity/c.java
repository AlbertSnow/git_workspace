package com.wandoujia.jupiter.app.activity;

import android.support.v4.app.b;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.model.IncompatibleAppInfo;

final class c
  implements View.OnClickListener
{
  c(IncompatibleDialogActivity paramIncompatibleDialogActivity)
  {
  }

  public final void onClick(View paramView)
  {
    ((de.greenrobot.event.c)i.k().a("event_bus")).d(new com.wandoujia.jupiter.b.a.c(IncompatibleDialogActivity.a(this.a).packageName, false));
    this.a.onBackPressed();
    b.a("incompatible_dialog", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.OPEN, "incompatible_cancel", IncompatibleDialogActivity.a(this.a).packageName);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.app.activity.c
 * JD-Core Version:    0.6.0
 */