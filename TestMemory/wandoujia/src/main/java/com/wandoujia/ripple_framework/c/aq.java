package com.wandoujia.ripple_framework.c;

import android.view.View;
import com.wandoujia.ripple_framework.b.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class aq extends h
{
  aq(ap paramap, Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    if (this.a.t() == null)
      return false;
    ((c)i.k().a("navigation")).a(paramView.getContext(), this.a, this.b.e());
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.aq
 * JD-Core Version:    0.6.0
 */