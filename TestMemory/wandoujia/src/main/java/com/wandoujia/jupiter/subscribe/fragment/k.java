package com.wandoujia.jupiter.subscribe.fragment;

import android.view.ViewGroup;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.jupiter.a.d;
import com.wandoujia.nirvana.framework.ui.a;

final class k extends d
{
  private k(SubscribeOnBoardFragment paramSubscribeOnBoardFragment)
  {
  }

  protected final a a(ViewGroup paramViewGroup, TemplateTypeEnum.TemplateType paramTemplateType)
  {
    switch (j.a[paramTemplateType.ordinal()])
    {
    default:
      return super.a(paramViewGroup, paramTemplateType);
    case 1:
      return SubscribeOnBoardFragment.a(this.c, paramViewGroup);
    case 2:
    }
    return SubscribeOnBoardFragment.a(paramViewGroup);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.k
 * JD-Core Version:    0.6.0
 */