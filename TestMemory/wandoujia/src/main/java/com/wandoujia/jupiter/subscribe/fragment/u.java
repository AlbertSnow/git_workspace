package com.wandoujia.jupiter.subscribe.fragment;

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

final class u extends c
{
  public u(i<Model> parami)
  {
    super(locali, parami.c());
  }

  protected final int d(int paramInt1, int paramInt2)
  {
    if (CollectionUtils.isEmpty(SubscribeTimeLineFragment.a(this.a).c()))
      return 0;
    if ((paramInt2 <= 0) || (paramInt2 >= SubscribeTimeLineFragment.b(this.a).c().size()))
      return JupiterApplication.e().getResources().getDimensionPixelOffset(2131427539);
    Model localModel = (Model)SubscribeTimeLineFragment.c(this.a).a(paramInt2);
    TemplateTypeEnum.TemplateType[] arrayOfTemplateType = SubscribeTimeLineFragment.e();
    int i = arrayOfTemplateType.length;
    for (int j = 0; ; j++)
    {
      int k = 0;
      if (j < i)
      {
        if (!arrayOfTemplateType[j].equals(localModel.g()))
          continue;
        k = 1;
      }
      if (k == 0)
        break;
      return JupiterApplication.e().getResources().getDimensionPixelOffset(2131427539);
    }
    return 1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.u
 * JD-Core Version:    0.6.0
 */