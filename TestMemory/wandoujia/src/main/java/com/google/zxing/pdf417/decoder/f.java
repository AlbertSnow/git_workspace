package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

final class f
{
  private final a a;
  private final g[] b;
  private c c;
  private final int d;

  f(a parama, c paramc)
  {
    this.a = parama;
    this.d = parama.a();
    this.c = paramc;
    this.b = new g[2 + this.d];
  }

  private static int a(int paramInt1, int paramInt2, d paramd)
  {
    if (paramd == null);
    do
      return paramInt2;
    while (paramd.a());
    if (paramd.a(paramInt1))
    {
      paramd.b(paramInt1);
      return 0;
    }
    return paramInt2 + 1;
  }

  private void a(g paramg)
  {
    if (paramg != null)
      ((h)paramg).a(this.a);
  }

  final g a(int paramInt)
  {
    return this.b[paramInt];
  }

  final void a(int paramInt, g paramg)
  {
    this.b[paramInt] = paramg;
  }

  public final void a(c paramc)
  {
    this.c = paramc;
  }

  final g[] a()
  {
    a(this.b[0]);
    a(this.b[(1 + this.d)]);
    int i = 928;
    int k;
    label64: int i4;
    if ((this.b[0] == null) || (this.b[(1 + this.d)] == null))
    {
      if (this.b[0] != null)
        break label264;
      k = 0;
      if (this.b[(1 + this.d)] != null)
        break label383;
      i4 = 0;
    }
    int i8;
    int i10;
    while (true)
    {
      i8 = k + i4;
      if (i8 != 0)
        break label507;
      i10 = 0;
      label96: if ((i10 > 0) && (i10 < i))
        break label899;
      return this.b;
      d[] arrayOfd7 = this.b[0].b();
      d[] arrayOfd8 = this.b[(1 + this.d)].b();
      for (int i14 = 0; i14 < arrayOfd7.length; i14++)
      {
        if ((arrayOfd7[i14] == null) || (arrayOfd8[i14] == null) || (arrayOfd7[i14].h() != arrayOfd8[i14].h()))
          continue;
        for (int i15 = 1; i15 <= this.d; i15++)
        {
          d locald5 = this.b[i15].b()[i14];
          if (locald5 == null)
            continue;
          locald5.b(arrayOfd7[i14].h());
          if (locald5.a())
            continue;
          this.b[i15].b()[i14] = null;
        }
      }
      break;
      label264: d[] arrayOfd1 = this.b[0].b();
      int j = 0;
      k = 0;
      while (j < arrayOfd1.length)
      {
        if (arrayOfd1[j] != null)
        {
          int m = arrayOfd1[j].h();
          int n = k;
          int i1 = 0;
          for (int i2 = 1; (i2 < 1 + this.d) && (i1 < 2); i2++)
          {
            d locald1 = this.b[i2].b()[j];
            if (locald1 == null)
              continue;
            i1 = a(m, i1, locald1);
            if (locald1.a())
              continue;
            n++;
          }
          k = n;
        }
        j++;
      }
      break label64;
      label383: d[] arrayOfd2 = this.b[(1 + this.d)].b();
      int i3 = 0;
      i4 = 0;
      while (i3 < arrayOfd2.length)
      {
        if (arrayOfd2[i3] != null)
        {
          int i5 = arrayOfd2[i3].h();
          int i6 = 1 + this.d;
          int i7 = 0;
          while ((i6 > 0) && (i7 < 2))
          {
            d locald2 = this.b[i6].b()[i3];
            if (locald2 != null)
            {
              i7 = a(i5, i7, locald2);
              if (!locald2.a())
                i4++;
            }
            i6--;
          }
        }
        i3++;
      }
    }
    label507: int i9 = 1;
    label510: d[] arrayOfd3;
    int i11;
    label536: d locald3;
    d[] arrayOfd4;
    if (i9 < 1 + this.d)
    {
      arrayOfd3 = this.b[i9].b();
      i11 = 0;
      if (i11 < arrayOfd3.length)
        if ((arrayOfd3[i11] != null) && (!arrayOfd3[i11].a()))
        {
          locald3 = arrayOfd3[i11];
          arrayOfd4 = this.b[(i9 - 1)].b();
          if (this.b[(i9 + 1)] == null)
            break label905;
        }
    }
    label899: label905: for (d[] arrayOfd5 = this.b[(i9 + 1)].b(); ; arrayOfd5 = arrayOfd4)
    {
      d[] arrayOfd6 = new d[14];
      arrayOfd6[2] = arrayOfd4[i11];
      arrayOfd6[3] = arrayOfd5[i11];
      if (i11 > 0)
      {
        arrayOfd6[0] = arrayOfd3[(i11 - 1)];
        arrayOfd6[4] = arrayOfd4[(i11 - 1)];
        arrayOfd6[5] = arrayOfd5[(i11 - 1)];
      }
      if (i11 > 1)
      {
        arrayOfd6[8] = arrayOfd3[(i11 - 2)];
        arrayOfd6[10] = arrayOfd4[(i11 - 2)];
        arrayOfd6[11] = arrayOfd5[(i11 - 2)];
      }
      if (i11 < -1 + arrayOfd3.length)
      {
        arrayOfd6[1] = arrayOfd3[(i11 + 1)];
        arrayOfd6[6] = arrayOfd4[(i11 + 1)];
        arrayOfd6[7] = arrayOfd5[(i11 + 1)];
      }
      if (i11 < -2 + arrayOfd3.length)
      {
        arrayOfd6[9] = arrayOfd3[(i11 + 2)];
        arrayOfd6[12] = arrayOfd4[(i11 + 2)];
        arrayOfd6[13] = arrayOfd5[(i11 + 2)];
      }
      int i12 = 0;
      if (i12 < 14)
      {
        d locald4 = arrayOfd6[i12];
        if ((locald4 != null) && (locald4.a()) && (locald4.f() == locald3.f()))
          locald3.b(locald4.h());
        for (int i13 = 1; ; i13 = 0)
        {
          if (i13 != 0)
            break label880;
          i12++;
          break;
        }
      }
      label880: i11++;
      break label536;
      i9++;
      break label510;
      i10 = i8;
      break label96;
      i = i10;
      break;
    }
  }

  final int b()
  {
    return this.d;
  }

  final int c()
  {
    return this.a.c();
  }

  final int d()
  {
    return this.a.b();
  }

  final c e()
  {
    return this.c;
  }

  public final String toString()
  {
    g localg = this.b[0];
    if (localg == null)
      localg = this.b[(1 + this.d)];
    Formatter localFormatter = new Formatter();
    for (int i = 0; i < localg.b().length; i++)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(i);
      localFormatter.format("CW %3d:", arrayOfObject1);
      int j = 0;
      if (j < 2 + this.d)
      {
        if (this.b[j] == null)
          localFormatter.format("    |   ", new Object[0]);
        while (true)
        {
          j++;
          break;
          d locald = this.b[j].b()[i];
          if (locald == null)
          {
            localFormatter.format("    |   ", new Object[0]);
            continue;
          }
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Integer.valueOf(locald.h());
          arrayOfObject2[1] = Integer.valueOf(locald.g());
          localFormatter.format(" %3d|%3d", arrayOfObject2);
        }
      }
      localFormatter.format("%n", new Object[0]);
    }
    String str = localFormatter.toString();
    localFormatter.close();
    return str;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.f
 * JD-Core Version:    0.6.0
 */