package com.google.zxing.oned.rss.expanded;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.e;
import com.google.zxing.f;
import com.google.zxing.oned.rss.expanded.decoders.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c extends com.google.zxing.oned.rss.a
{
  private static final int[] a = { 7, 5, 4, 3, 1 };
  private static final int[] b = { 4, 20, 52, 104, 204 };
  private static final int[] c = { 0, 348, 1388, 2948, 3988 };
  private static final int[][] d = { { 1, 8, 4, 1 }, { 3, 6, 4, 1 }, { 3, 4, 6, 1 }, { 3, 2, 8, 1 }, { 2, 6, 5, 1 }, { 2, 2, 9, 1 } };
  private static final int[][] e = { { 1, 3, 9, 27, 81, 32, 96, 77 }, { 20, 60, 180, 118, 143, 7, 21, 63 }, { 189, 145, 13, 39, 117, 140, 209, 205 }, { 193, 157, 49, 147, 19, 57, 171, 91 }, { 62, 186, 136, 197, 169, 85, 44, 132 }, { 185, 133, 188, 142, 4, 12, 36, 108 }, { 113, 128, 173, 97, 80, 29, 87, 50 }, { 150, 28, 84, 41, 123, 158, 52, 156 }, { 46, 138, 203, 187, 139, 206, 196, 166 }, { 76, 17, 51, 153, 37, 111, 122, 155 }, { 43, 129, 176, 106, 107, 110, 119, 146 }, { 16, 48, 144, 10, 30, 90, 59, 177 }, { 109, 116, 137, 200, 178, 112, 125, 164 }, { 70, 210, 208, 202, 184, 130, 179, 115 }, { 134, 191, 151, 31, 93, 68, 204, 190 }, { 148, 22, 66, 198, 172, 94, 71, 2 }, { 6, 18, 54, 162, 64, 192, 154, 40 }, { 120, 149, 25, 75, 14, 42, 126, 167 }, { 79, 26, 78, 23, 69, 207, 199, 175 }, { 103, 98, 83, 38, 114, 131, 182, 124 }, { 161, 61, 183, 127, 170, 88, 53, 159 }, { 55, 165, 73, 8, 24, 72, 5, 15 }, { 45, 135, 194, 160, 58, 174, 100, 89 } };
  private static final int[][] f = { { 0, 0 }, { 0, 1, 1 }, { 0, 2, 1, 3 }, { 0, 4, 1, 3, 2 }, { 0, 4, 1, 3, 3, 5 }, { 0, 4, 1, 3, 4, 5, 5 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 4, 4 }, { 0, 0, 1, 1, 2, 2, 3, 4, 5, 5 }, { 0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5 } };
  private final List<a> g = new ArrayList(11);
  private final List<b> h = new ArrayList();
  private final int[] i = new int[2];
  private boolean j = false;

  private static e a(List<a> paramList)
  {
    int k = -1 + 2 * paramList.size();
    if (((a)paramList.get(-1 + paramList.size())).b() == null);
    for (int m = k - 1; ; m = k)
    {
      com.google.zxing.common.a locala = new com.google.zxing.common.a(m * 12);
      int n = ((a)paramList.get(0)).b().a();
      int i1 = 11;
      int i12;
      for (int i2 = 0; i1 >= 0; i2 = i12)
      {
        if ((n & 1 << i1) != 0)
          locala.b(i2);
        i12 = i2 + 1;
        i1--;
      }
      int i3 = 1;
      int i7;
      for (int i4 = i2; i3 < paramList.size(); i4 = i7)
      {
        a locala1 = (a)paramList.get(i3);
        int i5 = locala1.a().a();
        int i6 = 11;
        while (i6 >= 0)
        {
          if ((i5 & 1 << i6) != 0)
            locala.b(i4);
          int i11 = i4 + 1;
          i6--;
          i4 = i11;
        }
        if (locala1.b() != null)
        {
          int i8 = locala1.b().a();
          i7 = i4;
          int i9 = 11;
          while (i9 >= 0)
          {
            if ((i8 & 1 << i9) != 0)
              locala.b(i7);
            int i10 = i7 + 1;
            i9--;
            i7 = i10;
          }
        }
        i7 = i4;
        i3++;
      }
      String str = j.a(locala).a();
      f[] arrayOff1 = ((a)paramList.get(0)).c().c();
      f[] arrayOff2 = ((a)paramList.get(-1 + paramList.size())).c().c();
      f[] arrayOff3 = new f[4];
      arrayOff3[0] = arrayOff1[0];
      arrayOff3[1] = arrayOff1[1];
      arrayOff3[2] = arrayOff2[0];
      arrayOff3[3] = arrayOff2[1];
      return new e(str, null, arrayOff3, BarcodeFormat.RSS_EXPANDED);
    }
  }

  private com.google.zxing.oned.rss.b a(com.google.zxing.common.a parama, com.google.zxing.oned.rss.c paramc, boolean paramBoolean1, boolean paramBoolean2)
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
    if (paramBoolean2)
      b(parama, paramc.b()[0], arrayOfInt1);
    float f1;
    while (true)
    {
      f1 = a(arrayOfInt1) / 17.0F;
      float f2 = (paramc.b()[1] - paramc.b()[0]) / 15.0F;
      if (Math.abs(f1 - f2) / f2 <= 0.3F)
        break;
      throw NotFoundException.getNotFoundInstance();
      a(parama, paramc.b()[1], arrayOfInt1);
      int k = 0;
      for (int m = -1 + arrayOfInt1.length; k < m; m--)
      {
        int n = arrayOfInt1[k];
        arrayOfInt1[k] = arrayOfInt1[m];
        arrayOfInt1[m] = n;
        k++;
      }
    }
    int[] arrayOfInt2 = f();
    int[] arrayOfInt3 = g();
    float[] arrayOfFloat1 = d();
    float[] arrayOfFloat2 = e();
    int i1 = 0;
    if (i1 < arrayOfInt1.length)
    {
      float f3 = 1.0F * arrayOfInt1[i1] / f1;
      int i30 = (int)(0.5F + f3);
      label254: int i31;
      if (i30 <= 0)
      {
        if (f3 < 0.3F)
          throw NotFoundException.getNotFoundInstance();
        i30 = 1;
        i31 = i1 / 2;
        if ((i1 & 0x1) != 0)
          break label317;
        arrayOfInt2[i31] = i30;
        arrayOfFloat1[i31] = (f3 - i30);
      }
      while (true)
      {
        i1++;
        break;
        if (i30 <= 8)
          break label254;
        if (f3 > 8.7F)
          throw NotFoundException.getNotFoundInstance();
        i30 = 8;
        break label254;
        label317: arrayOfInt3[i31] = i30;
        arrayOfFloat2[i31] = (f3 - i30);
      }
    }
    int i2 = a(f());
    int i3 = a(g());
    int i4 = -17 + (i2 + i3);
    int i5;
    int i6;
    label387: int i7;
    label400: int i9;
    int i10;
    if ((i2 & 0x1) == 1)
    {
      i5 = 1;
      if ((i3 & 0x1) != 0)
        break label439;
      i6 = 1;
      i7 = 0;
      if (i2 <= 13)
        break label445;
      i8 = 1;
      i9 = 0;
      if (i3 <= 13)
        break label466;
      i10 = 1;
    }
    while (true)
    {
      if (i4 != 1)
        break label519;
      if (i5 == 0)
        break label504;
      if (i6 == 0)
        break label487;
      throw NotFoundException.getNotFoundInstance();
      i5 = 0;
      break;
      label439: i6 = 0;
      break label387;
      label445: i8 = 0;
      i7 = 0;
      if (i2 >= 4)
        break label400;
      i7 = 1;
      i8 = 0;
      break label400;
      label466: i10 = 0;
      i9 = 0;
      if (i3 >= 4)
        continue;
      i9 = 1;
      i10 = 0;
    }
    label487: int i8 = 1;
    while (true)
    {
      if (i7 == 0)
        break label628;
      if (i8 == 0)
        break label617;
      throw NotFoundException.getNotFoundInstance();
      label504: if (i6 == 0)
        throw NotFoundException.getNotFoundInstance();
      i10 = 1;
      continue;
      label519: if (i4 == -1)
      {
        if (i5 != 0)
        {
          if (i6 != 0)
            throw NotFoundException.getNotFoundInstance();
          i7 = 1;
          continue;
        }
        if (i6 == 0)
          throw NotFoundException.getNotFoundInstance();
        i9 = 1;
        continue;
      }
      if (i4 != 0)
        break;
      if (i5 != 0)
      {
        if (i6 == 0)
          throw NotFoundException.getNotFoundInstance();
        if (i2 < i3)
        {
          i7 = 1;
          i10 = 1;
          continue;
        }
        i8 = 1;
        i9 = 1;
        continue;
      }
      if (i6 == 0)
        continue;
      throw NotFoundException.getNotFoundInstance();
    }
    throw NotFoundException.getNotFoundInstance();
    label617: a(f(), d());
    label628: if (i8 != 0)
      b(f(), d());
    if (i9 != 0)
    {
      if (i10 != 0)
        throw NotFoundException.getNotFoundInstance();
      a(g(), d());
    }
    if (i10 != 0)
      b(g(), e());
    int i11 = 4 * paramc.a();
    int i12;
    int i13;
    if (paramBoolean1)
    {
      i12 = 0;
      i13 = i11 + i12;
      if (!paramBoolean2)
        break label804;
    }
    int i15;
    int i17;
    int i19;
    label804: for (int i14 = 0; ; i14 = 1)
    {
      i15 = -1 + (i14 + i13);
      int i16 = -1 + arrayOfInt2.length;
      i17 = 0;
      int i18 = i16;
      i19 = 0;
      while (i18 >= 0)
      {
        if (a(paramc, paramBoolean1, paramBoolean2))
          i19 += e[i15][(i18 * 2)] * arrayOfInt2[i18];
        int i29 = i17 + arrayOfInt2[i18];
        i18--;
        i17 = i29;
      }
      i12 = 2;
      break;
    }
    int i20 = 0;
    for (int i21 = -1 + arrayOfInt3.length; i21 >= 0; i21--)
    {
      if (!a(paramc, paramBoolean1, paramBoolean2))
        continue;
      i20 += e[i15][(1 + i21 * 2)] * arrayOfInt3[i21];
    }
    int i22 = i19 + i20;
    if (((i17 & 0x1) != 0) || (i17 > 13) || (i17 < 4))
      throw NotFoundException.getNotFoundInstance();
    int i23 = (13 - i17) / 2;
    int i24 = a[i23];
    int i25 = 9 - i24;
    int i26 = android.support.v4.app.b.a(arrayOfInt2, i24, true);
    int i27 = android.support.v4.app.b.a(arrayOfInt3, i25, false);
    int i28 = b[i23];
    return new com.google.zxing.oned.rss.b(c[i23] + (i27 + i26 * i28), i22);
  }

  private com.google.zxing.oned.rss.c a(com.google.zxing.common.a parama, int paramInt, boolean paramBoolean)
  {
    int k;
    int n;
    int m;
    if (paramBoolean)
    {
      for (int i2 = -1 + this.i[0]; (i2 >= 0) && (!parama.a(i2)); i2--);
      k = i2 + 1;
      n = this.i[0] - k;
      m = this.i[1];
    }
    while (true)
    {
      int[] arrayOfInt = b();
      System.arraycopy(arrayOfInt, 0, arrayOfInt, 1, -1 + arrayOfInt.length);
      arrayOfInt[0] = n;
      try
      {
        int i1 = a(arrayOfInt, d);
        return new com.google.zxing.oned.rss.c(i1, new int[] { k, m }, k, m, paramInt);
        k = this.i[0];
        m = parama.d(1 + this.i[1]);
        n = m - this.i[1];
      }
      catch (NotFoundException localNotFoundException)
      {
      }
    }
    return null;
  }

  private a a(com.google.zxing.common.a parama, List<a> paramList, int paramInt)
  {
    boolean bool1;
    boolean bool3;
    if (paramList.size() % 2 == 0)
    {
      bool1 = true;
      if (!this.j)
        break label574;
      if (bool1)
        break label160;
      bool3 = true;
    }
    label29: label39: label556: label574: for (boolean bool2 = bool3; ; bool2 = bool1)
    {
      int k = 1;
      int m = -1;
      int[] arrayOfInt = b();
      arrayOfInt[0] = 0;
      arrayOfInt[1] = 0;
      arrayOfInt[2] = 0;
      arrayOfInt[3] = 0;
      int n = parama.a();
      int i1;
      if (m < 0)
        if (paramList.isEmpty())
          i1 = 0;
      while (true)
      {
        label88: int i2;
        label102: label117: int i3;
        if (paramList.size() % 2 != 0)
        {
          i2 = 1;
          if (this.j)
          {
            if (i2 != 0)
              break label202;
            i2 = 1;
          }
          i3 = i1;
          i4 = 0;
          label124: if (i3 >= n)
            break label214;
          if (parama.a(i3))
            break label208;
        }
        label202: label208: for (int i4 = 1; ; i4 = 0)
        {
          if (i4 == 0)
            break label214;
          i3++;
          break label124;
          bool1 = false;
          break;
          bool3 = false;
          break label29;
          i1 = ((a)paramList.get(-1 + paramList.size())).c().b()[1];
          break label88;
          i2 = 0;
          break label102;
          i2 = 0;
          break label117;
        }
        label214: int i5 = i3;
        int i6 = i4;
        int i7 = i3;
        int i8 = 0;
        com.google.zxing.oned.rss.c localc;
        int i11;
        int i9;
        while (true)
          if (i5 < n)
          {
            if ((i6 ^ parama.a(i5)) != 0)
            {
              arrayOfInt[i8] = (1 + arrayOfInt[i8]);
              i5++;
              continue;
            }
            if (i8 == 3)
            {
              if (i2 != 0)
                c(arrayOfInt);
              if (!b(arrayOfInt))
                break;
              this.i[0] = i7;
              this.i[1] = i5;
              localc = a(parama, paramInt, bool2);
              if (localc != null)
                break label508;
              i11 = this.i[0];
              if (!parama.a(i11))
                break label493;
              i9 = parama.c(parama.d(i11));
            }
          }
        label350: com.google.zxing.oned.rss.b localb1;
        for (int i10 = k; ; i10 = 0)
        {
          if (i10 != 0)
            break label556;
          localb1 = a(parama, localc, bool2, true);
          if ((paramList.isEmpty()) || (!((a)paramList.get(-1 + paramList.size())).d()))
            break label518;
          throw NotFoundException.getNotFoundInstance();
          if (i2 != 0)
            c(arrayOfInt);
          i7 += arrayOfInt[0] + arrayOfInt[1];
          arrayOfInt[0] = arrayOfInt[2];
          arrayOfInt[1] = arrayOfInt[3];
          arrayOfInt[2] = 0;
          arrayOfInt[3] = 0;
          i8--;
          while (true)
          {
            arrayOfInt[i8] = 1;
            if (i6 != 0)
              break label483;
            i6 = 1;
            break;
            i8++;
          }
          label483: i6 = 0;
          break;
          throw NotFoundException.getNotFoundInstance();
          label493: i9 = parama.d(parama.c(i11));
          break label350;
          label508: i9 = m;
        }
        try
        {
          com.google.zxing.oned.rss.b localb3 = a(parama, localc, bool2, false);
          localb2 = localb3;
          return new a(localb1, localb2, localc);
        }
        catch (NotFoundException localNotFoundException)
        {
          while (true)
            com.google.zxing.oned.rss.b localb2 = null;
        }
        k = i10;
        m = i9;
        break label39;
        i1 = m;
      }
    }
  }

  private List<a> a(int paramInt, com.google.zxing.common.a parama)
  {
    try
    {
      while (true)
      {
        a locala3 = a(parama, this.g, paramInt);
        this.g.add(locala3);
      }
    }
    catch (NotFoundException localNotFoundException)
    {
      if (this.g.isEmpty())
        throw localNotFoundException;
      if (!h())
        break label58;
    }
    List localList1 = this.g;
    return localList1;
    label58: int k;
    label73: int m;
    int n;
    label79: b localb3;
    if (!this.h.isEmpty())
    {
      k = 1;
      m = 0;
      n = 0;
      if (n >= this.h.size())
        break label542;
      localb3 = (b)this.h.get(n);
      if (localb3.b() <= paramInt)
        break label178;
    }
    label522: label524: label528: label534: label536: label540: label542: for (boolean bool1 = localb3.a(this.g); ; bool1 = false)
    {
      if ((bool1) || (m != 0))
      {
        if (k != 0)
        {
          localList1 = a(false);
          if (localList1 != null)
            break;
          localList1 = a(true);
          if (localList1 != null)
            break;
        }
        throw NotFoundException.getNotFoundInstance();
        k = 0;
        break label73;
        label178: boolean bool2 = localb3.a(this.g);
        n++;
        m = bool2;
        break label79;
      }
      List localList2 = this.g;
      Iterator localIterator1 = this.h.iterator();
      while (true)
      {
        label247: int i5;
        if (localIterator1.hasNext())
        {
          b localb2 = (b)localIterator1.next();
          Iterator localIterator5 = localList2.iterator();
          if (!localIterator5.hasNext())
            break label536;
          a locala2 = (a)localIterator5.next();
          Iterator localIterator6 = localb2.a().iterator();
          while (localIterator6.hasNext())
          {
            if (!locala2.equals((a)localIterator6.next()))
              continue;
            i5 = 1;
            label312: if (i5 != 0)
              break label534;
          }
        }
        for (int i4 = 0; ; i4 = 1)
        {
          if (i4 == 0)
            break label540;
          int i1 = 1;
          label328: List localList3;
          Iterator localIterator2;
          if (i1 == 0)
          {
            this.h.add(n, new b(this.g, paramInt));
            localList3 = this.g;
            localIterator2 = this.h.iterator();
          }
          while (true)
          {
            label373: int i3;
            if (localIterator2.hasNext())
            {
              b localb1 = (b)localIterator2.next();
              if (localb1.a().size() == localList3.size())
                continue;
              Iterator localIterator3 = localb1.a().iterator();
              label427: if (!localIterator3.hasNext())
                break label524;
              a locala1 = (a)localIterator3.next();
              Iterator localIterator4 = localList3.iterator();
              while (localIterator4.hasNext())
              {
                if (!locala1.equals((a)localIterator4.next()))
                  continue;
                i3 = 1;
                label489: if (i3 != 0)
                  break label522;
              }
            }
            for (int i2 = 0; ; i2 = 1)
            {
              if (i2 == 0)
                break label528;
              localIterator2.remove();
              break label373;
              break;
              i1 = 0;
              break label328;
              break;
              i3 = 0;
              break label489;
              break label427;
            }
          }
          i5 = 0;
          break label312;
          break label247;
        }
      }
    }
  }

  private List<a> a(List<b> paramList, int paramInt)
  {
    b localb;
    int n;
    int i3;
    if (paramInt < this.h.size())
    {
      localb = (b)this.h.get(paramInt);
      this.g.clear();
      int k = paramList.size();
      for (int m = 0; m < k; m++)
        this.g.addAll(((b)paramList.get(m)).a());
      this.g.addAll(localb.a());
      List localList1 = this.g;
      int[][] arrayOfInt = f;
      n = 0;
      if (n < 10)
      {
        int[] arrayOfInt1 = arrayOfInt[n];
        if (localList1.size() <= arrayOfInt1.length)
        {
          i3 = 0;
          label142: if (i3 >= localList1.size())
            break label283;
          if (((a)localList1.get(i3)).c().a() == arrayOfInt1[i3]);
        }
      }
    }
    label273: label283: for (int i4 = 0; ; i4 = 1)
    {
      if (i4 != 0);
      for (int i1 = 1; ; i1 = 0)
      {
        if (i1 == 0)
          break label273;
        if (!h())
          break label226;
        return this.g;
        i3++;
        break label142;
        n++;
        break;
      }
      label226: ArrayList localArrayList = new ArrayList();
      localArrayList.addAll(paramList);
      localArrayList.add(localb);
      int i2 = paramInt + 1;
      try
      {
        List localList2 = a(localArrayList, i2);
        return localList2;
      }
      catch (NotFoundException localNotFoundException)
      {
      }
      paramInt++;
      break;
      throw NotFoundException.getNotFoundInstance();
    }
  }

  private List<a> a(boolean paramBoolean)
  {
    Object localObject = null;
    if (this.h.size() > 25)
      this.h.clear();
    while (true)
    {
      return localObject;
      this.g.clear();
      if (paramBoolean)
        Collections.reverse(this.h);
      try
      {
        List localList = a(new ArrayList(), 0);
        localObject = localList;
        if (!paramBoolean)
          continue;
        Collections.reverse(this.h);
        return localObject;
      }
      catch (NotFoundException localNotFoundException)
      {
        while (true)
          localObject = null;
      }
    }
  }

  private static boolean a(com.google.zxing.oned.rss.c paramc, boolean paramBoolean1, boolean paramBoolean2)
  {
    return (paramc.a() != 0) || (!paramBoolean1) || (!paramBoolean2);
  }

  private static void c(int[] paramArrayOfInt)
  {
    int k = paramArrayOfInt.length;
    for (int m = 0; m < k / 2; m++)
    {
      int n = paramArrayOfInt[m];
      paramArrayOfInt[m] = paramArrayOfInt[(-1 + (k - m))];
      paramArrayOfInt[(-1 + (k - m))] = n;
    }
  }

  private boolean h()
  {
    int k = 1;
    a locala1 = (a)this.g.get(0);
    com.google.zxing.oned.rss.b localb1 = locala1.a();
    com.google.zxing.oned.rss.b localb2 = locala1.b();
    if (localb2 == null)
      k = 0;
    int n;
    int i1;
    do
    {
      return k;
      int m = localb2.b();
      n = 2;
      i1 = m;
      for (int i2 = k; i2 < this.g.size(); i2++)
      {
        a locala2 = (a)this.g.get(i2);
        i1 += locala2.a().b();
        n++;
        com.google.zxing.oned.rss.b localb3 = locala2.b();
        if (localb3 == null)
          continue;
        i1 += localb3.b();
        n++;
      }
    }
    while (i1 % 211 + 211 * (n - 4) == localb1.a());
    return false;
  }

  public final e a(int paramInt, com.google.zxing.common.a parama, Map<DecodeHintType, ?> paramMap)
  {
    this.g.clear();
    this.j = false;
    try
    {
      e locale = a(a(paramInt, parama));
      return locale;
    }
    catch (NotFoundException localNotFoundException)
    {
      this.g.clear();
      this.j = true;
    }
    return a(a(paramInt, parama));
  }

  public final void a()
  {
    this.g.clear();
    this.h.clear();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.c
 * JD-Core Version:    0.6.0
 */