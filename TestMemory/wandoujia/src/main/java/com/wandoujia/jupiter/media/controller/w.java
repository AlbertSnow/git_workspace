package com.wandoujia.jupiter.media.controller;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnVideoSizeChangedListener;

final class w
  implements MediaPlayer.OnVideoSizeChangedListener
{
  w(PlayerImpControl paramPlayerImpControl)
  {
  }

  public final void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    PlayerImpControl.a(this.a, paramMediaPlayer.getVideoWidth());
    PlayerImpControl.b(this.a, paramMediaPlayer.getVideoHeight());
    if (PlayerImpControl.c(this.a) != null)
      PlayerImpControl.c(this.a).a(PlayerImpControl.d(this.a), PlayerImpControl.e(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.w
 * JD-Core Version:    0.6.0
 */