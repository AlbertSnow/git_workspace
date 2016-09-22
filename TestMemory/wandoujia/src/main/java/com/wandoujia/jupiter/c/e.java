package com.wandoujia.jupiter.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import java.util.concurrent.CountDownLatch;

final class e
  implements DialogInterface.OnDismissListener
{
  e(b paramb)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    this.a.b.countDown();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.c.e
 * JD-Core Version:    0.6.0
 */