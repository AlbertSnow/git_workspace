package com.google.zxing.common;

import java.util.Arrays;

public final class a
  implements Cloneable
{
  private int[] a;
  private int b;

  public a()
  {
    this.b = 0;
    this.a = new int[1];
  }

  public a(int paramInt)
  {
    this.b = paramInt;
    this.a = new int[(paramInt + 31) / 32];
  }

  private a(int[] paramArrayOfInt, int paramInt)
  {
    this.a = paramArrayOfInt;
    this.b = paramInt;
  }

  public final int a()
  {
    return this.b;
  }

  public final void a(int paramInt1, int paramInt2)
  {
    this.a[(paramInt1 / 32)] = paramInt2;
  }

  public final boolean a(int paramInt)
  {
    return (this.a[(paramInt / 32)] & 1 << (paramInt & 0x1F)) != 0;
  }

  public final void b()
  {
    int i = this.a.length;
    for (int j = 0; j < i; j++)
      this.a[j] = 0;
  }

  public final void b(int paramInt)
  {
    int[] arrayOfInt = this.a;
    int i = paramInt / 32;
    arrayOfInt[i] |= 1 << (paramInt & 0x1F);
  }

  public final boolean b(int paramInt1, int paramInt2)
  {
    if (paramInt2 < paramInt1)
      throw new IllegalArgumentException();
    if (paramInt2 == paramInt1)
      return true;
    int i = paramInt2 - 1;
    int j = paramInt1 / 32;
    int k = i / 32;
    label145: for (int m = j; m <= k; m++)
    {
      int n;
      int i1;
      label68: int i3;
      if (m > j)
      {
        n = 0;
        if (m >= k)
          break label107;
        i1 = 31;
        if ((n != 0) || (i1 != 31))
          break label116;
        i3 = -1;
      }
      while (true)
      {
        if ((i3 & this.a[m]) == 0)
          break label145;
        return false;
        n = paramInt1 & 0x1F;
        break;
        label107: i1 = i & 0x1F;
        break label68;
        label116: int i2 = n;
        i3 = 0;
        while (i2 <= i1)
        {
          i3 |= 1 << i2;
          i2++;
        }
      }
    }
    return true;
  }

  public final int c(int paramInt)
  {
    int k;
    if (paramInt >= this.b)
      k = this.b;
    do
    {
      return k;
      int i = paramInt / 32;
      for (int j = this.a[i] & (0xFFFFFFFF ^ -1 + (1 << (paramInt & 0x1F))); j == 0; j = this.a[i])
      {
        i++;
        if (i == this.a.length)
          return this.b;
      }
      k = i * 32 + Integer.numberOfTrailingZeros(j);
    }
    while (k <= this.b);
    return this.b;
  }

  public final int[] c()
  {
    return this.a;
  }

  public final int d(int paramInt)
  {
    int k;
    if (paramInt >= this.b)
      k = this.b;
    do
    {
      return k;
      int i = paramInt / 32;
      for (int j = (0xFFFFFFFF ^ this.a[i]) & (0xFFFFFFFF ^ -1 + (1 << (paramInt & 0x1F))); j == 0; j = 0xFFFFFFFF ^ this.a[i])
      {
        i++;
        if (i == this.a.length)
          return this.b;
      }
      k = i * 32 + Integer.numberOfTrailingZeros(j);
    }
    while (k <= this.b);
    return this.b;
  }

  public final void d()
  {
    int i = 1;
    int[] arrayOfInt = new int[this.a.length];
    int j = (-1 + this.b) / 32;
    int k = j + 1;
    for (int m = 0; m < k; m++)
    {
      long l1 = this.a[m];
      long l2 = 0x55555555 & l1 >> i | (l1 & 0x55555555) << i;
      long l3 = 0x33333333 & l2 >> 2 | (l2 & 0x33333333) << 2;
      long l4 = 0xF0F0F0F & l3 >> 4 | (l3 & 0xF0F0F0F) << 4;
      long l5 = 0xFF00FF & l4 >> 8 | (l4 & 0xFF00FF) << 8;
      long l6 = 0xFFFF & l5 >> 16 | (l5 & 0xFFFF) << 16;
      arrayOfInt[(j - m)] = (int)l6;
    }
    if (this.b != k * 32)
    {
      int n = k * 32 - this.b;
      int i1 = 0;
      int i2 = i;
      while (i1 < 31 - n)
      {
        i2 = 0x1 | i2 << 1;
        i1++;
      }
      int i3 = i2 & arrayOfInt[0] >> n;
      while (i < k)
      {
        int i4 = arrayOfInt[i];
        int i5 = i3 | i4 << 32 - n;
        arrayOfInt[(i - 1)] = i5;
        i3 = i2 & i4 >> n;
        i++;
      }
      arrayOfInt[(k - 1)] = i3;
    }
    this.a = arrayOfInt;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a));
    a locala;
    do
    {
      return false;
      locala = (a)paramObject;
    }
    while ((this.b != locala.b) || (!Arrays.equals(this.a, locala.a)));
    return true;
  }

  public final int hashCode()
  {
    return 31 * this.b + Arrays.hashCode(this.a);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(this.b);
    int i = 0;
    if (i < this.b)
    {
      if ((i & 0x7) == 0)
        localStringBuilder.append(' ');
      if (a(i));
      for (char c = 'X'; ; c = '.')
      {
        localStringBuilder.append(c);
        i++;
        break;
      }
    }
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.common.a
 * JD-Core Version:    0.6.0
 */