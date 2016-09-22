package com.wandoujia.ripple_framework.c;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

public final class g extends c
{
  protected final void a(Model paramModel)
  {
    Logger localLogger = i.k().h();
    View localView = e();
    Logger.Module localModule = Logger.Module.UI;
    ViewLogPackage.Element localElement = ViewLogPackage.Element.CARD;
    ViewLogPackage.Action localAction = ViewLogPackage.Action.REDIRECT;
    if (paramModel == null);
    for (String str = null; ; str = paramModel.n())
    {
      localLogger.a(localView, localModule, localElement, localAction, str, null).a(e(), paramModel);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.g
 * JD-Core Version:    0.6.0
 */