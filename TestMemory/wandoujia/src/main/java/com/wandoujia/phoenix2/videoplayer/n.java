package com.wandoujia.phoenix2.videoplayer;

import android.os.Handler;
import com.wandoujia.jupiter.JupiterApplication;
import java.util.TimerTask;

final class n extends TimerTask
{
  private n(BasePlayerFragment paramBasePlayerFragment)
  {
  }

  public final void run()
  {
    JupiterApplication.a().post(new o(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.phoenix2.videoplayer.n
 * JD-Core Version:    0.6.0
 */