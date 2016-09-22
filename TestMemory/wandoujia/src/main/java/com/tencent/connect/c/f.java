package com.tencent.connect.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.open.utils.d;

final class f extends Handler
{
  f(Looper paramLooper, d paramd)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      super.handleMessage(paramMessage);
      return;
    case 101:
      String str = (String)paramMessage.obj;
      this.a.a(0, str);
      return;
    case 102:
    }
    int i = paramMessage.arg1;
    this.a.a(i, null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.c.f
 * JD-Core Version:    0.6.0
 */