package com.alipay.squareup.picasso;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Map;
import java.util.concurrent.Future;

final class e extends Handler
{
  e(Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    Request localRequest = (Request)paramMessage.obj;
    if ((localRequest.h.isCancelled()) || (localRequest.l))
      return;
    Picasso localPicasso = localRequest.a;
    switch (paramMessage.what)
    {
    default:
      throw new AssertionError("Unknown handler message received: " + paramMessage.what);
    case 1:
      localPicasso.c.remove(localRequest.a());
      localRequest.b();
      return;
    case 2:
      localPicasso.c(localRequest);
      return;
    case 3:
    }
    localPicasso.c.remove(localRequest.a());
    localRequest.c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.e
 * JD-Core Version:    0.6.0
 */