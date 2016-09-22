package com.wandoujia.phoenix2.videoplayer;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.wandoujia.base.log.Log;

final class j
  implements MediaPlayer.OnCompletionListener
{
  j(BasePlayerFragment paramBasePlayerFragment)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    BasePlayerFragment.a(true);
    Log.d("BasePlayerFragment", " on completion , now playingIndex is " + BasePlayerFragment.d(this.a), new Object[0]);
    if (BasePlayerFragment.g(this.a))
      return;
    if (this.a.h() > 0)
    {
      this.a.s();
      return;
    }
    this.a.t();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.j
 * JD-Core Version:    0.6.0
 */