package com.google.android.gms.analytics.internal;

import com.google.android.gms.analytics.k;

@Deprecated
public final class f
{
  private static volatile k a = new at();

  public static void a(String paramString)
  {
    g localg = g.b();
    if (localg != null)
      localg.f(paramString);
    while (true)
    {
      return;
      if (!a(2))
        continue;
    }
  }

  public static void a(String paramString, Object paramObject)
  {
    g localg = g.b();
    if (localg != null)
      localg.e(paramString, paramObject);
    while (true)
    {
      return;
      if (!a(3))
        continue;
      if (paramObject != null)
        new StringBuilder().append(paramString).append(":").append(paramObject);
    }
  }

  private static boolean a(int paramInt)
  {
    k localk = a;
    int i = 0;
    if (localk != null)
    {
      int j = a.a();
      i = 0;
      if (j <= paramInt)
        i = 1;
    }
    return i;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.f
 * JD-Core Version:    0.6.0
 */