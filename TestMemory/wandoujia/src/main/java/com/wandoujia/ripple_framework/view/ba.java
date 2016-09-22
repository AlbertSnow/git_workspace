package com.wandoujia.ripple_framework.view;

import android.view.View;
import android.widget.BaseAdapter;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;

public abstract class ba extends BaseAdapter
{
  protected View a;

  public ba(View paramView)
  {
    this.a = paramView;
  }

  protected final void a(Logger.Module paramModule, ViewLogPackage.Action paramAction, String paramString)
  {
    Logger localLogger = i.k().h();
    localLogger.a(this.a, paramModule, ViewLogPackage.Element.SPINNER, paramAction, paramString, null);
    localLogger.c(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.ba
 * JD-Core Version:    0.6.0
 */