package com.google.android.gms.ads.internal.util.future;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class d
  implements Runnable
{
  public d(a parama, f paramf, g paramg)
  {
  }

  public final void run()
  {
    try
    {
      this.a.b(this.b.a(this.c.get()));
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      this.a.cancel(true);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label28;
    }
    catch (CancellationException localCancellationException)
    {
      label28: break label28;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.future.d
 * JD-Core Version:    0.6.0
 */