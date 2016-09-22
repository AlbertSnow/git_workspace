package com.wandoujia.jupiter.gift;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.nirvana.framework.ui.recycler.i;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class c extends com.wandoujia.jupiter.a.c
{
  c(i<Model> parami)
  {
    super(locali, parami.c());
  }

  protected final int d(int paramInt1, int paramInt2)
  {
    if ((CdKeyGiftListFragment.a(this.a) == null) || (CollectionUtils.isEmpty(CdKeyGiftListFragment.b(this.a).c())))
      return 0;
    if ((paramInt2 <= 0) || (paramInt2 >= CdKeyGiftListFragment.c(this.a).c().size()))
      return JupiterApplication.e().getResources().getDimensionPixelOffset(2131427539);
    Model localModel1 = (Model)CdKeyGiftListFragment.d(this.a).a(paramInt2);
    Model localModel2;
    if (paramInt2 > 0)
    {
      localModel2 = (Model)CdKeyGiftListFragment.e(this.a).a(paramInt2 - 1);
      if ((!TemplateTypeEnum.TemplateType.DIVIDER.equals(localModel1.g())) && ((!TemplateTypeEnum.TemplateType.HEADER_NO_ARROW.equals(localModel1.g())) || (localModel2 == null) || (TemplateTypeEnum.TemplateType.DIVIDER.equals(localModel2.g()))))
        break label173;
    }
    label173: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        return JupiterApplication.e().getResources().getDimensionPixelOffset(2131427539);
        localModel2 = null;
        break;
      }
      return 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.gift.c
 * JD-Core Version:    0.6.0
 */