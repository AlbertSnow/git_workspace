package com.google.android.gms.analytics.internal;

public final class ar
  implements ar<c>
{
  private final w a;
  private final c b;

  public ar(w paramw)
  {
    this.a = paramw;
    this.b = new c();
  }

  public final c a()
  {
    return this.b;
  }

  public final void a(String paramString, int paramInt)
  {
    if ("ga_dispatchPeriod".equals(paramString))
    {
      this.b.d = paramInt;
      return;
    }
    this.a.e().d("Int xml configuration name not recognized", paramString);
  }

  public final void a(String paramString1, String paramString2)
  {
    if ("ga_appName".equals(paramString1))
    {
      this.b.a = paramString2;
      return;
    }
    if ("ga_appVersion".equals(paramString1))
    {
      this.b.b = paramString2;
      return;
    }
    if ("ga_logLevel".equals(paramString1))
    {
      this.b.c = paramString2;
      return;
    }
    this.a.e().d("String xml configuration name not recognized", paramString1);
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    if ("ga_dryRun".equals(paramString))
    {
      c localc = this.b;
      if (paramBoolean);
      for (int i = 1; ; i = 0)
      {
        localc.e = i;
        return;
      }
    }
    this.a.e().d("Bool xml configuration name not recognized", paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.ar
 * JD-Core Version:    0.6.0
 */