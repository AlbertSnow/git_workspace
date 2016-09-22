package com.unionpay.pboc.engine;

import android.os.Handler;
import android.os.Message;

final class e
  implements com.unionpay.pboctransaction.b
{
  e(b paramb)
  {
  }

  public final void a()
  {
    b.a(this.a, 4);
  }

  public final void b()
  {
    Message localMessage = b.a(this.a).obtainMessage(4, null);
    b.a(this.a).sendMessage(localMessage);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.pboc.engine.e
 * JD-Core Version:    0.6.0
 */