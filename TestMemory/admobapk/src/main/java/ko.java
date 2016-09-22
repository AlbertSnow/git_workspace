import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

final class ko
  implements kl
{
  ko(kn paramkn)
  {
  }

  public final int a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return 0;
    case 160:
    case 174:
    case 183:
    case 187:
    case 224:
    case 225:
    case 18407:
    case 19899:
    case 20533:
    case 25152:
    case 28032:
    case 290298740:
    case 357149030:
    case 374648427:
    case 408125543:
    case 440786851:
    case 475249515:
    case 524531317:
      return 1;
    case 131:
    case 159:
    case 176:
    case 179:
    case 186:
    case 215:
    case 231:
    case 241:
    case 251:
    case 17029:
    case 17143:
    case 18401:
    case 18408:
    case 20529:
    case 20530:
    case 20531:
    case 21420:
    case 22186:
    case 22203:
    case 2807729:
      return 2;
    case 134:
    case 17026:
      return 3;
    case 161:
    case 163:
    case 18402:
    case 21419:
    case 25506:
      return 4;
    case 181:
    case 17545:
    }
    return 5;
  }

  public final void a(int paramInt, double paramDouble)
  {
    kn localkn = this.a;
    switch (paramInt)
    {
    default:
      return;
    case 17545:
      localkn.h = localkn.a(()paramDouble);
      return;
    case 181:
    }
    localkn.i.i = (int)paramDouble;
  }

  public final void a(int paramInt1, int paramInt2, jn paramjn)
  {
    kn localkn = this.a;
    switch (paramInt1)
    {
    default:
      throw new IllegalStateException(26 + "Unexpected id: " + paramInt1);
    case 21419:
      Arrays.fill(localkn.d.a, 0);
      paramjn.a(localkn.d.a, 4 - paramInt2, paramInt2);
      localkn.d.a(0);
      localkn.m = (int)localkn.d.c();
      return;
    case 25506:
      localkn.i.j = new byte[paramInt2];
      paramjn.a(localkn.i.j, 0, paramInt2);
      return;
    case 18402:
      localkn.i.e = new byte[paramInt2];
      paramjn.a(localkn.i.e, 0, paramInt2);
      return;
    case 161:
    case 163:
    }
    if (localkn.w == 0)
    {
      localkn.y = (int)localkn.a.a(paramjn, false, true);
      localkn.v = localkn.a.a;
      localkn.w = 1;
    }
    if (((localkn.j != null) && (localkn.k != null) && (localkn.j.b != localkn.y) && (localkn.k.b != localkn.y)) || ((localkn.j != null) && (localkn.k == null) && (localkn.j.b != localkn.y)) || ((localkn.j == null) && (localkn.k != null) && (localkn.k.b != localkn.y)))
    {
      paramjn.a(paramInt2 - localkn.v);
      localkn.w = 0;
      return;
    }
    kp localkp;
    jx localjx;
    byte[] arrayOfByte;
    if ((localkn.j != null) && (localkn.y == localkn.j.b))
    {
      localkp = localkn.j;
      localjx = localkp.m;
      if (localkn.w != 1)
        break label773;
      arrayOfByte = localkn.b.a;
      if (!localkp.d)
        break label556;
    }
    label556: for (int i = 4; ; i = 3)
    {
      paramjn.a(arrayOfByte, 0, i);
      localkn.v = (i + localkn.v);
      int j = arrayOfByte[0] << 8 | 0xFF & arrayOfByte[1];
      localkn.A = (localkn.r + localkn.a(j));
      int k = (0x6 & arrayOfByte[2]) >> 1;
      if (k == 0)
        break label562;
      throw new it(38 + "Lacing mode not supported: " + k);
      localkp = localkn.k;
      break;
    }
    label562: int m;
    if ((0x8 & arrayOfByte[2]) == 8)
    {
      m = 1;
      if ((paramInt1 != 163) || ((0x80 & arrayOfByte[2]) != 128))
        break label639;
    }
    label639: for (int n = 1; ; n = 0)
    {
      if (!localkp.d)
        break label897;
      if ((0x80 & arrayOfByte[3]) != 128)
        break label645;
      throw new it("Extension bit is set in signal byte");
      m = 0;
      break;
    }
    label645: int i6;
    if ((0x1 & arrayOfByte[3]) == 1)
      i6 = 1;
    label897: for (int i1 = i6; ; i1 = 0)
    {
      int i2;
      label670: int i3;
      label679: int i4;
      if (n != 0)
      {
        i2 = 1;
        if (m == 0)
          break label823;
        i3 = 134217728;
        i4 = i2 | i3;
        if (i1 == 0)
          break label829;
      }
      label773: label823: label829: for (int i5 = 2; ; i5 = 0)
      {
        localkn.z = (i5 | i4);
        localkn.x = (paramInt2 - localkn.v);
        if (i1 != 0)
        {
          localkn.b.a[0] = 8;
          localkn.b.a(0);
          localjx.a(localkn.b, 1);
          localkn.x = (1 + localkn.x);
        }
        localkn.w = 2;
        while (localkn.v < paramInt2)
          localkn.v += localjx.a(paramjn, paramInt2 - localkn.v);
        i6 = 0;
        break;
        i2 = 0;
        break label670;
        i3 = 0;
        break label679;
      }
      if ("A_VORBIS".equals(localkp.a))
      {
        localkn.c.a(0);
        localjx.a(localkn.c, 4);
        localkn.x = (4 + localkn.x);
      }
      if (paramInt1 != 163)
        break;
      localkn.a(localjx);
      return;
    }
  }

  public final void a(int paramInt, long paramLong)
  {
    kn localkn = this.a;
    switch (paramInt)
    {
    default:
    case 17143:
    case 17029:
    case 21420:
    case 2807729:
    case 176:
    case 186:
    case 215:
    case 131:
    case 22186:
    case 22203:
    case 159:
    case 251:
    case 20529:
    case 20530:
    case 20531:
    case 18401:
    case 18408:
    case 179:
    case 241:
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                      return;
                    while (paramLong == 1L);
                    throw new it(50 + "EBMLReadVersion " + paramLong + " not supported");
                  }
                  while ((paramLong >= 1L) && (paramLong <= 2L));
                  throw new it(53 + "DocTypeReadVersion " + paramLong + " not supported");
                  localkn.n = (paramLong + localkn.e);
                  return;
                  localkn.g = paramLong;
                  return;
                  localkn.i.f = (int)paramLong;
                  return;
                  localkn.i.g = (int)paramLong;
                  return;
                  localkn.i.b = (int)paramLong;
                  return;
                  localkn.i.c = (int)paramLong;
                  return;
                  localkn.i.k = paramLong;
                  return;
                  localkn.i.l = paramLong;
                  return;
                  localkn.i.h = (int)paramLong;
                  return;
                  localkn.B = true;
                  return;
                }
                while (paramLong == 0L);
                throw new it(55 + "ContentEncodingOrder " + paramLong + " not supported");
              }
              while (paramLong == 1L);
              throw new it(55 + "ContentEncodingScope " + paramLong + " not supported");
            }
            while (paramLong == 1L);
            throw new it(54 + "ContentEncodingType " + paramLong + " not supported");
          }
          while (paramLong == 5L);
          throw new it(49 + "ContentEncAlgo " + paramLong + " not supported");
        }
        while (paramLong == 1L);
        throw new it(56 + "AESSettingsCipherMode " + paramLong + " not supported");
        localkn.s.a(localkn.a(paramLong));
        return;
      }
      while (localkn.u);
      localkn.t.a(paramLong);
      localkn.u = true;
      return;
    case 231:
    }
    localkn.r = localkn.a(paramLong);
  }

  public final void a(int paramInt, long paramLong1, long paramLong2)
  {
    kn localkn = this.a;
    switch (paramInt)
    {
    case 25152:
    default:
    case 408125543:
    case 19899:
    case 475249515:
    case 187:
    case 524531317:
      do
      {
        return;
        if (localkn.e != -1L)
          throw new it("Multiple Segment elements not supported");
        localkn.e = paramLong1;
        localkn.f = paramLong2;
        return;
        localkn.m = -1;
        localkn.n = -1L;
        return;
        localkn.s = new ls();
        localkn.t = new ls();
        return;
        localkn.u = false;
        return;
      }
      while ((localkn.q != 0) || (localkn.p == -1L));
      localkn.o = true;
      return;
    case 160:
      localkn.B = false;
      return;
    case 20533:
      localkn.i.d = true;
      return;
    case 174:
    }
    localkn.i = new kp();
  }

  public final void a(int paramInt, String paramString)
  {
    kn localkn = this.a;
    switch (paramInt)
    {
    default:
    case 17026:
      do
        return;
      while ("webm".equals(paramString));
      throw new it(22 + String.valueOf(paramString).length() + "DocType " + paramString + " not supported");
    case 134:
    }
    localkn.i.a = paramString;
  }

  public final void b(int paramInt)
  {
    kn localkn = this.a;
    switch (paramInt)
    {
    default:
    case 19899:
    case 475249515:
    case 160:
    case 25152:
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              if ((localkn.m != -1) && (localkn.n != -1L))
                continue;
              throw new it("Mandatory element SeekID or SeekPosition not found");
            }
            while (localkn.m != 475249515);
            localkn.p = localkn.n;
            return;
          }
          while (localkn.q == 2);
          jo localjo = localkn.C;
          if (localkn.e == -1L)
            throw new it("Segment start/end offsets unknown");
          if (localkn.h == -1L)
            throw new it("Duration unknown");
          if ((localkn.s == null) || (localkn.t == null) || (localkn.s.a == 0) || (localkn.s.a != localkn.t.a))
            throw new it("Invalid/missing cue points");
          int i = localkn.s.a;
          int[] arrayOfInt = new int[i];
          long[] arrayOfLong1 = new long[i];
          long[] arrayOfLong2 = new long[i];
          long[] arrayOfLong3 = new long[i];
          for (int j = 0; j < i; j++)
          {
            arrayOfLong3[j] = localkn.s.a(j);
            arrayOfLong1[j] = (localkn.e + localkn.t.a(j));
          }
          for (int k = 0; k < i - 1; k++)
          {
            arrayOfInt[k] = (int)(arrayOfLong1[(k + 1)] - arrayOfLong1[k]);
            arrayOfLong2[k] = (arrayOfLong3[(k + 1)] - arrayOfLong3[k]);
          }
          arrayOfInt[(i - 1)] = (int)(localkn.e + localkn.f - arrayOfLong1[(i - 1)]);
          arrayOfLong2[(i - 1)] = (localkn.h - arrayOfLong3[(i - 1)]);
          localkn.s = null;
          localkn.t = null;
          localjo.a(new jj(arrayOfInt, arrayOfLong1, arrayOfLong2, arrayOfLong3));
          localkn.q = 2;
          return;
        }
        while (localkn.w != 2);
        if (!localkn.B)
          localkn.z = (0x1 | localkn.z);
        if ((localkn.j != null) && (localkn.y == localkn.j.b));
        for (jx localjx3 = localkn.j.m; ; localjx3 = localkn.k.m)
        {
          localkn.a(localjx3);
          return;
        }
        if (!localkn.i.d)
          throw new it("Found an unsupported ContentEncoding");
        if (localkn.i.e != null)
          continue;
        throw new it("Encrypted Track found but ContentEncKeyID was not found");
      }
      while (localkn.l);
      localkn.C.a(new jh("video/webm", localkn.i.e));
      localkn.l = true;
      return;
    case 174:
      if ((localkn.i.b == -1) || (localkn.i.c == -1))
        throw new it("Mandatory element TrackNumber or TrackType not found");
      if (((localkn.i.c == 2) && (localkn.j != null)) || ((localkn.i.c == 1) && (localkn.k != null)))
      {
        localkn.i = null;
        return;
      }
      ir localir2;
      if ((localkn.i.c == 2) && (kn.a(localkn.i.a)))
      {
        localkn.j = localkn.i;
        localkn.j.m = localkn.C.c(localkn.j.b);
        jx localjx2 = localkn.j.m;
        if ((localkn.j != null) && ("A_VORBIS".equals(localkn.j.a)))
        {
          localir2 = ir.b("audio/vorbis", 8192, localkn.h, localkn.j.h, localkn.j.i, localkn.b());
          localjx2.a(localir2);
        }
      }
      do
      {
        localkn.i = null;
        return;
        if ((localkn.j != null) && ("A_OPUS".equals(localkn.j.a)))
        {
          ArrayList localArrayList = new ArrayList(3);
          localArrayList.add(localkn.j.j);
          localArrayList.add(ByteBuffer.allocate(64).putLong(localkn.j.k).array());
          localArrayList.add(ByteBuffer.allocate(64).putLong(localkn.j.l).array());
          localir2 = ir.b("audio/opus", 5760, localkn.h, localkn.j.h, localkn.j.i, localArrayList);
          break;
        }
        throw new it("Unable to build format");
      }
      while ((localkn.i.c != 1) || (!kn.a(localkn.i.a)));
      localkn.k = localkn.i;
      localkn.k.m = localkn.C.c(localkn.k.b);
      jx localjx1 = localkn.k.m;
      if ((localkn.k != null) && ("V_VP8".equals(localkn.k.a)));
      for (ir localir1 = ir.a("video/x-vnd.on2.vp8", -1, localkn.h, localkn.k.f, localkn.k.g, null); ; localir1 = ir.a("video/x-vnd.on2.vp9", -1, localkn.h, localkn.k.f, localkn.k.g, null))
      {
        localjx1.a(localir1);
        break;
        if ((localkn.k == null) || (!"V_VP9".equals(localkn.k.a)))
          break label1125;
      }
      label1125: throw new it("Unable to build format");
    case 374648427:
    }
    if ((localkn.k == null) && (localkn.j == null))
      throw new it("No valid tracks were found");
    localkn.C.e();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ko
 * JD-Core Version:    0.6.0
 */