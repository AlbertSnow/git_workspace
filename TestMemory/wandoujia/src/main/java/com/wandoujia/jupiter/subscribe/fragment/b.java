package com.wandoujia.jupiter.subscribe.fragment;

import android.view.ViewGroup;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.jupiter.presenter.eu;
import com.wandoujia.nirvana.framework.ui.a;
import com.wandoujia.ripple_framework.c.af;

final class b extends com.wandoujia.jupiter.a.d
{
  private b(PublisherProfileFragment paramPublisherProfileFragment)
  {
  }

  protected final a a(ViewGroup paramViewGroup, TemplateTypeEnum.TemplateType paramTemplateType)
  {
    switch (a.a[paramTemplateType.ordinal()])
    {
    default:
      return super.a(paramViewGroup, paramTemplateType);
    case 1:
      if (OemUtil.isOemOrPaid())
        return new a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903528));
      return super.a(paramViewGroup, paramTemplateType);
    case 2:
    }
    return new a((ViewGroup)android.support.v4.app.b.a(paramViewGroup, 2130903263), null).a(2131492998, new af()).a(2131492903, new af()).a(2131492972, new eu()).a(2131493603, new d(0));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.b
 * JD-Core Version:    0.6.0
 */