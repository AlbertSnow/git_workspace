package de.greenrobot.event;

final class k
{
  private j a;
  private j b;

  final j a()
  {
    monitorenter;
    try
    {
      j localj = this.a;
      if (this.a != null)
      {
        this.a = this.a.c;
        if (this.a == null)
          this.b = null;
      }
      monitorexit;
      return localj;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  final void a(j paramj)
  {
    monitorenter;
    if (paramj == null)
      try
      {
        throw new NullPointerException("null cannot be enqueued");
      }
      finally
      {
        monitorexit;
      }
    if (this.b != null)
    {
      this.b.c = paramj;
      this.b = paramj;
    }
    while (true)
    {
      notifyAll();
      monitorexit;
      return;
      if (this.a != null)
        break;
      this.b = paramj;
      this.a = paramj;
    }
    throw new IllegalStateException("Head present, but no tail");
  }

  final j b()
  {
    monitorenter;
    try
    {
      if (this.a == null)
        wait(1000L);
      j localj = a();
      return localj;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     de.greenrobot.event.k
 * JD-Core Version:    0.6.0
 */