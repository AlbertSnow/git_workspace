package com.tencent.open.b;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.tencent.open.utils.i;
import com.tencent.open.utils.o;
import java.util.List;
import java.util.TimeZone;

final class h
  implements Runnable
{
  h(f paramf, Bundle paramBundle, boolean paramBoolean)
  {
  }

  public final void run()
  {
    try
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("uin", "1000");
      localBundle.putString("imei", c.b(android.support.v4.app.b.t()));
      localBundle.putString("imsi", c.c(android.support.v4.app.b.t()));
      localBundle.putString("android_id", c.d(android.support.v4.app.b.t()));
      localBundle.putString("mac", c.a());
      localBundle.putString("platform", "1");
      localBundle.putString("os_ver", Build.VERSION.RELEASE);
      localBundle.putString("position", o.c(android.support.v4.app.b.t()));
      localBundle.putString("network", a.a(android.support.v4.app.b.t()));
      localBundle.putString("language", c.b());
      localBundle.putString("resolution", c.a(android.support.v4.app.b.t()));
      localBundle.putString("apn", a.b(android.support.v4.app.b.t()));
      localBundle.putString("model_name", Build.MODEL);
      localBundle.putString("timezone", TimeZone.getDefault().getID());
      localBundle.putString("sdk_ver", "2.9.4");
      localBundle.putString("qz_ver", o.c(android.support.v4.app.b.t(), "com.qzone"));
      localBundle.putString("qq_ver", o.b(android.support.v4.app.b.t(), "com.tencent.mobileqq"));
      localBundle.putString("qua", o.d(android.support.v4.app.b.t(), android.support.v4.app.b.u()));
      localBundle.putString("packagename", android.support.v4.app.b.u());
      localBundle.putString("app_ver", o.c(android.support.v4.app.b.t(), android.support.v4.app.b.u()));
      if (this.a != null)
        localBundle.putAll(this.a);
      b localb = new b(localBundle);
      this.c.b.add(localb);
      int i = this.c.b.size();
      int j = i.a(android.support.v4.app.b.t(), null).a("Agent_ReportTimeInterval");
      if (j == 0)
        j = 10000;
      if ((f.a("report_via", i)) || (this.b))
      {
        this.c.e();
        this.c.c.removeMessages(1001);
        return;
      }
      if (!this.c.c.hasMessages(1001))
      {
        Message localMessage = Message.obtain();
        localMessage.what = 1001;
        this.c.c.sendMessageDelayed(localMessage, j);
        return;
      }
    }
    catch (Exception localException)
    {
      com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "--> reporVia, exception in sub thread.", localException);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.b.h
 * JD-Core Version:    0.6.0
 */