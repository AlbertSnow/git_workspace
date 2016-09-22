package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.jupiter.b.b.a;
import com.wandoujia.jupiter.b.b.b;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;
import de.greenrobot.event.c;

final class dn extends h
{
  dn(dm paramdm, Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    Logger.Module localModule;
    ViewLogPackage.Element localElement;
    if (aa.a(this.a, this.b.a, false))
    {
      paramView.findViewById(2131493666).setBackgroundResource(2130838302);
      this.a.a(2131493666, Boolean.FALSE);
      ((c)i.k().a("event_bus")).d(new b(this.a, false));
      ((c)i.k().a("event_bus")).d(new a());
      localModule = Logger.Module.WELCOME;
      localElement = ViewLogPackage.Element.CARD;
      if (!aa.a(this.a, this.b.a, false))
        break label191;
    }
    label191: for (ViewLogPackage.Action localAction = ViewLogPackage.Action.SELECT; ; localAction = ViewLogPackage.Action.UNSELECT)
    {
      a(paramView, localModule, localElement, localAction, this.a.n(), null);
      return true;
      paramView.findViewById(2131493666).setBackgroundResource(2130838301);
      this.a.a(2131493666, Boolean.TRUE);
      ((c)i.k().a("event_bus")).d(new b(this.a, true));
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.dn
 * JD-Core Version:    0.6.0
 */