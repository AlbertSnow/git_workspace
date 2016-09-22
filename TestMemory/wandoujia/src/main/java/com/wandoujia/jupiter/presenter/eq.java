package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.api.proto.HttpResponse;
import com.wandoujia.api.proto.ShareTypeEnum.ShareType;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.a.b;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;
import java.util.HashMap;
import java.util.Map;

final class eq extends h
{
  eq(ep paramep, Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    HashMap localHashMap = new HashMap();
    if (this.a != null)
      localHashMap.put("docid", String.valueOf(this.a.a()));
    localHashMap.put("shareType", ShareTypeEnum.ShareType.ITEM.name());
    b localb = new b("http://ripple.wandoujia.com/api/v1/share/getcontent.proto", localHashMap, HttpResponse.class, new er(this.b.f(), 0), null, 0);
    localb.a(false);
    localb.u();
    a(paramView, Logger.Module.ITEM, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.SHARE, "share", null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.eq
 * JD-Core Version:    0.6.0
 */