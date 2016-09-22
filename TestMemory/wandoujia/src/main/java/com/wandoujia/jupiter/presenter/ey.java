package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class ey extends c
{
  protected final void a(Model paramModel)
  {
    label50: RelativeLayout.LayoutParams localLayoutParams;
    if (TextUtils.isEmpty(paramModel.q()))
    {
      h().a(2131493413).f(8);
      if (!TextUtils.isEmpty(paramModel.o()))
        break label141;
      h().a(2131492972).f(8);
      localLayoutParams = (RelativeLayout.LayoutParams)h().a(2131492998).a().getLayoutParams();
      if ((TextUtils.isEmpty(paramModel.q())) || (TextUtils.isEmpty(paramModel.o())))
        break label158;
    }
    label141: label158: for (localLayoutParams.topMargin = JupiterApplication.e().getResources().getDimensionPixelOffset(2131427948); ; localLayoutParams.topMargin = 0)
    {
      h().a(2131492998).a().setLayoutParams(localLayoutParams);
      return;
      h().a(2131493413).f(0);
      break;
      h().a(2131492972).f(0);
      break label50;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ey
 * JD-Core Version:    0.6.0
 */