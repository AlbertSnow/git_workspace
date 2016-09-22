package com.wandoujia.jupiter.presenter;

import com.wandoujia.jupiter.morph.MorphLoadingView;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class dw extends c
{
  protected final void a(Model paramModel)
  {
    if ((e() instanceof MorphLoadingView))
      ((MorphLoadingView)e()).setModel(paramModel);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.dw
 * JD-Core Version:    0.6.0
 */