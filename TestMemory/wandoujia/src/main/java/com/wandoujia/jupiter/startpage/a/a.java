package com.wandoujia.jupiter.startpage.a;

import android.support.v4.app.b;
import android.view.ViewGroup;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.jupiter.a.d;
import com.wandoujia.jupiter.presenter.aa;

public final class a extends d
{
  protected final com.wandoujia.nirvana.framework.ui.a a(ViewGroup paramViewGroup, TemplateTypeEnum.TemplateType paramTemplateType)
  {
    switch (b.a[paramTemplateType.ordinal()])
    {
    default:
      return super.a(paramViewGroup, paramTemplateType);
    case 1:
    }
    ViewGroup localViewGroup = (ViewGroup)b.a(paramViewGroup, 2130903400);
    localViewGroup.setTag(2130903400, paramTemplateType);
    return aa.a(localViewGroup, g()).a(new com.wandoujia.jupiter.startpage.b.a());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.startpage.a.a
 * JD-Core Version:    0.6.0
 */