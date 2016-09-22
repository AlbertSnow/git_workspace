package com.google.zxing.common.reedsolomon;

public final class c
{
  private final a a;

  public c(a parama)
  {
    this.a = parama;
  }

  private int[] a(b paramb)
  {
    int i = 0;
    int j = 1;
    int k = paramb.a();
    if (k == j)
    {
      int[] arrayOfInt2 = new int[j];
      arrayOfInt2[0] = paramb.a(j);
      return arrayOfInt2;
    }
    int[] arrayOfInt1 = new int[k];
    while ((j < this.a.c()) && (i < k))
    {
      if (paramb.b(j) == 0)
      {
        arrayOfInt1[i] = this.a.c(j);
        i++;
      }
      j++;
    }
    if (i != k)
      throw new ReedSolomonException("Error locator degree does not match number of roots");
    return arrayOfInt1;
  }

  private int[] a(b paramb, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int[] arrayOfInt = new int[i];
    int j = 0;
    int k;
    int m;
    int n;
    label36: int i2;
    int i3;
    if (j < i)
    {
      k = this.a.c(paramArrayOfInt[j]);
      m = 1;
      n = 0;
      if (n < i)
      {
        if (j == n)
          break label175;
        i2 = this.a.c(paramArrayOfInt[n], k);
        if ((i2 & 0x1) == 0)
          i3 = i2 | 0x1;
      }
    }
    label77: for (int i1 = this.a.c(m, i3); ; i1 = m)
    {
      n++;
      m = i1;
      break label36;
      i3 = i2 & 0xFFFFFFFE;
      break label77;
      arrayOfInt[j] = this.a.c(paramb.b(k), this.a.c(m));
      if (this.a.d() != 0)
        arrayOfInt[j] = this.a.c(arrayOfInt[j], k);
      j++;
      break;
      return arrayOfInt;
    }
  }

  public final void a(int[] paramArrayOfInt, int paramInt)
  {
    int i = 0;
    b localb1 = new b(this.a, paramArrayOfInt);
    int[] arrayOfInt1 = new int[paramInt];
    int j = 0;
    int k = 1;
    while (j < paramInt)
    {
      int i6 = localb1.b(this.a.a(j + this.a.d()));
      arrayOfInt1[(-1 + arrayOfInt1.length - j)] = i6;
      if (i6 != 0)
        k = 0;
      j++;
    }
    if (k != 0)
      return;
    Object localObject1 = new b(this.a, arrayOfInt1);
    Object localObject2 = this.a.a(paramInt, 1);
    if (((b)localObject2).a() < ((b)localObject1).a());
    while (true)
    {
      Object localObject4 = this.a.a();
      b localb2 = this.a.b();
      Object localObject5 = localObject2;
      Object localObject6 = localb2;
      while (localObject5.a() >= paramInt / 2)
      {
        if (localObject5.b())
          throw new ReedSolomonException("r_{i-1} was zero");
        b localb5 = this.a.a();
        int i2 = localObject5.a(localObject5.a());
        int i3 = this.a.c(i2);
        Object localObject7 = localObject1;
        b localb6 = localb5;
        while ((((b)localObject7).a() >= localObject5.a()) && (!((b)localObject7).b()))
        {
          int i4 = ((b)localObject7).a() - localObject5.a();
          int i5 = this.a.c(((b)localObject7).a(((b)localObject7).a()), i3);
          localb6 = localb6.a(this.a.a(i4, i5));
          localObject7 = ((b)localObject7).a(localObject5.a(i4, i5));
        }
        b localb7 = localb6.b((b)localObject6).a((b)localObject4);
        if (((b)localObject7).a() >= localObject5.a())
          throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
        localObject4 = localObject6;
        localObject6 = localb7;
        localObject1 = localObject5;
        localObject5 = localObject7;
      }
      int m = ((b)localObject6).a(0);
      if (m == 0)
        throw new ReedSolomonException("sigmaTilde(0) was zero");
      int n = this.a.c(m);
      b[] arrayOfb = { ((b)localObject6).c(n), localObject5.c(n) };
      b localb3 = arrayOfb[0];
      b localb4 = arrayOfb[1];
      int[] arrayOfInt2 = a(localb3);
      int[] arrayOfInt3 = a(localb4, arrayOfInt2);
      while (i < arrayOfInt2.length)
      {
        int i1 = -1 + paramArrayOfInt.length - this.a.b(arrayOfInt2[i]);
        if (i1 < 0)
          throw new ReedSolomonException("Bad error location");
        paramArrayOfInt[i1] = a.b(paramArrayOfInt[i1], arrayOfInt3[i]);
        i++;
      }
      break;
      Object localObject3 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.common.reedsolomon.c
 * JD-Core Version:    0.6.0
 */