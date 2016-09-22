package com.wandoujia.jupiter.update;

import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.a.a;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;

final class f
  implements a
{
  public final void a(Snackbar paramSnackbar)
  {
    i.k().h().a(paramSnackbar, Logger.Module.SELF_UPGRADE, ViewLogPackage.Element.FOOTER, ViewLogPackage.Action.CLOSE, null, null).c(paramSnackbar);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.update.f
 * JD-Core Version:    0.6.0
 */