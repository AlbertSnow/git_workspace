package com.google.android.ads.tasks;

import awa;
import awb;
import com.google.ads.afma.nano.d;
import hf;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public final class j
  implements Callable
{
  private final hf a;
  private final d b;

  public j(hf paramhf, d paramd)
  {
    this.a = paramhf;
    this.b = paramd;
  }

  private Void a()
  {
    if (this.a.g != null)
      this.a.g.get();
    d locald1 = this.a.f;
    if (locald1 != null)
      try
      {
        synchronized (this.b)
        {
          awb.a(this.b, awb.a(locald1));
        }
      }
      catch (awa localawa)
      {
      }
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.ads.tasks.j
 * JD-Core Version:    0.6.0
 */