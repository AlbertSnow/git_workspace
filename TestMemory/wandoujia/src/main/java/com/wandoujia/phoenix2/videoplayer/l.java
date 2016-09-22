package com.wandoujia.phoenix2.videoplayer;

import android.os.Handler;
import android.os.Message;

public final class l extends Handler
{
  protected l(BasePlayerFragment paramBasePlayerFragment)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      return;
    case 0:
      this.a.e();
      return;
    case 1:
      this.a.d();
      return;
    case 2:
    }
    this.a.b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.l
 * JD-Core Version:    0.6.0
 */