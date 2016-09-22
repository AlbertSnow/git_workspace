package com.wandoujia.jupiter.library.fragment;

import android.graphics.drawable.ColorDrawable;
import com.nineoldandroids.animation.ValueAnimator;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.library.view.TransitionTab;
import com.wandoujia.jupiter.library.view.TransitionTab.State;
import com.wandoujia.ripple_framework.adapter.m;
import com.wandoujia.ripple_framework.view.slidingtab.PagerSlidingTabStrip;
import java.util.Iterator;
import java.util.List;

final class aw extends ValueAnimator
{
  private final TransitionTab.State b;
  private int c;
  private int d;

  private aw(LibFragment paramLibFragment, TransitionTab.State paramState)
  {
    this.b = paramState;
    setFloatValues(new float[] { 1.0F });
    addUpdateListener(new ax(this, paramState));
    addListener(new ay(this, paramState));
  }

  public final void start()
  {
    if (SystemUtil.aboveApiLevel(11))
    {
      this.c = ((ColorDrawable)LibFragment.g(this.a).getBackground()).getColor();
      this.d = LibFragment.h(this.a).getIndicatorColor();
      Iterator localIterator = LibFragment.f(this.a).iterator();
      while (localIterator.hasNext())
      {
        m localm = (m)localIterator.next();
        if (!(localm.e instanceof TransitionTab))
          continue;
        ((TransitionTab)localm.e).a(this.b);
      }
    }
    super.start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.aw
 * JD-Core Version:    0.6.0
 */