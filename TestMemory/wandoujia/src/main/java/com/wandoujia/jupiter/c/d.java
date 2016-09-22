package com.wandoujia.jupiter.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import java.util.concurrent.CountDownLatch;

final class d
  implements DialogInterface.OnClickListener
{
  d(b paramb, View paramView)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.b.a[0] = false;
    this.b.b.countDown();
    a.a(this.a, 0L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.c.d
 * JD-Core Version:    0.6.0
 */