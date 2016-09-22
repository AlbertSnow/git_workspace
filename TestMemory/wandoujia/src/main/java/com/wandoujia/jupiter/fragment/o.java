package com.wandoujia.jupiter.fragment;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

final class o extends c
{
  o(n paramn)
  {
  }

  protected final void a(Model paramModel)
  {
    i.k().h().a(e(), Logger.Module.UI, ViewLogPackage.Element.CARD, ViewLogPackage.Action.REDIRECT, "detail_feedback", Long.valueOf(0L));
    e().setOnClickListener(new p(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.o
 * JD-Core Version:    0.6.0
 */