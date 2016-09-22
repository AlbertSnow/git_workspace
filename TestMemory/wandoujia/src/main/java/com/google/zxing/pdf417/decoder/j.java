package com.google.zxing.pdf417.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class j
{
  private static final com.google.zxing.pdf417.decoder.a.a a = new com.google.zxing.pdf417.decoder.a.a();

  private static c a(h paramh)
  {
    if (paramh == null);
    int[] arrayOfInt;
    do
    {
      return null;
      arrayOfInt = paramh.c();
    }
    while (arrayOfInt == null);
    int i = arrayOfInt.length;
    int j = -1;
    int k = 0;
    while (k < i)
    {
      int i11 = Math.max(j, arrayOfInt[k]);
      k++;
      j = i11;
    }
    int m = arrayOfInt.length;
    int n = 0;
    int i1 = 0;
    while (n < m)
    {
      int i10 = arrayOfInt[n];
      i1 += j - i10;
      if (i10 > 0)
        break;
      n++;
    }
    d[] arrayOfd = paramh.b();
    int i2 = i1;
    for (int i3 = 0; (i2 > 0) && (arrayOfd[i3] == null); i3++)
      i2--;
    int i4 = -1 + arrayOfInt.length;
    int i5 = 0;
    for (int i6 = i4; i6 >= 0; i6--)
    {
      i5 += j - arrayOfInt[i6];
      if (arrayOfInt[i6] > 0)
        break;
    }
    int i7 = -1 + arrayOfd.length;
    int i8 = i5;
    for (int i9 = i7; (i8 > 0) && (arrayOfd[i9] == null); i9--)
      i8--;
    return paramh.a().a(i2, i8, paramh.e());
  }

  private static d a(com.google.zxing.common.b paramb, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    int i;
    int j;
    int k;
    boolean bool1;
    int m;
    int i12;
    label31: label78: int[] arrayOfInt1;
    int n;
    if (paramBoolean)
    {
      i = -1;
      j = 0;
      k = i;
      bool1 = paramBoolean;
      m = paramInt3;
      if (j >= 2)
        break label212;
      i12 = m;
      if (((!bool1) || (i12 < paramInt1)) && ((bool1) || (i12 >= paramInt2) || (bool1 != paramb.a(i12, paramInt4))))
        break label179;
      if (Math.abs(paramInt3 - i12) <= 2)
        break label169;
      arrayOfInt1 = new int[8];
      n = 0;
      if (!paramBoolean)
        break label219;
    }
    int i2;
    boolean bool2;
    label169: label179: label212: label219: for (int i1 = 1; ; i1 = -1)
    {
      i2 = paramInt3;
      bool2 = paramBoolean;
      while (true)
      {
        if (((!paramBoolean) || (i2 >= paramInt2)) && ((paramBoolean) || (i2 < paramInt1) || (n >= 8)))
          break label256;
        if (paramb.a(i2, paramInt4) != bool2)
          break;
        arrayOfInt1[n] = (1 + arrayOfInt1[n]);
        i2 += i1;
      }
      i = 1;
      break;
      i12 += k;
      break label31;
      k = -k;
      if (!bool1);
      for (boolean bool4 = true; ; bool4 = false)
      {
        j++;
        bool1 = bool4;
        m = i12;
        break;
      }
      paramInt3 = m;
      break label78;
    }
    int i11 = n + 1;
    if (!bool2);
    for (boolean bool3 = true; ; bool3 = false)
    {
      bool2 = bool3;
      n = i11;
      break;
    }
    label256: if ((n == 8) || (((paramBoolean) && (i2 == paramInt2)) || ((!paramBoolean) && (i2 == paramInt1) && (n == 7))));
    while (arrayOfInt1 == null)
    {
      return null;
      arrayOfInt1 = null;
    }
    int i3 = com.google.zxing.pdf417.a.a(arrayOfInt1);
    int i6;
    if (paramBoolean)
    {
      i6 = paramInt3 + i3;
      if ((paramInt5 - 2 > i3) || (i3 > paramInt6 + 2))
        break label422;
    }
    label422: for (int i7 = 1; ; i7 = 0)
    {
      if (i7 != 0)
        break label428;
      return null;
      for (int i4 = 0; i4 < arrayOfInt1.length / 2; i4++)
      {
        int i10 = arrayOfInt1[i4];
        arrayOfInt1[i4] = arrayOfInt1[(-1 + arrayOfInt1.length - i4)];
        arrayOfInt1[(-1 + arrayOfInt1.length - i4)] = i10;
      }
      int i5 = paramInt3 - i3;
      i6 = paramInt3;
      paramInt3 = i5;
      break;
    }
    label428: int i8 = i.a(arrayOfInt1);
    int i9 = com.google.zxing.pdf417.a.a(i8);
    if (i9 == -1)
      return null;
    int[] arrayOfInt2 = a(i8);
    return new d(paramInt3, i6, (9 + (arrayOfInt2[0] - arrayOfInt2[2] + arrayOfInt2[4] - arrayOfInt2[6])) % 9, i9);
  }

  private static h a(com.google.zxing.common.b paramb, c paramc, com.google.zxing.f paramf, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    h localh = new h(paramc, paramBoolean);
    for (int i = 0; i < 2; i++)
    {
      int j;
      int m;
      label42: d locald;
      if (i == 0)
      {
        j = 1;
        k = (int)paramf.a();
        m = (int)paramf.b();
        if ((m > paramc.d()) || (m < paramc.c()))
          continue;
        locald = a(paramb, 0, paramb.e(), paramBoolean, k, m, paramInt1, paramInt2);
        if (locald != null)
        {
          localh.a(m, locald);
          if (!paramBoolean)
            break label121;
        }
      }
      label121: for (int k = locald.d(); ; k = locald.e())
      {
        m += j;
        break label42;
        j = -1;
        break;
      }
    }
    return localh;
  }

  private static BadgeUtil a(int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[][] paramArrayOfInt)
  {
    int[] arrayOfInt = new int[paramArrayOfInt3.length];
    int i = 100;
    int j = i - 1;
    label76: int n;
    if (i > 0)
    {
      for (int k = 0; k < arrayOfInt.length; k++)
        paramArrayOfInt1[paramArrayOfInt3[k]] = paramArrayOfInt[k][arrayOfInt[k]];
      try
      {
        if (paramArrayOfInt1.length != 0)
          break label76;
        throw FormatException.getFormatInstance();
      }
      catch (ChecksumException localChecksumException)
      {
        if (arrayOfInt.length != 0)
          break label192;
      }
      throw ChecksumException.getChecksumInstance();
      n = 1 << paramInt + 1;
      if ((paramArrayOfInt2 == null) || (paramArrayOfInt2.length <= 3 + n / 2))
        break label275;
    }
    label264: label275: 
    while (true)
    {
      label101: throw ChecksumException.getChecksumInstance();
      label192: 
      do
      {
        int i1 = a.a(paramArrayOfInt1, n, paramArrayOfInt2);
        if (paramArrayOfInt1.length < 4)
          throw FormatException.getFormatInstance();
        int i2 = paramArrayOfInt1[0];
        if (i2 > paramArrayOfInt1.length)
          throw FormatException.getFormatInstance();
        if (i2 == 0)
        {
          if (n < paramArrayOfInt1.length)
            paramArrayOfInt1[0] = (paramArrayOfInt1.length - n);
        }
        else
        {
          BadgeUtil localBadgeUtil = DecodedBitStreamParser.a(paramArrayOfInt1, String.valueOf(paramInt));
          Integer.valueOf(i1);
          Integer.valueOf(paramArrayOfInt2.length);
          return localBadgeUtil;
        }
        throw FormatException.getFormatInstance();
        for (int m = 0; ; m++)
        {
          if (m >= arrayOfInt.length)
            break label264;
          if (arrayOfInt[m] < -1 + paramArrayOfInt[m].length)
          {
            arrayOfInt[m] = (1 + arrayOfInt[m]);
            i = j;
            break;
          }
          arrayOfInt[m] = 0;
          if (m != -1 + arrayOfInt.length)
            continue;
          throw ChecksumException.getChecksumInstance();
        }
        i = j;
        break;
        throw ChecksumException.getChecksumInstance();
        if (n < 0)
          break label101;
      }
      while (n <= 512);
    }
  }

  public static BadgeUtil a(com.google.zxing.common.b paramb, com.google.zxing.f paramf1, com.google.zxing.f paramf2, com.google.zxing.f paramf3, com.google.zxing.f paramf4, int paramInt1, int paramInt2)
  {
    c localc1 = new c(paramb, paramf1, paramf2, paramf3, paramf4);
    Object localObject1 = null;
    int i = 0;
    Object localObject2 = localc1;
    f localf1 = null;
    Object localObject3 = null;
    Object localObject6;
    Object localObject7;
    label73: label217: f localf2;
    Object localObject4;
    while (true)
    {
      if (i >= 2)
        break label1513;
      if (paramf1 == null)
        break label1506;
      localObject6 = a(paramb, (c)localObject2, paramf1, true, paramInt1, paramInt2);
      if (paramf3 == null)
        break;
      localObject7 = a(paramb, (c)localObject2, paramf3, false, paramInt1, paramInt2);
      if ((localObject6 == null) && (localObject7 == null))
        localf1 = null;
      while (localf1 == null)
      {
        throw NotFoundException.getNotFoundInstance();
        a locala2;
        a locala1;
        if (localObject6 != null)
        {
          locala2 = ((h)localObject6).d();
          if (locala2 != null);
        }
        else if (localObject7 == null)
        {
          locala1 = null;
        }
        while (true)
        {
          if (locala1 != null)
            break label217;
          localf1 = null;
          break;
          locala1 = ((h)localObject7).d();
          continue;
          a locala3;
          if (localObject7 != null)
          {
            locala3 = ((h)localObject7).d();
            if (locala3 != null);
          }
          else
          {
            locala1 = locala2;
            continue;
          }
          if ((locala2.a() != locala3.a()) && (locala2.b() != locala3.b()) && (locala2.c() != locala3.c()))
          {
            locala1 = null;
            continue;
          }
          locala1 = locala2;
        }
        localf1 = new f(locala1, c.a(a((h)localObject6), a((h)localObject7)));
      }
      if ((i == 0) && (localf1.e() != null) && ((localf1.e().c() < ((c)localObject2).c()) || (localf1.e().d() > ((c)localObject2).d())))
      {
        c localc2 = localf1.e();
        i++;
        localObject1 = localObject7;
        localObject3 = localObject6;
        localObject2 = localc2;
        continue;
      }
      localf1.a((c)localObject2);
      localf2 = localf1;
      localObject4 = localObject7;
      localObject3 = localObject6;
    }
    while (true)
    {
      int j = 1 + localf2.b();
      localf2.a(0, localObject3);
      localf2.a(j, localObject4);
      boolean bool1;
      int k;
      label378: int i14;
      label394: boolean bool2;
      label424: Object localObject5;
      label437: int i15;
      int i16;
      label456: int i17;
      label474: d locald2;
      int i20;
      if (localObject3 != null)
      {
        bool1 = true;
        k = 1;
        int m = paramInt2;
        int n = paramInt1;
        if (k > j)
          break label953;
        if (!bool1)
          break label637;
        i14 = k;
        if (localf2.a(i14) != null)
          break label947;
        if ((i14 != 0) && (i14 != j))
          break label653;
        if (i14 != 0)
          break label647;
        bool2 = true;
        localObject5 = new h((c)localObject2, bool2);
        localf2.a(i14, (g)localObject5);
        i15 = ((c)localObject2).c();
        i16 = -1;
        if (i15 > ((c)localObject2).d())
          break label947;
        if (!bool1)
          break label667;
        i17 = 1;
        boolean bool3 = a(localf2, i14 - i17);
        locald2 = null;
        if (bool3)
          locald2 = localf2.a(i14 - i17).c(i15);
        if (locald2 == null)
          break label683;
        if (!bool1)
          break label673;
        i20 = locald2.e();
        label528: if ((i20 < 0) || (i20 > ((c)localObject2).b()))
        {
          if (i16 == -1)
            break label1492;
          i20 = i16;
        }
        d locald4 = a(paramb, ((c)localObject2).a(), ((c)localObject2).b(), bool1, i20, i15, n, m);
        if (locald4 == null)
          break label1492;
        ((g)localObject5).a(i15, locald4);
        n = Math.min(n, locald4.c());
        m = Math.max(m, locald4.c());
      }
      label647: label653: label667: label673: label683: label947: label953: label1492: for (int i21 = i20; ; i21 = i16)
      {
        i15++;
        i16 = i21;
        break label456;
        bool1 = false;
        break;
        label637: i14 = j - k;
        break label394;
        bool2 = false;
        break label424;
        localObject5 = new g((c)localObject2);
        break label437;
        i17 = -1;
        break label474;
        i20 = locald2.d();
        break label528;
        d locald3 = localf2.a(i14).a(i15);
        if (locald3 != null)
        {
          if (bool1)
          {
            i20 = locald3.d();
            break label528;
          }
          i20 = locald3.e();
          break label528;
        }
        if (a(localf2, i14 - i17))
          locald3 = localf2.a(i14 - i17).a(i15);
        if (locald3 != null)
        {
          if (bool1)
          {
            i20 = locald3.e();
            break label528;
          }
          i20 = locald3.d();
          break label528;
        }
        int i18 = 0;
        int i22;
        for (int i19 = i14; ; i19 = i22)
        {
          if (!a(localf2, i19 - i17))
            break label916;
          i22 = i19 - i17;
          d[] arrayOfd2 = localf2.a(i22).b();
          int i23 = arrayOfd2.length;
          for (int i24 = 0; ; i24++)
          {
            if (i24 >= i23)
              break label906;
            d locald5 = arrayOfd2[i24];
            if (locald5 == null)
              continue;
            if (bool1);
            for (int i25 = locald5.e(); ; i25 = locald5.d())
            {
              i20 = i25 + i17 * i18 * (locald5.e() - locald5.d());
              break;
            }
          }
          i18++;
        }
        if (bool1)
        {
          i20 = localf2.e().a();
          break label528;
        }
        i20 = localf2.e().b();
        break label528;
        k++;
        break label378;
        b[][] arrayOfb = (b[][])Array.newInstance(b.class, new int[] { localf2.c(), 2 + localf2.b() });
        for (int i1 = 0; i1 < arrayOfb.length; i1++)
          for (int i13 = 0; i13 < arrayOfb[i1].length; i13++)
            arrayOfb[i1][i13] = new b();
        int i2 = 0;
        for (g localg : localf2.a())
        {
          if (localg != null)
            for (d locald1 : localg.b())
            {
              if (locald1 == null)
                continue;
              int i12 = locald1.h();
              if (i12 < 0)
                continue;
              if (i12 >= arrayOfb.length)
                throw FormatException.getFormatInstance();
              arrayOfb[i12][i2].a(locald1.g());
            }
          i2++;
        }
        int[] arrayOfInt1 = arrayOfb[0][1].a();
        int i5 = localf2.b() * localf2.c() - (2 << localf2.d());
        ArrayList localArrayList1;
        int[] arrayOfInt2;
        ArrayList localArrayList2;
        ArrayList localArrayList3;
        if (arrayOfInt1.length == 0)
        {
          if ((i5 <= 0) || (i5 > 928))
            throw NotFoundException.getNotFoundInstance();
          arrayOfb[0][1].a(i5);
          localArrayList1 = new ArrayList();
          arrayOfInt2 = new int[localf2.c() * localf2.b()];
          localArrayList2 = new ArrayList();
          localArrayList3 = new ArrayList();
        }
        for (int i6 = 0; ; i6++)
        {
          if (i6 >= localf2.c())
            break label1423;
          int i8 = 0;
          if (i8 >= localf2.b())
            continue;
          int[] arrayOfInt3 = arrayOfb[i6][(i8 + 1)].a();
          int i9 = i8 + i6 * localf2.b();
          if (arrayOfInt3.length == 0)
            localArrayList1.add(Integer.valueOf(i9));
          while (true)
          {
            i8++;
            break label1286;
            if (arrayOfInt1[0] == i5)
              break;
            arrayOfb[0][1].a(i5);
            break;
            if (arrayOfInt3.length == 1)
            {
              arrayOfInt2[i9] = arrayOfInt3[0];
              continue;
            }
            localArrayList3.add(Integer.valueOf(i9));
            localArrayList2.add(arrayOfInt3);
          }
        }
        int[][] arrayOfInt = new int[localArrayList2.size()][];
        for (int i7 = 0; i7 < arrayOfInt.length; i7++)
          arrayOfInt[i7] = ((int[])localArrayList2.get(i7));
        return a(localf2.d(), arrayOfInt2, com.google.zxing.pdf417.a.a(localArrayList1), com.google.zxing.pdf417.a.a(localArrayList3), arrayOfInt);
      }
      label906: label916: localObject7 = localObject1;
      label1286: label1423: break label73;
      label1506: localObject6 = localObject3;
      break;
      label1513: localf2 = localf1;
      localObject4 = localObject1;
    }
  }

  private static boolean a(f paramf, int paramInt)
  {
    return (paramInt >= 0) && (paramInt <= 1 + paramf.b());
  }

  private static int[] a(int paramInt)
  {
    int[] arrayOfInt = new int[8];
    int i = 0;
    int j = 7;
    while (true)
    {
      if ((paramInt & 0x1) != i)
      {
        i = paramInt & 0x1;
        j--;
        if (j < 0)
          break;
      }
      arrayOfInt[j] = (1 + arrayOfInt[j]);
      paramInt >>= 1;
    }
    return arrayOfInt;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.j
 * JD-Core Version:    0.6.0
 */