package com.wandoujia.p4.community.fragmant;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class at
  implements Animation.AnimationListener
{
  at(CommunityTopicListTabFragment paramCommunityTopicListTabFragment)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    CommunityTopicListTabFragment.l(this.a).setVisibility(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.at
 * JD-Core Version:    0.6.0
 */