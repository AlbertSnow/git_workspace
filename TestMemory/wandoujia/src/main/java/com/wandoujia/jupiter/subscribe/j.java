package com.wandoujia.jupiter.subscribe;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.p4.subscribe.core.SubscribeManager;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.CustomFontTextView;

final class j extends h
{
  j(PublisherButtonPresenter paramPublisherButtonPresenter, Model paramModel)
  {
    super(paramModel);
  }

  public final boolean a(View paramView)
  {
    SubscribeManager.a().f(PublisherButtonPresenter.b(this.a).getContext(), PublisherButtonPresenter.a(this.a));
    a(paramView, Logger.Module.FOLLOW, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.UNSUBSCRIBE, PublisherButtonPresenter.c(this.a).n(), null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.j
 * JD-Core Version:    0.6.0
 */