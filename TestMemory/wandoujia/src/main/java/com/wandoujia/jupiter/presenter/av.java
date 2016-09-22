package com.wandoujia.jupiter.presenter;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class av extends c
{
  protected final void a(Model paramModel)
  {
    if (!SystemUtil.isMX())
      return;
    e().getLayoutParams().width = e().getLayoutParams().height;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.av
 * JD-Core Version:    0.6.0
 */