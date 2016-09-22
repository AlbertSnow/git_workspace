package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.jupiter.b.a.a;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;
import de.greenrobot.event.c;
import java.util.List;

final class ci extends h
{
  ci(Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    Integer localInteger1 = (Integer)this.a.a(2131492965);
    List localList = this.a.b().sub_entity;
    if ((localList != null) && (localList.size() > 0))
      if ((localInteger1 != null) && (localList.size() <= localInteger1.intValue()))
        break label143;
    label143: for (Integer localInteger2 = Integer.valueOf(0); ; localInteger2 = localInteger1)
    {
      ((c)i.k().a("event_bus")).d(new a((ApkDetail)((Entity)localList.get(localInteger2.intValue())).detail.app_detail.apk.get(0)));
      a(paramView, Logger.Module.APPS, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.DOWNLOAD, this.a.F().package_name, null);
      return true;
      return false;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ci
 * JD-Core Version:    0.6.0
 */