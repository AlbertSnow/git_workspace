package com.google.zxing.oned.rss;

import com.google.zxing.f;

public final class c
{
  private final int a;
  private final int[] b;
  private final f[] c;

  public c(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramArrayOfInt;
    f[] arrayOff = new f[2];
    arrayOff[0] = new f(paramInt2, paramInt4);
    arrayOff[1] = new f(paramInt3, paramInt4);
    this.c = arrayOff;
  }

  public final int a()
  {
    return this.a;
  }

  public final int[] b()
  {
    return this.b;
  }

  public final f[] c()
  {
    return this.c;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof c));
    c localc;
    do
    {
      return false;
      localc = (c)paramObject;
    }
    while (this.a != localc.a);
    return true;
  }

  public final int hashCode()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.rss.c
 * JD-Core Version:    0.6.0
 */