package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.jupiter.subscribe.a.a;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.p4.subscribe.core.SubscribeManager;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class bl extends h
{
  bl(bk parambk, Model paramModel)
  {
  }

  public final boolean a(View paramView)
  {
    int i;
    View localView;
    String str;
    Logger localLogger;
    Logger.Module localModule;
    ViewLogPackage.Element localElement;
    if (a.b(this.a))
    {
      SubscribeManager.a().f(bk.a(this.b), bk.b(this.b));
      i = 0;
      localView = this.b.e();
      str = this.a.F().package_name;
      localLogger = i.k().h();
      localModule = Logger.Module.APPS;
      localElement = ViewLogPackage.Element.ICON;
      if (i == 0)
        break label133;
    }
    label133: for (ViewLogPackage.Action localAction = ViewLogPackage.Action.MARK_FAVORITE; ; localAction = ViewLogPackage.Action.UNMARK_FAVORITE)
    {
      localLogger.a(localView, localModule, localElement, localAction, str, null);
      this.b.e().setEnabled(false);
      return true;
      SubscribeManager.a().e(bk.a(this.b), bk.b(this.b));
      i = 1;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bl
 * JD-Core Version:    0.6.0
 */