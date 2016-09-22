package com.wandoujia.jupiter.search.b;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

public final class k extends c
{
  protected final void a(Model paramModel)
  {
    l locall = new l(paramModel);
    locall.a(e(), Logger.Module.SEARCH, ViewLogPackage.Element.LIST_ITEM, ViewLogPackage.Action.REDIRECT, "wdj://search/result/" + paramModel.n(), null);
    e().setOnClickListener(locall);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.b.k
 * JD-Core Version:    0.6.0
 */