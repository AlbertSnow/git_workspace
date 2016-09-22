package com.wandoujia.jupiter.fragment;

import android.support.v4.view.bg;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.ripple_framework.view.bi;

final class u
  implements bi
{
  u(DetailFragment paramDetailFragment)
  {
  }

  public final void a(float paramFloat)
  {
    ViewHelper.setTranslationY(DetailFragment.a(this.a), paramFloat + DetailFragment.b(this.a));
    if (DetailFragment.j(this.a) != null)
      bg.b(DetailFragment.j(this.a), paramFloat);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.u
 * JD-Core Version:    0.6.0
 */