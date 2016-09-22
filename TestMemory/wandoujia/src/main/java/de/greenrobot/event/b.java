package de.greenrobot.event;

import java.util.concurrent.ExecutorService;

final class b
  implements Runnable
{
  private final k a;
  private final c b;
  private volatile boolean c;

  b(c paramc)
  {
    this.b = paramc;
    this.a = new k();
  }

  public final void a(o paramo, Object paramObject)
  {
    j localj = j.a(paramo, paramObject);
    monitorenter;
    try
    {
      this.a.a(localj);
      if (!this.c)
      {
        this.c = true;
        this.b.b().execute(this);
      }
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void run()
  {
    try
    {
      localj = this.a.b();
      if (localj == null)
        monitorenter;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
    finally
    {
      j localj;
      this.c = false;
    }
    throw localObject1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     de.greenrobot.event.b
 * JD-Core Version:    0.6.0
 */