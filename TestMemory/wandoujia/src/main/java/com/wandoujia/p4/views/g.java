package com.wandoujia.p4.views;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class g
  implements Animation.AnimationListener
{
  g(ContentListView paramContentListView)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    ContentListView.d(this.a).setVisibility(8);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.g
 * JD-Core Version:    0.6.0
 */