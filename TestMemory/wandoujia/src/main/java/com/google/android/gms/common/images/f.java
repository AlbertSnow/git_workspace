package com.google.android.gms.common.images;

import com.google.android.gms.common.internal.p;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public final class f extends d
{
  protected final void b()
  {
    null.get();
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof f))
      return false;
    if (this == paramObject)
      return true;
    f localf = (f)paramObject;
    android.support.v7.app.f localf1 = (android.support.v7.app.f)null.get();
    android.support.v7.app.f localf2 = (android.support.v7.app.f)null.get();
    return (localf2 != null) && (localf1 != null) && (p.a(localf2, localf1)) && (p.a(localf.a, this.a));
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return Arrays.hashCode(arrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.images.f
 * JD-Core Version:    0.6.0
 */