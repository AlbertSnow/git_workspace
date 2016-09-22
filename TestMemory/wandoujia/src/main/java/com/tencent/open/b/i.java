package com.tencent.open.b;

import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.util.List;

final class i
  implements Runnable
{
  i(f paramf, long paramLong1, String paramString1, String paramString2, int paramInt, long paramLong2, long paramLong3)
  {
  }

  public final void run()
  {
    int i = 1;
    while (true)
    {
      int j;
      int k;
      try
      {
        long l = SystemClock.elapsedRealtime() - this.a;
        Bundle localBundle = new Bundle();
        String str = a.a(android.support.v4.app.b.t());
        localBundle.putString("apn", str);
        localBundle.putString("appid", "1000067");
        localBundle.putString("commandid", this.b);
        localBundle.putString("detail", this.c);
        StringBuilder localStringBuilder1 = new StringBuilder();
        localStringBuilder1.append("network=").append(str).append('&');
        StringBuilder localStringBuilder2 = localStringBuilder1.append("sdcard=");
        if (Environment.getExternalStorageState().equals("mounted"))
        {
          j = i;
          localStringBuilder2.append(j).append('&');
          localStringBuilder1.append("wifi=").append(a.c(android.support.v4.app.b.t()));
          localBundle.putString("deviceInfo", localStringBuilder1.toString());
          k = 100 / f.a(this.d);
          if (k > 0)
            break label444;
          label177: localBundle.putString("frequency", String.valueOf(i));
          localBundle.putString("reqSize", this.e);
          localBundle.putString("resultCode", this.d);
          localBundle.putString("rspSize", this.f);
          localBundle.putString("timeCost", String.valueOf(l));
          localBundle.putString("uin", "1000");
          b localb = new b(localBundle);
          this.g.a.add(localb);
          int m = this.g.a.size();
          int n = com.tencent.open.utils.i.a(android.support.v4.app.b.t(), null).a("Agent_ReportTimeInterval");
          if (n != 0)
            continue;
          n = 10000;
          if (!f.a("report_cgi", m))
            continue;
          this.g.b();
          this.g.c.removeMessages(1000);
          return;
          if (!this.g.c.hasMessages(1000))
          {
            Message localMessage = Message.obtain();
            localMessage.what = 1000;
            this.g.c.sendMessageDelayed(localMessage, n);
            return;
          }
        }
      }
      catch (Exception localException)
      {
        com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "--> reportCGI, exception in sub thread.", localException);
        return;
      }
      label444: 
      do
      {
        i = k;
        break label177;
        return;
        j = 0;
        break;
      }
      while (k <= 100);
      i = 100;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.b.i
 * JD-Core Version:    0.6.0
 */