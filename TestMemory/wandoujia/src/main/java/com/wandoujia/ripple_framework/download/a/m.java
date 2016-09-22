package com.wandoujia.ripple_framework.download.a;

import android.os.Handler;
import java.util.List;

final class m
  implements Runnable
{
  m(a parama, p paramp)
  {
  }

  public final void run()
  {
    List localList = a.b(this.b).b();
    a.d(this.b).post(new n(this, localList));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.a.m
 * JD-Core Version:    0.6.0
 */