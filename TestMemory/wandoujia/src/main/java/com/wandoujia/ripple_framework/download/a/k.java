package com.wandoujia.ripple_framework.download.a;

import android.os.Handler;
import java.util.List;

final class k
  implements Runnable
{
  k(a parama, p paramp)
  {
  }

  public final void run()
  {
    List localList = a.b(this.b).a();
    a.d(this.b).post(new l(this, localList));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.a.k
 * JD-Core Version:    0.6.0
 */