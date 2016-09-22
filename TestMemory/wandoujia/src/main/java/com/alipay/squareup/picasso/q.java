package com.alipay.squareup.picasso;

import android.os.Process;

final class q extends Thread
{
  public q(Runnable paramRunnable)
  {
    super(paramRunnable);
  }

  public final void run()
  {
    Process.setThreadPriority(10);
    super.run();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.squareup.picasso.q
 * JD-Core Version:    0.6.0
 */