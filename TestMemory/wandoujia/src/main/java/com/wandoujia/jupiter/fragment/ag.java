package com.wandoujia.jupiter.fragment;

import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorListenerAdapter;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.nirvana.framework.network.page.a;

final class ag extends AnimatorListenerAdapter
{
  ag(ReviewFragment paramReviewFragment, AsyncImageView paramAsyncImageView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    ReviewFragment.h(this.b);
    if (SystemUtil.aboveApiLevel(11))
      this.a.setLayerType(0, null);
    if (!CollectionUtils.isEmpty(ReviewFragment.i(this.b).c()))
      ReviewFragment.j(this.b);
    super.onAnimationEnd(paramAnimator);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.ag
 * JD-Core Version:    0.6.0
 */