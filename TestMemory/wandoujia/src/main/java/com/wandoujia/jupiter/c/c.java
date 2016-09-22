package com.wandoujia.jupiter.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import java.util.concurrent.CountDownLatch;

final class c
  implements DialogInterface.OnClickListener
{
  c(b paramb, View paramView)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.a[0] = true;
    this.b.b.countDown();
    a.a(this.a, 1L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.c.c
 * JD-Core Version:    0.6.0
 */