package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.WindowManager;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.p4.views.FlowLayout.LayoutParams;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class dy extends c
{
  protected final void a(Model paramModel)
  {
    int i = (SystemUtil.getScreenWidth((WindowManager)e().getContext().getSystemService("window")) - (1 + e().getResources().getDimensionPixelOffset(2131427776))) / 2;
    FlowLayout.LayoutParams localLayoutParams = (FlowLayout.LayoutParams)e().getLayoutParams();
    localLayoutParams.width = i;
    e().setLayoutParams(localLayoutParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.dy
 * JD-Core Version:    0.6.0
 */