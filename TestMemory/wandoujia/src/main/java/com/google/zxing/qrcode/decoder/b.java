package com.google.zxing.qrcode.decoder;

final class b
{
  private final int a;
  private final byte[] b;

  private b(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    this.b = paramArrayOfByte;
  }

  static b[] a(byte[] paramArrayOfByte, p paramp, ErrorCorrectionLevel paramErrorCorrectionLevel)
  {
    if (paramArrayOfByte.length != paramp.c())
      throw new IllegalArgumentException();
    r localr = paramp.a(paramErrorCorrectionLevel);
    q[] arrayOfq = localr.b();
    int i = arrayOfq.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += arrayOfq[j].a();
      j++;
    }
    b[] arrayOfb = new b[k];
    int m = arrayOfq.length;
    int n = 0;
    int i1 = 0;
    while (i1 < m)
    {
      q localq = arrayOfq[i1];
      int i18 = n;
      int i19 = 0;
      while (i19 < localq.a())
      {
        int i20 = localq.b();
        int i21 = i20 + localr.a();
        int i22 = i18 + 1;
        arrayOfb[i18] = new b(i20, new byte[i21]);
        i19++;
        i18 = i22;
      }
      i1++;
      n = i18;
    }
    int i2 = arrayOfb[0].b.length;
    for (int i3 = -1 + arrayOfb.length; (i3 >= 0) && (arrayOfb[i3].b.length != i2); i3--);
    int i4 = i3 + 1;
    int i5 = i2 - localr.a();
    int i6 = 0;
    int i15;
    for (int i7 = 0; i6 < i5; i7 = i15)
    {
      i15 = i7;
      int i16 = 0;
      while (i16 < n)
      {
        byte[] arrayOfByte3 = arrayOfb[i16].b;
        int i17 = i15 + 1;
        arrayOfByte3[i6] = paramArrayOfByte[i15];
        i16++;
        i15 = i17;
      }
      i6++;
    }
    int i8 = i4;
    while (i8 < n)
    {
      byte[] arrayOfByte2 = arrayOfb[i8].b;
      int i14 = i7 + 1;
      arrayOfByte2[i5] = paramArrayOfByte[i7];
      i8++;
      i7 = i14;
    }
    int i9 = arrayOfb[0].b.length;
    while (i5 < i9)
    {
      int i10 = 0;
      int i11 = i7;
      if (i10 < n)
      {
        if (i10 < i4);
        for (int i12 = i5; ; i12 = i5 + 1)
        {
          byte[] arrayOfByte1 = arrayOfb[i10].b;
          int i13 = i11 + 1;
          arrayOfByte1[i12] = paramArrayOfByte[i11];
          i10++;
          i11 = i13;
          break;
        }
      }
      i5++;
      i7 = i11;
    }
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
 * Qualified Name:     com.google.zxing.qrcode.decoder.b
 * JD-Core Version:    0.6.0
 */