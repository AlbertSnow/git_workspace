package com.wandoujia.ripple_framework.c;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

public class bg extends c
{
  private Logger.Module a;
  private ViewLogPackage.Element g;

  public bg(Logger.Module paramModule, ViewLogPackage.Element paramElement)
  {
    this.a = paramModule;
    this.g = paramElement;
  }

  public final void a()
  {
    e().setOnClickListener(null);
  }

  protected void a(View paramView, Model paramModel)
  {
    ((com.wandoujia.ripple_framework.b.c)i.k().a("navigation")).a(paramView.getContext(), paramModel, e());
  }

  protected void a(Model paramModel)
  {
    e().setOnClickListener(new bh(this, paramModel, paramModel));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bg
 * JD-Core Version:    0.6.0
 */