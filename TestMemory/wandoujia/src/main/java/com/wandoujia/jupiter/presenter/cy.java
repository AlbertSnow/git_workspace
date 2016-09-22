package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.view.View;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.rootkit.b;

final class cy extends com.wandoujia.ripple_framework.log.h
{
  cy(Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    String str = this.a.F().package_name;
    if (b.a().c())
    {
      com.wandoujia.ripple_framework.view.a.h localh = new com.wandoujia.ripple_framework.view.a.h(paramView.getContext());
      Context localContext = paramView.getContext();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a.n();
      localh.a(localContext.getString(2131625533, arrayOfObject));
      localh.a(2131625532, new cz(str));
      localh.b(2131624330, null);
      localh.b();
    }
    while (true)
    {
      a(paramView, Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.UNINSTALL, str, null);
      return true;
      ((AppTaskManager)i.k().a("app_task")).b(str);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.cy
 * JD-Core Version:    0.6.0
 */