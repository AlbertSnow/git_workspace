package com.google.android.gms.internal;

import android.os.Process;

final class ae extends Thread
{
  ae(Runnable paramRunnable, String paramString)
  {
    super(paramRunnable, paramString);
  }

  public final void run()
  {
    Process.setThreadPriority(10);
    super.run();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.ae
 * JD-Core Version:    0.6.0
 */