package com.wandoujia.ripple_framework.download.a;

import android.os.Handler;
import java.util.List;

final class c
  implements Runnable
{
  c(a parama, int paramInt, p paramp)
  {
  }

  public final void run()
  {
    List localList = a.b(this.c).a(this.b);
    a.d(this.c).post(new d(this, localList));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.a.c
 * JD-Core Version:    0.6.0
 */