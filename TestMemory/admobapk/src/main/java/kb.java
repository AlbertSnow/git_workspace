import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class kb
{
  private static ir a(lu paramlu, int paramInt1, int paramInt2, long paramLong)
  {
    paramlu.a(paramInt1 + 8);
    paramlu.b(24);
    int i = paramlu.b();
    int j = paramlu.b();
    paramlu.b(50);
    ArrayList localArrayList = new ArrayList(1);
    int k = paramlu.b;
    if (k - paramInt1 < paramInt2)
    {
      paramlu.a(k);
      int m = paramlu.b;
      int n = paramlu.d();
      if (n > 0);
      for (boolean bool = true; ; bool = false)
      {
        lp.a(bool, "childAtomSize should be positive");
        if (paramlu.d() == jy.c)
          localArrayList.add(a(paramlu, m));
        k += n;
        break;
      }
    }
    return ir.a("video/mp4v-es", -1, paramLong, i, j, localArrayList);
  }

  public static kf a(jz paramjz, ka paramka)
  {
    jz localjz1 = paramjz.d(jy.l);
    lu locallu1 = localjz1.c(jy.r).N;
    locallu1.a(16);
    int i = locallu1.d();
    if ((i != 1936684398) && (i != 1986618469) && (i != 1952807028) && (i != 1953325924))
      return null;
    lu locallu2 = paramjz.c(jy.p).N;
    locallu2.a(8);
    int j = jy.a(locallu2.d());
    int k;
    int i2;
    label137: int i3;
    label140: long l1;
    label182: int i4;
    long l2;
    int i5;
    label251: long l3;
    long l4;
    label279: int i6;
    label328: long l5;
    lu locallu5;
    kc localkc;
    int i8;
    int i10;
    int i11;
    boolean bool1;
    label412: int i12;
    int i13;
    int i14;
    float f;
    int i15;
    int i16;
    int i17;
    if (j == 0)
    {
      k = 8;
      locallu2.b(k);
      int m = locallu2.d();
      locallu2.b(4);
      int n = 1;
      int i1 = locallu2.b;
      if (j != 0)
        break label624;
      i2 = 4;
      i3 = 0;
      if (i3 < i2)
      {
        if (locallu2.a[(i1 + i3)] == -1)
          break label631;
        n = 0;
      }
      if (n == 0)
        break label637;
      locallu2.b(i2);
      l1 = -1L;
      Pair localPair1 = Pair.create(Integer.valueOf(m), Long.valueOf(l1));
      i4 = ((Integer)localPair1.first).intValue();
      l2 = ((Long)localPair1.second).longValue();
      lu locallu3 = paramka.N;
      locallu3.a(8);
      if (jy.a(locallu3.d()) != 0)
        break label662;
      i5 = 8;
      locallu3.b(i5);
      l3 = locallu3.c();
      if (l2 != -1L)
        break label669;
      l4 = -1L;
      jz localjz2 = localjz1.d(jy.m).d(jy.n);
      lu locallu4 = localjz1.c(jy.q).N;
      locallu4.a(8);
      if (jy.a(locallu4.d()) != 0)
        break label684;
      i6 = 8;
      locallu4.b(i6);
      l5 = locallu4.c();
      locallu5 = localjz2.c(jy.s).N;
      locallu5.a(12);
      int i7 = locallu5.d();
      localkc = new kc(i7);
      i8 = 0;
      if (i8 >= i7)
        break label1055;
      i10 = locallu5.b;
      i11 = locallu5.d();
      if (i11 <= 0)
        break label691;
      bool1 = true;
      lp.a(bool1, "childAtomSize should be positive");
      i12 = locallu5.d();
      if ((i12 != jy.a) && (i12 != jy.b) && (i12 != jy.x))
        break label948;
      locallu5.a(i10 + 8);
      locallu5.b(24);
      i13 = locallu5.b();
      i14 = locallu5.b();
      f = 1.0F;
      locallu5.b(50);
      localObject = null;
      i15 = locallu5.b;
      if (i15 - i10 >= i11)
        break label911;
      locallu5.a(i15);
      i16 = locallu5.b;
      i17 = locallu5.d();
      if ((i17 == 0) && (locallu5.b - i10 == i11))
        break label911;
      if (i17 <= 0)
        break label697;
    }
    int i18;
    int i21;
    label662: label669: label684: label691: label697: for (boolean bool2 = true; ; bool2 = false)
    {
      lp.a(bool2, "childAtomSize should be positive");
      i18 = locallu5.d();
      if (i18 != jy.o)
        break label839;
      locallu5.a(4 + (i16 + 8));
      i21 = 1 + (0x3 & locallu5.a());
      if (i21 != 3)
        break label703;
      throw new IllegalStateException();
      k = 16;
      break;
      label624: i2 = 8;
      break label137;
      label631: i3++;
      break label140;
      label637: if (j == 0)
      {
        l1 = locallu2.c();
        break label182;
      }
      l1 = locallu2.g();
      break label182;
      i5 = 16;
      break label251;
      l4 = ly.a(l2, 1000000L, l3);
      break label279;
      i6 = 16;
      break label328;
      bool1 = false;
      break label412;
    }
    label703: ArrayList localArrayList = new ArrayList();
    int i22 = 0x1F & locallu5.a();
    for (int i23 = 0; i23 < i22; i23++)
      localArrayList.add(lr.a(locallu5));
    int i24 = locallu5.a();
    for (int i25 = 0; i25 < i24; i25++)
      localArrayList.add(lr.a(locallu5));
    Pair localPair2 = Pair.create(localArrayList, Integer.valueOf(i21));
    List localList = (List)localPair2.first;
    localkc.c = ((Integer)localPair2.second).intValue();
    Object localObject = localList;
    while (true)
    {
      i15 += i17;
      break;
      label839: if (i18 == jy.t)
      {
        localkc.a[i8] = a(locallu5, i16, i17);
        continue;
      }
      if (i18 != jy.A)
        continue;
      locallu5.a(i16 + 8);
      int i19 = locallu5.f();
      int i20 = locallu5.f();
      f = i19 / i20;
    }
    label911: localkc.b = ir.a("video/avc", -1, l4, i13, i14, f, localObject);
    while (true)
    {
      locallu5.a(i10 + i11);
      i8++;
      break;
      label948: if ((i12 == jy.d) || (i12 == jy.y) || (i12 == jy.e))
      {
        a(locallu5, i12, i10, i11, l4, localkc, i8);
        continue;
      }
      if (i12 == jy.B)
      {
        localkc.b = new ir("application/ttml+xml", -1, -1L, -1, -1, -1.0F, -1, -1, null);
        continue;
      }
      if (i12 != jy.E)
        continue;
      localkc.b = a(locallu5, i10, i11, l4);
    }
    label1055: ir localir = localkc.b;
    kg[] arrayOfkg = localkc.a;
    int i9 = localkc.c;
    return new kf(i4, i, l5, l4, localir, arrayOfkg, i9);
  }

  private static kg a(lu paramlu, int paramInt1, int paramInt2)
  {
    int i = paramInt1 + 8;
    kg localkg = null;
    if (i - paramInt1 < paramInt2)
    {
      paramlu.a(i);
      int j = paramlu.d();
      int k = paramlu.d();
      if (k == jy.z)
        paramlu.d();
      while (true)
      {
        i += j;
        break;
        if (k == jy.u)
        {
          paramlu.b(4);
          paramlu.d();
          paramlu.d();
          continue;
        }
        if (k != jy.v)
          continue;
        int m = i + 8;
        while (true)
        {
          if (m - i >= j)
            break label204;
          paramlu.a(m);
          int n = paramlu.d();
          if (paramlu.d() == jy.w)
          {
            paramlu.b(4);
            int i1 = paramlu.d();
            if (i1 >> 8 == 1);
            for (boolean bool = true; ; bool = false)
            {
              int i2 = i1 & 0xFF;
              byte[] arrayOfByte = new byte[16];
              paramlu.a(arrayOfByte, 0, 16);
              localkg = new kg(bool, i2, arrayOfByte);
              break;
            }
          }
          m += n;
        }
        label204: localkg = null;
      }
    }
    return localkg;
  }

  public static kh a(kf paramkf, jz paramjz)
  {
    lu locallu1 = paramjz.c(jy.J).N;
    ka localka1 = paramjz.c(jy.K);
    if (localka1 == null)
      localka1 = paramjz.c(jy.L);
    lu locallu2 = localka1.N;
    lu locallu3 = paramjz.c(jy.I).N;
    lu locallu4 = paramjz.c(jy.F).N;
    ka localka2 = paramjz.c(jy.G);
    lu locallu5;
    lu locallu6;
    label103: int i;
    int j;
    int[] arrayOfInt1;
    long[] arrayOfLong1;
    long[] arrayOfLong2;
    int[] arrayOfInt2;
    int k;
    int m;
    if (localka2 != null)
    {
      locallu5 = localka2.N;
      ka localka3 = paramjz.c(jy.H);
      if (localka3 == null)
        break label212;
      locallu6 = localka3.N;
      locallu1.a(12);
      i = locallu1.f();
      j = locallu1.f();
      arrayOfInt1 = new int[j];
      arrayOfLong1 = new long[j];
      arrayOfLong2 = new long[j];
      arrayOfInt2 = new int[j];
      locallu2.a(12);
      k = locallu2.f();
      locallu3.a(12);
      m = -1 + locallu3.f();
      if (locallu3.d() != 1)
        break label218;
    }
    label212: label218: for (int n = 1; ; n = 0)
    {
      if (n != 0)
        break label224;
      throw new IllegalStateException(String.valueOf("stsc first chunk must be 1"));
      locallu5 = null;
      break;
      locallu6 = null;
      break label103;
    }
    label224: int i1 = locallu3.f();
    locallu3.b(4);
    int i2 = -1;
    if (m > 0)
      i2 = -1 + locallu3.f();
    locallu4.a(12);
    int i3 = -1 + locallu4.f();
    int i4 = locallu4.f();
    int i5 = locallu4.f();
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    if (locallu6 != null)
    {
      locallu6.a(12);
      i7 = -1 + locallu6.f();
      i8 = locallu6.f();
      i6 = locallu6.d();
    }
    int i9 = -1;
    int i10 = 0;
    if (locallu5 != null)
    {
      locallu5.a(12);
      i10 = locallu5.f();
      i9 = -1 + locallu5.f();
    }
    long l1;
    long l2;
    int i11;
    int i12;
    int i13;
    int i14;
    int i15;
    int i16;
    int i17;
    int i18;
    int i19;
    long l3;
    int i20;
    int i21;
    int i22;
    int i23;
    int i24;
    label440: int i25;
    label465: int i26;
    label491: int i50;
    int i27;
    int i28;
    if (localka1.M == jy.K)
    {
      l1 = locallu2.c();
      l2 = 0L;
      i11 = i4;
      i12 = i1;
      i13 = i10;
      i14 = i1;
      i15 = m;
      i16 = 0;
      i17 = i2;
      i18 = i3;
      i19 = i9;
      l3 = l1;
      i20 = 0;
      i21 = i6;
      i22 = i7;
      i23 = i8;
      i24 = i5;
      if (i16 >= j)
        break label873;
      arrayOfLong2[i16] = l3;
      if (i != 0)
        break label816;
      i25 = locallu1.f();
      arrayOfInt1[i16] = i25;
      arrayOfLong1[i16] = (l2 + i21);
      if (locallu5 != null)
        break label823;
      i26 = 1;
      arrayOfInt2[i16] = i26;
      if (i16 != i19)
        break label1082;
      arrayOfInt2[i16] = 1;
      i50 = i13 - 1;
      if (i50 <= 0)
        break label1071;
      int i51 = -1 + locallu5.f();
      i27 = i50;
      i28 = i51;
    }
    while (true)
    {
      l2 += i24;
      int i29 = i11 - 1;
      int i48;
      int i30;
      int i31;
      if ((i29 == 0) && (i18 > 0))
      {
        int i47 = locallu4.f();
        i48 = locallu4.f();
        int i49 = i18 - 1;
        i30 = i47;
        i31 = i49;
      }
      for (int i32 = i48; ; i32 = i24)
      {
        int i43;
        int i35;
        int i33;
        int i34;
        if (locallu6 != null)
        {
          i43 = i23 - 1;
          if ((i43 == 0) && (i22 > 0))
          {
            int i44 = locallu6.f();
            int i45 = locallu6.d();
            int i46 = i22 - 1;
            i35 = i45;
            i33 = i44;
            i34 = i46;
          }
        }
        while (true)
        {
          int i36 = i12 - 1;
          int i42;
          label689: int i37;
          int i41;
          if (i36 == 0)
          {
            i42 = i20 + 1;
            if (i42 < k)
            {
              if (localka1.M == jy.K)
                l3 = locallu2.c();
            }
            else
            {
              if (i42 != i17)
                break label1015;
              i37 = locallu3.f();
              locallu3.b(4);
              i41 = i15 - 1;
              if (i41 > 0)
                i17 = -1 + locallu3.f();
            }
          }
          while (true)
          {
            int i38;
            int i39;
            int i40;
            if (i42 < k)
            {
              i38 = i42;
              i39 = i17;
              i40 = i37;
            }
            while (true)
            {
              i16++;
              i11 = i30;
              i12 = i37;
              i13 = i27;
              i15 = i41;
              i14 = i40;
              i17 = i39;
              i20 = i38;
              i21 = i35;
              i22 = i34;
              i23 = i33;
              i24 = i32;
              i18 = i31;
              i19 = i28;
              break label440;
              l1 = locallu2.g();
              break;
              label816: i25 = i;
              break label465;
              label823: i26 = 0;
              break label491;
              l3 = locallu2.g();
              break label689;
              l3 += arrayOfInt1[i16];
              i37 = i36;
              i38 = i20;
              i39 = i17;
              i40 = i14;
              i41 = i15;
              continue;
              label873: ly.a(arrayOfLong1, 1000000L, paramkf.b);
              boolean bool1;
              boolean bool2;
              label906: boolean bool3;
              label919: boolean bool4;
              if (i13 == 0)
              {
                bool1 = true;
                lp.a(bool1);
                if (i11 != 0)
                  break label972;
                bool2 = true;
                lp.a(bool2);
                if (i12 != 0)
                  break label978;
                bool3 = true;
                lp.a(bool3);
                if (i18 != 0)
                  break label984;
                bool4 = true;
                label932: lp.a(bool4);
                if (i22 != 0)
                  break label990;
              }
              label972: label978: label984: label990: for (boolean bool5 = true; ; bool5 = false)
              {
                lp.a(bool5);
                return new kh(arrayOfLong2, arrayOfInt1, arrayOfLong1, arrayOfInt2);
                bool1 = false;
                break;
                bool2 = false;
                break label906;
                bool3 = false;
                break label919;
                bool4 = false;
                break label932;
              }
              i38 = i42;
              i39 = i17;
              i40 = i37;
              i37 = i36;
            }
            label1015: i37 = i14;
            i41 = i15;
          }
          i34 = i22;
          i33 = i43;
          i35 = i21;
          continue;
          i33 = i23;
          i34 = i22;
          i35 = i21;
        }
        i30 = i29;
        i31 = i18;
      }
      label1071: i27 = i50;
      i28 = i19;
      continue;
      label1082: i27 = i13;
      i28 = i19;
    }
  }

  private static void a(lu paramlu, int paramInt1, int paramInt2, int paramInt3, long paramLong, kc paramkc, int paramInt4)
  {
    paramlu.a(paramInt2 + 8);
    paramlu.b(16);
    int i = paramlu.b();
    int j = paramlu.b();
    paramlu.b(4);
    byte[] arrayOfByte1 = paramlu.a;
    int k = paramlu.b;
    paramlu.b = (k + 1);
    int m = (0xFF & arrayOfByte1[k]) << 8;
    byte[] arrayOfByte2 = paramlu.a;
    int n = paramlu.b;
    paramlu.b = (n + 1);
    int i1 = m | 0xFF & arrayOfByte2[n];
    paramlu.b = (2 + paramlu.b);
    Object localObject1 = null;
    int i2 = paramlu.b;
    int i3;
    int i4;
    boolean bool;
    label152: int i5;
    Object localObject2;
    if (i2 - paramInt2 < paramInt3)
    {
      paramlu.a(i2);
      i3 = paramlu.b;
      i4 = paramlu.d();
      if (i4 > 0)
      {
        bool = true;
        lp.a(bool, "childAtomSize should be positive");
        i5 = paramlu.d();
        if ((paramInt1 != jy.d) && (paramInt1 != jy.y))
          break label283;
        if (i5 != jy.c)
          break label252;
        byte[] arrayOfByte3 = a(paramlu, i3);
        Pair localPair = lq.a(arrayOfByte3);
        i1 = ((Integer)localPair.first).intValue();
        i = ((Integer)localPair.second).intValue();
        localObject2 = arrayOfByte3;
      }
    }
    while (true)
    {
      i2 += i4;
      localObject1 = localObject2;
      break;
      bool = false;
      break label152;
      label252: if (i5 == jy.t)
      {
        paramkc.a[paramInt4] = a(paramlu, i3, i4);
        localObject2 = localObject1;
        continue;
        if ((paramInt1 == jy.e) && (i5 == jy.f))
        {
          paramlu.a(i3 + 8);
          paramkc.b = lo.a(paramlu);
          return;
        }
        if ((paramInt1 == jy.g) && (i5 == jy.h))
        {
          paramlu.a(i3 + 8);
          paramkc.b = lo.b(paramlu);
          return;
          String str;
          if (paramInt1 == jy.e)
          {
            str = "audio/ac3";
            if (localObject1 != null)
              break label415;
          }
          for (List localList = null; ; localList = Collections.singletonList(localObject1))
          {
            paramkc.b = ir.b(str, j, paramLong, i, i1, localList);
            return;
            if (paramInt1 == jy.g)
            {
              str = "audio/eac3";
              break;
            }
            str = "audio/mp4a-latm";
            break;
          }
        }
      }
      label283: label415: localObject2 = localObject1;
    }
  }

  private static byte[] a(lu paramlu, int paramInt)
  {
    paramlu.a(4 + (paramInt + 8));
    paramlu.b(1);
    for (int i = paramlu.a(); i > 127; i = paramlu.a());
    paramlu.b(2);
    int j = paramlu.a();
    if ((j & 0x80) != 0)
      paramlu.b(2);
    if ((j & 0x40) != 0)
      paramlu.b(paramlu.b());
    if ((j & 0x20) != 0)
      paramlu.b(2);
    paramlu.b(1);
    for (int k = paramlu.a(); k > 127; k = paramlu.a());
    paramlu.b(13);
    paramlu.b(1);
    int m = paramlu.a();
    for (int n = m & 0x7F; m > 127; n = n << 8 | m & 0x7F)
      m = paramlu.a();
    byte[] arrayOfByte = new byte[n];
    paramlu.a(arrayOfByte, 0, n);
    return arrayOfByte;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     kb
 * JD-Core Version:    0.6.0
 */