package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.f;

final class h extends g
{
  private final boolean a;

  h(c paramc, boolean paramBoolean)
  {
    super(paramc);
    this.a = paramBoolean;
  }

  private void a(d[] paramArrayOfd, a parama)
  {
    int i = 0;
    if (i < paramArrayOfd.length)
    {
      d locald = paramArrayOfd[i];
      int j;
      int k;
      if (paramArrayOfd[i] != null)
      {
        j = locald.g() % 30;
        k = locald.h();
        if (k <= parama.c())
          break label55;
        paramArrayOfd[i] = null;
      }
      while (true)
      {
        i++;
        break;
        label55: if (!this.a)
          k += 2;
        switch (k % 3)
        {
        default:
          break;
        case 0:
          if (1 + j * 3 == parama.d())
            continue;
          paramArrayOfd[i] = null;
          break;
        case 1:
          if ((j / 3 == parama.b()) && (j % 3 == parama.e()))
            continue;
          paramArrayOfd[i] = null;
          break;
        case 2:
          if (j + 1 == parama.a())
            continue;
          paramArrayOfd[i] = null;
        }
      }
    }
  }

  final int a(a parama)
  {
    d[] arrayOfd1 = b();
    for (d locald2 : b())
    {
      if (locald2 == null)
        continue;
      locald2.b();
    }
    a(arrayOfd1, parama);
    c localc = a();
    f localf1;
    f localf2;
    label86: float f;
    int n;
    int i1;
    int i2;
    int i3;
    label137: d locald1;
    int i7;
    int i4;
    int i5;
    int i6;
    if (this.a)
    {
      localf1 = localc.e();
      if (!this.a)
        break label214;
      localf2 = localc.g();
      int k = b((int)localf1.b());
      int m = b((int)localf2.b());
      f = (m - k) / parama.c();
      n = -1;
      i1 = 0;
      i2 = 1;
      i3 = k;
      if (i3 >= m)
        break label417;
      if (arrayOfd1[i3] == null)
        break label433;
      locald1 = arrayOfd1[i3];
      i7 = locald1.h() - n;
      if (i7 != 0)
        break label224;
      i4 = i1 + 1;
      i5 = i2;
      i6 = n;
    }
    while (true)
    {
      i3++;
      n = i6;
      i2 = i5;
      i1 = i4;
      break label137;
      localf1 = localc.f();
      break;
      label214: localf2 = localc.h();
      break label86;
      label224: if (i7 == 1)
      {
        int i12 = Math.max(i2, i1);
        i6 = locald1.h();
        i5 = i12;
        i4 = 1;
        continue;
      }
      if ((i7 < 0) || (locald1.h() >= parama.c()) || (i7 > i3))
      {
        arrayOfd1[i3] = null;
        i4 = i1;
        i5 = i2;
        i6 = n;
        continue;
      }
      if (i2 > 2);
      for (int i8 = i7 * (i2 - 2); ; i8 = i7)
      {
        int i10;
        if (i8 >= i3)
        {
          i9 = 1;
          i10 = 1;
          label328: if ((i10 > i8) || (i9 != 0))
            break label371;
          if (arrayOfd1[(i3 - i10)] == null)
            break label365;
        }
        label365: for (int i9 = 1; ; i9 = 0)
        {
          i10++;
          break label328;
          i9 = 0;
          break;
        }
        label371: if (i9 != 0)
        {
          arrayOfd1[i3] = null;
          i4 = i1;
          i5 = i2;
          i6 = n;
          break;
        }
        int i11 = locald1.h();
        i5 = i2;
        i6 = i11;
        i4 = 1;
        break;
        label417: return (int)(0.5D + f);
      }
      label433: i4 = i1;
      i5 = i2;
      i6 = n;
    }
  }

  final int[] c()
  {
    a locala = d();
    int[] arrayOfInt;
    if (locala == null)
      arrayOfInt = null;
    while (true)
    {
      return arrayOfInt;
      c localc = a();
      f localf1;
      f localf2;
      label45: d[] arrayOfd1;
      int k;
      int m;
      int n;
      int i1;
      label87: d locald2;
      int i5;
      if (this.a)
      {
        localf1 = localc.e();
        if (!this.a)
          break label146;
        localf2 = localc.g();
        int i = b((int)localf1.b());
        int j = b((int)localf2.b());
        arrayOfd1 = b();
        k = -1;
        m = 1;
        n = i;
        i1 = 0;
        if (n >= j)
          break label221;
        if (arrayOfd1[n] != null)
        {
          locald2 = arrayOfd1[n];
          locald2.b();
          i5 = locald2.h() - k;
          if (i5 != 0)
            break label155;
          i1++;
        }
      }
      while (true)
      {
        n++;
        break label87;
        localf1 = localc.f();
        break;
        label146: localf2 = localc.h();
        break label45;
        label155: if (i5 == 1)
        {
          int i6 = Math.max(m, i1);
          k = locald2.h();
          m = i6;
          i1 = 1;
          continue;
        }
        if (locald2.h() >= locala.c())
        {
          arrayOfd1[n] = null;
          continue;
        }
        k = locald2.h();
        i1 = 1;
      }
      label221: arrayOfInt = new int[locala.c()];
      for (d locald1 : b())
      {
        if (locald1 == null)
          continue;
        int i4 = locald1.h();
        if (i4 >= arrayOfInt.length)
          throw FormatException.getFormatInstance();
        arrayOfInt[i4] = (1 + arrayOfInt[i4]);
      }
    }
  }

  final a d()
  {
    d[] arrayOfd = b();
    b localb1 = new b();
    b localb2 = new b();
    b localb3 = new b();
    b localb4 = new b();
    int i = arrayOfd.length;
    int j = 0;
    if (j < i)
    {
      d locald = arrayOfd[j];
      int k;
      if (locald != null)
      {
        locald.b();
        k = locald.g() % 30;
        int m = locald.h();
        if (!this.a)
          m += 2;
        switch (m % 3)
        {
        default:
        case 0:
        case 1:
        case 2:
        }
      }
      while (true)
      {
        j++;
        break;
        localb2.a(1 + k * 3);
        continue;
        localb4.a(k / 3);
        localb3.a(k % 3);
        continue;
        localb1.a(k + 1);
      }
    }
    if ((localb1.a().length == 0) || (localb2.a().length == 0) || (localb3.a().length == 0) || (localb4.a().length == 0) || (localb1.a()[0] <= 0) || (localb2.a()[0] + localb3.a()[0] < 3) || (localb2.a()[0] + localb3.a()[0] > 90))
      return null;
    a locala = new a(localb1.a()[0], localb2.a()[0], localb3.a()[0], localb4.a()[0]);
    a(arrayOfd, locala);
    return locala;
  }

  final boolean e()
  {
    return this.a;
  }

  public final String toString()
  {
    return "IsLeft: " + this.a + '\n' + super.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.h
 * JD-Core Version:    0.6.0
 */