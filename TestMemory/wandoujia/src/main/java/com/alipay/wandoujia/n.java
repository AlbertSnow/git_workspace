package com.alipay.wandoujia;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class n extends Handler
{
  public n(Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    try
    {
      ((k)paramMessage.obj).b();
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.n
 * JD-Core Version:    0.6.0
 */