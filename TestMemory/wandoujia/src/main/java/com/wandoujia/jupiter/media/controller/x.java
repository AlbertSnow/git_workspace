package com.wandoujia.jupiter.media.controller;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

final class x
  implements MediaPlayer.OnCompletionListener
{
  x(PlayerImpControl paramPlayerImpControl)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    PlayerImpControl.a(this.a, PlayerImpControl.State.PLAYBACK_COMPLETED);
    PlayerImpControl.b(this.a, PlayerImpControl.State.PLAYBACK_COMPLETED);
    this.a.j();
    if (PlayerImpControl.c(this.a) != null)
      PlayerImpControl.c(this.a).c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.x
 * JD-Core Version:    0.6.0
 */