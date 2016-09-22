package com.google.android.gms.analytics.internal;

public abstract class u extends t
{
  private boolean a;

  protected u(w paramw)
  {
    super(paramw);
  }

  public final void A()
  {
    a();
    this.a = true;
  }

  protected abstract void a();

  public final boolean y()
  {
    return this.a;
  }

  protected final void z()
  {
    if (!y())
      throw new IllegalStateException("Not initialized");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.u
 * JD-Core Version:    0.6.0
 */