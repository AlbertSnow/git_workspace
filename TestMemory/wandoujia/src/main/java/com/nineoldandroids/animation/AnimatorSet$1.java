package com.nineoldandroids.animation;

import java.util.ArrayList;

class AnimatorSet$1 extends AnimatorListenerAdapter
{
  boolean canceled = false;

  public void onAnimationCancel(Animator paramAnimator)
  {
    this.canceled = true;
  }

  public void onAnimationEnd(Animator paramAnimator)
  {
    if (!this.canceled)
    {
      int i = this.val$nodesToStart.size();
      for (int j = 0; j < i; j++)
      {
        AnimatorSet.Node localNode = (AnimatorSet.Node)this.val$nodesToStart.get(j);
        localNode.animation.start();
        AnimatorSet.access$000(this.this$0).add(localNode.animation);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nineoldandroids.animation.AnimatorSet.1
 * JD-Core Version:    0.6.0
 */