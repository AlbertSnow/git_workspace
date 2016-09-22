package com.wandoujia.jupiter.presenter;

import com.wandoujia.api.proto.Entity;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class ee extends c
{
  protected final void a(Model paramModel)
  {
    if (CollectionUtils.isEmpty(paramModel.b().attach_entity))
    {
      h().b(2131493734).f(8);
      return;
    }
    h().b(2131493734).f(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ee
 * JD-Core Version:    0.6.0
 */