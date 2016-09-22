import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
public abstract class hz extends ix
{
  private int A;
  private boolean B;
  private boolean C;
  private boolean D;
  private boolean E;
  private long F;
  private final ji a;
  public final hj b;
  final ie c;
  public final Handler d;
  MediaCodec e;
  int f;
  private final boolean h;
  private final iv i;
  private final iu j;
  private final is k;
  private final List l;
  private final MediaCodec.BufferInfo m;
  private ir n;
  private jf o;
  private boolean p;
  private ByteBuffer[] q;
  private ByteBuffer[] r;
  private long s;
  private int t;
  private int u;
  private boolean v;
  private boolean w;
  private int x;
  private int y;
  private boolean z;

  public hz(iv paramiv, ji paramji, boolean paramBoolean, Handler paramHandler, ie paramie)
  {
    if (ly.a >= 16);
    for (boolean bool = true; ; bool = false)
    {
      lp.b(bool);
      this.i = paramiv;
      this.a = paramji;
      this.h = paramBoolean;
      this.d = paramHandler;
      this.c = paramie;
      this.b = new hj();
      this.j = new iu(0);
      this.k = new is();
      this.l = new ArrayList();
      this.m = new MediaCodec.BufferInfo();
      this.x = 0;
      this.y = 0;
      return;
    }
  }

  private final void a(MediaCodec.CryptoException paramCryptoException)
  {
    if ((this.d != null) && (this.c != null))
      this.d.post(new ib(this, paramCryptoException));
  }

  private final void a(id paramid)
  {
    if ((this.d != null) && (this.c != null))
      this.d.post(new ia(this, paramid));
    throw new hm(paramid);
  }

  private final boolean a(boolean paramBoolean)
  {
    if ((this.B) || (this.y == 2))
      return false;
    if (this.t < 0)
    {
      this.t = this.e.dequeueInputBuffer(0L);
      if (this.t < 0)
        return false;
      this.j.b = this.q[this.t];
      this.j.b.clear();
    }
    if (this.y == 1)
    {
      this.e.queueInputBuffer(this.t, 0, 0, 0L, 4);
      this.t = -1;
      this.y = 2;
      return false;
    }
    int i1;
    if (this.D)
      i1 = -3;
    while (i1 == -2)
    {
      return false;
      if (this.x == 1)
      {
        for (int i6 = 0; i6 < this.n.f.size(); i6++)
        {
          byte[] arrayOfByte = (byte[])this.n.f.get(i6);
          this.j.b.put(arrayOfByte);
        }
        this.x = 2;
      }
      i1 = this.i.a(this.A, this.F, this.k, this.j, false);
      if ((!paramBoolean) || (this.f != 1) || (i1 != -2))
        continue;
      this.f = 2;
    }
    if (i1 == -5)
    {
      p();
      return true;
    }
    if (i1 == -4)
    {
      if (this.x == 2)
      {
        this.j.b.clear();
        this.x = 1;
      }
      a(this.k);
      return true;
    }
    if (i1 == -1)
    {
      if (this.x == 2)
      {
        this.j.b.clear();
        this.x = 1;
      }
      this.B = true;
      try
      {
        this.e.queueInputBuffer(this.t, 0, 0, 0L, 4);
        this.t = -1;
        return false;
      }
      catch (MediaCodec.CryptoException localCryptoException2)
      {
        a(localCryptoException2);
        throw new hm(localCryptoException2);
      }
    }
    if (this.E)
    {
      if (!this.j.b())
      {
        this.j.b.clear();
        if (this.x == 2)
          this.x = 1;
        return true;
      }
      this.E = false;
    }
    boolean bool1 = this.j.a();
    if (this.v)
    {
      int i5 = this.a.a();
      if (i5 == 0)
        throw new hm(this.a.d());
      if ((i5 == 4) || ((!bool1) && (this.h)));
    }
    for (boolean bool2 = true; ; bool2 = false)
    {
      this.D = bool2;
      if (!this.D)
        break;
      return false;
    }
    while (true)
    {
      int i2;
      long l1;
      try
      {
        i2 = this.j.b.position();
        int i3 = i2 - this.j.c;
        l1 = this.j.e;
        if ((0x8000000 & this.j.d) == 0)
          break label711;
        i4 = 1;
        if (i4 == 0)
          continue;
        this.l.add(Long.valueOf(l1));
        if (bool1)
        {
          MediaCodec.CryptoInfo localCryptoInfo = this.j.a.g;
          if (i3 != 0)
            continue;
          this.e.queueSecureInputBuffer(this.t, 0, localCryptoInfo, l1, 0);
          this.t = -1;
          this.z = true;
          this.x = 0;
          return true;
          if (localCryptoInfo.numBytesOfClearData != null)
            continue;
          localCryptoInfo.numBytesOfClearData = new int[1];
          int[] arrayOfInt = localCryptoInfo.numBytesOfClearData;
          arrayOfInt[0] = (i3 + arrayOfInt[0]);
          continue;
        }
      }
      catch (MediaCodec.CryptoException localCryptoException1)
      {
        a(localCryptoException1);
        throw new hm(localCryptoException1);
      }
      this.e.queueInputBuffer(this.t, 0, i2, l1, 0);
      continue;
      label711: int i4 = 0;
    }
  }

  private final void p()
  {
    this.s = -1L;
    this.t = -1;
    this.u = -1;
    this.E = true;
    this.D = false;
    this.l.clear();
    if ((ly.a >= 18) && (this.y == 0))
    {
      this.e.flush();
      this.z = false;
    }
    while (true)
    {
      if ((this.w) && (this.n != null))
        this.x = 1;
      return;
      j();
      h();
    }
  }

  protected hl a(String paramString, boolean paramBoolean)
  {
    return if.a(paramString, paramBoolean);
  }

  protected void a(long paramLong)
  {
    this.F = paramLong;
    this.i.b(paramLong);
    this.f = 0;
    this.B = false;
    this.C = false;
  }

  protected final void a(long paramLong1, long paramLong2)
  {
    int i1;
    int i2;
    try
    {
      if (!this.i.a(paramLong1))
        break label520;
      if (this.f == 0)
      {
        i1 = 1;
        this.f = i1;
        if ((this.e != null) && (this.i.a(this.A, this.F, this.k, this.j, true) == -5))
          p();
        if ((this.n == null) && (this.i.a(this.A, this.F, this.k, this.j, false) == -4))
          a(this.k);
        if ((this.e == null) && (i()))
          h();
        if (this.e == null);
      }
      label297: 
      while (true)
      {
        if (this.C)
          break label514;
        if (this.u < 0)
          this.u = this.e.dequeueOutputBuffer(this.m, 0L);
        if (this.u == -2)
        {
          a(this.n, this.e.getOutputFormat());
          hj localhj2 = this.b;
          localhj2.c = (1 + localhj2.c);
        }
        for (i2 = 1; ; i2 = 1)
        {
          label217: if (i2 != 0)
            break label297;
          while ((a(true)) && (a(false)));
          this.b.a();
          return;
          i1 = this.f;
          break;
          if (this.u != -3)
            break label299;
          this.r = this.e.getOutputBuffers();
          hj localhj1 = this.b;
          localhj1.d = (1 + localhj1.d);
        }
      }
      label299: if (this.u < 0)
        break label514;
      if ((0x4 & this.m.flags) != 0)
      {
        if (this.y == 2)
        {
          j();
          h();
          break label526;
        }
        this.C = true;
      }
    }
    catch (IOException localIOException)
    {
      throw new hm(localIOException);
    }
    long l1 = this.m.presentationTimeUs;
    int i3 = this.l.size();
    int i4 = 0;
    label380: int i5;
    label414: MediaCodec localMediaCodec;
    ByteBuffer localByteBuffer;
    MediaCodec.BufferInfo localBufferInfo;
    int i6;
    if (i4 < i3)
      if (((Long)this.l.get(i4)).longValue() == l1)
      {
        i5 = i4;
        localMediaCodec = this.e;
        localByteBuffer = this.r[this.u];
        localBufferInfo = this.m;
        i6 = this.u;
        if (i5 == -1)
          break label544;
      }
    label514: label520: label526: label544: for (boolean bool = true; ; bool = false)
    {
      if (a(paramLong1, paramLong2, localMediaCodec, localByteBuffer, localBufferInfo, i6, bool))
      {
        if (i5 != -1)
          this.l.remove(i5);
        while (true)
        {
          this.u = -1;
          i2 = 1;
          break;
          this.F = this.m.presentationTimeUs;
        }
      }
      i2 = 0;
      break label217;
      i1 = 0;
      break;
      i2 = 0;
      break label217;
      i4++;
      break label380;
      i5 = -1;
      break label414;
    }
  }

  protected void a(long paramLong, boolean paramBoolean)
  {
    this.i.a(this.A, paramLong);
    this.f = 0;
    this.B = false;
    this.C = false;
    this.D = false;
    this.F = paramLong;
  }

  protected void a(MediaCodec paramMediaCodec, String paramString, MediaFormat paramMediaFormat, MediaCrypto paramMediaCrypto)
  {
    paramMediaCodec.configure(paramMediaFormat, null, paramMediaCrypto, 0);
  }

  protected void a(ir paramir, MediaFormat paramMediaFormat)
  {
  }

  protected void a(is paramis)
  {
    ir localir = this.n;
    this.n = paramis.a;
    this.o = paramis.b;
    if ((this.e != null) && (a(this.p, localir, this.n)))
    {
      this.w = true;
      this.x = 1;
      return;
    }
    if (this.z)
    {
      this.y = 1;
      return;
    }
    j();
    h();
  }

  protected abstract boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo, int paramInt, boolean paramBoolean);

  protected boolean a(String paramString)
  {
    return true;
  }

  protected boolean a(boolean paramBoolean, ir paramir1, ir paramir2)
  {
    return false;
  }

  protected final int b(long paramLong)
  {
    int i1;
    try
    {
      boolean bool = this.i.a();
      i1 = 0;
      if (!bool)
        return 0;
    }
    catch (IOException localIOException)
    {
      throw new hm(localIOException);
    }
    while (true)
    {
      i1++;
      if (i1 >= this.i.b())
        break;
      if (!a(this.i.a(i1).a))
        continue;
      this.A = i1;
      return 1;
    }
    return -1;
  }

  protected void b()
  {
  }

  protected void c()
  {
  }

  protected boolean d()
  {
    return this.C;
  }

  protected boolean e()
  {
    if ((this.n != null) && (!this.D))
    {
      if ((this.f == 0) && (this.u < 0))
        if (SystemClock.elapsedRealtime() >= 1000L + this.s)
          break label51;
      label51: for (int i1 = 1; i1 != 0; i1 = 0)
        return true;
    }
    return false;
  }

  protected long f()
  {
    return this.F;
  }

  protected void g()
  {
    this.n = null;
    this.o = null;
    try
    {
      j();
      try
      {
        if (this.v)
          this.v = false;
        return;
      }
      finally
      {
        this.i.b(this.A);
      }
    }
    finally
    {
    }
    throw localObject2;
  }

  protected final void h()
  {
    if (!i());
    String str1;
    MediaCrypto localMediaCrypto;
    boolean bool;
    while (true)
    {
      return;
      str1 = this.n.a;
      if (this.o == null)
        break;
      if (this.a == null)
        throw new hm("Media requires a DrmSessionManager");
      if (!this.v)
        this.v = true;
      int i1 = this.a.a();
      if (i1 == 0)
        throw new hm(this.a.d());
      if ((i1 != 3) && (i1 != 4))
        continue;
      localMediaCrypto = this.a.b();
      bool = this.a.c();
    }
    while (true)
    {
      try
      {
        hl localhl2 = a(str1, bool);
        localhl1 = localhl2;
        if (localhl1 != null)
          continue;
        a(new id(this.n, null, -49999));
        str2 = localhl1.a;
        this.p = localhl1.b;
      }
      catch (ih localih)
      {
        try
        {
          long l2 = SystemClock.elapsedRealtime();
          this.e = MediaCodec.createByCodecName(str2);
          a(this.e, str2, this.n.a(), localMediaCrypto);
          this.e.start();
          long l3 = SystemClock.elapsedRealtime();
          long l4 = l3 - l2;
          if ((this.d == null) || (this.c == null))
            continue;
          this.d.post(new ic(this, str2, l3, l4));
          this.q = this.e.getInputBuffers();
          this.r = this.e.getOutputBuffers();
          if (this.g != 3)
            continue;
          l1 = SystemClock.elapsedRealtime();
          this.s = l1;
          this.t = -1;
          this.u = -1;
          this.E = true;
          hj localhj = this.b;
          localhj.a = (1 + localhj.a);
          return;
          localih = localih;
          a(new id(this.n, localih, -49998));
          hl localhl1 = null;
        }
        catch (Exception localException)
        {
          String str2;
          a(new id(this.n, localException, str2));
          continue;
          long l1 = -1L;
          continue;
        }
      }
      bool = false;
      localMediaCrypto = null;
    }
  }

  protected boolean i()
  {
    return (this.e == null) && (this.n != null);
  }

  protected final void j()
  {
    if (this.e != null)
    {
      this.s = -1L;
      this.t = -1;
      this.u = -1;
      this.D = false;
      this.l.clear();
      this.q = null;
      this.r = null;
      this.w = false;
      this.z = false;
      this.p = false;
      this.x = 0;
      this.y = 0;
      hj localhj = this.b;
      localhj.b = (1 + localhj.b);
    }
    try
    {
      this.e.stop();
      try
      {
        this.e.release();
        return;
      }
      finally
      {
        this.e = null;
      }
    }
    finally
    {
    }
    throw localObject2;
  }

  protected final void k()
  {
    this.i.d();
  }

  protected final long l()
  {
    return this.i.a(this.A).b;
  }

  protected final long m()
  {
    long l1 = this.i.c();
    if ((l1 == -1L) || (l1 == -3L))
      return l1;
    return Math.max(l1, f());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     hz
 * JD-Core Version:    0.6.0
 */