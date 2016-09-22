package com.unionpay.pboc.engine;

import android.os.Handler;
import android.os.Message;
import com.unionpay.pboctransaction.e;
import java.util.ArrayList;

final class f
  implements Runnable
{
  f(b paramb)
  {
  }

  public final void run()
  {
    ArrayList localArrayList = b.b(this.a).b();
    Message localMessage = b.a(this.a).obtainMessage(1, localArrayList);
    b.a(this.a).sendMessage(localMessage);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.pboc.engine.f
 * JD-Core Version:    0.6.0
 */