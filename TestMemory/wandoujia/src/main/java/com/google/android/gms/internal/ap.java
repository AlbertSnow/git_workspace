package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

public final class ap
{
  private final Map<String, a> a;
  private final a b;

  public final Map<String, a> a()
  {
    return Collections.unmodifiableMap(this.a);
  }

  public final void a(String paramString, a parama)
  {
    this.a.put(paramString, parama);
  }

  public final a b()
  {
    return this.b;
  }

  public final String toString()
  {
    return "Properties: " + Collections.unmodifiableMap(this.a) + " pushAfterEvaluate: " + this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.ap
 * JD-Core Version:    0.6.0
 */