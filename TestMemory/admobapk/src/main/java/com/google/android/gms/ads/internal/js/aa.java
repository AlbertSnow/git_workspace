package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.util.promise.c;
import com.google.android.gms.ads.internal.util.promise.e;

public final class aa extends e
{
  final ae a;
  private final Object b = new Object();
  private boolean c;

  public aa(ae paramae)
  {
    this.a = paramae;
  }

  public final void a_()
  {
    synchronized (this.b)
    {
      if (this.c)
        return;
      this.c = true;
      a(new ab(this), new c());
      a(new ac(this), new ad(this));
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.js.aa
 * JD-Core Version:    0.6.0
 */