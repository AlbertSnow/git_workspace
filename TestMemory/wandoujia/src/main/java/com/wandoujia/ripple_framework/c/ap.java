package com.wandoujia.ripple_framework.c;

import android.text.TextUtils;
import android.view.View;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.GiftDetail;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

public final class ap extends e
{
  protected final void a(Model paramModel)
  {
    if (paramModel == null)
      return;
    String str;
    if (paramModel.t() == null)
      str = null;
    while (str == null)
    {
      e().setOnClickListener(null);
      i.k().h().a(e(), Logger.Module.UI, ViewLogPackage.Element.CARD, ViewLogPackage.Action.REDIRECT, paramModel.n(), paramModel.E().id).a(e(), paramModel);
      return;
      if (TextUtils.isEmpty(paramModel.t().intent))
      {
        if (TextUtils.isEmpty(paramModel.t().url))
        {
          str = null;
          continue;
        }
        str = paramModel.t().url;
        continue;
      }
      str = paramModel.t().intent;
    }
    aq localaq = new aq(this, paramModel, paramModel);
    localaq.a(e(), Logger.Module.UI, ViewLogPackage.Element.CARD, ViewLogPackage.Action.REDIRECT, str, paramModel.E().id);
    e().setOnClickListener(localaq);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.ap
 * JD-Core Version:    0.6.0
 */