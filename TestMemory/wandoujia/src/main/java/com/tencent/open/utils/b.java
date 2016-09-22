package com.tencent.open.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.open.a.f;

final class b extends Handler
{
  b(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    f.a("AsynLoadImg", "handleMessage:" + paramMessage.arg1);
    if (paramMessage.arg1 == 0)
    {
      a.a(this.a).a(paramMessage.arg1, (String)paramMessage.obj);
      return;
    }
    a.a(this.a).a(paramMessage.arg1, null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.utils.b
 * JD-Core Version:    0.6.0
 */