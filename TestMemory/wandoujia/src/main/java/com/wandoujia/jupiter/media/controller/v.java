package com.wandoujia.jupiter.media.controller;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

final class v
  implements MediaPlayer.OnPreparedListener
{
  v(PlayerImpControl paramPlayerImpControl)
  {
  }

  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    PlayerImpControl.a(this.a, PlayerImpControl.State.PREPARED);
    PlayerImpControl.a(this.a, paramMediaPlayer.getVideoWidth());
    PlayerImpControl.b(this.a, paramMediaPlayer.getVideoHeight());
    int i = PlayerImpControl.a(this.a);
    if (i != 0)
      this.a.a(i);
    if (PlayerImpControl.b(this.a) == PlayerImpControl.State.PLAYING)
      this.a.a();
    while (true)
    {
      if (PlayerImpControl.c(this.a) != null)
        PlayerImpControl.c(this.a).a();
      return;
      if (PlayerImpControl.b(this.a) != PlayerImpControl.State.PAUSED)
        continue;
      this.a.b();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.v
 * JD-Core Version:    0.6.0
 */