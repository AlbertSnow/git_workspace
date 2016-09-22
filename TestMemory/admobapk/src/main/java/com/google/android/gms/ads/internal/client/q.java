package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.formats.client.ah;
import com.google.android.gms.ads.internal.purchase.client.s;
import com.google.android.gms.ads.internal.reward.client.n;

@com.google.android.gms.ads.internal.report.client.a
public final class q
{
  private static final Object c = new Object();
  private static q d;
  public final com.google.android.gms.ads.internal.util.client.a a = new com.google.android.gms.ads.internal.util.client.a();
  public final k b = new k(new e(), new d(), new bn(), new ah(), new n(), new s(), new com.google.android.gms.ads.internal.overlay.client.a());

  static
  {
    q localq = new q();
    synchronized (c)
    {
      d = localq;
      return;
    }
  }

  public static q a()
  {
    synchronized (c)
    {
      q localq = d;
      return localq;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.q
 * JD-Core Version:    0.6.0
 */