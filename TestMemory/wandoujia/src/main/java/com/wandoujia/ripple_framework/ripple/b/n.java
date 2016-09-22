package com.wandoujia.ripple_framework.ripple.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.wandoujia.api.proto.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.navigation.a;

final class n
  implements DialogInterface.OnClickListener
{
  n(l paraml, Intent paramIntent, Model paramModel)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    i.k().a("navigation");
    a.a(this.c.f(), this.a);
    Logger localLogger = i.k().h();
    Logger.Module localModule = Logger.Module.ITEM;
    ViewLogPackage.Action localAction = ViewLogPackage.Action.OPEN_IN_APP;
    if (this.b.t().intent != null);
    for (String str = this.b.t().intent; ; str = this.b.t().url)
    {
      localLogger.a(localModule, localAction, str, null);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.b.n
 * JD-Core Version:    0.6.0
 */