package com.google.zxing.common.a;

import com.google.zxing.NotFoundException;
import com.google.zxing.f;

public final class a
{
  private final com.google.zxing.common.b a;
  private final int b;
  private final int c;
  private final int d;
  private final int e;
  private final int f;
  private final int g;

  public a(com.google.zxing.common.b paramb)
  {
    this(paramb, 10, paramb.e() / 2, paramb.f() / 2);
  }

  public a(com.google.zxing.common.b paramb, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramb;
    this.b = paramb.f();
    this.c = paramb.e();
    int i = paramInt1 / 2;
    this.d = (paramInt2 - i);
    this.e = (paramInt2 + i);
    this.g = (paramInt3 - i);
    this.f = (i + paramInt3);
    if ((this.g < 0) || (this.d < 0) || (this.f >= this.b) || (this.e >= this.c))
      throw NotFoundException.getNotFoundInstance();
  }

  private f a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i = android.support.v4.app.b.a(android.support.v4.app.b.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4));
    float f1 = (paramFloat3 - paramFloat1) / i;
    float f2 = (paramFloat4 - paramFloat2) / i;
    for (int j = 0; j < i; j++)
    {
      int k = android.support.v4.app.b.a(paramFloat1 + f1 * j);
      int m = android.support.v4.app.b.a(paramFloat2 + f2 * j);
      if (this.a.a(k, m))
        return new f(k, m);
    }
    return null;
  }

  private boolean a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (paramBoolean)
      while (paramInt1 <= paramInt2)
      {
        if (this.a.a(paramInt1, paramInt3))
          return true;
        paramInt1++;
      }
    while (true)
    {
      paramInt1++;
      if (paramInt1 > paramInt2)
        break;
      if (this.a.a(paramInt3, paramInt1))
        return true;
    }
    return false;
  }

  public final f[] a()
  {
    int i = this.d;
    int j = this.e;
    int k = this.g;
    int m = this.f;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = m;
    int i6 = k;
    int i7 = j;
    int i8 = i;
    int i9 = 1;
    int i22;
    int i23;
    int i15;
    int i10;
    int i12;
    int i13;
    int i14;
    if (i9 != 0)
    {
      boolean bool1 = true;
      int i21 = i1;
      i22 = 0;
      i23 = i21;
      while (((bool1) || (i23 == 0)) && (i7 < this.c))
      {
        bool1 = a(i6, i5, i7, false);
        if (bool1)
        {
          int i36 = i7 + 1;
          i22 = 1;
          i7 = i36;
          i23 = 1;
          continue;
        }
        if (i23 != 0)
          continue;
        i7++;
      }
      if (i7 >= this.c)
      {
        i15 = 1;
        i10 = i7;
        int i35 = i6;
        i12 = i8;
        i13 = i5;
        i14 = i35;
      }
    }
    while (true)
    {
      label170: if ((i15 == 0) && (n != 0))
      {
        int i16 = i10 - i12;
        f localf1 = null;
        int i17 = 1;
        while (true)
          if (i17 < i16)
          {
            localf1 = a(i12, i13 - i17, i12 + i17, i13);
            if (localf1 == null)
            {
              i17++;
              continue;
              boolean bool2 = true;
              int i24 = i2;
              int i25 = i22;
              int i26 = i24;
              while (((bool2) || (i26 == 0)) && (i5 < this.b))
              {
                bool2 = a(i8, i7, i5, true);
                if (bool2)
                {
                  int i34 = i5 + 1;
                  i25 = 1;
                  i5 = i34;
                  i26 = 1;
                  continue;
                }
                if (i26 != 0)
                  continue;
                i5++;
              }
              if (i5 >= this.b)
              {
                i15 = 1;
                i10 = i7;
                int i33 = i6;
                i12 = i8;
                i13 = i5;
                i14 = i33;
                break label170;
              }
              boolean bool3 = true;
              int i27 = i3;
              int i28 = i25;
              int i29 = i27;
              while (((bool3) || (i29 == 0)) && (i8 >= 0))
              {
                bool3 = a(i6, i5, i8, false);
                if (bool3)
                {
                  int i32 = i8 - 1;
                  i28 = 1;
                  i8 = i32;
                  i29 = 1;
                  continue;
                }
                if (i29 != 0)
                  continue;
                i8--;
              }
              if (i8 < 0)
              {
                i15 = 1;
                i10 = i7;
                int i31 = i6;
                i12 = i8;
                i13 = i5;
                i14 = i31;
                break label170;
              }
              boolean bool4 = true;
              while (((bool4) || (i4 == 0)) && (i6 >= 0))
              {
                bool4 = a(i8, i7, i6, true);
                if (bool4)
                {
                  i6--;
                  i28 = 1;
                  i4 = 1;
                  continue;
                }
                if (i4 != 0)
                  continue;
                i6--;
              }
              if (i6 < 0)
              {
                i15 = 1;
                i10 = i7;
                int i30 = i6;
                i12 = i8;
                i13 = i5;
                i14 = i30;
                break label170;
              }
              if (i28 != 0)
                n = 1;
              i9 = i28;
              i3 = i29;
              i2 = i26;
              i1 = i23;
              break;
            }
          }
        f localf2 = localf1;
        if (localf2 == null)
          throw NotFoundException.getNotFoundInstance();
        f localf3 = null;
        for (int i18 = 1; i18 < i16; i18++)
        {
          localf3 = a(i12, i14 + i18, i12 + i18, i14);
          if (localf3 != null)
            break;
        }
        f localf4 = localf3;
        if (localf4 == null)
          throw NotFoundException.getNotFoundInstance();
        f localf5 = null;
        for (int i19 = 1; i19 < i16; i19++)
        {
          localf5 = a(i10, i14 + i19, i10 - i19, i14);
          if (localf5 != null)
            break;
        }
        f localf6 = localf5;
        if (localf6 == null)
          throw NotFoundException.getNotFoundInstance();
        f localf7 = null;
        for (int i20 = 1; i20 < i16; i20++)
        {
          localf7 = a(i10, i13 - i20, i10 - i20, i13);
          if (localf7 != null)
            break;
        }
        if (localf7 == null)
          throw NotFoundException.getNotFoundInstance();
        float f1 = localf7.a();
        float f2 = localf7.b();
        float f3 = localf2.a();
        float f4 = localf2.b();
        float f5 = localf6.a();
        float f6 = localf6.b();
        float f7 = localf4.a();
        float f8 = localf4.b();
        if (f1 < this.c / 2.0F)
        {
          f[] arrayOff2 = new f[4];
          arrayOff2[0] = new f(f7 - 1.0F, f8 + 1.0F);
          arrayOff2[1] = new f(f3 + 1.0F, f4 + 1.0F);
          arrayOff2[2] = new f(f5 - 1.0F, f6 - 1.0F);
          arrayOff2[3] = new f(f1 + 1.0F, f2 - 1.0F);
          return arrayOff2;
        }
        f[] arrayOff1 = new f[4];
        arrayOff1[0] = new f(f7 + 1.0F, f8 + 1.0F);
        arrayOff1[1] = new f(f3 + 1.0F, f4 - 1.0F);
        arrayOff1[2] = new f(f5 - 1.0F, f6 + 1.0F);
        arrayOff1[3] = new f(f1 - 1.0F, f2 - 1.0F);
        return arrayOff1;
      }
      throw NotFoundException.getNotFoundInstance();
      i10 = i7;
      int i11 = i6;
      i12 = i8;
      i13 = i5;
      i14 = i11;
      i15 = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.common.a.a
 * JD-Core Version:    0.6.0
 */