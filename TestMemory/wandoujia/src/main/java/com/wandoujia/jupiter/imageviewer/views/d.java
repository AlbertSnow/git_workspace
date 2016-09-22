package com.wandoujia.jupiter.imageviewer.views;

import android.os.Handler;
import java.util.TimerTask;

final class d extends TimerTask
{
  private d(TouchImageView paramTouchImageView)
  {
  }

  public final void run()
  {
    TouchImageView.a(this.a).sendEmptyMessage(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.imageviewer.views.d
 * JD-Core Version:    0.6.0
 */