package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class dm extends c
{
  dm(dr paramdr)
  {
  }

  protected final void a(Model paramModel)
  {
    if (paramModel == null)
      return;
    dn localdn = new dn(this, paramModel, paramModel);
    View localView = e();
    Logger.Module localModule = Logger.Module.WELCOME;
    ViewLogPackage.Element localElement = ViewLogPackage.Element.CARD;
    if (aa.a(paramModel, this.a, false));
    for (ViewLogPackage.Action localAction = ViewLogPackage.Action.SELECT; ; localAction = ViewLogPackage.Action.UNSELECT)
    {
      localdn.a(localView, localModule, localElement, localAction, paramModel.n(), null);
      e().setOnClickListener(localdn);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.dm
 * JD-Core Version:    0.6.0
 */