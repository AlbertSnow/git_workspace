package de.greenrobot.event;

import java.util.concurrent.ExecutorService;

final class a
  implements Runnable
{
  private final k a;
  private final c b;

  a(c paramc)
  {
    this.b = paramc;
    this.a = new k();
  }

  public final void a(o paramo, Object paramObject)
  {
    j localj = j.a(paramo, paramObject);
    this.a.a(localj);
    this.b.b().execute(this);
  }

  public final void run()
  {
    j localj = this.a.a();
    if (localj == null)
      throw new IllegalStateException("No pending post available");
    this.b.a(localj);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     de.greenrobot.event.a
 * JD-Core Version:    0.6.0
 */