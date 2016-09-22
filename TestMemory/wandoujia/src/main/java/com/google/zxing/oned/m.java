package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.a;
import com.google.zxing.e;
import com.google.zxing.f;
import java.util.EnumMap;
import java.util.Map;

final class m
{
  private final int[] a = new int[4];
  private final StringBuilder b = new StringBuilder();

  final e a(int paramInt, a parama, int[] paramArrayOfInt)
  {
    StringBuilder localStringBuilder = this.b;
    localStringBuilder.setLength(0);
    int[] arrayOfInt = this.a;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    int i = parama.a();
    int j = paramArrayOfInt[1];
    int k = 0;
    int m = 0;
    while ((m < 2) && (j < i))
    {
      int n = p.a(parama, arrayOfInt, j, p.c);
      localStringBuilder.append((char)(48 + n % 10));
      int i1 = j;
      int i3 = 0;
      while (i3 < 4)
      {
        int i4 = i1 + arrayOfInt[i3];
        i3++;
        i1 = i4;
      }
      if (n >= 10)
        k |= 1 << 1 - m;
      int i2;
      if (m != 1)
        i2 = parama.d(parama.c(i1));
      m++;
      j = i2;
    }
    if (localStringBuilder.length() != 2)
      throw NotFoundException.getNotFoundInstance();
    if (Integer.parseInt(localStringBuilder.toString()) % 4 != k)
      throw NotFoundException.getNotFoundInstance();
    String str = localStringBuilder.toString();
    Object localObject;
    if (str.length() != 2)
      localObject = null;
    while (true)
    {
      f[] arrayOff = new f[2];
      arrayOff[0] = new f((paramArrayOfInt[0] + paramArrayOfInt[1]) / 2.0F, paramInt);
      arrayOff[1] = new f(j, paramInt);
      e locale = new e(str, null, arrayOff, BarcodeFormat.UPC_EAN_EXTENSION);
      if (localObject != null)
        locale.a((Map)localObject);
      return locale;
      localObject = new EnumMap(ResultMetadataType.class);
      ((Map)localObject).put(ResultMetadataType.ISSUE_NUMBER, Integer.valueOf(str));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.m
 * JD-Core Version:    0.6.0
 */