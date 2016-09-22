import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class il extends hz
{
  final ip a;
  private final iq h;
  private final long i;
  private final int j;
  private final int k;
  private Surface l;
  private boolean m;
  private boolean n;
  private long o;
  private long p;
  private int q;
  private int r;
  private int s;
  private float t;
  private int u;
  private int v;
  private float w;

  public il(iv paramiv, int paramInt1, long paramLong, Handler paramHandler, ip paramip, int paramInt2)
  {
    this(paramiv, null, true, 1, 0L, null, paramHandler, paramip, -1);
  }

  private il(iv paramiv, ji paramji, boolean paramBoolean, int paramInt1, long paramLong, iq paramiq, Handler paramHandler, ip paramip, int paramInt2)
  {
    super(paramiv, null, true, paramHandler, paramip);
    this.j = paramInt1;
    this.i = (1000L * paramLong);
    this.h = null;
    this.a = paramip;
    this.k = paramInt2;
    this.o = -1L;
    this.r = -1;
    this.s = -1;
    this.t = -1.0F;
    this.u = -1;
    this.v = -1;
    this.w = -1.0F;
  }

  private void a(MediaCodec paramMediaCodec, int paramInt)
  {
    p();
    lx.a("renderVideoBufferImmediate");
    paramMediaCodec.releaseOutputBuffer(paramInt, true);
    lx.a();
    hj localhj = this.b;
    localhj.e = (1 + localhj.e);
    this.n = true;
    q();
  }

  private final void p()
  {
    if ((this.d == null) || (this.a == null) || ((this.u == this.r) && (this.v == this.s) && (this.w == this.t)))
      return;
    int i1 = this.r;
    int i2 = this.s;
    float f = this.t;
    this.d.post(new im(this, i1, i2, f));
    this.u = i1;
    this.v = i2;
    this.w = f;
  }

  private final void q()
  {
    if ((this.d == null) || (this.a == null) || (this.m))
      return;
    Surface localSurface = this.l;
    this.d.post(new in(this, localSurface));
    this.m = true;
  }

  private final void r()
  {
    if ((this.d == null) || (this.a == null) || (this.q == 0))
      return;
    long l1 = SystemClock.elapsedRealtime();
    int i1 = this.q;
    long l2 = l1 - this.p;
    this.d.post(new io(this, i1, l2));
    this.q = 0;
    this.p = l1;
  }

  public final void a(int paramInt, Object paramObject)
  {
    if (paramInt == 1)
    {
      Surface localSurface = (Surface)paramObject;
      if (this.l != localSurface)
      {
        this.l = localSurface;
        this.m = false;
        int i1 = this.g;
        if ((i1 == 2) || (i1 == 3))
        {
          j();
          h();
        }
      }
      return;
    }
    super.a(paramInt, paramObject);
  }

  protected final void a(long paramLong)
  {
    super.a(paramLong);
    this.n = false;
    this.o = -1L;
  }

  protected final void a(long paramLong, boolean paramBoolean)
  {
    super.a(paramLong, paramBoolean);
    this.n = false;
    if ((paramBoolean) && (this.i > 0L))
      this.o = (1000L * SystemClock.elapsedRealtime() + this.i);
  }

  protected final void a(MediaCodec paramMediaCodec, String paramString, MediaFormat paramMediaFormat, MediaCrypto paramMediaCrypto)
  {
    paramMediaCodec.configure(paramMediaFormat, this.l, paramMediaCrypto, 0);
    paramMediaCodec.setVideoScalingMode(this.j);
  }

  protected final void a(ir paramir, MediaFormat paramMediaFormat)
  {
    int i1;
    int i2;
    if ((paramMediaFormat.containsKey("crop-right")) && (paramMediaFormat.containsKey("crop-left")) && (paramMediaFormat.containsKey("crop-bottom")) && (paramMediaFormat.containsKey("crop-top")))
    {
      i1 = 1;
      if (i1 == 0)
        break label98;
      i2 = 1 + (paramMediaFormat.getInteger("crop-right") - paramMediaFormat.getInteger("crop-left"));
      label59: this.r = i2;
      if (i1 == 0)
        break label109;
    }
    label98: label109: for (int i3 = 1 + (paramMediaFormat.getInteger("crop-bottom") - paramMediaFormat.getInteger("crop-top")); ; i3 = paramMediaFormat.getInteger("height"))
    {
      this.s = i3;
      return;
      i1 = 0;
      break;
      i2 = paramMediaFormat.getInteger("width");
      break label59;
    }
  }

  protected final void a(is paramis)
  {
    super.a(paramis);
    float f;
    if (paramis.a.e == -1.0F)
      f = 1.0F;
    while (true)
    {
      this.t = f;
      return;
      f = paramis.a.e;
    }
  }

  protected final boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      lx.a("skipVideoBuffer");
      paramMediaCodec.releaseOutputBuffer(paramInt, false);
      lx.a();
      hj localhj3 = this.b;
      localhj3.f = (1 + localhj3.f);
      return true;
    }
    long l1 = 1000L * SystemClock.elapsedRealtime() - paramLong2;
    long l2 = paramBufferInfo.presentationTimeUs - paramLong1 - l1;
    long l3 = System.nanoTime();
    long l4 = l3 + 1000L * l2;
    if (this.h != null)
    {
      iq localiq = this.h;
      l4 = localiq.a();
      l2 = (l4 - l3) / 1000L;
    }
    if (l2 < -30000L)
    {
      lx.a("dropVideoBuffer");
      paramMediaCodec.releaseOutputBuffer(paramInt, false);
      lx.a();
      hj localhj2 = this.b;
      localhj2.g = (1 + localhj2.g);
      this.q = (1 + this.q);
      if (this.q == this.k)
        r();
      return true;
    }
    if (!this.n)
    {
      a(paramMediaCodec, paramInt);
      return true;
    }
    if (this.g != 3)
      return false;
    if (ly.a >= 21)
    {
      if (l2 < 50000L)
      {
        p();
        lx.a("releaseOutputBufferTimed");
        paramMediaCodec.releaseOutputBuffer(paramInt, l4);
        lx.a();
        hj localhj1 = this.b;
        localhj1.e = (1 + localhj1.e);
        this.n = true;
        q();
        return true;
      }
    }
    else if (l2 < 30000L)
    {
      long l5;
      if (l2 > 11000L)
        l5 = l2 - 10000L;
      try
      {
        Thread.sleep(l5 / 1000L);
        a(paramMediaCodec, paramInt);
        return true;
      }
      catch (InterruptedException localInterruptedException)
      {
        while (true)
          Thread.currentThread().interrupt();
      }
    }
    return false;
  }

  protected final boolean a(String paramString)
  {
    return (lt.a(paramString).equals("video")) && (super.a(paramString));
  }

  protected final boolean a(boolean paramBoolean, ir paramir1, ir paramir2)
  {
    return (paramir2.a.equals(paramir1.a)) && ((paramBoolean) || ((paramir1.c == paramir2.c) && (paramir1.d == paramir2.d)));
  }

  protected final void b()
  {
    super.b();
    this.q = 0;
    this.p = SystemClock.elapsedRealtime();
  }

  protected final void c()
  {
    this.o = -1L;
    r();
    super.c();
  }

  protected final boolean e()
  {
    int i1;
    if (super.e())
      if (!this.n)
      {
        if (this.e != null)
        {
          i1 = 1;
          if ((i1 != 0) && (this.f != 2))
            break label49;
        }
      }
      else
        this.o = -1L;
    label49: 
    do
    {
      return true;
      i1 = 0;
      break;
      if (this.o == -1L)
        return false;
    }
    while (1000L * SystemClock.elapsedRealtime() < this.o);
    this.o = -1L;
    return false;
  }

  public final void g()
  {
    this.r = -1;
    this.s = -1;
    this.t = -1.0F;
    this.u = -1;
    this.v = -1;
    this.w = -1.0F;
    super.g();
  }

  protected final boolean i()
  {
    return (super.i()) && (this.l != null) && (this.l.isValid());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     il
 * JD-Core Version:    0.6.0
 */