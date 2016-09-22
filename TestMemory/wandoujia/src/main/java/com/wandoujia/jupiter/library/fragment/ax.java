package com.wandoujia.jupiter.library.fragment;

import com.nineoldandroids.animation.ArgbEvaluator;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;
import com.wandoujia.jupiter.library.view.TransitionTab;
import com.wandoujia.jupiter.library.view.TransitionTab.State;
import com.wandoujia.ripple_framework.adapter.m;
import com.wandoujia.ripple_framework.view.slidingtab.PagerSlidingTabStrip;
import java.util.Iterator;
import java.util.List;

final class ax
  implements ValueAnimator.AnimatorUpdateListener
{
  ax(aw paramaw, TransitionTab.State paramState)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    LibFragment.d(this.b.a).setBackgroundColor(((Integer)TransitionTab.a.evaluate(f, Integer.valueOf(aw.a(this.b)), Integer.valueOf(this.a.getBgColor()))).intValue());
    LibFragment.e(this.b.a).setIndicatorColor(((Integer)TransitionTab.a.evaluate(f, Integer.valueOf(aw.b(this.b)), Integer.valueOf(this.a.getIndicatorColor()))).intValue());
    Iterator localIterator = LibFragment.f(this.b.a).iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      if (!(localm.e instanceof TransitionTab))
        continue;
      ((TransitionTab)localm.e).a(this.a, f);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.ax
 * JD-Core Version:    0.6.0
 */