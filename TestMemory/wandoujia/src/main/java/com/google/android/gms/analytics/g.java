package com.google.android.gms.analytics;

public final class g extends h<g>
{
  public g()
  {
    a("&t", "event");
  }

  public final g a(long paramLong)
  {
    a("&ev", Long.toString(paramLong));
    return this;
  }

  public final g a(String paramString)
  {
    a("&ec", paramString);
    return this;
  }

  public final g b(String paramString)
  {
    a("&ea", paramString);
    return this;
  }

  public final g c(String paramString)
  {
    a("&el", paramString);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.g
 * JD-Core Version:    0.6.0
 */