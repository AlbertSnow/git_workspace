package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.support.v4.app.d;

public final class y
{
  private final Context a;
  private final Context b;

  public y(Context paramContext)
  {
    d.a(paramContext);
    Context localContext = paramContext.getApplicationContext();
    d.a(localContext, "Application context can't be null");
    this.a = localContext;
    this.b = localContext;
  }

  protected static am a(w paramw)
  {
    return new am(paramw);
  }

  protected static as b(w paramw)
  {
    return new as(paramw);
  }

  public static z d(w paramw)
  {
    return new z(paramw);
  }

  public static ax e(w paramw)
  {
    return new ax(paramw);
  }

  public static j f(w paramw)
  {
    return new j(paramw);
  }

  public final Context a()
  {
    return this.a;
  }

  public final Context b()
  {
    return this.b;
  }

  final ah c(w paramw)
  {
    return new ah(paramw, this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.y
 * JD-Core Version:    0.6.0
 */