package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

final class d
  implements Executor
{
  d(Handler paramHandler)
  {
  }

  public final void execute(Runnable paramRunnable)
  {
    this.a.post(paramRunnable);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.d
 * JD-Core Version:    0.6.0
 */