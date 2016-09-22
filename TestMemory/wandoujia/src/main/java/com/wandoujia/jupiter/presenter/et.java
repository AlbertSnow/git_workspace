package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.i;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class et extends c
{
  protected final void a(Model paramModel)
  {
    if (paramModel.f() == ContentTypeEnum.ContentType.FEED)
    {
      e().setPadding(0, 0, 0, 0);
      ViewGroup.LayoutParams localLayoutParams2 = e().getLayoutParams();
      int k = i.a(240.0F, f());
      if (localLayoutParams2 == null)
        localLayoutParams2 = new ViewGroup.LayoutParams(-1, k);
      while (true)
      {
        e().setLayoutParams(localLayoutParams2);
        return;
        localLayoutParams2.height = k;
      }
    }
    int i = f().getResources().getDimensionPixelOffset(2131427721);
    e().setPadding(0, i, 0, i);
    ViewGroup.LayoutParams localLayoutParams1 = e().getLayoutParams();
    int j = i.a(180.0F, f());
    if (localLayoutParams1 == null)
      localLayoutParams1 = new ViewGroup.LayoutParams(-1, j);
    while (true)
    {
      e().setLayoutParams(localLayoutParams1);
      return;
      localLayoutParams1.height = j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.et
 * JD-Core Version:    0.6.0
 */