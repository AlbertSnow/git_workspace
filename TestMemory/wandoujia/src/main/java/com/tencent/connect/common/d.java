package com.tencent.connect.common;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.tauth.b;

final class d extends Handler
{
  d(c paramc, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 0)
    {
      c.a(this.a).a(paramMessage.obj);
      return;
    }
    c.a(this.a).a(new com.tencent.tauth.d(paramMessage.what, (String)paramMessage.obj));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.common.d
 * JD-Core Version:    0.6.0
 */