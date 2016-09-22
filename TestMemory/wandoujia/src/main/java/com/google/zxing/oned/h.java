package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;
import com.google.zxing.e;
import com.google.zxing.f;
import java.util.Map;

public final class h extends k
{
  private static final int[] a = { 6, 8, 10, 12, 14 };
  private static final int[] c = { 1, 1, 1, 1 };
  private static final int[] d = { 1, 1, 3 };
  private static int[][] e = { { 1, 1, 3, 3, 1 }, { 3, 1, 1, 1, 3 }, { 1, 3, 1, 1, 3 }, { 3, 3, 1, 1, 1 }, { 1, 1, 3, 1, 3 }, { 3, 1, 3, 1, 1 }, { 1, 3, 3, 1, 1 }, { 1, 1, 1, 3, 3 }, { 3, 1, 1, 3, 1 }, { 1, 3, 1, 3, 1 } };
  private int b = -1;

  private static int a(a parama)
  {
    int i = parama.a();
    int j = parama.c(0);
    if (j == i)
      throw NotFoundException.getNotFoundInstance();
    return j;
  }

  private static int a(int[] paramArrayOfInt)
  {
    float f1 = 0.38F;
    int i = -1;
    int j = 0;
    float f2;
    if (j < 10)
    {
      f2 = a(paramArrayOfInt, e[j], 0.78F);
      if (f2 >= f1)
        break label54;
      i = j;
    }
    while (true)
    {
      j++;
      f1 = f2;
      break;
      if (i >= 0)
        return i;
      throw NotFoundException.getNotFoundInstance();
      label54: f2 = f1;
    }
  }

  private void a(a parama, int paramInt)
  {
    int i = 10 * this.b;
    if (i < paramInt);
    while (true)
    {
      for (int j = paramInt - 1; (i > 0) && (j >= 0) && (!parama.a(j)); j--)
        i--;
      i = paramInt;
    }
    if (i != 0)
      throw NotFoundException.getNotFoundInstance();
  }

  private static void a(a parama, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    int[] arrayOfInt1 = new int[10];
    int[] arrayOfInt2 = new int[5];
    int[] arrayOfInt3 = new int[5];
    int k;
    for (int i = paramInt1; i < paramInt2; i = k)
    {
      a(parama, i, arrayOfInt1);
      for (int j = 0; j < 5; j++)
      {
        int n = j * 2;
        arrayOfInt2[j] = arrayOfInt1[n];
        arrayOfInt3[j] = arrayOfInt1[(n + 1)];
      }
      paramStringBuilder.append((char)(48 + a(arrayOfInt2)));
      paramStringBuilder.append((char)(48 + a(arrayOfInt3)));
      k = i;
      for (int m = 0; m < 10; m++)
        k += arrayOfInt1[m];
    }
  }

  private int[] b(a parama)
  {
    parama.d();
    try
    {
      int[] arrayOfInt = c(parama, a(parama), d);
      a(parama, arrayOfInt[0]);
      int i = arrayOfInt[0];
      arrayOfInt[0] = (parama.a() - arrayOfInt[1]);
      arrayOfInt[1] = (parama.a() - i);
      return arrayOfInt;
    }
    finally
    {
      parama.d();
    }
    throw localObject;
  }

  private static int[] c(a parama, int paramInt, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int[] arrayOfInt = new int[i];
    int j = parama.a();
    int k = paramInt;
    int m = 0;
    int n = 0;
    if (paramInt < j)
    {
      if ((n ^ parama.a(paramInt)) != 0)
        arrayOfInt[m] = (1 + arrayOfInt[m]);
      while (true)
      {
        paramInt++;
        break;
        if (m == i - 1)
        {
          if (a(arrayOfInt, paramArrayOfInt, 0.78F) < 0.38F)
            return new int[] { k, paramInt };
          k += arrayOfInt[0] + arrayOfInt[1];
          System.arraycopy(arrayOfInt, 2, arrayOfInt, 0, i - 2);
          arrayOfInt[(i - 2)] = 0;
          arrayOfInt[(i - 1)] = 0;
          m--;
        }
        while (true)
        {
          arrayOfInt[m] = 1;
          if (n != 0)
            break label159;
          n = 1;
          break;
          m++;
        }
        label159: n = 0;
      }
    }
    throw NotFoundException.getNotFoundInstance();
  }

  public final e a(int paramInt, a parama, Map<DecodeHintType, ?> paramMap)
  {
    int[] arrayOfInt1 = c(parama, a(parama), c);
    this.b = ((arrayOfInt1[1] - arrayOfInt1[0]) / 4);
    a(parama, arrayOfInt1[0]);
    int[] arrayOfInt2 = b(parama);
    StringBuilder localStringBuilder = new StringBuilder(20);
    a(parama, arrayOfInt1[1], arrayOfInt2[0], localStringBuilder);
    String str = localStringBuilder.toString();
    if (paramMap != null);
    for (int[] arrayOfInt3 = (int[])paramMap.get(DecodeHintType.ALLOWED_LENGTHS); ; arrayOfInt3 = null)
    {
      if (arrayOfInt3 == null)
        arrayOfInt3 = a;
      int i = str.length();
      int j = arrayOfInt3.length;
      int k = 0;
      int m = 0;
      int i1;
      if (k < j)
      {
        i1 = arrayOfInt3[k];
        if (i != i1);
      }
      for (int n = 1; ; n = 0)
      {
        if ((n == 0) && (i > m))
          n = 1;
        if (n == 0)
        {
          throw FormatException.getFormatInstance();
          if (i1 <= m)
            break label245;
        }
        while (true)
        {
          k++;
          m = i1;
          break;
          f[] arrayOff = new f[2];
          arrayOff[0] = new f(arrayOfInt1[1], paramInt);
          arrayOff[1] = new f(arrayOfInt2[0], paramInt);
          return new e(str, null, arrayOff, BarcodeFormat.ITF);
          label245: i1 = m;
        }
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.h
 * JD-Core Version:    0.6.0
 */