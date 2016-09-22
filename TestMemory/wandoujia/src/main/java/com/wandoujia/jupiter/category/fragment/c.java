package com.wandoujia.jupiter.category.fragment;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.nirvana.framework.network.page.a;
import com.wandoujia.nirvana.framework.ui.recycler.i;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class c extends com.wandoujia.jupiter.a.c
{
  private c(i<Model> parami)
  {
    super(locali, parami.c());
  }

  protected final int d(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
      return this.a.c();
    if (CollectionUtils.isEmpty(CategoryListFragment.a(this.a).c()))
      return 0;
    if ((paramInt2 <= 0) || (paramInt2 >= CategoryListFragment.b(this.a).c().size()))
      return 0;
    Model localModel = (Model)CategoryListFragment.c(this.a).a(paramInt2);
    int i = 0;
    if (localModel != null)
    {
      Object localObject = localModel.a(0);
      i = 0;
      if (localObject != null)
        i = 1;
    }
    if (i != 0)
      return JupiterApplication.e().getResources().getDimensionPixelOffset(2131427539);
    return 1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.fragment.c
 * JD-Core Version:    0.6.0
 */