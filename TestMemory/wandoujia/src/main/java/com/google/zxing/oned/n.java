package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.a;
import com.google.zxing.e;
import com.google.zxing.f;
import java.util.EnumMap;
import java.util.Map;

final class n
{
  private static final int[] a = { 24, 20, 18, 17, 12, 6, 3, 10, 9, 5 };
  private final int[] b = new int[4];
  private final StringBuilder c = new StringBuilder();

  final e a(int paramInt, a parama, int[] paramArrayOfInt)
  {
    StringBuilder localStringBuilder = this.c;
    localStringBuilder.setLength(0);
    int[] arrayOfInt = this.b;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    int i = parama.a();
    int j = paramArrayOfInt[1];
    int k = 0;
    int m = j;
    int n = 0;
    int i11;
    if ((n < 5) && (m < i))
    {
      int i9 = p.a(parama, arrayOfInt, m, p.c);
      localStringBuilder.append((char)(48 + i9 % 10));
      int i10 = 0;
      int i14;
      for (i11 = m; i10 < 4; i11 = i14)
      {
        i14 = i11 + arrayOfInt[i10];
        i10++;
      }
      if (i9 < 10)
        break label681;
    }
    label654: label681: for (int i13 = k | 1 << 4 - n; ; i13 = k)
    {
      int i12;
      if (n != 4)
        i12 = parama.d(parama.c(i11));
      n++;
      k = i13;
      m = i12;
      break;
      if (localStringBuilder.length() != 5)
        throw NotFoundException.getNotFoundInstance();
      int i1 = 0;
      String str1;
      int i2;
      int i3;
      while (true)
      {
        if (i1 < 10)
        {
          if (k == a[i1])
          {
            str1 = localStringBuilder.toString();
            i2 = str1.length();
            i3 = 0;
            for (int i4 = i2 - 2; i4 >= 0; i4 -= 2)
              i3 += '￐' + str1.charAt(i4);
          }
          i1++;
          continue;
        }
        throw NotFoundException.getNotFoundInstance();
      }
      int i5 = i3 * 3;
      for (int i6 = i2 - 1; i6 >= 0; i6 -= 2)
        i5 += '￐' + str1.charAt(i6);
      if (i5 * 3 % 10 != i1)
        throw NotFoundException.getNotFoundInstance();
      String str2 = localStringBuilder.toString();
      Object localObject;
      if (str2.length() != 5)
        localObject = null;
      while (true)
      {
        f[] arrayOff = new f[2];
        arrayOff[0] = new f((paramArrayOfInt[0] + paramArrayOfInt[1]) / 2.0F, paramInt);
        arrayOff[1] = new f(m, paramInt);
        e locale = new e(str2, null, arrayOff, BarcodeFormat.UPC_EAN_EXTENSION);
        if (localObject != null)
          locale.a((Map)localObject);
        return locale;
        String str4;
        label476: String str5;
        int i8;
        switch (str2.charAt(0))
        {
        default:
          str4 = "";
          int i7 = Integer.parseInt(str2.substring(1));
          str5 = String.valueOf(i7 / 100);
          i8 = i7 % 100;
          if (i8 >= 10)
            break;
        case '0':
        case '5':
        case '9':
        }
        String str3;
        for (String str6 = "0" + i8; ; str6 = String.valueOf(i8))
        {
          str3 = str4 + str5 + '.' + str6;
          while (true)
          {
            if (str3 != null)
              break label654;
            localObject = null;
            break;
            str4 = "£";
            break label476;
            str4 = "$";
            break label476;
            if ("90000".equals(str2))
            {
              str3 = null;
              continue;
            }
            if ("99991".equals(str2))
            {
              str3 = "0.00";
              continue;
            }
            if (!"99990".equals(str2))
              break label637;
            str3 = "Used";
          }
          label637: str4 = "";
          break label476;
        }
        localObject = new EnumMap(ResultMetadataType.class);
        ((Map)localObject).put(ResultMetadataType.SUGGESTED_PRICE, str3);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.n
 * JD-Core Version:    0.6.0
 */