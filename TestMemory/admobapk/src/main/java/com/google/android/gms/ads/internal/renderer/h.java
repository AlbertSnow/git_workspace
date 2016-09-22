package com.google.android.gms.ads.internal.renderer;

import com.google.android.gms.ads.internal.state.a;

final class h
  implements Runnable
{
  h(f paramf, a parama)
  {
  }

  public final void run()
  {
    synchronized (this.b.c)
    {
      f localf = this.b;
      a locala = this.a;
      localf.a.b(locala);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.h
 * JD-Core Version:    0.6.0
 */