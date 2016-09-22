package com.wandoujia.p4.views;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class i
  implements Animation.AnimationListener
{
  i(ExpandablePanel paramExpandablePanel)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (ExpandablePanel.a(this.a) != null)
      ExpandablePanel.a(this.a).b(ExpandablePanel.b(this.a));
    ExpandablePanel.c(this.a);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.i
 * JD-Core Version:    0.6.0
 */