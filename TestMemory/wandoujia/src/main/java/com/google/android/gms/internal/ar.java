package com.google.android.gms.internal;

public abstract class ar<M extends ar<M>> extends aw
{
  protected at m;

  private M c()
  {
    ar localar = (ar)super.b();
    av.a(this, localar);
    return localar;
  }

  protected final int a()
  {
    if ((this.m == null) || (this.m.a()))
      return 0;
    return this.m.hashCode();
  }

  protected final boolean a(M paramM)
  {
    if ((this.m == null) || (this.m.a()))
      return (paramM.m == null) || (paramM.m.a());
    return this.m.equals(paramM.m);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.ar
 * JD-Core Version:    0.6.0
 */