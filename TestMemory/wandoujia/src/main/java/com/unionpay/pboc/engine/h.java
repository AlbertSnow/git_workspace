package com.unionpay.pboc.engine;

import android.os.Handler;
import android.os.Message;
import com.unionpay.pboctransaction.e;
import java.util.ArrayList;

final class h
  implements Runnable
{
  h(b paramb)
  {
  }

  public final void run()
  {
    ArrayList localArrayList = b.d(this.a).b();
    Message localMessage = b.a(this.a).obtainMessage(4, localArrayList);
    b.a(this.a).sendMessage(localMessage);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.pboc.engine.h
 * JD-Core Version:    0.6.0
 */