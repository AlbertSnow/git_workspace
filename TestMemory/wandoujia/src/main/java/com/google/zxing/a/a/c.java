package com.google.zxing.a.a;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.wandoujia.ripple_framework.util.BadgeUtil;

public final class c
{
  private final com.google.zxing.common.reedsolomon.c a = new com.google.zxing.common.reedsolomon.c(com.google.zxing.common.reedsolomon.a.h);

  private void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    int j = paramInt2 + paramInt3;
    if (paramInt4 == 0);
    int[] arrayOfInt;
    for (int k = 1; ; k = 2)
    {
      arrayOfInt = new int[j / k];
      for (int m = 0; m < j; m++)
      {
        if ((paramInt4 != 0) && (m % 2 != paramInt4 - 1))
          continue;
        arrayOfInt[(m / k)] = (0xFF & paramArrayOfByte[(m + paramInt1)]);
      }
    }
    try
    {
      this.a.a(arrayOfInt, paramInt3 / k);
      while (i < paramInt2)
      {
        if ((paramInt4 == 0) || (i % 2 == paramInt4 - 1))
          paramArrayOfByte[(i + paramInt1)] = (byte)arrayOfInt[(i / k)];
        i++;
      }
    }
    catch (ReedSolomonException localReedSolomonException)
    {
      throw ChecksumException.getChecksumInstance();
    }
  }

  public final BadgeUtil a(com.google.zxing.common.b paramb)
  {
    byte[] arrayOfByte1 = new a(paramb).a();
    a(arrayOfByte1, 0, 10, 10, 0);
    int i = 0xF & arrayOfByte1[0];
    switch (i)
    {
    default:
      throw FormatException.getFormatInstance();
    case 2:
    case 3:
    case 4:
      a(arrayOfByte1, 20, 84, 40, 1);
      a(arrayOfByte1, 20, 84, 40, 2);
    case 5:
    }
    for (byte[] arrayOfByte2 = new byte[94]; ; arrayOfByte2 = new byte[78])
    {
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 10);
      System.arraycopy(arrayOfByte1, 20, arrayOfByte2, 10, -10 + arrayOfByte2.length);
      return b.a(arrayOfByte2, i);
      a(arrayOfByte1, 20, 68, 56, 1);
      a(arrayOfByte1, 20, 68, 56, 2);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.a.a.c
 * JD-Core Version:    0.6.0
 */