package com.wandoujia.jupiter.media.controller;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;

final class y
  implements MediaPlayer.OnErrorListener
{
  y(PlayerImpControl paramPlayerImpControl)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    PlayerImpControl.a(this.a, PlayerImpControl.State.ERROR);
    PlayerImpControl.b(this.a, PlayerImpControl.State.ERROR);
    if (PlayerImpControl.c(this.a) != null)
      PlayerImpControl.c(this.a).b();
    this.a.m();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.y
 * JD-Core Version:    0.6.0
 */