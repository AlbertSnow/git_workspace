package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.a;
import com.google.zxing.e;
import com.google.zxing.f;
import java.util.Arrays;
import java.util.Map;

public abstract class p extends k
{
  static final int[] a;
  static final int[][] b;
  static final int[][] c;
  private static int[] d = { 1, 1, 1 };
  private final StringBuilder e = new StringBuilder(20);
  private final o f = new o();
  private final g g = new g();

  static
  {
    a = new int[] { 1, 1, 1, 1, 1 };
    b = new int[][] { { 3, 2, 1, 1 }, { 2, 2, 2, 1 }, { 2, 1, 2, 2 }, { 1, 4, 1, 1 }, { 1, 1, 3, 2 }, { 1, 2, 3, 1 }, { 1, 1, 1, 4 }, { 1, 3, 1, 2 }, { 1, 2, 1, 3 }, { 3, 1, 1, 2 } };
    c = new int[20][];
    System.arraycopy(b, 0, c, 0, 10);
    for (int i = 10; i < 20; i++)
    {
      int[] arrayOfInt1 = b[(i - 10)];
      int[] arrayOfInt2 = new int[arrayOfInt1.length];
      for (int j = 0; j < arrayOfInt1.length; j++)
        arrayOfInt2[j] = arrayOfInt1[(-1 + (arrayOfInt1.length - j))];
      c[i] = arrayOfInt2;
    }
  }

  static int a(a parama, int[] paramArrayOfInt, int paramInt, int[][] paramArrayOfInt1)
  {
    a(parama, paramInt, paramArrayOfInt);
    float f1 = 0.48F;
    int i = -1;
    int j = paramArrayOfInt1.length;
    int k = 0;
    float f2;
    if (k < j)
    {
      f2 = a(paramArrayOfInt, paramArrayOfInt1[k], 0.7F);
      if (f2 >= f1)
        break label73;
      i = k;
    }
    while (true)
    {
      k++;
      f1 = f2;
      break;
      if (i >= 0)
        return i;
      throw NotFoundException.getNotFoundInstance();
      label73: f2 = f1;
    }
  }

  static int[] a(a parama)
  {
    int[] arrayOfInt1 = new int[3];
    int i = 0;
    int[] arrayOfInt2 = null;
    boolean bool = false;
    while (!bool)
    {
      Arrays.fill(arrayOfInt1, 0, 3, 0);
      arrayOfInt2 = a(parama, i, false, d, arrayOfInt1);
      int j = arrayOfInt2[0];
      i = arrayOfInt2[1];
      int k = j - (i - j);
      if (k < 0)
        continue;
      bool = parama.b(k, j);
    }
    return arrayOfInt2;
  }

  static int[] a(a parama, int paramInt, boolean paramBoolean, int[] paramArrayOfInt)
  {
    return a(parama, paramInt, paramBoolean, paramArrayOfInt, new int[paramArrayOfInt.length]);
  }

  private static int[] a(a parama, int paramInt, boolean paramBoolean, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int i = paramArrayOfInt1.length;
    int j = parama.a();
    int k;
    boolean bool;
    int m;
    int n;
    if (paramBoolean)
    {
      k = parama.d(paramInt);
      bool = paramBoolean;
      m = 0;
      n = k;
      label31: if (n >= j)
        break label190;
      if (!(bool ^ parama.a(n)))
        break label78;
      paramArrayOfInt2[m] = (1 + paramArrayOfInt2[m]);
    }
    while (true)
    {
      n++;
      break label31;
      k = parama.c(paramInt);
      break;
      label78: if (m == i - 1)
      {
        if (a(paramArrayOfInt2, paramArrayOfInt1, 0.7F) < 0.48F)
          return new int[] { k, n };
        k += paramArrayOfInt2[0] + paramArrayOfInt2[1];
        System.arraycopy(paramArrayOfInt2, 2, paramArrayOfInt2, 0, i - 2);
        paramArrayOfInt2[(i - 2)] = 0;
        paramArrayOfInt2[(i - 1)] = 0;
        m--;
      }
      while (true)
      {
        paramArrayOfInt2[m] = 1;
        if (bool)
          break label184;
        bool = true;
        break;
        m++;
      }
      label184: bool = false;
    }
    label190: throw NotFoundException.getNotFoundInstance();
  }

  protected abstract int a(a parama, int[] paramArrayOfInt, StringBuilder paramStringBuilder);

  public e a(int paramInt, a parama, Map<DecodeHintType, ?> paramMap)
  {
    return a(paramInt, parama, a(parama), paramMap);
  }

  public e a(int paramInt, a parama, int[] paramArrayOfInt, Map<DecodeHintType, ?> paramMap)
  {
    if (paramMap == null);
    StringBuilder localStringBuilder;
    int[] arrayOfInt1;
    for (com.google.zxing.g localg = null; ; localg = (com.google.zxing.g)paramMap.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK))
    {
      if (localg != null)
        localg.a(new f((paramArrayOfInt[0] + paramArrayOfInt[1]) / 2.0F, paramInt));
      localStringBuilder = this.e;
      localStringBuilder.setLength(0);
      int i = a(parama, paramArrayOfInt, localStringBuilder);
      if (localg != null)
        localg.a(new f(i, paramInt));
      arrayOfInt1 = a(parama, i);
      if (localg != null)
        localg.a(new f((arrayOfInt1[0] + arrayOfInt1[1]) / 2.0F, paramInt));
      int j = arrayOfInt1[1];
      int k = j + (j - arrayOfInt1[0]);
      if ((k < parama.a()) && (parama.b(j, k)))
        break;
      throw NotFoundException.getNotFoundInstance();
    }
    String str1 = localStringBuilder.toString();
    if (str1.length() < 8)
      throw FormatException.getFormatInstance();
    if (!a(str1))
      throw ChecksumException.getChecksumInstance();
    float f1 = (paramArrayOfInt[1] + paramArrayOfInt[0]) / 2.0F;
    float f2 = (arrayOfInt1[1] + arrayOfInt1[0]) / 2.0F;
    BarcodeFormat localBarcodeFormat = b();
    f[] arrayOff = new f[2];
    arrayOff[0] = new f(f1, paramInt);
    arrayOff[1] = new f(f2, paramInt);
    e locale1 = new e(str1, null, arrayOff, localBarcodeFormat);
    try
    {
      e locale2 = this.f.a(paramInt, parama, arrayOfInt1[1]);
      locale1.a(ResultMetadataType.UPC_EAN_EXTENSION, locale2.a());
      locale1.a(locale2.e());
      locale1.a(locale2.c());
      int i3 = locale2.a().length();
      m = i3;
      if (paramMap == null)
      {
        arrayOfInt2 = null;
        if (arrayOfInt2 == null)
          break label452;
        int n = arrayOfInt2.length;
        i1 = 0;
        int i2 = 0;
        if (i1 < n)
        {
          if (m != arrayOfInt2[i1])
            break label446;
          i2 = 1;
        }
        if (i2 != 0)
          break label452;
        throw NotFoundException.getNotFoundInstance();
      }
    }
    catch (ReaderException localReaderException)
    {
      while (true)
      {
        int i1;
        int m = 0;
        continue;
        int[] arrayOfInt2 = (int[])paramMap.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS);
        continue;
        label446: i1++;
      }
      label452: if ((localBarcodeFormat == BarcodeFormat.EAN_13) || (localBarcodeFormat == BarcodeFormat.UPC_A))
      {
        String str2 = this.g.a(str1);
        if (str2 != null)
          locale1.a(ResultMetadataType.POSSIBLE_COUNTRY, str2);
      }
    }
    return locale1;
  }

  boolean a(String paramString)
  {
    int i = paramString.length();
    int j = 0;
    if (i != 0)
    {
      int k = i - 2;
      int m = 0;
      while (k >= 0)
      {
        int i4 = '￐' + paramString.charAt(k);
        if ((i4 < 0) || (i4 > 9))
          throw FormatException.getFormatInstance();
        m += i4;
        k -= 2;
      }
      int n = m * 3;
      for (int i1 = i - 1; i1 >= 0; i1 -= 2)
      {
        int i3 = '￐' + paramString.charAt(i1);
        if ((i3 < 0) || (i3 > 9))
          throw FormatException.getFormatInstance();
        n += i3;
      }
      int i2 = n % 10;
      j = 0;
      if (i2 == 0)
        j = 1;
    }
    return j;
  }

  int[] a(a parama, int paramInt)
  {
    return a(parama, paramInt, false, d);
  }

  abstract BarcodeFormat b();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.p
 * JD-Core Version:    0.6.0
 */