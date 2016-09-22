package com.wandoujia.jupiter.presenter;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;

final class am
  implements AdapterView.OnItemSelectedListener
{
  am(LocalAppInfo paramLocalAppInfo)
  {
  }

  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt == 1)
    {
      ((AppManager)i.k().a("app")).d(this.a.getPackageName());
      i.k().h().a(paramView, Logger.Module.APPS, ViewLogPackage.Element.SPINNER, ViewLogPackage.Action.CLEAR, this.a.getPackageName(), null).c(paramView);
    }
  }

  public final void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.am
 * JD-Core Version:    0.6.0
 */