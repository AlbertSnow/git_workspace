package com.wandoujia.phoenix2.videoplayer;

import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.wandoujia.jupiter.JupiterApplication;

final class r
  implements Animation.AnimationListener
{
  r(SimplePlayerControllerView paramSimplePlayerControllerView)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    JupiterApplication.a().post(new s(this));
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.r
 * JD-Core Version:    0.6.0
 */