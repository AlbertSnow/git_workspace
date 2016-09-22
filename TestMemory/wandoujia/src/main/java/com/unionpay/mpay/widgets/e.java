package com.unionpay.mpay.widgets;

import android.os.Handler;
import android.os.Message;

final class e extends Thread
{
  e(z paramz)
  {
  }

  public final void run()
  {
    long l1 = 60000L + System.currentTimeMillis();
    while (true)
    {
      long l2 = System.currentTimeMillis();
      if (l2 > l1)
        break;
      int i = (int)((60L + (l1 - l2)) / 1000L);
      if (i <= 0)
        break;
      Message localMessage = Message.obtain();
      localMessage.what = 0;
      localMessage.arg1 = i;
      z.b(this.a).sendMessage(localMessage);
      try
      {
        sleep(1000L);
      }
      catch (InterruptedException localInterruptedException)
      {
        z.b(this.a).sendEmptyMessage(1);
        return;
      }
    }
    z.b(this.a).sendEmptyMessage(1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.widgets.e
 * JD-Core Version:    0.6.0
 */