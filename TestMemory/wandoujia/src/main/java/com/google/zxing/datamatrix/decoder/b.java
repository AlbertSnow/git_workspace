package com.google.zxing.datamatrix.decoder;

final class b
{
  private final int a;
  private final byte[] b;

  private b(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    this.b = paramArrayOfByte;
  }

  static b[] a(byte[] paramArrayOfByte, e parame)
  {
    g localg = parame.g();
    f[] arrayOff = localg.b();
    int i = arrayOff.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += arrayOff[j].a();
      j++;
    }
    b[] arrayOfb = new b[k];
    int m = arrayOff.length;
    int n = 0;
    int i1 = 0;
    while (i1 < m)
    {
      f localf = arrayOff[i1];
      int i21 = n;
      int i22 = 0;
      while (i22 < localf.a())
      {
        int i23 = localf.b();
        int i24 = i23 + localg.a();
        int i25 = i21 + 1;
        arrayOfb[i21] = new b(i23, new byte[i24]);
        i22++;
        i21 = i25;
      }
      i1++;
      n = i21;
    }
    int i2 = arrayOfb[0].b.length - localg.a();
    int i3 = i2 - 1;
    int i4 = 0;
    int i5 = 0;
    while (i4 < i3)
    {
      int i19 = 0;
      while (i19 < n)
      {
        byte[] arrayOfByte3 = arrayOfb[i19].b;
        int i20 = i5 + 1;
        arrayOfByte3[i4] = paramArrayOfByte[i5];
        i19++;
        i5 = i20;
      }
      i4++;
    }
    int i6;
    if (parame.a() == 24)
    {
      i6 = 1;
      if (i6 == 0)
        break label315;
    }
    label315: for (int i7 = 8; ; i7 = n)
    {
      int i8 = 0;
      while (i8 < i7)
      {
        byte[] arrayOfByte2 = arrayOfb[i8].b;
        int i17 = i2 - 1;
        int i18 = i5 + 1;
        arrayOfByte2[i17] = paramArrayOfByte[i5];
        i8++;
        i5 = i18;
      }
      i6 = 0;
      break;
    }
    int i9 = arrayOfb[0].b.length;
    int i10 = i5;
    int i11 = i2;
    while (i11 < i9)
    {
      int i12 = i10;
      int i13 = 0;
      if (i13 < n)
      {
        if ((i6 != 0) && (i13 > 7));
        for (int i14 = i11 - 1; ; i14 = i11)
        {
          byte[] arrayOfByte1 = arrayOfb[i13].b;
          int i15 = i12 + 1;
          arrayOfByte1[i14] = paramArrayOfByte[i12];
          int i16 = i13 + 1;
          i12 = i15;
          i13 = i16;
          break;
        }
      }
      i11++;
      i10 = i12;
    }
    if (i10 != paramArrayOfByte.length)
      throw new IllegalArgumentException();
    return arrayOfb;
  }

  final int a()
  {
    return this.a;
  }

  final byte[] b()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.datamatrix.decoder.b
 * JD-Core Version:    0.6.0
 */