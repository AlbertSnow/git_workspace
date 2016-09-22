package com.wandoujia.jupiter.media.controller;

import android.os.Handler;
import android.os.Message;

final class e extends Handler
{
  e(a parama)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      return;
    case 1:
    }
    this.a.k();
    sendEmptyMessageDelayed(1, 1000L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.e
 * JD-Core Version:    0.6.0
 */