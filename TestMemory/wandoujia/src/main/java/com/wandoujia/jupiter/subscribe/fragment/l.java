package com.wandoujia.jupiter.subscribe.fragment;

import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.jupiter.a.c;
import com.wandoujia.nirvana.framework.ui.recycler.i;
import com.wandoujia.ripple_framework.adapter.f;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class l extends c
{
  private int a = 1;

  public l(i<Model> parami)
  {
    super(locali, parami.c());
  }

  protected final int d(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
      return this.b.c();
    if (paramInt2 == 1)
      return 0;
    if ((((Model)SubscribeOnBoardFragment.f(this.b).f().get(-1 + SubscribeOnBoardFragment.e(this.b).f().size())).g() == TemplateTypeEnum.TemplateType.END) && (paramInt2 == -1 + SubscribeOnBoardFragment.g(this.b).f().size()))
      return 0;
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.l
 * JD-Core Version:    0.6.0
 */