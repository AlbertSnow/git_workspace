package com.wandoujia.jupiter.presenter;

import android.text.TextUtils;
import android.view.View;
import com.wandoujia.api.proto.Action;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.action.ActionType;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class d extends h
{
  d(Model paramModel, Action paramAction)
  {
    super(paramModel);
  }

  public final boolean a(View paramView)
  {
    ((NavigationManager)i.k().a("navigation")).a(paramView.getContext(), this.a);
    if (this.a == null)
      return false;
    if ((this.a.type == null) || (ActionType.REDIRECT.ordinal() == this.a.type.intValue()))
    {
      Logger.Module localModule = Logger.Module.UI;
      ViewLogPackage.Element localElement = ViewLogPackage.Element.BUTTON;
      ViewLogPackage.Action localAction = ViewLogPackage.Action.REDIRECT;
      if (TextUtils.isEmpty(this.a.intent));
      for (String str = this.a.url; ; str = this.a.intent)
      {
        a(paramView, localModule, localElement, localAction, str, null);
        return true;
      }
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.d
 * JD-Core Version:    0.6.0
 */