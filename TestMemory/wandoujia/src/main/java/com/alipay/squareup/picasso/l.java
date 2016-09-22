package com.alipay.squareup.picasso;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class l extends Handler
{
  public l(k paramk, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    while (true)
    {
      synchronized (this.a)
      {
        switch (paramMessage.what)
        {
        default:
          new Handler(Looper.getMainLooper()).post(new m(paramMessage));
        case 0:
          return;
        case 1:
          k localk7 = this.a;
          localk7.b = (1L + localk7.b);
        case 2:
        case 3:
        case 4:
        }
      }
      k localk6 = this.a;
      localk6.c = (1L + localk6.c);
      continue;
      k localk4 = this.a;
      localk4.f = (1 + localk4.f);
      k localk5 = this.a;
      localk5.d += paramMessage.arg1;
      continue;
      k localk2 = this.a;
      localk2.g = (1 + localk2.g);
      k localk3 = this.a;
      localk3.e += paramMessage.arg1;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.l
 * JD-Core Version:    0.6.0
 */