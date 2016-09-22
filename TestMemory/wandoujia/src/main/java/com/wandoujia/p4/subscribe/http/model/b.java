package com.wandoujia.p4.subscribe.http.model;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.concurrent.CountDownLatch;

final class b
  implements DialogInterface.OnClickListener
{
  b(SubscribePublisher paramSubscribePublisher, CountDownLatch paramCountDownLatch, e parame)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    SubscribePublisher.access$100(this.c, this.a, this.b, true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.http.model.b
 * JD-Core Version:    0.6.0
 */