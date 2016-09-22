package com.wandoujia.jupiter.subscribe.fragment;

import android.view.ViewGroup;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.jupiter.a.d;
import com.wandoujia.nirvana.framework.ui.a;

final class t extends d
{
  private t(SubscribeTimeLineFragment paramSubscribeTimeLineFragment)
  {
  }

  protected final a a(ViewGroup paramViewGroup, TemplateTypeEnum.TemplateType paramTemplateType)
  {
    switch (r.a[paramTemplateType.ordinal()])
    {
    default:
      return super.a(paramViewGroup, paramTemplateType);
    case 1:
    }
    return SubscribeTimeLineFragment.a(paramViewGroup);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.t
 * JD-Core Version:    0.6.0
 */