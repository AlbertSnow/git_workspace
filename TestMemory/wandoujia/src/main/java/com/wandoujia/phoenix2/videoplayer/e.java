package com.wandoujia.phoenix2.videoplayer;

import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.wandoujia.jupiter.JupiterApplication;

final class e
  implements Animation.AnimationListener
{
  e(BasePlayerFragment paramBasePlayerFragment)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (!this.a.isAdded())
      return;
    JupiterApplication.a().post(new f(this));
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.e
 * JD-Core Version:    0.6.0
 */