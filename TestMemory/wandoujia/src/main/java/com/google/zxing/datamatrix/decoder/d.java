package com.google.zxing.datamatrix.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.common.reedsolomon.c;
import com.wandoujia.ripple_framework.util.BadgeUtil;

public final class d
{
  private final c a = new c(com.google.zxing.common.reedsolomon.a.f);

  public final BadgeUtil a(com.google.zxing.common.b paramb)
  {
    a locala = new a(paramb);
    e locale = locala.a();
    b[] arrayOfb = b.a(locala.b(), locale);
    int i = arrayOfb.length;
    int j = arrayOfb.length;
    int k = 0;
    int m = 0;
    while (k < j)
    {
      m += arrayOfb[k].a();
      k++;
    }
    byte[] arrayOfByte1 = new byte[m];
    for (int n = 0; n < i; n++)
    {
      b localb = arrayOfb[n];
      byte[] arrayOfByte2 = localb.b();
      int i1 = localb.a();
      int i2 = arrayOfByte2.length;
      int[] arrayOfInt = new int[i2];
      for (int i3 = 0; i3 < i2; i3++)
        arrayOfInt[i3] = (0xFF & arrayOfByte2[i3]);
      int i4 = arrayOfByte2.length - i1;
      try
      {
        this.a.a(arrayOfInt, i4);
        for (int i5 = 0; i5 < i1; i5++)
          arrayOfByte2[i5] = (byte)arrayOfInt[i5];
      }
      catch (ReedSolomonException localReedSolomonException)
      {
        throw ChecksumException.getChecksumInstance();
      }
      for (int i6 = 0; i6 < i1; i6++)
        arrayOfByte1[(n + i6 * i)] = arrayOfByte2[i6];
    }
    return DecodedBitStreamParser.a(arrayOfByte1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.datamatrix.decoder.d
 * JD-Core Version:    0.6.0
 */