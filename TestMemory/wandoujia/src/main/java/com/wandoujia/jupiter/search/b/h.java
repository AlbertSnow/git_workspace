package com.wandoujia.jupiter.search.b;

import android.view.View;
import com.wandoujia.jupiter.search.view.SearchHotQueryItem;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class h extends c
{
  protected final void a(Model paramModel)
  {
    if ((e() instanceof SearchHotQueryItem))
    {
      e().setClickable(false);
      h().a(2131492998).a().setOnClickListener(new i(this, paramModel, paramModel));
    }
    while (true)
    {
      if ((e() instanceof SearchHotQueryItem))
        ((SearchHotQueryItem)e()).a(paramModel.n(), paramModel.q());
      return;
      e().setOnClickListener(new j(this, paramModel, paramModel));
      h().a(2131492998).a().setClickable(false);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.search.b.h
 * JD-Core Version:    0.6.0
 */