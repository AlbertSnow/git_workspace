package com.google.android.gms.ads.internal.directappinstall;

import android.content.Context;
import aom;

@com.google.android.gms.ads.internal.report.client.a
public final class b
{
  private static final Object e = new Object();
  private static b f;
  public final Context a;
  public final c b;
  public final aom c;
  public long d;

  private b(Context paramContext, aom paramaom)
  {
    this.a = paramContext;
    this.b = new c(this.a);
    this.c = paramaom;
    this.d = a.a;
  }

  public static b a(Context paramContext, aom paramaom)
  {
    synchronized (e)
    {
      if (f == null)
        f = new b(paramContext, paramaom);
      b localb = f;
      return localb;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.directappinstall.b
 * JD-Core Version:    0.6.0
 */