package com.wandoujia.p4.community.fragmant;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class au
  implements Animation.AnimationListener
{
  au(CommunityTopicListTabFragment paramCommunityTopicListTabFragment)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    CommunityTopicListTabFragment.m(this.a).setVisibility(8);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.au
 * JD-Core Version:    0.6.0
 */