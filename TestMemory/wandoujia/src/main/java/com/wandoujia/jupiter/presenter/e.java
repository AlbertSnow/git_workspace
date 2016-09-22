package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.view.View;
import com.wandoujia.api.proto.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.action.ActionType;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class e extends h
{
  e(Action paramAction)
  {
  }

  public final boolean a(View paramView)
  {
    Context localContext = paramView.getContext();
    if (this.a.type.intValue() == ActionType.CLEAR_DOWNLOAD_COMPLETE_APP.ordinal());
    for (boolean bool = true; ; bool = false)
    {
      aw.a(localContext, bool, new f(this));
      a(paramView, Logger.Module.DOWNLOAD, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.CLEAR, null, null);
      return true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.e
 * JD-Core Version:    0.6.0
 */