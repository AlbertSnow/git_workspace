package com.wandoujia.p4.button.views;

import android.view.View;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.mvc.Action;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import java.util.List;

final class g extends h
{
  g(List paramList)
  {
  }

  public final boolean a(View paramView)
  {
    if (!this.a.isEmpty())
    {
      i locali = (i)this.a.get(0);
      if (locali.b != null)
      {
        a(paramView, Logger.Module.UI, ViewLogPackage.Element.SUB_ACTION, ViewLogPackage.Action.REDIRECT, locali.a, null);
        locali.b.execute();
        return true;
      }
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.button.views.g
 * JD-Core Version:    0.6.0
 */