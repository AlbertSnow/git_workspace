package com.wandoujia.ripple_framework.c;

import android.view.View;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class bh extends h
{
  bh(bg parambg, Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    if (this.a.t() != null)
    {
      this.b.a(this.b.e(), this.a);
      a(paramView, bg.a(this.b), bg.b(this.b), this.a.t());
      return true;
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.bh
 * JD-Core Version:    0.6.0
 */