package com.google.android.gms.internal;

final class at
  implements Cloneable
{
  private int[] a;
  private au[] b;
  private int c;

  static
  {
    new au();
  }

  public at()
  {
    this(10);
  }

  private at(int paramInt)
  {
    int i = a(paramInt * 4) / 4;
    this.a = new int[i];
    this.b = new au[i];
    this.c = 0;
  }

  private static int a(int paramInt)
  {
    for (int i = 4; ; i++)
    {
      if (i < 32)
      {
        if (paramInt > -12 + (1 << i))
          continue;
        paramInt = -12 + (1 << i);
      }
      return paramInt;
    }
  }

  public final boolean a()
  {
    return this.c == 0;
  }

  public final at b()
  {
    int i = 0;
    int j = this.c;
    at localat = new at(j);
    System.arraycopy(this.a, 0, localat.a, 0, j);
    while (i < j)
    {
      if (this.b[i] != null)
        localat.b[i] = this.b[i].a();
      i++;
    }
    localat.c = j;
    return localat;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    label147: label153: label157: 
    while (true)
    {
      return true;
      if (!(paramObject instanceof at))
        return false;
      at localat = (at)paramObject;
      if (this.c != localat.c)
        return false;
      int[] arrayOfInt1 = this.a;
      int[] arrayOfInt2 = localat.a;
      int i = this.c;
      int j = 0;
      int k;
      label76: int n;
      if (j < i)
        if (arrayOfInt1[j] != arrayOfInt2[j])
        {
          k = 0;
          if (k != 0)
          {
            au[] arrayOfau1 = this.b;
            au[] arrayOfau2 = localat.b;
            int m = this.c;
            n = 0;
            label102: if (n >= m)
              break label153;
            if (arrayOfau1[n].equals(arrayOfau2[n]))
              break label147;
          }
        }
      for (int i1 = 0; ; i1 = 1)
      {
        if (i1 != 0)
          break label157;
        return false;
        j++;
        break;
        k = 1;
        break label76;
        n++;
        break label102;
      }
    }
  }

  public final int hashCode()
  {
    int i = 17;
    for (int j = 0; j < this.c; j++)
      i = 31 * (i * 31 + this.a[j]) + this.b[j].hashCode();
    return i;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.at
 * JD-Core Version:    0.6.0
 */