package com.google.zxing.oned.rss;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.f;
import com.google.zxing.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class e extends a
{
  private static final int[] a = { 1, 10, 34, 70, 126 };
  private static final int[] b = { 4, 20, 48, 81 };
  private static final int[] c = { 0, 161, 961, 2015, 2715 };
  private static final int[] d = { 0, 336, 1036, 1516 };
  private static final int[] e = { 8, 6, 4, 3, 1 };
  private static final int[] f = { 2, 4, 6, 8 };
  private static final int[][] g = { { 3, 8, 2, 1 }, { 3, 5, 5, 1 }, { 3, 3, 7, 1 }, { 3, 1, 9, 1 }, { 2, 7, 4, 1 }, { 2, 5, 6, 1 }, { 2, 3, 8, 1 }, { 1, 5, 7, 1 }, { 1, 3, 9, 1 } };
  private final List<d> h = new ArrayList();
  private final List<d> i = new ArrayList();

  private b a(com.google.zxing.common.a parama, c paramc, boolean paramBoolean)
  {
    int[] arrayOfInt1 = c();
    arrayOfInt1[0] = 0;
    arrayOfInt1[1] = 0;
    arrayOfInt1[2] = 0;
    arrayOfInt1[3] = 0;
    arrayOfInt1[4] = 0;
    arrayOfInt1[5] = 0;
    arrayOfInt1[6] = 0;
    arrayOfInt1[7] = 0;
    int n;
    label72: int[] arrayOfInt2;
    int[] arrayOfInt3;
    float[] arrayOfFloat2;
    int i1;
    label111: float f2;
    int i34;
    label146: int i35;
    if (paramBoolean)
    {
      b(parama, paramc.b()[0], arrayOfInt1);
      if (!paramBoolean)
        break label247;
      n = 16;
      float f1 = a(arrayOfInt1) / n;
      arrayOfInt2 = f();
      arrayOfInt3 = g();
      float[] arrayOfFloat1 = d();
      arrayOfFloat2 = e();
      i1 = 0;
      if (i1 >= arrayOfInt1.length)
        break label289;
      f2 = arrayOfInt1[i1] / f1;
      i34 = (int)(0.5F + f2);
      if (i34 > 0)
        break label254;
      i34 = 1;
      i35 = i1 / 2;
      if ((i1 & 0x1) != 0)
        break label268;
      arrayOfInt2[i35] = i34;
      arrayOfFloat1[i35] = (f2 - i34);
    }
    while (true)
    {
      i1++;
      break label111;
      a(parama, 1 + paramc.b()[1], arrayOfInt1);
      int j = 0;
      for (int k = -1 + arrayOfInt1.length; j < k; k--)
      {
        int m = arrayOfInt1[j];
        arrayOfInt1[j] = arrayOfInt1[k];
        arrayOfInt1[k] = m;
        j++;
      }
      break;
      label247: n = 15;
      break label72;
      label254: if (i34 <= 8)
        break label146;
      i34 = 8;
      break label146;
      label268: arrayOfInt3[i35] = i34;
      arrayOfFloat2[i35] = (f2 - i34);
    }
    label289: int i2 = a(f());
    int i3 = a(g());
    int i4 = i2 + i3 - n;
    int i5 = i2 & 0x1;
    int i6;
    int i7;
    label340: int i8;
    label351: int i9;
    int i10;
    label371: int i12;
    if (paramBoolean)
    {
      i6 = 1;
      if (i5 != i6)
        break label407;
      i7 = 1;
      if ((i3 & 0x1) != 1)
        break label413;
      i8 = 1;
      i9 = 0;
      i10 = 0;
      if (!paramBoolean)
        break label461;
      if (i2 <= 12)
        break label419;
      i11 = 1;
      if (i3 <= 12)
        break label440;
      i12 = 1;
    }
    while (true)
    {
      if (i4 != 1)
        break label561;
      if (i7 == 0)
        break label546;
      if (i8 == 0)
        break label529;
      throw NotFoundException.getNotFoundInstance();
      i6 = 0;
      break;
      label407: i7 = 0;
      break label340;
      label413: i8 = 0;
      break label351;
      label419: i11 = 0;
      i9 = 0;
      if (i2 >= 4)
        break label371;
      i9 = 1;
      i11 = 0;
      break label371;
      label440: i12 = 0;
      i10 = 0;
      if (i3 >= 4)
        continue;
      i10 = 1;
      i12 = 0;
      continue;
      label461: if (i2 > 11)
        i11 = 1;
      while (true)
      {
        if (i3 <= 10)
          break label508;
        i12 = 1;
        i10 = 0;
        break;
        i11 = 0;
        i9 = 0;
        if (i2 >= 5)
          continue;
        i9 = 1;
        i11 = 0;
      }
      label508: i12 = 0;
      i10 = 0;
      if (i3 >= 4)
        continue;
      i10 = 1;
      i12 = 0;
    }
    label529: int i11 = 1;
    while (true)
    {
      if (i9 == 0)
        break label670;
      if (i11 == 0)
        break label659;
      throw NotFoundException.getNotFoundInstance();
      label546: if (i8 == 0)
        throw NotFoundException.getNotFoundInstance();
      i12 = 1;
      continue;
      label561: if (i4 == -1)
      {
        if (i7 != 0)
        {
          if (i8 != 0)
            throw NotFoundException.getNotFoundInstance();
          i9 = 1;
          continue;
        }
        if (i8 == 0)
          throw NotFoundException.getNotFoundInstance();
        i10 = 1;
        continue;
      }
      if (i4 != 0)
        break;
      if (i7 != 0)
      {
        if (i8 == 0)
          throw NotFoundException.getNotFoundInstance();
        if (i2 < i3)
        {
          i9 = 1;
          i12 = 1;
          continue;
        }
        i11 = 1;
        i10 = 1;
        continue;
      }
      if (i8 == 0)
        continue;
      throw NotFoundException.getNotFoundInstance();
    }
    throw NotFoundException.getNotFoundInstance();
    label659: a(f(), d());
    label670: if (i11 != 0)
      b(f(), d());
    if (i10 != 0)
    {
      if (i12 != 0)
        throw NotFoundException.getNotFoundInstance();
      a(g(), d());
    }
    if (i12 != 0)
      b(g(), e());
    int i13 = -1 + arrayOfInt2.length;
    int i14 = 0;
    int i33;
    for (int i15 = 0; i13 >= 0; i15 = i33)
    {
      int i32 = i14 * 9 + arrayOfInt2[i13];
      i33 = i15 + arrayOfInt2[i13];
      i13--;
      i14 = i32;
    }
    int i16 = 0;
    int i17 = 0;
    for (int i18 = -1 + arrayOfInt3.length; i18 >= 0; i18--)
    {
      i16 = i16 * 9 + arrayOfInt3[i18];
      i17 += arrayOfInt3[i18];
    }
    int i19 = i14 + i16 * 3;
    if (paramBoolean)
    {
      if (((i15 & 0x1) != 0) || (i15 > 12) || (i15 < 4))
        throw NotFoundException.getNotFoundInstance();
      int i26 = (12 - i15) / 2;
      int i27 = e[i26];
      int i28 = 9 - i27;
      int i29 = android.support.v4.app.b.a(arrayOfInt2, i27, false);
      int i30 = android.support.v4.app.b.a(arrayOfInt3, i28, true);
      int i31 = a[i26];
      return new b(c[i26] + (i30 + i29 * i31), i19);
    }
    if (((i17 & 0x1) != 0) || (i17 > 10) || (i17 < 4))
      throw NotFoundException.getNotFoundInstance();
    int i20 = (10 - i17) / 2;
    int i21 = f[i20];
    int i22 = 9 - i21;
    int i23 = android.support.v4.app.b.a(arrayOfInt2, i21, true);
    int i24 = android.support.v4.app.b.a(arrayOfInt3, i22, false);
    int i25 = b[i20];
    return new b(d[i20] + (i23 + i24 * i25), i19);
  }

  private d a(com.google.zxing.common.a parama, boolean paramBoolean, int paramInt, Map<DecodeHintType, ?> paramMap)
  {
    int j = 0;
    try
    {
      int[] arrayOfInt1 = b();
      arrayOfInt1[0] = 0;
      arrayOfInt1[1] = 0;
      arrayOfInt1[2] = 0;
      arrayOfInt1[3] = 0;
      int k = parama.a();
      boolean bool1 = false;
      if (j < k)
        if (!parama.a(j))
          bool1 = true;
      int n;
      int i9;
      boolean bool6;
      int i7;
      int i8;
      boolean bool4;
      while (true)
      {
        int m;
        int[] arrayOfInt2;
        int i1;
        if (m < k)
        {
          if ((bool2 ^ parama.a(m)))
          {
            arrayOfInt1[n] = (1 + arrayOfInt1[n]);
            boolean bool8 = bool2;
            i9 = j;
            bool6 = bool8;
          }
          else
          {
            if (n != 3)
              break label580;
            if (b(arrayOfInt1))
            {
              arrayOfInt2 = new int[] { j, m };
              boolean bool3 = parama.a(arrayOfInt2[0]);
              for (i1 = -1 + arrayOfInt2[0]; (i1 >= 0) && ((bool3 ^ parama.a(i1))); i1--);
            }
            i7 = j + (arrayOfInt1[0] + arrayOfInt1[1]);
            arrayOfInt1[0] = arrayOfInt1[2];
            arrayOfInt1[1] = arrayOfInt1[3];
            arrayOfInt1[2] = 0;
            arrayOfInt1[3] = 0;
            i8 = n - 1;
            arrayOfInt1[i8] = 1;
            if (bool2)
              break label597;
            bool4 = true;
            break label561;
          }
        }
        else
        {
          throw NotFoundException.getNotFoundInstance();
          int i2 = i1 + 1;
          int i3 = arrayOfInt2[0] - i2;
          int[] arrayOfInt3 = b();
          System.arraycopy(arrayOfInt3, 0, arrayOfInt3, 1, -1 + arrayOfInt3.length);
          arrayOfInt3[0] = i3;
          int i4 = a(arrayOfInt3, g);
          int i5 = arrayOfInt2[1];
          int i6;
          if (paramBoolean)
          {
            i6 = -1 + parama.a() - i2;
            i5 = -1 + parama.a() - i5;
          }
          while (true)
          {
            int[] arrayOfInt4 = new int[2];
            arrayOfInt4[0] = i2;
            arrayOfInt4[1] = arrayOfInt2[1];
            c localc = new c(i4, arrayOfInt4, i6, i5, paramInt);
            if (paramMap == null);
            g localg;
            for (Object localObject = null; ; localObject = localg)
            {
              if (localObject != null)
              {
                float f1 = (arrayOfInt2[0] + arrayOfInt2[1]) / 2.0F;
                if (paramBoolean)
                  f1 = -1 + parama.a() - f1;
                localObject.a(new f(f1, paramInt));
              }
              b localb1 = a(parama, localc, true);
              b localb2 = a(parama, localc, false);
              return new d(1597 * localb1.a() + localb2.a(), localb1.b() + 4 * localb2.b(), localc);
              localg = (g)paramMap.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            }
            i6 = i2;
          }
          while (true)
          {
            if (paramBoolean == bool1)
              break label529;
            j++;
            break;
            bool1 = false;
          }
          label529: m = j;
          bool2 = bool1;
          n = 0;
          continue;
        }
        label543: m++;
        boolean bool7 = bool6;
        j = i9;
        boolean bool2 = bool7;
      }
      while (true)
      {
        label561: i9 = i7;
        boolean bool5 = bool4;
        n = i8;
        bool6 = bool5;
        break label543;
        label580: int i10 = n + 1;
        i7 = j;
        i8 = i10;
        break;
        label597: bool4 = false;
      }
    }
    catch (NotFoundException localNotFoundException)
    {
    }
    return null;
  }

  private static void a(Collection<d> paramCollection, d paramd)
  {
    if (paramd == null);
    while (true)
    {
      return;
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        if (locald.a() != paramd.a())
          continue;
        locald.e();
      }
      for (int j = 1; j == 0; j = 0)
      {
        paramCollection.add(paramd);
        return;
      }
    }
  }

  public final com.google.zxing.e a(int paramInt, com.google.zxing.common.a parama, Map<DecodeHintType, ?> paramMap)
  {
    d locald1 = a(parama, false, paramInt, paramMap);
    a(this.h, locald1);
    parama.d();
    d locald2 = a(parama, true, paramInt, paramMap);
    a(this.i, locald2);
    parama.d();
    int j = this.h.size();
    for (int k = 0; k < j; k++)
    {
      d locald3 = (d)this.h.get(k);
      if (locald3.d() <= 1)
        continue;
      int m = this.i.size();
      for (int n = 0; n < m; n++)
      {
        d locald4 = (d)this.i.get(n);
        if (locald4.d() <= 1)
          continue;
        int i1 = (locald3.b() + 16 * locald4.b()) % 79;
        int i2 = 9 * locald3.c().a() + locald4.c().a();
        if (i2 > 72)
          i2--;
        if (i2 > 8)
          i2--;
        int i3;
        if (i1 == i2)
          i3 = 1;
        while (i3 != 0)
        {
          String str1 = String.valueOf(4537077L * locald3.a() + locald4.a());
          StringBuilder localStringBuilder = new StringBuilder(14);
          int i4 = 13 - str1.length();
          while (true)
            if (i4 > 0)
            {
              localStringBuilder.append('0');
              i4--;
              continue;
              i3 = 0;
              break;
            }
          localStringBuilder.append(str1);
          int i5 = 0;
          int i6 = 0;
          while (i6 < 13)
          {
            int i8 = '￐' + localStringBuilder.charAt(i6);
            if ((i6 & 0x1) == 0)
              i8 *= 3;
            int i9 = i8 + i5;
            i6++;
            i5 = i9;
          }
          int i7 = 10 - i5 % 10;
          if (i7 == 10)
            i7 = 0;
          localStringBuilder.append(i7);
          f[] arrayOff1 = locald3.c().c();
          f[] arrayOff2 = locald4.c().c();
          String str2 = String.valueOf(localStringBuilder.toString());
          f[] arrayOff3 = new f[4];
          arrayOff3[0] = arrayOff1[0];
          arrayOff3[1] = arrayOff1[1];
          arrayOff3[2] = arrayOff2[0];
          arrayOff3[3] = arrayOff2[1];
          return new com.google.zxing.e(str2, null, arrayOff3, BarcodeFormat.RSS_14);
        }
      }
    }
    throw NotFoundException.getNotFoundInstance();
  }

  public final void a()
  {
    this.h.clear();
    this.i.clear();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.rss.e
 * JD-Core Version:    0.6.0
 */