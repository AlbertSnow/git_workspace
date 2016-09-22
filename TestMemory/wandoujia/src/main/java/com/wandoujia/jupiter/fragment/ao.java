package com.wandoujia.jupiter.fragment;

import android.view.View;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

final class ao extends c
{
  ao(an paraman)
  {
  }

  protected final void a(Model paramModel)
  {
    if (ReviewFragment.l(this.a.a))
      e().setVisibility(0);
    while (true)
    {
      e().setOnClickListener(new ap(this, paramModel, paramModel));
      return;
      e().setVisibility(8);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.ao
 * JD-Core Version:    0.6.0
 */