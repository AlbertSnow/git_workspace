package com.wandoujia.jupiter.library.fragment;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.a.c;
import com.wandoujia.nirvana.framework.ui.recycler.a;
import com.wandoujia.nirvana.framework.ui.recycler.i;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

final class al extends c
{
  private final int a;
  private final i<Model> b;

  public al(i<Model> parami)
  {
    super(parami);
    this.b = parami;
    this.a = JupiterApplication.e().getResources().getDimensionPixelOffset(2131427707);
  }

  protected final int d(int paramInt1, int paramInt2)
  {
    if (CollectionUtils.isEmpty(this.b.f()))
      return 0;
    if (paramInt2 == 0)
      return this.a;
    if ((this.b instanceof a));
    for (int i = paramInt2 - ((a)this.b).c(); ; i = paramInt2)
    {
      if ((i > 0) && (i < this.b.f().size()))
      {
        Model localModel = (Model)this.b.f().get(i);
        switch (ak.c[localModel.g().ordinal()])
        {
        default:
          return 1;
        case 1:
        }
        return this.a;
      }
      return super.d(paramInt1, paramInt2);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.al
 * JD-Core Version:    0.6.0
 */