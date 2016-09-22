package com.wandoujia.jupiter.subscribe.fragment;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.nirvana.framework.ui.recycler.i;
import com.wandoujia.ripple_framework.adapter.f;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class c extends com.wandoujia.jupiter.a.c
{
  public c(i<Model> parami)
  {
    super(locali, parami.c());
  }

  protected final int d(int paramInt1, int paramInt2)
  {
    if (CollectionUtils.isEmpty(PublisherProfileFragment.a(this.a).c()));
    do
    {
      return 0;
      if (paramInt2 == 0)
        return this.a.c();
    }
    while (((paramInt2 == -1 + PublisherProfileFragment.b(this.a).f().size()) && (((Model)PublisherProfileFragment.d(this.a).f().get(-1 + PublisherProfileFragment.c(this.a).f().size())).g() == TemplateTypeEnum.TemplateType.END)) || (paramInt2 <= 0) || (paramInt2 >= PublisherProfileFragment.e(this.a).c().size()));
    Model localModel1 = (Model)PublisherProfileFragment.f(this.a).a(paramInt2);
    Model localModel2;
    int i;
    label190: int j;
    if (paramInt2 > 0)
    {
      localModel2 = (Model)PublisherProfileFragment.g(this.a).a(paramInt2 - 1);
      if ((localModel2 == null) || (!localModel2.g().equals(TemplateTypeEnum.TemplateType.DETAIL_HEADER)) || (localModel1.g().equals(TemplateTypeEnum.TemplateType.SINGLE_MICRO)))
        break label300;
      i = 1;
      if ((localModel2 == null) || (!PublisherProfileFragment.a(localModel2.g(), this.a.b)))
        break label306;
      j = 1;
      label216: if ((!PublisherProfileFragment.a(localModel1.g(), this.a.c)) && ((localModel2 == null) || (localModel2.c() == null) || (localModel1.c() != null)))
        break label312;
    }
    label300: label306: label312: for (int k = 1; ; k = 0)
    {
      int m;
      if ((i == 0) && (j == 0))
      {
        m = 0;
        if (k == 0);
      }
      else
      {
        m = 1;
      }
      if (m == 0)
        break label318;
      return JupiterApplication.e().getResources().getDimensionPixelOffset(2131427539);
      localModel2 = null;
      break;
      i = 0;
      break label190;
      j = 0;
      break label216;
    }
    label318: return 1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.fragment.c
 * JD-Core Version:    0.6.0
 */