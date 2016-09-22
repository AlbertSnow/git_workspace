package com.wandoujia.logv3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.SystemUtil;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.HttpClient;

public final class LogSender
{
  private static final Object f = new Object();
  private final Context a;
  private final b b;
  private final c c;
  private HttpClient d;
  private final m e;
  private boolean g = false;
  private long h = 0L;
  private final LogSender.SenderPolicyModel i;
  private final LogSender.SenderPolicyModel j;
  private boolean k = true;
  private String l;
  private final ScheduledExecutorService m = Executors.newSingleThreadScheduledExecutor();

  LogSender(Context paramContext, b paramb, c paramc)
  {
    this.a = paramContext;
    this.b = paramb;
    this.c = paramc;
    this.i = this.c.l();
    this.j = this.c.m();
    String str1 = paramc.h();
    String str2 = paramc.j();
    String str3 = paramc.i();
    String str4 = String.valueOf(SystemUtil.getVersionCode(paramContext));
    String str5 = SystemUtil.getVersionName(paramContext);
    if (GlobalConfig.isDebug());
    for (String str6 = String.format("http://dmhd1.hy01.wandoujia.com/muce/data/proxy?profile=%1$s&vc=%2$s&vn=%3$s&gzip=true&encrypt=true&key_version=%4$s&log_version=%5$s", new Object[] { str1, str4, str5, str2, str3 }); ; str6 = String.format("http://l.wandoujia.com/muce/data/proxy?profile=%1$s&vc=%2$s&vn=%3$s&gzip=true&encrypt=true&key_version=%4$s&log_version=%5$s", new Object[] { str1, str4, str5, str2, str3 }))
    {
      this.l = str6;
      HandlerThread localHandlerThread = new HandlerThread("log-senderv3-thread");
      localHandlerThread.start();
      this.e = new m(this, localHandlerThread.getLooper());
      this.m.scheduleWithFixedDelay(new k(this), 5L, 10L, TimeUnit.MINUTES);
      return;
    }
  }

  public final void a(boolean paramBoolean)
  {
    long l1 = 0L;
    int i1;
    if (!paramBoolean)
    {
      if (!GlobalConfig.isDebug())
        break label112;
      i1 = 1;
      if (i1 == 0)
        break label111;
    }
    while (true)
    {
      synchronized (f)
      {
        if (!this.g)
        {
          long l3 = SystemClock.elapsedRealtime();
          if (this.h != l1)
            continue;
          l2 = l1;
          this.g = true;
          this.h = l3;
          l1 = l3;
          n = 1;
          if (n == 0)
            continue;
          Message localMessage = Message.obtain();
          localMessage.what = 1001;
          localMessage.obj = Long.valueOf(l1);
          this.e.sendMessageDelayed(localMessage, l2);
          label111: return;
          label112: LogSender.SenderPolicyModel localSenderPolicyModel;
          switch (NetworkUtil.getNetworkType())
          {
          default:
            i1 = 0;
            break;
          case 0:
            localSenderPolicyModel = this.j;
            switch (l.a[LogSender.SenderPolicyModel.access$400(localSenderPolicyModel).ordinal()])
            {
            default:
              i1 = 0;
            case 1:
            case 2:
            case 3:
            case 4:
            }
            break;
          case 1:
            localSenderPolicyModel = this.i;
            break;
          case -1:
            i1 = 0;
            break;
            i1 = 0;
            break;
            i1 = 1;
            break;
            if (!this.k)
              continue;
            this.k = false;
            i1 = 1;
            break;
            i1 = 0;
            break;
            if (LogSender.SenderPolicyModel.access$500(localSenderPolicyModel) + this.a.getSharedPreferences("log_modulev3", 0).getLong("log_senderv3_last_success_time", l1) > System.currentTimeMillis())
              continue;
            i1 = 1;
            break;
            i1 = 0;
            break;
          }
          l2 = 5000L;
        }
      }
      long l2 = l1;
      int n = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.LogSender
 * JD-Core Version:    0.6.0
 */