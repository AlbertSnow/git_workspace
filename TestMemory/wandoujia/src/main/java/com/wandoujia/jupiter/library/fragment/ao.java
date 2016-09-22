package com.wandoujia.jupiter.library.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.view.View;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.jupiter.c.h;
import com.wandoujia.jupiter.subscribe.a.a;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.p4.subscribe.core.SubscribeManager;
import com.wandoujia.p4.subscribe.core.b;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

public final class ao
{
  private ActionMenuItemView a;
  private Context b;
  private Model c;
  private b d;
  private ap e;

  public ao(Context paramContext, ActionMenuItemView paramActionMenuItemView, Model paramModel)
  {
    this.b = paramContext;
    this.a = paramActionMenuItemView;
    this.c = paramModel;
    this.d = new h(paramContext, paramModel);
    this.e = new ap(this);
    SubscribeManager.a().a(this.e);
    c();
  }

  private void a(View paramView, boolean paramBoolean)
  {
    Logger localLogger = i.k().h();
    Logger.Module localModule = Logger.Module.UI;
    ViewLogPackage.Element localElement = ViewLogPackage.Element.MENU_ITEM;
    if (paramBoolean);
    for (ViewLogPackage.Action localAction = ViewLogPackage.Action.MARK_FAVORITE; ; localAction = ViewLogPackage.Action.UNMARK_FAVORITE)
    {
      localLogger.a(paramView, localModule, localElement, localAction, this.c.F().package_name, null).c(paramView);
      return;
    }
  }

  private void c()
  {
    if (this.c == null)
      return;
    ActionMenuItemView localActionMenuItemView = this.a;
    Resources localResources = this.b.getResources();
    if (a.b(this.c));
    for (int i = 2130838271; ; i = 2130838268)
    {
      localActionMenuItemView.setIcon(localResources.getDrawable(i));
      return;
    }
  }

  public final void a()
  {
    this.c = null;
    this.d = null;
    this.e.a();
  }

  public final void b()
  {
    if (this.c == null)
      return;
    if (a.b(this.c))
    {
      SubscribeManager.a().f(this.b, this.d);
      a(this.a, false);
    }
    while (true)
    {
      this.a.setEnabled(false);
      return;
      SubscribeManager.a().e(this.b, this.d);
      a(this.a, true);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.ao
 * JD-Core Version:    0.6.0
 */