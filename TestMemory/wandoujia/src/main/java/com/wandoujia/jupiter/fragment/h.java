package com.wandoujia.jupiter.fragment;

import android.view.View;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

final class h extends c
{
  h(g paramg)
  {
  }

  protected final void a(Model paramModel)
  {
    if (DetailFragment.p(this.a.a))
      e().setVisibility(0);
    while (true)
    {
      e().setOnClickListener(new i(this, paramModel, paramModel));
      return;
      e().setVisibility(8);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.h
 * JD-Core Version:    0.6.0
 */