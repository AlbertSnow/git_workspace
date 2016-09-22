package com.wandoujia.ripple_framework.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.ripple_framework.b.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

final class bc
  implements DialogInterface.OnClickListener
{
  bc(az paramaz)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ((c)i.k().a("navigation")).c(this.a.f(), this.a.i().H());
    i.k().h().a(Logger.Module.ITEM, ViewLogPackage.Action.OPEN_IN_BROWSER, this.a.i().H(), null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bc
 * JD-Core Version:    0.6.0
 */