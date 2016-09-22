package com.google.zxing.aztec.a;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.common.reedsolomon.c;

public final class a
{
  private static final int[] g = { 3808, 476, 2107, 1799 };
  private final com.google.zxing.common.b a;
  private boolean b;
  private int c;
  private int d;
  private int e;
  private int f;

  public a(com.google.zxing.common.b paramb)
  {
    this.a = paramb;
  }

  private static int a(long paramLong, boolean paramBoolean)
  {
    int i = 0;
    int j;
    if (paramBoolean)
      j = 7;
    int m;
    int[] arrayOfInt;
    for (int k = 2; ; k = 4)
    {
      m = j - k;
      arrayOfInt = new int[j];
      for (int n = j - 1; n >= 0; n--)
      {
        arrayOfInt[n] = (0xF & (int)paramLong);
        paramLong >>= 4;
      }
      j = 10;
    }
    int i1;
    try
    {
      new c(com.google.zxing.common.reedsolomon.a.d).a(arrayOfInt, m);
      i1 = 0;
      while (i < k)
      {
        i1 = (i1 << 4) + arrayOfInt[i];
        i++;
      }
    }
    catch (ReedSolomonException localReedSolomonException)
    {
      throw NotFoundException.getNotFoundInstance();
    }
    return i1;
  }

  private int a(b paramb1, b paramb2)
  {
    float f1 = b(paramb1, paramb2);
    float f2 = (paramb2.b() - paramb1.b()) / f1;
    float f3 = (paramb2.c() - paramb1.c()) / f1;
    float f4 = paramb1.b();
    float f5 = paramb1.c();
    boolean bool1 = this.a.a(paramb1.b(), paramb1.c());
    int i = 0;
    float f6 = f4;
    float f7 = f5;
    for (int j = 0; j < f1; j++)
    {
      f6 += f2;
      f7 += f3;
      if (this.a.a(android.support.v4.app.b.a(f6), android.support.v4.app.b.a(f7)) == bool1)
        continue;
      i++;
    }
    float f8 = i / f1;
    if ((f8 > 0.1F) && (f8 < 0.9F))
      return 0;
    if (f8 <= 0.1F);
    for (boolean bool2 = true; bool2 == bool1; bool2 = false)
      return 1;
    return -1;
  }

  private int a(com.google.zxing.f paramf1, com.google.zxing.f paramf2, int paramInt)
  {
    int i = 0;
    float f1 = android.support.v4.app.b.a(paramf1.a(), paramf1.b(), paramf2.a(), paramf2.b());
    float f2 = f1 / paramInt;
    float f3 = paramf1.a();
    float f4 = paramf1.b();
    float f5 = f2 * (paramf2.a() - paramf1.a()) / f1;
    float f6 = f2 * (paramf2.b() - paramf1.b()) / f1;
    for (int j = 0; j < paramInt; j++)
    {
      if (!this.a.a(android.support.v4.app.b.a(f3 + f5 * j), android.support.v4.app.b.a(f4 + f6 * j)))
        continue;
      i |= 1 << -1 + (paramInt - j);
    }
    return i;
  }

  private b a()
  {
    try
    {
      com.google.zxing.f[] arrayOff2 = new com.google.zxing.common.a.a(this.a).a();
      localf1 = arrayOff2[0];
      localf2 = arrayOff2[1];
      localf3 = arrayOff2[2];
      localf4 = arrayOff2[3];
      k = android.support.v4.app.b.a((localf1.a() + localf4.a() + localf2.a() + localf3.a()) / 4.0F);
      m = android.support.v4.app.b.a((localf1.b() + localf4.b() + localf2.b() + localf3.b()) / 4.0F);
    }
    catch (NotFoundException localNotFoundException1)
    {
      try
      {
        com.google.zxing.f[] arrayOff1 = new com.google.zxing.common.a.a(this.a, 15, k, m).a();
        localf5 = arrayOff1[0];
        localf6 = arrayOff1[1];
        localf7 = arrayOff1[2];
        localf8 = arrayOff1[3];
        return new b(android.support.v4.app.b.a((localf5.a() + localf8.a() + localf6.a() + localf7.a()) / 4.0F), android.support.v4.app.b.a((localf5.b() + localf8.b() + localf6.b() + localf7.b()) / 4.0F));
        localNotFoundException1 = localNotFoundException1;
        int i = this.a.e() / 2;
        int j = this.a.f() / 2;
        com.google.zxing.f localf1 = a(new b(i + 7, j - 7), false, 1, -1).a();
        com.google.zxing.f localf2 = a(new b(i + 7, j + 7), false, 1, 1).a();
        com.google.zxing.f localf3 = a(new b(i - 7, j + 7), false, -1, 1).a();
        com.google.zxing.f localf4 = a(new b(i - 7, j - 7), false, -1, -1).a();
      }
      catch (NotFoundException localNotFoundException2)
      {
        while (true)
        {
          int k;
          int m;
          com.google.zxing.f localf5 = a(new b(k + 7, m - 7), false, 1, -1).a();
          com.google.zxing.f localf6 = a(new b(k + 7, m + 7), false, 1, 1).a();
          com.google.zxing.f localf7 = a(new b(k - 7, m + 7), false, -1, 1).a();
          com.google.zxing.f localf8 = a(new b(k - 7, m - 7), false, -1, -1).a();
        }
      }
    }
  }

  private b a(b paramb, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    int i = paramInt1 + paramb.b();
    int j = paramInt2 + paramb.c();
    while ((a(i, j)) && (this.a.a(i, j) == paramBoolean))
    {
      i += paramInt1;
      j += paramInt2;
    }
    int k = i - paramInt1;
    int m = j - paramInt2;
    while ((a(k, m)) && (this.a.a(k, m) == paramBoolean))
      k += paramInt1;
    int n = k - paramInt1;
    int i1 = m;
    while ((a(n, i1)) && (this.a.a(n, i1) == paramBoolean))
      i1 += paramInt2;
    return new b(n, i1 - paramInt2);
  }

  private boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 >= 0) && (paramInt1 < this.a.e()) && (paramInt2 > 0) && (paramInt2 < this.a.f());
  }

  private boolean a(com.google.zxing.f paramf)
  {
    return a(android.support.v4.app.b.a(paramf.a()), android.support.v4.app.b.a(paramf.b()));
  }

  private static com.google.zxing.f[] a(com.google.zxing.f[] paramArrayOff, float paramFloat1, float paramFloat2)
  {
    float f1 = paramFloat2 / (2.0F * paramFloat1);
    float f2 = paramArrayOff[0].a() - paramArrayOff[2].a();
    float f3 = paramArrayOff[0].b() - paramArrayOff[2].b();
    float f4 = (paramArrayOff[0].a() + paramArrayOff[2].a()) / 2.0F;
    float f5 = (paramArrayOff[0].b() + paramArrayOff[2].b()) / 2.0F;
    com.google.zxing.f localf1 = new com.google.zxing.f(f4 + f1 * f2, f5 + f1 * f3);
    com.google.zxing.f localf2 = new com.google.zxing.f(f4 - f2 * f1, f5 - f3 * f1);
    float f6 = paramArrayOff[1].a() - paramArrayOff[3].a();
    float f7 = paramArrayOff[1].b() - paramArrayOff[3].b();
    float f8 = (paramArrayOff[1].a() + paramArrayOff[3].a()) / 2.0F;
    float f9 = (paramArrayOff[1].b() + paramArrayOff[3].b()) / 2.0F;
    return new com.google.zxing.f[] { localf1, new com.google.zxing.f(f8 + f1 * f6, f9 + f1 * f7), localf2, new com.google.zxing.f(f8 - f6 * f1, f9 - f1 * f7) };
  }

  private static float b(b paramb1, b paramb2)
  {
    return android.support.v4.app.b.a(paramb1.b(), paramb1.c(), paramb2.b(), paramb2.c());
  }

  private int b()
  {
    if (this.b)
      return 11 + 4 * this.c;
    if (this.c <= 4)
      return 15 + 4 * this.c;
    return 15 + (4 * this.c + 2 * (1 + (-4 + this.c) / 8));
  }

  public final com.google.zxing.aztec.a a(boolean paramBoolean)
  {
    Object localObject1 = a();
    this.e = 1;
    Object localObject2 = localObject1;
    boolean bool1 = true;
    Object localObject3 = localObject1;
    Object localObject4 = localObject1;
    if (this.e < 9)
    {
      b localb1 = a(localObject4, bool1, 1, -1);
      b localb2 = a(localObject3, bool1, 1, 1);
      b localb3 = a(localObject2, bool1, -1, 1);
      b localb4 = a((b)localObject1, bool1, -1, -1);
      int i7;
      if (this.e > 2)
      {
        float f3 = b(localb4, localb1) * this.e / (b((b)localObject1, localObject4) * (2 + this.e));
        if ((f3 < 0.75D) || (f3 > 1.25D))
          break label343;
        b localb5 = new b(-3 + localb1.b(), 3 + localb1.c());
        b localb6 = new b(-3 + localb2.b(), -3 + localb2.c());
        b localb7 = new b(3 + localb3.b(), -3 + localb3.c());
        b localb8 = new b(3 + localb4.b(), 3 + localb4.c());
        int i6 = a(localb8, localb5);
        if ((i6 != 0) && (a(localb5, localb6) == i6) && (a(localb6, localb7) == i6) && (a(localb7, localb8) == i6))
        {
          i7 = 1;
          label287: if (i7 == 0)
            break label343;
        }
      }
      else
      {
        if (bool1)
          break label337;
      }
      label337: for (boolean bool3 = true; ; bool3 = false)
      {
        this.e = (1 + this.e);
        localObject2 = localb3;
        bool1 = bool3;
        localObject3 = localb2;
        localObject4 = localb1;
        localObject1 = localb4;
        break;
        i7 = 0;
        break label287;
      }
    }
    label343: if ((this.e != 5) && (this.e != 7))
      throw NotFoundException.getNotFoundInstance();
    if (this.e == 5);
    com.google.zxing.f[] arrayOff;
    for (boolean bool2 = true; ; bool2 = false)
    {
      this.b = bool2;
      arrayOff = a(new com.google.zxing.f[] { new com.google.zxing.f(0.5F + localObject4.b(), localObject4.c() - 0.5F), new com.google.zxing.f(0.5F + localObject3.b(), 0.5F + localObject3.c()), new com.google.zxing.f(localObject2.b() - 0.5F, 0.5F + localObject2.c()), new com.google.zxing.f(((b)localObject1).b() - 0.5F, ((b)localObject1).c() - 0.5F) }, -3 + 2 * this.e, 2 * this.e);
      if (paramBoolean)
      {
        com.google.zxing.f localf5 = arrayOff[0];
        arrayOff[0] = arrayOff[2];
        arrayOff[2] = localf5;
      }
      if ((a(arrayOff[0])) && (a(arrayOff[1])) && (a(arrayOff[2])) && (a(arrayOff[3])))
        break;
      throw NotFoundException.getNotFoundInstance();
    }
    int i = 2 * this.e;
    int[] arrayOfInt = new int[4];
    arrayOfInt[0] = a(arrayOff[0], arrayOff[1], i);
    arrayOfInt[1] = a(arrayOff[1], arrayOff[2], i);
    arrayOfInt[2] = a(arrayOff[2], arrayOff[3], i);
    arrayOfInt[3] = a(arrayOff[3], arrayOff[0], i);
    int j = 0;
    for (int k = 0; k < 4; k++)
    {
      int i5 = arrayOfInt[k];
      j = (i5 >> i - 2 << 1) + (i5 & 0x1) + (j << 3);
    }
    int m = ((j & 0x1) << 11) + (j >> 1);
    int n = 0;
    long l;
    int i1;
    label775: int i4;
    if (n < 4)
      if (Integer.bitCount(m ^ g[n]) <= 2)
      {
        this.f = n;
        l = 0L;
        i1 = 0;
        if (i1 >= 4)
          break label862;
        i4 = arrayOfInt[((i1 + this.f) % 4)];
        if (!this.b)
          break label834;
        l = (l << 7) + (0x7F & i4 >> 1);
      }
    while (true)
    {
      i1++;
      break label775;
      n++;
      break;
      throw NotFoundException.getNotFoundInstance();
      label834: l = (l << 10) + ((0x3E0 & i4 >> 2) + (0x1F & i4 >> 1));
    }
    label862: int i2 = a(l, this.b);
    if (this.b)
      this.c = (1 + (i2 >> 6));
    for (this.d = (1 + (i2 & 0x3F)); ; this.d = (1 + (i2 & 0x7FF)))
    {
      com.google.zxing.common.b localb = this.a;
      com.google.zxing.f localf1 = arrayOff[(this.f % 4)];
      com.google.zxing.f localf2 = arrayOff[((1 + this.f) % 4)];
      com.google.zxing.f localf3 = arrayOff[((2 + this.f) % 4)];
      com.google.zxing.f localf4 = arrayOff[((3 + this.f) % 4)];
      com.google.zxing.common.f localf = com.google.zxing.common.f.a();
      int i3 = b();
      float f1 = i3 / 2.0F - this.e;
      float f2 = i3 / 2.0F + this.e;
      return new com.google.zxing.aztec.a(localf.a(localb, i3, i3, f1, f1, f2, f1, f2, f2, f1, f2, localf1.a(), localf1.b(), localf2.a(), localf2.b(), localf3.a(), localf3.b(), localf4.a(), localf4.b()), a(arrayOff, 2 * this.e, b()), this.b, this.d, this.c);
      this.c = (1 + (i2 >> 11));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.aztec.a.a
 * JD-Core Version:    0.6.0
 */