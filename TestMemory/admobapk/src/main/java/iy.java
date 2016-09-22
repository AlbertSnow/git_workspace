import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.util.Log;
import java.lang.reflect.Method;

@TargetApi(16)
public final class iy
{
  private static boolean w = false;
  private long A;
  private Method B;
  private long C;
  private float D;
  final ConditionVariable a = new ConditionVariable(true);
  public final jb b;
  public AudioTrack c;
  public AudioTrack d;
  public int e;
  public int f;
  public int g;
  public int h;
  public int i;
  public int j;
  public int k;
  public long l;
  public boolean m;
  public long n;
  public int o;
  public long p;
  public long q;
  public byte[] r;
  public int s;
  public int t;
  public boolean u;
  public int v;
  private final long[] x;
  private int y;
  private long z;

  public iy()
  {
    if (ly.a >= 18);
    try
    {
      this.B = AudioTrack.class.getMethod("getLatency", null);
      label36: if (ly.a >= 19);
      for (this.b = new jc(); ; this.b = new jb(0))
      {
        this.x = new long[10];
        this.D = 1.0F;
        this.o = 0;
        return;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label36;
    }
  }

  // ERROR //
  public final int a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 63	iy:a	Landroid/os/ConditionVariable;
    //   4: invokevirtual 101	android/os/ConditionVariable:block	()V
    //   7: iload_1
    //   8: ifne +78 -> 86
    //   11: aload_0
    //   12: new 69	android/media/AudioTrack
    //   15: dup
    //   16: iconst_3
    //   17: aload_0
    //   18: getfield 103	iy:e	I
    //   21: aload_0
    //   22: getfield 105	iy:f	I
    //   25: aload_0
    //   26: getfield 107	iy:g	I
    //   29: aload_0
    //   30: getfield 109	iy:j	I
    //   33: iconst_1
    //   34: invokespecial 112	android/media/AudioTrack:<init>	(IIIIII)V
    //   37: putfield 114	iy:d	Landroid/media/AudioTrack;
    //   40: aload_0
    //   41: getfield 114	iy:d	Landroid/media/AudioTrack;
    //   44: invokevirtual 118	android/media/AudioTrack:getState	()I
    //   47: istore_2
    //   48: iload_2
    //   49: iconst_1
    //   50: if_icmpeq +89 -> 139
    //   53: aload_0
    //   54: getfield 114	iy:d	Landroid/media/AudioTrack;
    //   57: invokevirtual 121	android/media/AudioTrack:release	()V
    //   60: aload_0
    //   61: aconst_null
    //   62: putfield 114	iy:d	Landroid/media/AudioTrack;
    //   65: new 123	jd
    //   68: dup
    //   69: iload_2
    //   70: aload_0
    //   71: getfield 103	iy:e	I
    //   74: aload_0
    //   75: getfield 105	iy:f	I
    //   78: aload_0
    //   79: getfield 109	iy:j	I
    //   82: invokespecial 126	jd:<init>	(IIII)V
    //   85: athrow
    //   86: aload_0
    //   87: new 69	android/media/AudioTrack
    //   90: dup
    //   91: iconst_3
    //   92: aload_0
    //   93: getfield 103	iy:e	I
    //   96: aload_0
    //   97: getfield 105	iy:f	I
    //   100: aload_0
    //   101: getfield 107	iy:g	I
    //   104: aload_0
    //   105: getfield 109	iy:j	I
    //   108: iconst_1
    //   109: iload_1
    //   110: invokespecial 129	android/media/AudioTrack:<init>	(IIIIIII)V
    //   113: putfield 114	iy:d	Landroid/media/AudioTrack;
    //   116: goto -76 -> 40
    //   119: astore 5
    //   121: aload_0
    //   122: aconst_null
    //   123: putfield 114	iy:d	Landroid/media/AudioTrack;
    //   126: goto -61 -> 65
    //   129: astore 4
    //   131: aload_0
    //   132: aconst_null
    //   133: putfield 114	iy:d	Landroid/media/AudioTrack;
    //   136: aload 4
    //   138: athrow
    //   139: aload_0
    //   140: getfield 114	iy:d	Landroid/media/AudioTrack;
    //   143: invokevirtual 132	android/media/AudioTrack:getAudioSessionId	()I
    //   146: istore_3
    //   147: aload_0
    //   148: getfield 84	iy:b	Ljb;
    //   151: aload_0
    //   152: getfield 114	iy:d	Landroid/media/AudioTrack;
    //   155: aload_0
    //   156: getfield 134	iy:u	Z
    //   159: invokevirtual 137	jb:a	(Landroid/media/AudioTrack;Z)V
    //   162: aload_0
    //   163: aload_0
    //   164: getfield 88	iy:D	F
    //   167: invokevirtual 140	iy:a	(F)V
    //   170: iload_3
    //   171: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   53	60	119	java/lang/Exception
    //   53	60	129	finally
  }

  public final long a(long paramLong)
  {
    if (this.u)
    {
      if (this.v == 0)
        return 0L;
      return (paramLong << 3) * this.e / (1000 * this.v);
    }
    return paramLong / this.h;
  }

  public final void a(float paramFloat)
  {
    this.D = paramFloat;
    if (a())
    {
      if (ly.a >= 21)
        this.d.setVolume(paramFloat);
    }
    else
      return;
    this.d.setStereoVolume(paramFloat, paramFloat);
  }

  public final boolean a()
  {
    return this.d != null;
  }

  public final long b(long paramLong)
  {
    return 1000000L * paramLong / this.e;
  }

  public final void b()
  {
    if (a())
    {
      this.C = (System.nanoTime() / 1000L);
      this.d.play();
    }
  }

  public final long c(long paramLong)
  {
    return paramLong * this.e / 1000000L;
  }

  public final boolean c()
  {
    if (a())
    {
      if (a(this.n) <= this.b.a())
      {
        jb localjb = this.b;
        if ((ly.a > 22) || (!localjb.b) || (localjb.a.getPlayState() != 2) || (localjb.a.getPlaybackHeadPosition() != 0))
          break label75;
      }
      label75: for (int i1 = 1; i1 != 0; i1 = 0)
        return true;
    }
    return false;
  }

  public final void d()
  {
    if (a())
    {
      this.n = 0L;
      this.t = 0;
      this.p = 0L;
      this.q = 0L;
      f();
      if (this.d.getPlayState() == 3)
        this.d.pause();
      AudioTrack localAudioTrack = this.d;
      this.d = null;
      this.b.a(null, false);
      this.a.close();
      new iz(this, localAudioTrack).start();
    }
  }

  public final void e()
  {
    long l1 = this.b.b();
    if (l1 == 0L);
    long l2;
    do
    {
      return;
      l2 = System.nanoTime() / 1000L;
      if (l2 - this.z < 30000L)
        continue;
      this.x[this.y] = (l1 - l2);
      this.y = ((1 + this.y) % 10);
      if (this.k < 10)
        this.k = (1 + this.k);
      this.z = l2;
      this.l = 0L;
      for (int i1 = 0; i1 < this.k; i1++)
        this.l += this.x[i1] / this.k;
    }
    while ((this.u) || (l2 - this.A < 500000L));
    this.m = this.b.c();
    long l4;
    long l5;
    if (this.m)
    {
      l4 = this.b.d() / 1000L;
      l5 = this.b.e();
      if (l4 >= this.C)
        break label323;
      this.m = false;
    }
    while (true)
    {
      if (this.B != null);
      try
      {
        this.q = (1000L * ((Integer)this.B.invoke(this.d, null)).intValue() - b(a(this.j)));
        this.q = Math.max(this.q, 0L);
        if (this.q > 5000000L)
        {
          long l3 = this.q;
          Log.w("AudioTrack", 61 + "Ignoring impossibly large audio latency: " + l3);
          this.q = 0L;
        }
        this.A = l2;
        return;
        label323: if (Math.abs(l4 - l2) > 5000000L)
        {
          this.m = false;
          Log.w("AudioTrack", 136 + "Spurious audio timestamp (system clock mismatch): " + l5 + ", " + l4 + ", " + l2 + ", " + l1);
          continue;
        }
        if (Math.abs(b(l5) - l1) <= 5000000L)
          continue;
        this.m = false;
        Log.w("AudioTrack", 138 + "Spurious audio timestamp (frame position mismatch): " + l5 + ", " + l4 + ", " + l2 + ", " + l1);
      }
      catch (Exception localException)
      {
        while (true)
          this.B = null;
      }
    }
  }

  public final void f()
  {
    this.l = 0L;
    this.k = 0;
    this.y = 0;
    this.z = 0L;
    this.m = false;
    this.A = 0L;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     iy
 * JD-Core Version:    0.6.0
 */