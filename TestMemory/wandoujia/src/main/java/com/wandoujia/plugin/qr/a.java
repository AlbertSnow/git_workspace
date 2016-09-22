package com.wandoujia.plugin.qr;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

final class a
  implements MediaPlayer.OnCompletionListener
{
  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    paramMediaPlayer.seekTo(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.plugin.qr.a
 * JD-Core Version:    0.6.0
 */