package com.wandoujia.p4.subscribe.http.model;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import java.util.concurrent.CountDownLatch;

final class d
  implements DialogInterface.OnDismissListener
{
  d(SubscribePublisher paramSubscribePublisher, CountDownLatch paramCountDownLatch, e parame)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    SubscribePublisher.access$100(this.c, this.a, this.b, false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.http.model.d
 * JD-Core Version:    0.6.0
 */