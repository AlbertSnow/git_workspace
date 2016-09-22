package com.wandoujia.ripple_framework.c;

import com.wandoujia.api.proto.Image;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class i extends c
{
  protected final void a(Model paramModel)
  {
    int i = ((Image)paramModel.v().get(0)).height.intValue();
    h().j(i);
    h().a(new j(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.i
 * JD-Core Version:    0.6.0
 */