package com.google.android.gms.internal;

import I;
import android.os.SystemClock;

public final class s
  implements r
{
  private static s a;

  public static a a(a parama)
  {
    a locala = new a();
    locala.a = parama.a;
    locala.k = ((int[])parama.k.clone());
    if (parama.l)
      locala.l = parama.l;
    return locala;
  }

  public static r c()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new s();
      s locals = a;
      return locals;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final long a()
  {
    return System.currentTimeMillis();
  }

  public final long b()
  {
    return SystemClock.elapsedRealtime();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.s
 * JD-Core Version:    0.6.0
 */