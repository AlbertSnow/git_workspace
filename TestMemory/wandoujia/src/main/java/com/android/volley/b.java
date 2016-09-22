package com.android.volley;

import android.os.Process;
import com.wandoujia.log.toolkit.LaunchLogger;
import java.util.concurrent.BlockingQueue;

public final class b extends Thread
{
  private static final boolean a = n.a;
  private final BlockingQueue<Request> b;
  private final BlockingQueue<Request> c;
  private final a d;
  private final l e;
  private volatile boolean f = false;

  public b(BlockingQueue<Request> paramBlockingQueue1, BlockingQueue<Request> paramBlockingQueue2, a parama, l paraml)
  {
    this.b = paramBlockingQueue1;
    this.c = paramBlockingQueue2;
    this.d = parama;
    this.e = paraml;
  }

  public final void a()
  {
    this.f = true;
    interrupt();
  }

  public final void run()
  {
    if (a)
      n.a("start new dispatcher", new Object[0]);
    Process.setThreadPriority(10);
    this.d.a();
    Request localRequest;
    label73: LaunchLogger localLaunchLogger;
    while (true)
    {
      try
      {
        localRequest = (Request)this.b.take();
        localRequest.a("cache-queue-take");
        if (!localRequest.g())
          break label73;
        localRequest.b("cache-discard-canceled");
        continue;
      }
      catch (InterruptedException localInterruptedException)
      {
      }
      if (this.f)
      {
        return;
        localLaunchLogger = this.d.a(localRequest.d());
        if (localLaunchLogger != null)
          break;
        localRequest.a("cache-miss");
        this.c.put(localRequest);
      }
    }
    if (3000L + localLaunchLogger.d < System.currentTimeMillis());
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        localRequest.a("cache-hit-expired");
        localRequest.a(localLaunchLogger);
        this.c.put(localRequest);
        break;
      }
      localRequest.a("cache-hit");
      com.wandoujia.p4.app.detail.model.b localb = localRequest.a(new com.wandoujia.nirvana.framework.network.a.a(localLaunchLogger.a, localLaunchLogger.f));
      localRequest.a("cache-hit-parsed");
      if (!localLaunchLogger.a())
      {
        this.e.a(localRequest, localb);
        break;
      }
      localRequest.a("cache-hit-refresh-needed");
      localRequest.a(localLaunchLogger);
      localb.d = true;
      this.e.a(localRequest, localb, new c(this, localRequest));
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.b
 * JD-Core Version:    0.6.0
 */