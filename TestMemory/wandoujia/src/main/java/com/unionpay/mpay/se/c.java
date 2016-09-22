package com.unionpay.mpay.se;

import android.os.Bundle;
import android.os.Handler;

final class c
  implements Runnable
{
  c(a parama, com.unionpay.pboctransaction.model.b paramb, String paramString)
  {
  }

  public final void run()
  {
    Bundle localBundle = a.i(this.c).Z.a(this.a, this.b, a.h(this.c).g);
    Handler localHandler1 = a.j(this.c);
    Handler localHandler2 = a.j(this.c);
    if (localBundle != null);
    while (true)
    {
      localHandler1.sendMessage(localHandler2.obtainMessage(0, localBundle));
      return;
      localBundle = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.se.c
 * JD-Core Version:    0.6.0
 */