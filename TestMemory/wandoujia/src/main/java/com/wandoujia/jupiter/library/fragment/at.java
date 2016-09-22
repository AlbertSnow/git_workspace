package com.wandoujia.jupiter.library.fragment;

import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.p4.views.ScrollDownLayout;
import com.wandoujia.p4.views.q;

final class at
  implements q
{
  private float a = -1.0F;

  at(LibFragment paramLibFragment)
  {
  }

  public final void a(float paramFloat)
  {
    int i = this.b.c.getMaxOffset();
    ViewHelper.setTranslationY(this.b.a, (int)(i * (paramFloat - 1.0F)));
    if (paramFloat == 0.0F)
      LibFragment.a(this.b);
    while (true)
    {
      this.a = paramFloat;
      return;
      if ((paramFloat <= 0.0F) || (this.a != 0.0F))
        continue;
      LibFragment.b(this.b);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.at
 * JD-Core Version:    0.6.0
 */