package com.wandoujia.jupiter.media.controller;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;

final class z
  implements MediaPlayer.OnBufferingUpdateListener
{
  z(PlayerImpControl paramPlayerImpControl)
  {
  }

  public final void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    PlayerImpControl.c(this.a, paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.z
 * JD-Core Version:    0.6.0
 */