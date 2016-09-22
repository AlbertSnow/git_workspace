import android.media.MediaCodec.CryptoInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;

public final class jp
  implements iv, jo, li
{
  private lh A;
  private jq B;
  private IOException C;
  private boolean D;
  private int E;
  private long F;
  private boolean G;
  private int H;
  int a;
  private final jm b;
  private final kw c;
  private final int d;
  private final SparseArray e;
  private final int f;
  private final boolean g;
  private final Uri h;
  private final ku i;
  private volatile boolean j;
  private volatile jw k;
  private volatile jf l;
  private boolean m;
  private int n;
  private iw[] o;
  private long p;
  private boolean[] q;
  private boolean[] r;
  private boolean[] s;
  private int t;
  private long u;
  private long v;
  private long w;
  private boolean x;
  private long y;
  private long z;

  public jp(Uri paramUri, ku paramku, jm paramjm, int paramInt1, int paramInt2)
  {
    this(paramUri, paramku, paramjm, 2, paramInt2, -1);
  }

  private jp(Uri paramUri, ku paramku, jm paramjm, int paramInt1, int paramInt2, int paramInt3)
  {
    this.h = paramUri;
    this.i = paramku;
    this.b = paramjm;
    this.t = paramInt1;
    this.d = paramInt2;
    this.f = -1;
    this.e = new SparseArray();
    this.c = new kw(262144);
    this.w = -1L;
    this.g = true;
    paramjm.a(this);
  }

  private final void c(long paramLong)
  {
    this.w = paramLong;
    this.G = false;
    if (this.A.c)
    {
      this.A.a();
      return;
    }
    l();
    i();
  }

  private final boolean h()
  {
    i();
    boolean bool1 = m();
    int i1 = 0;
    if (bool1)
      return i1;
    boolean bool2 = this.m;
    i1 = 0;
    int i2;
    label31: int i4;
    if (bool2)
    {
      i2 = 0;
      if (i2 >= this.s.length)
        break label111;
      if (this.s[i2] == 0)
        break label105;
      if (((jr)this.e.valueAt(i2)).b())
        break label99;
      i4 = 1;
      label72: if (i4 != 0)
        break label105;
    }
    label99: label105: label111: for (int i3 = 1; ; i3 = 0)
    {
      i1 = 0;
      if (i3 != 0)
        i1 = 1;
      if (i1 != 0)
        break;
      j();
      return i1;
      i4 = 0;
      break label72;
      i2++;
      break label31;
    }
  }

  private final void i()
  {
    boolean bool1 = true;
    if ((this.G) || (this.A.c))
      return;
    if (this.C != null)
    {
      if (this.B != null);
      while (true)
      {
        lp.b(bool1);
        if (SystemClock.elapsedRealtime() - this.F < Math.min(1000L * (this.E - 1L), 5000L))
          break;
        this.C = null;
        boolean bool2 = this.m;
        int i1 = 0;
        if (bool2)
          break label153;
        while (i1 < this.e.size())
        {
          ((jr)this.e.valueAt(i1)).a();
          i1++;
        }
        bool1 = false;
      }
      this.B = k();
      label153: 
      while (true)
      {
        this.H = this.a;
        this.A.a(this.B, this);
        return;
      }
    }
    this.z = 0L;
    this.x = false;
    if (!this.m)
      this.B = k();
    while (true)
    {
      this.H = this.a;
      this.A.a(this.B, this);
      return;
      lp.b(m());
      if ((this.p != -1L) && (this.w >= this.p))
      {
        this.G = bool1;
        this.w = -1L;
        return;
      }
      long l1 = this.w;
      this.B = new jq(this.h, this.i, this.b, this.c, this.d, this.k.a(l1));
      this.w = -1L;
    }
  }

  private final void j()
  {
    if (this.C == null);
    while (true)
    {
      return;
      if (this.f != -1);
      for (int i1 = this.f; this.E > i1; i1 = 3)
      {
        throw this.C;
        if (this.k == null)
          continue;
      }
    }
  }

  private final jq k()
  {
    return new jq(this.h, this.i, this.b, this.c, this.d, 0L);
  }

  private final void l()
  {
    for (int i1 = 0; i1 < this.e.size(); i1++)
      ((jr)this.e.valueAt(i1)).a();
    this.B = null;
    this.C = null;
    this.E = 0;
    this.D = false;
  }

  private final boolean m()
  {
    return this.w != -1L;
  }

  public final int a(int paramInt, long paramLong, is paramis, iu paramiu, boolean paramBoolean)
  {
    this.u = paramLong;
    if (this.r[paramInt] != 0)
    {
      this.r[paramInt] = false;
      return -5;
    }
    if ((paramBoolean) || (m()))
    {
      j();
      return -2;
    }
    jr localjr = (jr)this.e.valueAt(paramInt);
    if (this.q[paramInt] != 0)
    {
      paramis.a = localjr.e;
      paramis.b = this.l;
      this.q[paramInt] = false;
      return -4;
    }
    int i2;
    int i3;
    label133: int i4;
    if (!localjr.b())
    {
      i2 = 0;
      if (i2 == 0)
        break label1027;
      if ((!this.g) || (paramiu.e >= this.v))
        break label1015;
      i3 = 1;
      i4 = paramiu.d;
      if (i3 == 0)
        break label1021;
    }
    label602: label999: label1015: label1021: for (int i5 = 134217728; ; i5 = 0)
    {
      paramiu.d = (i5 | i4);
      if (this.x)
      {
        this.z = (this.y - paramiu.e);
        this.x = false;
      }
      paramiu.e += this.z;
      return -3;
      jt localjt = localjr.a;
      if (!localjt.c.a(paramiu, localjt.e));
      while (true)
      {
        localjr.c = false;
        i2 = 1;
        break;
        jv localjv;
        long l4;
        int[] arrayOfInt1;
        int[] arrayOfInt2;
        long l5;
        if (paramiu.a())
        {
          localjv = localjt.e;
          long l2 = localjv.a;
          localjt.a(l2, localjt.f.a, 1);
          long l3 = 1L + l2;
          int i9 = localjt.f.a[0];
          int i10;
          if ((i9 & 0x80) != 0)
          {
            i10 = 1;
            int i11 = i9 & 0x7F;
            if (paramiu.a.a == null)
              paramiu.a.a = new byte[16];
            localjt.a(l3, paramiu.a.a, i11);
            l4 = l3 + i11;
            if (i10 == 0)
              break label602;
            localjt.a(l4, localjt.f.a, 2);
            l4 += 2L;
            localjt.f.a(0);
          }
          long l6;
          for (int i12 = localjt.f.b(); ; i12 = 1)
          {
            arrayOfInt1 = paramiu.a.d;
            if ((arrayOfInt1 == null) || (arrayOfInt1.length < i12))
              arrayOfInt1 = new int[i12];
            arrayOfInt2 = paramiu.a.e;
            if ((arrayOfInt2 == null) || (arrayOfInt2.length < i12))
              arrayOfInt2 = new int[i12];
            if (i10 == 0)
              break label942;
            int i14 = i12 * 6;
            lu locallu = localjt.f;
            if (locallu.c < i14)
            {
              locallu.a = new byte[i14];
              locallu.c = i14;
              locallu.b = 0;
            }
            localjt.a(l4, localjt.f.a, i14);
            l6 = l4 + i14;
            localjt.f.a(0);
            for (int i15 = 0; i15 < i12; i15++)
            {
              arrayOfInt1[i15] = localjt.f.b();
              arrayOfInt2[i15] = localjt.f.f();
            }
            i10 = 0;
            break;
          }
          l5 = l6;
          hk localhk = paramiu.a;
          byte[] arrayOfByte1 = localjv.b;
          byte[] arrayOfByte2 = paramiu.a.a;
          localhk.f = i12;
          localhk.d = arrayOfInt1;
          localhk.e = arrayOfInt2;
          localhk.b = arrayOfByte1;
          localhk.a = arrayOfByte2;
          localhk.c = 1;
          if (ly.a >= 16)
            localhk.g.set(localhk.f, localhk.d, localhk.e, localhk.b, localhk.a, localhk.c);
          int i13 = (int)(l5 - localjv.a);
          localjv.a += i13;
          paramiu.c -= i13;
        }
        int i1;
        if ((paramiu.b == null) || (paramiu.b.capacity() < paramiu.c))
        {
          i1 = paramiu.c;
          switch (paramiu.f)
          {
          default:
          case 1:
          case 2:
          }
        }
        while (true)
        {
          if (paramiu.b == null)
            break label999;
          long l1 = localjt.e.a;
          ByteBuffer localByteBuffer = paramiu.b;
          int i6 = paramiu.c;
          while (i6 > 0)
          {
            localjt.a(l1);
            int i7 = (int)(l1 - localjt.g);
            int i8 = Math.min(i6, localjt.b - i7);
            kq localkq = (kq)localjt.d.peek();
            localByteBuffer.put(localkq.a, i7 + localkq.b, i8);
            l1 += i8;
            i6 -= i8;
          }
          arrayOfInt1[0] = 0;
          arrayOfInt2[0] = (paramiu.c - (int)(l4 - localjv.a));
          l5 = l4;
          break;
          paramiu.b = ByteBuffer.allocate(i1);
          continue;
          paramiu.b = ByteBuffer.allocateDirect(i1);
        }
        localjt.a(localjt.c.a());
      }
      i3 = 0;
      break label133;
    }
    label942: if (this.G)
      return -1;
    label1027: j();
    return -2;
  }

  public final iw a(int paramInt)
  {
    lp.b(this.m);
    return this.o[paramInt];
  }

  public final void a(int paramInt, long paramLong)
  {
    lp.b(this.m);
    if (this.s[paramInt] == 0);
    for (boolean bool = true; ; bool = false)
    {
      lp.b(bool);
      this.n = (1 + this.n);
      this.s[paramInt] = true;
      this.q[paramInt] = true;
      if (this.n == 1)
        b(paramLong);
      return;
    }
  }

  public final void a(IOException paramIOException)
  {
    this.C = paramIOException;
    if (this.a > this.H);
    for (int i1 = 1; ; i1 = 1 + this.E)
    {
      this.E = i1;
      this.F = SystemClock.elapsedRealtime();
      i();
      return;
    }
  }

  public final void a(jf paramjf)
  {
    this.l = paramjf;
  }

  public final void a(jw paramjw)
  {
    this.k = paramjw;
  }

  public final boolean a()
  {
    int i1 = 0;
    if (this.m)
      return true;
    if (this.A == null)
      this.A = new lh("Loader:ExtractorSampleSource");
    h();
    if ((this.k != null) && (this.j))
    {
      int i2 = 0;
      int i5;
      if (i2 < this.e.size())
        if (((jr)this.e.valueAt(i2)).e != null)
        {
          i5 = 1;
          label84: if (i5 != 0)
            break label237;
        }
      for (int i3 = 0; ; i3 = 1)
      {
        if (i3 == 0)
          break label256;
        int i4 = this.e.size();
        this.s = new boolean[i4];
        this.r = new boolean[i4];
        this.q = new boolean[i4];
        this.o = new iw[i4];
        this.p = -1L;
        while (i1 < i4)
        {
          ir localir = ((jr)this.e.valueAt(i1)).e;
          this.o[i1] = new iw(localir.a, localir.b);
          if ((localir.b != -1L) && (localir.b > this.p))
            this.p = localir.b;
          i1++;
        }
        i5 = 0;
        break label84;
        label237: i2++;
        break;
      }
      this.m = true;
      return true;
    }
    label256: j();
    return false;
  }

  public final boolean a(long paramLong)
  {
    lp.b(this.m);
    boolean bool1;
    long l1;
    if (this.n > 0)
    {
      bool1 = true;
      lp.b(bool1);
      this.u = paramLong;
      l1 = this.u;
    }
    for (int i1 = 0; ; i1++)
    {
      if (i1 >= this.s.length)
        break label126;
      if (this.s[i1] != 0)
        continue;
      jr localjr = (jr)this.e.valueAt(i1);
      while (true)
        if ((localjr.a.a(localjr.b)) && (localjr.b.e < l1))
        {
          localjr.a.a();
          localjr.c = true;
          continue;
          bool1 = false;
          break;
        }
    }
    label126: int i2;
    if (!this.G)
    {
      boolean bool2 = h();
      i2 = 0;
      if (!bool2);
    }
    else
    {
      i2 = 1;
    }
    return i2;
  }

  public final int b()
  {
    return this.e.size();
  }

  public final void b(int paramInt)
  {
    lp.b(this.m);
    lp.b(this.s[paramInt]);
    this.n = (-1 + this.n);
    this.s[paramInt] = false;
    this.r[paramInt] = false;
    if (this.n == 0)
    {
      if (this.A.c)
        this.A.a();
    }
    else
      return;
    l();
    this.c.a(0);
  }

  public final void b(long paramLong)
  {
    lp.b(this.m);
    boolean bool;
    long l1;
    if (this.n > 0)
    {
      bool = true;
      lp.b(bool);
      this.v = paramLong;
      if (!m())
        break label56;
      l1 = this.w;
      label43: if (l1 != paramLong)
        break label65;
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label56: l1 = this.u;
      break label43;
      label65: this.u = paramLong;
      int i1;
      int i2;
      int i3;
      label87: jt localjt;
      long l2;
      if (!m())
      {
        i1 = 1;
        i2 = 0;
        i3 = i1;
        if ((i3 == 0) || (i2 >= this.e.size()))
          break label176;
        localjt = ((jr)this.e.valueAt(i2)).a;
        l2 = localjt.c.a(paramLong);
        if (l2 != -1L)
          break label163;
      }
      for (int i5 = 0; ; i5 = 1)
      {
        i3 &= i5;
        i2++;
        break label87;
        i1 = 0;
        break;
        label163: localjt.a(l2);
      }
      label176: int i4 = 0;
      if (i3 == 0)
        c(paramLong);
      while (i4 < this.r.length)
      {
        this.r[i4] = true;
        i4++;
      }
    }
  }

  public final long c()
  {
    long l1;
    if (this.G)
      l1 = -3L;
    do
    {
      return l1;
      if (m())
        return this.w;
      int i1 = 0;
      l1 = -9223372036854775808L;
      while (i1 < this.e.size())
      {
        l1 = Math.max(l1, ((jr)this.e.valueAt(i1)).d);
        i1++;
      }
    }
    while (l1 != -9223372036854775808L);
    return this.u;
  }

  public final jx c(int paramInt)
  {
    jr localjr = (jr)this.e.get(paramInt);
    if (localjr == null)
    {
      localjr = new jr(this, this.c);
      this.e.put(paramInt, localjr);
    }
    return localjr;
  }

  public final void d()
  {
    if (this.t > 0);
    for (boolean bool = true; ; bool = false)
    {
      lp.b(bool);
      int i1 = -1 + this.t;
      this.t = i1;
      if ((i1 == 0) && (this.A != null))
      {
        lh locallh = this.A;
        if (locallh.c)
          locallh.a();
        locallh.a.shutdown();
        this.A = null;
      }
      return;
    }
  }

  public final void e()
  {
    this.j = true;
  }

  public final void f()
  {
    this.G = true;
  }

  public final void g()
  {
    if (this.n > 0)
    {
      c(this.w);
      return;
    }
    l();
    this.c.a(0);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     jp
 * JD-Core Version:    0.6.0
 */