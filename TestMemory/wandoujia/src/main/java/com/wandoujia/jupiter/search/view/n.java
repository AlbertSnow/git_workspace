package com.wandoujia.jupiter.search.view;

import android.content.Context;
import android.support.v4.app.b;
import android.view.ViewGroup;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.jupiter.a.d;
import com.wandoujia.jupiter.presenter.aa;
import com.wandoujia.jupiter.search.b.k;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.log.Logger;

final class n extends d
{
  protected final com.wandoujia.nirvana.framework.ui.a a(ViewGroup paramViewGroup, TemplateTypeEnum.TemplateType paramTemplateType)
  {
    if (paramViewGroup != null)
    {
      com.wandoujia.ripple_framework.i.k().h().a(paramViewGroup, "wdj://search/suggestions");
      Context localContext = paramViewGroup.getContext();
      if (!(localContext instanceof BaseActivity))
        break label85;
      ((BaseActivity)localContext).pushPopupWindow(paramViewGroup);
    }
    while (true)
      switch (h.a[paramTemplateType.ordinal()])
      {
      default:
        return super.a(paramViewGroup, paramTemplateType).a(new com.wandoujia.jupiter.presenter.i());
        label85: com.wandoujia.ripple_framework.i.k().h().e(paramViewGroup);
      case 1:
      }
    return aa.a((ViewGroup)b.a(paramViewGroup, 2130903263), g()).a(new k()).a(new com.wandoujia.jupiter.search.b.a()).a(new com.wandoujia.jupiter.presenter.i());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.view.n
 * JD-Core Version:    0.6.0
 */