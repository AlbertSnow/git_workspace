package com.wandoujia.p4.connection.ui;

import android.net.Uri;

final class b extends Thread
{
  b(ConnectionActivity paramConnectionActivity, Uri paramUri)
  {
  }

  public final void run()
  {
    try
    {
      sleep(1000L);
      label6: ConnectionActivity.a(this.b, this.a);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label6;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.connection.ui.b
 * JD-Core Version:    0.6.0
 */