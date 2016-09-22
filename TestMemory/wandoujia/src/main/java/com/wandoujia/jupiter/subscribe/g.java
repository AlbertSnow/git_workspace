package com.wandoujia.jupiter.subscribe;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import java.util.concurrent.CountDownLatch;

final class g
  implements DialogInterface.OnDismissListener
{
  g(CountDownLatch paramCountDownLatch, h paramh)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    c.a(this.a, this.b, false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.g
 * JD-Core Version:    0.6.0
 */