package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Message;

final class n extends Handler
{
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      new StringBuilder("Unknown message id: ").append(paramMessage.what);
      return;
    case 1:
      a.l();
      return;
    case 2:
    }
    a.a(null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.n
 * JD-Core Version:    0.6.0
 */