package com.wandoujia.phoenix2.videoplayer;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;

final class i
  implements MediaPlayer.OnBufferingUpdateListener
{
  i(BasePlayerFragment paramBasePlayerFragment)
  {
  }

  public final void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    this.a.c(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.i
 * JD-Core Version:    0.6.0
 */