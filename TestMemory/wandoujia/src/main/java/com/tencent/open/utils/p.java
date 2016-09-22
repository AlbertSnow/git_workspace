package com.tencent.open.utils;

import android.content.Context;
import android.os.Bundle;
import com.tencent.open.a.f;

final class p extends Thread
{
  p(Context paramContext, Bundle paramBundle)
  {
  }

  public final void run()
  {
    try
    {
      a.a(this.a, "http://cgi.qplus.com/report/report", "GET", this.b);
      return;
    }
    catch (Exception localException)
    {
      f.e("openSDK_LOG.Util", "reportBernoulli has exception: " + localException.getMessage());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.utils.p
 * JD-Core Version:    0.6.0
 */