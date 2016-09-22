package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.b;
import com.google.zxing.f;
import com.google.zxing.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FinderPatternFinder
{
  private final b a;
  private final List<d> b;
  private boolean c;
  private final int[] d;
  private final g e;

  public FinderPatternFinder(b paramb, g paramg)
  {
    this.a = paramb;
    this.b = new ArrayList();
    this.d = new int[5];
    this.e = paramg;
  }

  private static float a(int[] paramArrayOfInt, int paramInt)
  {
    return paramInt - paramArrayOfInt[4] - paramArrayOfInt[3] - paramArrayOfInt[2] / 2.0F;
  }

  private static boolean a(int[] paramArrayOfInt)
  {
    int i = 0;
    int j = 0;
    int k;
    if (i < 5)
    {
      k = paramArrayOfInt[i];
      if (k != 0);
    }
    float f1;
    float f2;
    do
    {
      do
      {
        return false;
        j += k;
        i++;
        break;
      }
      while (j < 7);
      f1 = j / 7.0F;
      f2 = f1 / 2.0F;
    }
    while ((Math.abs(f1 - paramArrayOfInt[0]) >= f2) || (Math.abs(f1 - paramArrayOfInt[1]) >= f2) || (Math.abs(3.0F * f1 - paramArrayOfInt[2]) >= 3.0F * f2) || (Math.abs(f1 - paramArrayOfInt[3]) >= f2) || (Math.abs(f1 - paramArrayOfInt[4]) >= f2));
    return true;
  }

  private boolean a(int[] paramArrayOfInt, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = paramArrayOfInt[0] + paramArrayOfInt[1] + paramArrayOfInt[2] + paramArrayOfInt[3] + paramArrayOfInt[4];
    float f1 = a(paramArrayOfInt, paramInt2);
    int j = (int)f1;
    int k = paramArrayOfInt[2];
    b localb1 = this.a;
    int m = localb1.f();
    int[] arrayOfInt1 = a();
    for (int n = paramInt1; (n >= 0) && (localb1.a(j, n)); n--)
      arrayOfInt1[2] = (1 + arrayOfInt1[2]);
    float f2;
    if (n < 0)
      f2 = (0.0F / 0.0F);
    float f3;
    int i8;
    int i9;
    int i10;
    int[] arrayOfInt3;
    int i11;
    int i12;
    float f4;
    int i6;
    while (true)
      if (!Float.isNaN(f2))
      {
        int i1 = (int)f1;
        int i2 = (int)f2;
        int i3 = paramArrayOfInt[2];
        b localb2 = this.a;
        int i4 = localb2.e();
        int[] arrayOfInt2 = a();
        int i5 = i1;
        while (true)
          if ((i5 >= 0) && (localb2.a(i5, i2)))
          {
            arrayOfInt2[2] = (1 + arrayOfInt2[2]);
            i5--;
            continue;
            while ((n >= 0) && (!localb1.a(j, n)) && (arrayOfInt1[1] <= k))
            {
              arrayOfInt1[1] = (1 + arrayOfInt1[1]);
              n--;
            }
            if ((n < 0) || (arrayOfInt1[1] > k))
            {
              f2 = (0.0F / 0.0F);
              break;
            }
            while ((n >= 0) && (localb1.a(j, n)) && (arrayOfInt1[0] <= k))
            {
              arrayOfInt1[0] = (1 + arrayOfInt1[0]);
              n--;
            }
            if (arrayOfInt1[0] > k)
            {
              f2 = (0.0F / 0.0F);
              break;
            }
            for (int i17 = paramInt1 + 1; (i17 < m) && (localb1.a(j, i17)); i17++)
              arrayOfInt1[2] = (1 + arrayOfInt1[2]);
            if (i17 == m)
            {
              f2 = (0.0F / 0.0F);
              break;
            }
            while ((i17 < m) && (!localb1.a(j, i17)) && (arrayOfInt1[3] < k))
            {
              arrayOfInt1[3] = (1 + arrayOfInt1[3]);
              i17++;
            }
            if ((i17 == m) || (arrayOfInt1[3] >= k))
            {
              f2 = (0.0F / 0.0F);
              break;
            }
            while ((i17 < m) && (localb1.a(j, i17)) && (arrayOfInt1[4] < k))
            {
              arrayOfInt1[4] = (1 + arrayOfInt1[4]);
              i17++;
            }
            if (arrayOfInt1[4] >= k)
            {
              f2 = (0.0F / 0.0F);
              break;
            }
            if (5 * Math.abs(arrayOfInt1[0] + arrayOfInt1[1] + arrayOfInt1[2] + arrayOfInt1[3] + arrayOfInt1[4] - i) >= i * 2)
            {
              f2 = (0.0F / 0.0F);
              break;
            }
            if (a(arrayOfInt1))
            {
              f2 = a(arrayOfInt1, i17);
              break;
            }
            f2 = (0.0F / 0.0F);
            break;
          }
        if (i5 < 0)
          f3 = (0.0F / 0.0F);
        while (true)
        {
          if (Float.isNaN(f3))
            break label1677;
          if (!paramBoolean)
            break;
          i8 = (int)f2;
          i9 = (int)f3;
          i10 = paramArrayOfInt[2];
          arrayOfInt3 = a();
          i11 = 0;
          while (true)
            if ((i8 >= i11) && (i9 >= i11) && (this.a.a(i9 - i11, i8 - i11)))
            {
              arrayOfInt3[2] = (1 + arrayOfInt3[2]);
              i11++;
              continue;
              while ((i5 >= 0) && (!localb2.a(i5, i2)) && (arrayOfInt2[1] <= i3))
              {
                arrayOfInt2[1] = (1 + arrayOfInt2[1]);
                i5--;
              }
              if ((i5 < 0) || (arrayOfInt2[1] > i3))
              {
                f3 = (0.0F / 0.0F);
                break;
              }
              while ((i5 >= 0) && (localb2.a(i5, i2)) && (arrayOfInt2[0] <= i3))
              {
                arrayOfInt2[0] = (1 + arrayOfInt2[0]);
                i5--;
              }
              if (arrayOfInt2[0] > i3)
              {
                f3 = (0.0F / 0.0F);
                break;
              }
              for (int i16 = i1 + 1; (i16 < i4) && (localb2.a(i16, i2)); i16++)
                arrayOfInt2[2] = (1 + arrayOfInt2[2]);
              if (i16 == i4)
              {
                f3 = (0.0F / 0.0F);
                break;
              }
              while ((i16 < i4) && (!localb2.a(i16, i2)) && (arrayOfInt2[3] < i3))
              {
                arrayOfInt2[3] = (1 + arrayOfInt2[3]);
                i16++;
              }
              if ((i16 == i4) || (arrayOfInt2[3] >= i3))
              {
                f3 = (0.0F / 0.0F);
                break;
              }
              while ((i16 < i4) && (localb2.a(i16, i2)) && (arrayOfInt2[4] < i3))
              {
                arrayOfInt2[4] = (1 + arrayOfInt2[4]);
                i16++;
              }
              if (arrayOfInt2[4] >= i3)
              {
                f3 = (0.0F / 0.0F);
                break;
              }
              if (5 * Math.abs(arrayOfInt2[0] + arrayOfInt2[1] + arrayOfInt2[2] + arrayOfInt2[3] + arrayOfInt2[4] - i) >= i)
              {
                f3 = (0.0F / 0.0F);
                break;
              }
              if (a(arrayOfInt2))
              {
                f3 = a(arrayOfInt2, i16);
                break;
              }
              f3 = (0.0F / 0.0F);
              break;
            }
          if ((i8 >= i11) && (i9 >= i11))
            break label1181;
          i12 = 0;
          if (i12 == 0)
            break label1677;
        }
        f4 = i / 7.0F;
        i6 = 0;
        label1059: if (i6 >= this.b.size())
          break label1679;
        d locald2 = (d)this.b.get(i6);
        if (!locald2.a(f4, f2, f3))
          break;
        this.b.set(i6, locald2.b(f2, f3, f4));
      }
    label1677: label1679: for (int i7 = 1; ; i7 = 0)
    {
      if (i7 == 0)
      {
        d locald1 = new d(f3, f2, f4);
        this.b.add(locald1);
        if (this.e != null)
          this.e.a(locald1);
      }
      return true;
      label1181: 
      while ((i8 >= i11) && (i9 >= i11) && (!this.a.a(i9 - i11, i8 - i11)) && (arrayOfInt3[1] <= i10))
      {
        arrayOfInt3[1] = (1 + arrayOfInt3[1]);
        i11++;
      }
      if ((i8 < i11) || (i9 < i11) || (arrayOfInt3[1] > i10))
      {
        i12 = 0;
        break;
      }
      while ((i8 >= i11) && (i9 >= i11) && (this.a.a(i9 - i11, i8 - i11)) && (arrayOfInt3[0] <= i10))
      {
        arrayOfInt3[0] = (1 + arrayOfInt3[0]);
        i11++;
      }
      if (arrayOfInt3[0] <= i10)
      {
        int i13 = this.a.f();
        int i14 = this.a.e();
        for (int i15 = 1; (i8 + i15 < i13) && (i9 + i15 < i14) && (this.a.a(i9 + i15, i8 + i15)); i15++)
          arrayOfInt3[2] = (1 + arrayOfInt3[2]);
        if ((i8 + i15 >= i13) || (i9 + i15 >= i14))
        {
          i12 = 0;
          break;
        }
        while ((i8 + i15 < i13) && (i9 + i15 < i14) && (!this.a.a(i9 + i15, i8 + i15)) && (arrayOfInt3[3] < i10))
        {
          arrayOfInt3[3] = (1 + arrayOfInt3[3]);
          i15++;
        }
        if ((i8 + i15 >= i13) || (i9 + i15 >= i14) || (arrayOfInt3[3] >= i10))
        {
          i12 = 0;
          break;
        }
        while ((i8 + i15 < i13) && (i9 + i15 < i14) && (this.a.a(i9 + i15, i8 + i15)) && (arrayOfInt3[4] < i10))
        {
          arrayOfInt3[4] = (1 + arrayOfInt3[4]);
          i15++;
        }
        if ((arrayOfInt3[4] < i10) && (Math.abs(arrayOfInt3[0] + arrayOfInt3[1] + arrayOfInt3[2] + arrayOfInt3[3] + arrayOfInt3[4] - i) < i * 2) && (a(arrayOfInt3)))
        {
          i12 = 1;
          break;
        }
      }
      i12 = 0;
      break;
      i6++;
      break label1059;
      return false;
    }
  }

  private int[] a()
  {
    this.d[0] = 0;
    this.d[1] = 0;
    this.d[2] = 0;
    this.d[3] = 0;
    this.d[4] = 0;
    return this.d;
  }

  private boolean b()
  {
    float f1 = 0.0F;
    int i = this.b.size();
    Iterator localIterator1 = this.b.iterator();
    float f2 = 0.0F;
    int j = 0;
    int m;
    float f4;
    if (localIterator1.hasNext())
    {
      d locald = (d)localIterator1.next();
      if (locald.d() < 2)
        break label161;
      m = j + 1;
      f4 = f2 + locald.c();
    }
    for (int k = m; ; k = j)
    {
      j = k;
      f2 = f4;
      break;
      if (j < 3);
      do
      {
        return false;
        float f3 = f2 / i;
        Iterator localIterator2 = this.b.iterator();
        while (localIterator2.hasNext())
          f1 += Math.abs(((d)localIterator2.next()).c() - f3);
      }
      while (f1 > 0.05F * f2);
      return true;
      label161: f4 = f2;
    }
  }

  final e a(Map<DecodeHintType, ?> paramMap)
  {
    int i;
    boolean bool1;
    label36: int k;
    boolean bool2;
    int[] arrayOfInt;
    int n;
    int i1;
    int i4;
    int i5;
    if ((paramMap != null) && (paramMap.containsKey(DecodeHintType.TRY_HARDER)))
    {
      i = 1;
      if ((paramMap == null) || (!paramMap.containsKey(DecodeHintType.PURE_BARCODE)))
        break label193;
      bool1 = true;
      int j = this.a.f();
      k = this.a.e();
      int m = j * 3 / 228;
      if ((m < 3) || (i != 0))
        m = 3;
      bool2 = false;
      arrayOfInt = new int[5];
      n = m - 1;
      i1 = m;
      if ((n >= j) || (bool2))
        break label608;
      arrayOfInt[0] = 0;
      arrayOfInt[1] = 0;
      arrayOfInt[2] = 0;
      arrayOfInt[3] = 0;
      arrayOfInt[4] = 0;
      i4 = 0;
      i5 = 0;
      label138: if (i5 >= k)
        break label557;
      if (!this.a.a(i5, n))
        break label198;
      if ((i4 & 0x1) == 1)
        i4++;
      arrayOfInt[i4] = (1 + arrayOfInt[i4]);
    }
    label182: label193: label198: boolean bool3;
    while (true)
    {
      i5++;
      break label138;
      i = 0;
      break;
      bool1 = false;
      break label36;
      if ((i4 & 0x1) != 0)
        break label542;
      if (i4 != 4)
        break label524;
      if (!a(arrayOfInt))
        break label484;
      if (!a(arrayOfInt, n, i5, bool1))
        break label444;
      if (!this.c)
        break label284;
      bool3 = b();
      label246: arrayOfInt[0] = 0;
      arrayOfInt[1] = 0;
      arrayOfInt[2] = 0;
      arrayOfInt[3] = 0;
      arrayOfInt[4] = 0;
      bool2 = bool3;
      i1 = 2;
      i4 = 0;
    }
    label284: int i6;
    label393: int i8;
    int i7;
    if (this.b.size() > 1)
    {
      Iterator localIterator3 = this.b.iterator();
      Object localObject = null;
      while (localIterator3.hasNext())
      {
        d locald = (d)localIterator3.next();
        if (locald.d() < 2)
          continue;
        if (localObject == null)
        {
          localObject = locald;
          continue;
        }
        this.c = true;
        i6 = (int)(Math.abs(localObject.a() - locald.a()) - Math.abs(localObject.b() - locald.b())) / 2;
        if (i6 <= arrayOfInt[2])
          break label1019;
        i8 = n + (-2 + (i6 - arrayOfInt[2]));
        i7 = k - 1;
      }
    }
    while (true)
    {
      i5 = i7;
      n = i8;
      bool3 = bool2;
      break label246;
      i6 = 0;
      break label393;
      label444: arrayOfInt[0] = arrayOfInt[2];
      arrayOfInt[1] = arrayOfInt[3];
      arrayOfInt[2] = arrayOfInt[4];
      arrayOfInt[3] = 1;
      arrayOfInt[4] = 0;
      i4 = 3;
      break label182;
      label484: arrayOfInt[0] = arrayOfInt[2];
      arrayOfInt[1] = arrayOfInt[3];
      arrayOfInt[2] = arrayOfInt[4];
      arrayOfInt[3] = 1;
      arrayOfInt[4] = 0;
      i4 = 3;
      break label182;
      label524: i4++;
      arrayOfInt[i4] = (1 + arrayOfInt[i4]);
      break label182;
      label542: arrayOfInt[i4] = (1 + arrayOfInt[i4]);
      break label182;
      label557: if ((a(arrayOfInt)) && (a(arrayOfInt, n, k, bool1)))
      {
        i1 = arrayOfInt[0];
        if (this.c)
          bool2 = b();
      }
      n += i1;
      break;
      label608: int i2 = this.b.size();
      if (i2 < 3)
        throw NotFoundException.getNotFoundInstance();
      if (i2 > 3)
      {
        Iterator localIterator2 = this.b.iterator();
        float f3 = 0.0F;
        float f4 = 0.0F;
        while (localIterator2.hasNext())
        {
          float f8 = ((d)localIterator2.next()).c();
          f3 += f8;
          f4 += f8 * f8;
        }
        float f5 = f3 / i2;
        float f6 = (float)Math.sqrt(f4 / i2 - f5 * f5);
        Collections.sort(this.b, new FinderPatternFinder.FurthestFromAverageComparator(f5, null));
        float f7 = Math.max(0.2F * f5, f6);
        for (int i3 = 0; (i3 < this.b.size()) && (this.b.size() > 3); i3++)
        {
          if (Math.abs(((d)this.b.get(i3)).c() - f5) <= f7)
            continue;
          this.b.remove(i3);
          i3--;
        }
      }
      if (this.b.size() > 3)
      {
        Iterator localIterator1 = this.b.iterator();
        float f1 = 0.0F;
        while (localIterator1.hasNext())
          f1 += ((d)localIterator1.next()).c();
        float f2 = f1 / this.b.size();
        Collections.sort(this.b, new FinderPatternFinder.CenterComparator(f2, null));
        this.b.subList(3, this.b.size()).clear();
      }
      d[] arrayOfd = new d[3];
      arrayOfd[0] = ((d)this.b.get(0));
      arrayOfd[1] = ((d)this.b.get(1));
      arrayOfd[2] = ((d)this.b.get(2));
      f.a(arrayOfd);
      return new e(arrayOfd);
      label1019: i7 = i5;
      i8 = n;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.qrcode.detector.FinderPatternFinder
 * JD-Core Version:    0.6.0
 */