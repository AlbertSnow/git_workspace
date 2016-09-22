package com.wandoujia.jupiter.search.b;

import android.content.Context;
import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

final class d extends com.wandoujia.ripple_framework.log.h
{
  d(c paramc, Model paramModel)
  {
    super(paramModel);
  }

  public final boolean a(View paramView)
  {
    new com.wandoujia.ripple_framework.view.a.h(this.a.e().getContext()).a(2131625498).b(this.a.e().getContext().getString(2131625243, new Object[] { "" })).a(2131624552, new e()).b(2131624330, null).b();
    a(paramView, Logger.Module.SEARCH, ViewLogPackage.Element.TEXT_LINK, ViewLogPackage.Action.CLEAR_SEARCH_HISTORY, null, null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.b.d
 * JD-Core Version:    0.6.0
 */