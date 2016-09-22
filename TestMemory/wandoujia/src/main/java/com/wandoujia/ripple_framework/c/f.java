package com.wandoujia.ripple_framework.c;

import android.support.v4.app.b;
import android.view.View;
import com.wandoujia.api.proto.Action;
import com.wandoujia.ripple_framework.action.ActionType;
import com.wandoujia.ripple_framework.b.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class f extends h
{
  f(e parame, Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    if (this.a.t() == null)
      return false;
    if ((this.a.t() != null) && (this.a.t().type != null) && (this.a.t().type.intValue() == ActionType.DOWNLOAD_APP.ordinal()))
    {
      AppTaskManager localAppTaskManager = (AppTaskManager)i.k().a("app_task");
      if (localAppTaskManager != null)
      {
        localAppTaskManager.a(this.a, b.w(paramView.getContext()));
        return true;
      }
    }
    ((c)i.k().a("navigation")).a(paramView.getContext(), this.a, this.b.e());
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.f
 * JD-Core Version:    0.6.0
 */