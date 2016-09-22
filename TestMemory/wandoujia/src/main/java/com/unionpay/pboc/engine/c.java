package com.unionpay.pboc.engine;

import android.os.Handler;
import android.os.Message;

final class c
  implements com.unionpay.pboctransaction.b
{
  c(b paramb)
  {
  }

  public final void a()
  {
    b.a(this.a, 1);
  }

  public final void b()
  {
    Message localMessage = b.a(this.a).obtainMessage(1, null);
    b.a(this.a).sendMessage(localMessage);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.pboc.engine.c
 * JD-Core Version:    0.6.0
 */