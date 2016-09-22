package com.wandoujia.ripple_framework.c;

import com.wandoujia.api.proto.Entity;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.model.Model;

public final class d extends c
{
  protected final void a(Model paramModel)
  {
    if (CollectionUtils.isEmpty(paramModel.b().tag))
      h().b(R.id.tag).f(4);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.d
 * JD-Core Version:    0.6.0
 */