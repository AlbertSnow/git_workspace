import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.Map;

@Deprecated
@TargetApi(16)
public final class ht
  implements iv
{
  private final Context a;
  private final Uri b;
  private final Map c;
  private final FileDescriptor d;
  private final long e;
  private final long f;
  private MediaExtractor g;
  private iw[] h;
  private boolean i;
  private int j;
  private int[] k;
  private boolean[] l;
  private long m;

  public ht(Context paramContext, Uri paramUri, Map paramMap, int paramInt)
  {
    if (ly.a >= 16);
    for (boolean bool = true; ; bool = false)
    {
      lp.b(bool);
      this.j = 2;
      this.a = ((Context)lp.a(paramContext));
      this.b = ((Uri)lp.a(paramUri));
      this.c = null;
      this.d = null;
      this.e = 0L;
      this.f = 0L;
      return;
    }
  }

  private final void a(long paramLong, boolean paramBoolean)
  {
    int n = 0;
    if ((paramBoolean) || (this.m != paramLong))
    {
      this.m = paramLong;
      this.g.seekTo(paramLong, 0);
      while (n < this.k.length)
      {
        if (this.k[n] != 0)
          this.l[n] = true;
        n++;
      }
    }
  }

  public final int a(int paramInt, long paramLong, is paramis, iu paramiu, boolean paramBoolean)
  {
    lp.b(this.i);
    if (this.k[paramInt] != 0);
    for (boolean bool = true; ; bool = false)
    {
      lp.b(bool);
      if (this.l[paramInt] == 0)
        break;
      this.l[paramInt] = false;
      return -5;
    }
    if (paramBoolean)
      return -2;
    if (this.k[paramInt] != 2)
    {
      paramis.a = new ir(this.g.getTrackFormat(paramInt));
      Map localMap;
      jg localjg;
      if (ly.a >= 18)
      {
        localMap = this.g.getPsshInfo();
        if ((localMap == null) || (localMap.isEmpty()))
          localjg = null;
      }
      while (true)
      {
        paramis.b = localjg;
        this.k[paramInt] = 2;
        return -4;
        localjg = new jg("video/mp4");
        localjg.a.putAll(localMap);
        continue;
        localjg = null;
      }
    }
    int n = this.g.getSampleTrackIndex();
    if (n == paramInt)
    {
      if (paramiu.b != null)
      {
        int i1 = paramiu.b.position();
        paramiu.c = this.g.readSampleData(paramiu.b, i1);
        paramiu.b.position(i1 + paramiu.c);
      }
      while (true)
      {
        paramiu.e = this.g.getSampleTime();
        paramiu.d = (0x3 & this.g.getSampleFlags());
        if (paramiu.a())
        {
          hk localhk = paramiu.a;
          this.g.getSampleCryptoInfo(localhk.g);
          localhk.f = localhk.g.numSubSamples;
          localhk.d = localhk.g.numBytesOfClearData;
          localhk.e = localhk.g.numBytesOfEncryptedData;
          localhk.b = localhk.g.key;
          localhk.a = localhk.g.iv;
          localhk.c = localhk.g.mode;
        }
        this.m = -1L;
        this.g.advance();
        return -3;
        paramiu.c = 0;
      }
    }
    if (n < 0)
      return -1;
    return -2;
  }

  public final iw a(int paramInt)
  {
    lp.b(this.i);
    return this.h[paramInt];
  }

  public final void a(int paramInt, long paramLong)
  {
    boolean bool1 = true;
    lp.b(this.i);
    boolean bool2;
    if (this.k[paramInt] == 0)
    {
      bool2 = bool1;
      lp.b(bool2);
      this.k[paramInt] = bool1;
      this.g.selectTrack(paramInt);
      if (paramLong == 0L)
        break label64;
    }
    while (true)
    {
      a(paramLong, bool1);
      return;
      bool2 = false;
      break;
      label64: bool1 = false;
    }
  }

  public final boolean a()
  {
    if (!this.i)
    {
      this.g = new MediaExtractor();
      int n;
      label82: MediaFormat localMediaFormat;
      long l1;
      if (this.a != null)
      {
        this.g.setDataSource(this.a, this.b, this.c);
        this.k = new int[this.g.getTrackCount()];
        this.l = new boolean[this.k.length];
        this.h = new iw[this.k.length];
        n = 0;
        if (n >= this.k.length)
          break label166;
        localMediaFormat = this.g.getTrackFormat(n);
        if (!localMediaFormat.containsKey("durationUs"))
          break label159;
        l1 = localMediaFormat.getLong("durationUs");
      }
      while (true)
      {
        String str = localMediaFormat.getString("mime");
        this.h[n] = new iw(str, l1);
        n++;
        break label82;
        this.g.setDataSource(null, 0L, 0L);
        break;
        label159: l1 = -1L;
      }
      label166: this.i = true;
    }
    return true;
  }

  public final boolean a(long paramLong)
  {
    return true;
  }

  public final int b()
  {
    lp.b(this.i);
    return this.k.length;
  }

  public final void b(int paramInt)
  {
    lp.b(this.i);
    if (this.k[paramInt] != 0);
    for (boolean bool = true; ; bool = false)
    {
      lp.b(bool);
      this.g.unselectTrack(paramInt);
      this.l[paramInt] = false;
      this.k[paramInt] = 0;
      return;
    }
  }

  public final void b(long paramLong)
  {
    lp.b(this.i);
    a(paramLong, false);
  }

  public final long c()
  {
    lp.b(this.i);
    long l1 = this.g.getCachedDuration();
    if (l1 == -1L)
      return -1L;
    long l2 = this.g.getSampleTime();
    if (l2 == -1L)
      return -3L;
    return l2 + l1;
  }

  public final void d()
  {
    if (this.j > 0);
    for (boolean bool = true; ; bool = false)
    {
      lp.b(bool);
      int n = -1 + this.j;
      this.j = n;
      if ((n == 0) && (this.g != null))
      {
        this.g.release();
        this.g = null;
      }
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ht
 * JD-Core Version:    0.6.0
 */