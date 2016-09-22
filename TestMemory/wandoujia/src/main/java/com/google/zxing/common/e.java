package com.google.zxing.common;

import com.google.zxing.NotFoundException;
import com.google.zxing.c;

public class e extends com.google.zxing.a
{
  private static final byte[] a = new byte[0];
  private byte[] b = a;
  private final int[] c = new int[32];

  public e(c paramc)
  {
    super(paramc);
  }

  private static int a(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    while (j < i)
    {
      if (paramArrayOfInt[j] > k)
      {
        k = paramArrayOfInt[j];
        m = j;
      }
      if (paramArrayOfInt[j] > n)
        n = paramArrayOfInt[j];
      j++;
    }
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i12;
    if (i1 < i)
    {
      int i11 = i1 - m;
      i12 = i11 * (i11 * paramArrayOfInt[i1]);
      if (i12 <= i3)
        break label235;
      i2 = i1;
    }
    while (true)
    {
      i1++;
      i3 = i12;
      break;
      if (m > i2);
      while (true)
      {
        if (m - i2 <= i / 16)
          throw NotFoundException.getNotFoundInstance();
        int i5 = m - 1;
        int i6 = -1;
        int i7 = m - 1;
        int i9;
        if (i7 > i2)
        {
          int i8 = i7 - i2;
          i9 = i8 * i8 * (m - i7) * (n - paramArrayOfInt[i7]);
          if (i9 <= i6)
            break label209;
        }
        for (int i10 = i7; ; i10 = i5)
        {
          i7--;
          i5 = i10;
          i6 = i9;
          break;
          return i5 << 3;
          label209: i9 = i6;
        }
        int i4 = i2;
        i2 = m;
        m = i4;
      }
      label235: i12 = i3;
    }
  }

  private void a(int paramInt)
  {
    if (this.b.length < paramInt)
      this.b = new byte[paramInt];
    for (int i = 0; i < 32; i++)
      this.c[i] = 0;
  }

  public final a a(int paramInt, a parama)
  {
    int i = 1;
    c localc = a();
    int j = localc.b();
    if ((parama == null) || (parama.a() < j))
      parama = new a(j);
    byte[] arrayOfByte;
    int[] arrayOfInt;
    while (true)
    {
      a(j);
      arrayOfByte = localc.a(paramInt, this.b);
      arrayOfInt = this.c;
      for (int k = 0; k < j; k++)
      {
        int i3 = (0xFF & arrayOfByte[k]) >> 3;
        arrayOfInt[i3] = (1 + arrayOfInt[i3]);
      }
      parama.b();
    }
    int m = a(arrayOfInt);
    int n = 0xFF & arrayOfByte[0];
    int i2;
    for (int i1 = 0xFF & arrayOfByte[i]; i < j - 1; i1 = i2)
    {
      i2 = 0xFF & arrayOfByte[(i + 1)];
      if ((i1 * 4 - n - i2) / 2 < m)
        parama.b(i);
      i++;
      n = i1;
    }
    return parama;
  }

  public b b()
  {
    c localc = a();
    int i = localc.b();
    int j = localc.c();
    b localb = new b(i, j);
    a(i);
    int[] arrayOfInt = this.c;
    for (int k = 1; k < 5; k++)
    {
      byte[] arrayOfByte2 = localc.a(j * k / 5, this.b);
      int i3 = i * 4 / 5;
      for (int i4 = i / 5; i4 < i3; i4++)
      {
        int i5 = (0xFF & arrayOfByte2[i4]) >> 3;
        arrayOfInt[i5] = (1 + arrayOfInt[i5]);
      }
    }
    int m = a(arrayOfInt);
    byte[] arrayOfByte1 = localc.a();
    for (int n = 0; n < j; n++)
    {
      int i1 = n * i;
      for (int i2 = 0; i2 < i; i2++)
      {
        if ((0xFF & arrayOfByte1[(i1 + i2)]) >= m)
          continue;
        localb.b(i2, n);
      }
    }
    return localb;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.common.e
 * JD-Core Version:    0.6.0
 */