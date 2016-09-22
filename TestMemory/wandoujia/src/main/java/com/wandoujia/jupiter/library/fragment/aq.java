package com.wandoujia.jupiter.library.fragment;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.a.c;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.nirvana.framework.ui.recycler.i;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class aq extends c
{
  aq(i<Model> parami)
  {
    super(locali, parami.c());
  }

  protected final int d(int paramInt1, int paramInt2)
  {
    if (CollectionUtils.isEmpty(GiftLibFragment.a(this.a).c()))
      return 0;
    if ((paramInt2 <= 0) || (paramInt2 >= GiftLibFragment.b(this.a).c().size()))
      return JupiterApplication.e().getResources().getDimensionPixelOffset(2131427539);
    Model localModel = (Model)GiftLibFragment.c(this.a).a(paramInt2);
    if (TemplateTypeEnum.TemplateType.HEADER_NO_ARROW.equals(localModel.g()));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        return JupiterApplication.e().getResources().getDimensionPixelOffset(2131427539);
      return 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.aq
 * JD-Core Version:    0.6.0
 */