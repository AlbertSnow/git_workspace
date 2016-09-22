package com.wandoujia.phoenix2.videoplayer;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import com.wandoujia.base.log.Log;

final class g
  implements MediaPlayer.OnPreparedListener
{
  g(BasePlayerFragment paramBasePlayerFragment)
  {
  }

  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    BasePlayerFragment.c(this.a);
    BasePlayerFragment.a(false);
    Log.d("BasePlayerFragment", " on prepared  , now playingIndex is " + BasePlayerFragment.d(this.a), new Object[0]);
    this.a.a(System.currentTimeMillis() - BasePlayerFragment.e(this.a), this.a.j());
    this.a.k();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.g
 * JD-Core Version:    0.6.0
 */