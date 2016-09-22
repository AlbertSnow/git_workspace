package com.wandoujia.ripple_framework.c;

import android.content.Context;
import android.content.res.Resources;
import com.wandoujia.api.proto.Image;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.model.Model;

public final class aw extends c
{
  protected final void a(Model paramModel)
  {
    if ((paramModel.k() != null) && (paramModel.k().rgbs != null) && (paramModel.k().rgbs.intValue() != -1));
    for (int i = 1; i != 0; i = 0)
    {
      h().b(R.id.root).h(paramModel.k().rgbs.intValue());
      return;
    }
    h().b(R.id.root).h(f().getResources().getColor(R.color.single_highlight_default_color));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.aw
 * JD-Core Version:    0.6.0
 */