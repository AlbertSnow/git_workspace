package com.wandoujia.jupiter.fragment;

import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorListenerAdapter;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.nirvana.framework.network.page.a;

final class f extends AnimatorListenerAdapter
{
  f(DetailFragment paramDetailFragment, AsyncImageView paramAsyncImageView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    DetailFragment.m(this.b);
    if (SystemUtil.aboveApiLevel(11))
      this.a.setLayerType(0, null);
    if (!CollectionUtils.isEmpty(DetailFragment.n(this.b).c()))
      DetailFragment.o(this.b);
    super.onAnimationEnd(paramAnimator);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.f
 * JD-Core Version:    0.6.0
 */