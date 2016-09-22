package com.google.android.gms.internal;

import java.util.Arrays;

final class ax
{
  final int a;
  final byte[] b;

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    ax localax;
    do
    {
      return true;
      if (!(paramObject instanceof ax))
        return false;
      localax = (ax)paramObject;
    }
    while ((this.a == localax.a) && (Arrays.equals(this.b, localax.b)));
    return false;
  }

  public final int hashCode()
  {
    return 31 * (527 + this.a) + Arrays.hashCode(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.ax
 * JD-Core Version:    0.6.0
 */