package com.google.zxing.common.reedsolomon;

final class b
{
  private final a a;
  private final int[] b;

  b(a parama, int[] paramArrayOfInt)
  {
    if (paramArrayOfInt.length == 0)
      throw new IllegalArgumentException();
    this.a = parama;
    int i = paramArrayOfInt.length;
    if ((i > 1) && (paramArrayOfInt[0] == 0))
    {
      for (int j = 1; (j < i) && (paramArrayOfInt[j] == 0); j++);
      if (j == i)
      {
        this.b = new int[] { 0 };
        return;
      }
      this.b = new int[i - j];
      System.arraycopy(paramArrayOfInt, j, this.b, 0, this.b.length);
      return;
    }
    this.b = paramArrayOfInt;
  }

  final int a()
  {
    return -1 + this.b.length;
  }

  final int a(int paramInt)
  {
    return this.b[(-1 + this.b.length - paramInt)];
  }

  final b a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
      throw new IllegalArgumentException();
    if (paramInt2 == 0)
      return this.a.a();
    int i = this.b.length;
    int[] arrayOfInt = new int[i + paramInt1];
    for (int j = 0; j < i; j++)
      arrayOfInt[j] = this.a.c(this.b[j], paramInt2);
    return new b(this.a, arrayOfInt);
  }

  final b a(b paramb)
  {
    if (!this.a.equals(paramb.a))
      throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    if (b())
      return paramb;
    if (paramb.b())
      return this;
    Object localObject1 = this.b;
    Object localObject2 = paramb.b;
    if (localObject1.length > localObject2.length);
    while (true)
    {
      int[] arrayOfInt = new int[localObject1.length];
      int i = localObject1.length - localObject2.length;
      System.arraycopy(localObject1, 0, arrayOfInt, 0, i);
      for (int j = i; j < localObject1.length; j++)
        arrayOfInt[j] = a.b(localObject2[(j - i)], localObject1[j]);
      return new b(this.a, arrayOfInt);
      Object localObject3 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
  }

  final int b(int paramInt)
  {
    int i = 0;
    int k;
    if (paramInt == 0)
      k = a(0);
    while (true)
    {
      return k;
      int j = this.b.length;
      if (paramInt == 1)
      {
        int[] arrayOfInt = this.b;
        int i1 = arrayOfInt.length;
        k = 0;
        while (i < i1)
        {
          k = a.b(k, arrayOfInt[i]);
          i++;
        }
        continue;
      }
      k = this.b[0];
      int m = 1;
      while (m < j)
      {
        int n = a.b(this.a.c(paramInt, k), this.b[m]);
        m++;
        k = n;
      }
    }
  }

  final b b(b paramb)
  {
    if (!this.a.equals(paramb.a))
      throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    if ((b()) || (paramb.b()))
      return this.a.a();
    int[] arrayOfInt1 = this.b;
    int i = arrayOfInt1.length;
    int[] arrayOfInt2 = paramb.b;
    int j = arrayOfInt2.length;
    int[] arrayOfInt3 = new int[-1 + (i + j)];
    for (int k = 0; k < i; k++)
    {
      int m = arrayOfInt1[k];
      for (int n = 0; n < j; n++)
        arrayOfInt3[(k + n)] = a.b(arrayOfInt3[(k + n)], this.a.c(m, arrayOfInt2[n]));
    }
    return new b(this.a, arrayOfInt3);
  }

  final boolean b()
  {
    int i = this.b[0];
    int j = 0;
    if (i == 0)
      j = 1;
    return j;
  }

  final b c(int paramInt)
  {
    if (paramInt == 0)
      this = this.a.a();
    do
      return this;
    while (paramInt == 1);
    int i = this.b.length;
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++)
      arrayOfInt[j] = this.a.c(this.b[j], paramInt);
    return new b(this.a, arrayOfInt);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(8 * (-1 + this.b.length));
    int i = -1 + this.b.length;
    if (i >= 0)
    {
      int j = a(i);
      label54: int k;
      if (j != 0)
      {
        if (j >= 0)
          break label107;
        localStringBuilder.append(" - ");
        j = -j;
        if ((i == 0) || (j != 1))
        {
          k = this.a.b(j);
          if (k != 0)
            break label124;
          localStringBuilder.append('1');
        }
        label85: if (i != 0)
        {
          if (i != 1)
            break label157;
          localStringBuilder.append('x');
        }
      }
      while (true)
      {
        i--;
        break;
        label107: if (localStringBuilder.length() <= 0)
          break label54;
        localStringBuilder.append(" + ");
        break label54;
        label124: if (k == 1)
        {
          localStringBuilder.append('a');
          break label85;
        }
        localStringBuilder.append("a^");
        localStringBuilder.append(k);
        break label85;
        label157: localStringBuilder.append("x^");
        localStringBuilder.append(i);
      }
    }
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.common.reedsolomon.b
 * JD-Core Version:    0.6.0
 */