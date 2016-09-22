package com.wandoujia.p4.campaign;

import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;

final class f
  implements Runnable
{
  f(e parame, ViewLogPackage.Element paramElement, ViewLogPackage.Action paramAction, String paramString)
  {
  }

  public final void run()
  {
    i.k().h().a(e.a(this.d), Logger.Module.UI, this.a, this.b, this.c, null).c(e.a(this.d));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.f
 * JD-Core Version:    0.6.0
 */