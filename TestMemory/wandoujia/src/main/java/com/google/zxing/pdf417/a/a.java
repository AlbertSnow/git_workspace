package com.google.zxing.pdf417.a;

import com.google.zxing.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class a
{
  private static final int[] a = { 0, 4, 1, 5 };
  private static final int[] b = { 6, 2, 7, 3 };
  private static final int[] c = { 8, 1, 1, 1, 1, 1, 1, 3 };
  private static final int[] d = { 7, 1, 1, 3, 1, 1, 1, 2, 1 };

  private static float a(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int i = paramArrayOfInt1.length;
    int j = 0;
    int k = 0;
    int m = 0;
    while (j < i)
    {
      int i2 = k + paramArrayOfInt1[j];
      int i3 = m + paramArrayOfInt2[j];
      j++;
      m = i3;
      k = i2;
    }
    if (k < m);
    float f3;
    label147: 
    while (true)
    {
      return (1.0F / 1.0F);
      float f1 = k / m;
      float f2 = 0.8F * f1;
      f3 = 0.0F;
      int n = 0;
      if (n >= i)
        break;
      int i1 = paramArrayOfInt1[n];
      float f4 = f1 * paramArrayOfInt2[n];
      float f5;
      if (i1 > f4)
        f5 = i1 - f4;
      while (true)
      {
        if (f5 > f2)
          break label147;
        f3 += f5;
        n++;
        break;
        f5 = f4 - i1;
      }
    }
    return f3 / k;
  }

  public static b a(com.google.zxing.b paramb)
  {
    com.google.zxing.common.b localb = paramb.c();
    List localList = a(localb);
    if (localList.isEmpty())
    {
      localb = localb.g();
      localb.a();
      localList = a(localb);
    }
    return new b(localb, localList);
  }

  private static List<f[]> a(com.google.zxing.common.b paramb)
  {
    ArrayList localArrayList = new ArrayList();
    int i;
    int j;
    f[] arrayOff;
    int m;
    int k;
    if (paramb.f() > 0)
    {
      i = paramb.f();
      j = paramb.e();
      arrayOff = new f[8];
      a(arrayOff, a(paramb, i, j, 0, 0, c), a);
      if (arrayOff[4] == null)
        break label124;
      m = (int)arrayOff[4].a();
      k = (int)arrayOff[4].b();
    }
    while (true)
    {
      a(arrayOff, a(paramb, i, j, k, m, d), b);
      if ((arrayOff[0] != null) || (arrayOff[3] != null))
        localArrayList.add(arrayOff);
      return localArrayList;
      label124: k = 0;
      m = 0;
    }
  }

  private static void a(f[] paramArrayOff1, f[] paramArrayOff2, int[] paramArrayOfInt)
  {
    for (int i = 0; i < paramArrayOfInt.length; i++)
      paramArrayOff1[paramArrayOfInt[i]] = paramArrayOff2[i];
  }

  private static int[] a(com.google.zxing.common.b paramb, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    Arrays.fill(paramArrayOfInt2, 0, paramArrayOfInt2.length, 0);
    int i = paramArrayOfInt1.length;
    int i1;
    for (int j = 0; (paramb.a(paramInt1, paramInt2)) && (paramInt1 > 0); j = i1)
    {
      i1 = j + 1;
      if (j >= 3)
        break;
      paramInt1--;
    }
    int k = 0;
    int m = 0;
    int n = paramInt1;
    if (paramInt1 < paramInt3)
    {
      if ((m ^ paramb.a(paramInt1, paramInt2)) != 0)
        paramArrayOfInt2[k] = (1 + paramArrayOfInt2[k]);
      while (true)
      {
        paramInt1++;
        break;
        if (k == i - 1)
        {
          if (a(paramArrayOfInt2, paramArrayOfInt1) < 0.42F)
            return new int[] { n, paramInt1 };
          n += paramArrayOfInt2[0] + paramArrayOfInt2[1];
          System.arraycopy(paramArrayOfInt2, 2, paramArrayOfInt2, 0, i - 2);
          paramArrayOfInt2[(i - 2)] = 0;
          paramArrayOfInt2[(i - 1)] = 0;
          k--;
        }
        while (true)
        {
          paramArrayOfInt2[k] = 1;
          if (m != 0)
            break label201;
          m = 1;
          break;
          k++;
        }
        label201: m = 0;
      }
    }
    if ((k == i - 1) && (a(paramArrayOfInt2, paramArrayOfInt1) < 0.42F))
    {
      int[] arrayOfInt = new int[2];
      arrayOfInt[0] = n;
      arrayOfInt[1] = (paramInt1 - 1);
      return arrayOfInt;
    }
    return null;
  }

  private static f[] a(com.google.zxing.common.b paramb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    f[] arrayOff = new f[4];
    int[] arrayOfInt1 = new int[paramArrayOfInt.length];
    int i = paramInt3;
    int m;
    int j;
    if (i < paramInt1)
    {
      int[] arrayOfInt2 = a(paramb, paramInt4, i, paramInt2, paramArrayOfInt, arrayOfInt1);
      if (arrayOfInt2 != null)
      {
        Object localObject3 = arrayOfInt2;
        int i5 = i;
        while (i5 > 0)
        {
          int i6 = i5 - 1;
          int[] arrayOfInt3 = a(paramb, paramInt4, i6, paramInt2, paramArrayOfInt, arrayOfInt1);
          if (arrayOfInt3 != null)
          {
            localObject3 = arrayOfInt3;
            i5 = i6;
            continue;
          }
          i5 = i6 + 1;
        }
        arrayOff[0] = new f(localObject3[0], i5);
        arrayOff[1] = new f(localObject3[1], i5);
        m = 1;
        j = i5;
      }
    }
    while (true)
    {
      int n = j + 1;
      if (m != 0)
      {
        Object localObject1 = new int[2];
        localObject1[0] = (int)arrayOff[0].a();
        localObject1[1] = (int)arrayOff[1].a();
        int i2 = n;
        int i3 = 0;
        label190: if (i2 < paramInt1)
        {
          Object localObject2 = a(paramb, localObject1[0], i2, paramInt2, paramArrayOfInt, arrayOfInt1);
          int i4;
          if ((localObject2 != null) && (Math.abs(localObject1[0] - localObject2[0]) < 5) && (Math.abs(localObject1[1] - localObject2[1]) < 5))
            i4 = 0;
          while (true)
          {
            i2++;
            i3 = i4;
            localObject1 = localObject2;
            break label190;
            i += 5;
            break;
            if (i3 > 25)
              break label293;
            i4 = i3 + 1;
            localObject2 = localObject1;
          }
        }
        label293: n = i2 - (i3 + 1);
        arrayOff[2] = new f(localObject1[0], n);
        arrayOff[3] = new f(localObject1[1], n);
      }
      if (n - j < 10)
        for (int i1 = 0; i1 < 4; i1++)
          arrayOff[i1] = null;
      return arrayOff;
      int k = i;
      m = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.pdf417.a.a
 * JD-Core Version:    0.6.0
 */