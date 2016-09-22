package com.wandoujia.phoenix2.videoplayer;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnSeekCompleteListener;

final class h
  implements MediaPlayer.OnSeekCompleteListener
{
  h(BasePlayerFragment paramBasePlayerFragment)
  {
  }

  public final void onSeekComplete(MediaPlayer paramMediaPlayer)
  {
    System.currentTimeMillis();
    BasePlayerFragment.f(this.a);
    this.a.p();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.h
 * JD-Core Version:    0.6.0
 */