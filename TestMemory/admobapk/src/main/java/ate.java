import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Build.VERSION;
import android.view.SurfaceView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.CompletionService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ate
{
  static final Logger a = aso.a("AppStreamingFragment", "MediaCodecRenderer");
  private AtomicInteger A = new AtomicInteger();
  private AtomicInteger B = new AtomicInteger();
  final CompletionService b;
  final MediaCodec c;
  final SurfaceView d;
  final int e;
  int f;
  MediaCodec.BufferInfo g = new MediaCodec.BufferInfo();
  ByteBuffer[] h;
  Future i;
  AtomicBoolean j = new AtomicBoolean();
  AtomicLong k = new AtomicLong();
  final atg l;
  AtomicInteger m = new AtomicInteger();
  AtomicInteger n = new AtomicInteger();
  AtomicInteger o = new AtomicInteger();
  AtomicInteger p = new AtomicInteger();
  AtomicInteger q = new AtomicInteger();
  Runnable r = new atf(this);
  private final long s;
  private long t;
  private long u;
  private int v;
  private int w;
  private AtomicLong x = new AtomicLong();
  private AtomicInteger y = new AtomicInteger();
  private AtomicInteger z = new AtomicInteger();

  ate(CompletionService paramCompletionService, MediaCodec paramMediaCodec, SurfaceView paramSurfaceView, long paramLong, atg paramatg)
  {
    this.b = paramCompletionService;
    this.c = paramMediaCodec;
    this.d = paramSurfaceView;
    this.s = paramLong;
    this.l = paramatg;
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.e = 0;
      return;
    }
    this.e = 1;
  }

  public static boolean a()
  {
    if (Build.VERSION.SDK_INT >= 21)
      return d() != null;
    MediaCodec localMediaCodec = b();
    if (localMediaCodec != null)
    {
      localMediaCodec.release();
      return true;
    }
    return false;
  }

  static MediaCodec b()
  {
    int i1 = 0;
    if (a.isLoggable(asn.d))
      if (Build.VERSION.SDK_INT >= 21)
      {
        MediaCodecInfo[] arrayOfMediaCodecInfo = new MediaCodecList(0).getCodecInfos();
        int i4 = arrayOfMediaCodecInfo.length;
        int i5 = 0;
        if (i5 < i4)
        {
          MediaCodecInfo localMediaCodecInfo = arrayOfMediaCodecInfo[i5];
          Logger localLogger5 = a;
          Level localLevel5 = asn.d;
          String str8 = String.valueOf(localMediaCodecInfo.getName());
          if (str8.length() != 0);
          for (String str9 = "Available codecs: ".concat(str8); ; str9 = new String("Available codecs: "))
          {
            localLogger5.log(localLevel5, str9);
            i5++;
            break;
          }
        }
      }
      else
      {
        int i3 = 0;
        if (i3 < MediaCodecList.getCodecCount())
        {
          Logger localLogger4 = a;
          Level localLevel4 = asn.d;
          String str6 = String.valueOf(MediaCodecList.getCodecInfoAt(i3).getName());
          if (str6.length() != 0);
          for (String str7 = "Available codecs: ".concat(str6); ; str7 = new String("Available codecs: "))
          {
            localLogger4.log(localLevel4, str7);
            i3++;
            break;
          }
        }
      }
    String str1 = d();
    MediaCodec localMediaCodec;
    if (str1 == null)
    {
      a.log(asn.a, "Failed to find a decoder supporting video/avc");
      localMediaCodec = null;
    }
    while (true)
    {
      return localMediaCodec;
      try
      {
        localMediaCodec = MediaCodec.createByCodecName(str1);
        if ((!a.isLoggable(asn.d)) || (localMediaCodec == null))
          continue;
        Logger localLogger2 = a;
        Level localLevel2 = asn.d;
        String str4 = String.valueOf(str1);
        if (str4.length() != 0);
        for (String str5 = "Codec created with decoder name: ".concat(str4); ; str5 = new String("Codec created with decoder name: "))
        {
          localLogger2.log(localLevel2, str5);
          MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = localMediaCodec.getCodecInfo().getCapabilitiesForType("video/avc").profileLevels;
          int i2 = arrayOfCodecProfileLevel.length;
          while (i1 < i2)
          {
            MediaCodecInfo.CodecProfileLevel localCodecProfileLevel = arrayOfCodecProfileLevel[i1];
            Logger localLogger3 = a;
            Level localLevel3 = asn.d;
            Locale localLocale = Locale.US;
            Object[] arrayOfObject = new Object[2];
            arrayOfObject[0] = Integer.valueOf(localCodecProfileLevel.profile);
            arrayOfObject[1] = Integer.valueOf(localCodecProfileLevel.level);
            localLogger3.log(localLevel3, String.format(localLocale, "Codec profile %d, level %d", arrayOfObject));
            i1++;
          }
        }
      }
      catch (IOException localIOException)
      {
        Logger localLogger1 = a;
        Level localLevel1 = asn.a;
        String str2 = String.valueOf(str1);
        if (str2.length() != 0);
        for (String str3 = "Failed to create decoder ".concat(str2); ; str3 = new String("Failed to create decoder "))
        {
          localLogger1.log(localLevel1, str3, localIOException);
          return null;
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        label407: break label407;
      }
    }
  }

  private static String d()
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      MediaFormat localMediaFormat = MediaFormat.createVideoFormat("video/avc", 1024, 1024);
      return new MediaCodecList(0).findDecoderForFormat(localMediaFormat);
    }
    for (int i1 = 0; i1 < MediaCodecList.getCodecCount(); i1++)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i1);
      if (((localMediaCodecInfo.getName().equals("OMX.google.h264.decoder")) && (!Build.FINGERPRINT.startsWith("generic"))) || (localMediaCodecInfo.isEncoder()))
        continue;
      String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
      int i2 = arrayOfString.length;
      for (int i3 = 0; i3 < i2; i3++)
        if (arrayOfString[i3].equalsIgnoreCase("video/avc"))
          return localMediaCodecInfo.getName();
    }
    return null;
  }

  public final avm a(ByteBuffer paramByteBuffer, avl paramavl)
  {
    monitorenter;
    if (paramavl != null);
    while (true)
    {
      try
      {
        if (paramavl.b == 0)
          continue;
        int i1 = 1;
        if (i1 == 0)
          continue;
        long l1 = 1000000L * (0xFFFFFFFF & paramavl.b) + this.s;
        this.x.set(this.x.get() + paramByteBuffer.remaining());
        AtomicInteger localAtomicInteger = this.y;
        int i2 = 0;
        if (paramavl == null)
          continue;
        i2 = paramavl.a;
        localAtomicInteger.set(i2);
        this.z.incrementAndGet();
        this.A.set((int)((System.nanoTime() - l1) / 1000000L));
        if ((paramavl == null) || (!paramavl.c))
          continue;
        this.k.set(l1);
        try
        {
          int i3 = this.c.dequeueInputBuffer(1000000L);
          if (i3 >= 0)
          {
            this.h[i3].rewind();
            int i4 = paramByteBuffer.remaining();
            if (i4 > this.h[i3].remaining())
              continue;
            this.h[i3].put(paramByteBuffer);
            long l3 = l1 / 1000L;
            this.m.incrementAndGet();
            this.c.queueInputBuffer(i3, 0, i4, l3, 0);
            this.B.set((int)((System.nanoTime() - l1) / 1000000L));
            if (!a.isLoggable(asn.d))
              continue;
            long l2 = System.currentTimeMillis();
            if (l2 - this.t < 2000L)
              continue;
            float f1 = 8.0F * (float)(this.x.get() - this.u) / (float)(l2 - this.t);
            float f2 = 1000.0F * (this.n.get() - this.v) / (float)(l2 - this.t);
            float f3 = 1000.0F * (this.o.get() - this.w) / (float)(l2 - this.t);
            Logger localLogger2 = a;
            Level localLevel2 = asn.d;
            Locale localLocale2 = Locale.US;
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = Float.valueOf(f1);
            localLogger2.log(localLevel2, String.format(localLocale2, "Bitrate: %.2f Kbps.", arrayOfObject2));
            Logger localLogger3 = a;
            Level localLevel3 = asn.d;
            Locale localLocale3 = Locale.US;
            Object[] arrayOfObject3 = new Object[2];
            arrayOfObject3[0] = Float.valueOf(f2);
            arrayOfObject3[1] = Float.valueOf(f3);
            localLogger3.log(localLevel3, String.format(localLocale3, "Decoding/rendering framerate: %.2f/%.2f fps.", arrayOfObject3));
            this.u = this.x.get();
            this.v = this.n.get();
            this.w = this.o.get();
            this.t = l2;
            avm localavm = new avm();
            localavm.a = this.y.get();
            localavm.b = this.z.get();
            localavm.c = this.m.get();
            localavm.d = this.n.get();
            localavm.e = this.o.get();
            if (i1 == 0)
              continue;
            localavm.f = this.A.get();
            localavm.g = this.B.get();
            localavm.h = this.p.get();
            localavm.i = this.q.get();
            monitorexit;
            return localavm;
            i1 = 0;
            continue;
            long l4 = System.nanoTime();
            l1 = l4;
            continue;
            Logger localLogger1 = a;
            Level localLevel1 = asn.a;
            Locale localLocale1 = Locale.US;
            Object[] arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = Integer.valueOf(paramByteBuffer.remaining());
            arrayOfObject1[1] = Integer.valueOf(this.h[i3].remaining());
            localLogger1.log(localLevel1, String.format(localLocale1, "Encoded frame length (%d) larger than input buffer length (%d)", arrayOfObject1));
            continue;
          }
        }
        catch (IllegalStateException localIllegalStateException)
        {
          a.log(asn.a, "dequeueInputBuffer failed");
          throw new IOException(localIllegalStateException);
        }
      }
      finally
      {
        monitorexit;
      }
      a.log(asn.a, "dequeueInputBuffer timed out");
    }
  }

  // ERROR //
  final void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 73	ate:j	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   6: iconst_1
    //   7: invokevirtual 406	java/util/concurrent/atomic/AtomicBoolean:getAndSet	(Z)Z
    //   10: ifne +52 -> 62
    //   13: aload_0
    //   14: getfield 408	ate:i	Ljava/util/concurrent/Future;
    //   17: iconst_1
    //   18: invokeinterface 413 2 0
    //   23: pop
    //   24: getstatic 59	ate:a	Ljava/util/logging/Logger;
    //   27: getstatic 146	asn:d	Ljava/util/logging/Level;
    //   30: ldc_w 415
    //   33: invokevirtual 186	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   36: aload_0
    //   37: getfield 112	ate:c	Landroid/media/MediaCodec;
    //   40: invokevirtual 418	android/media/MediaCodec:stop	()V
    //   43: aload_0
    //   44: getfield 112	ate:c	Landroid/media/MediaCodec;
    //   47: invokevirtual 137	android/media/MediaCodec:release	()V
    //   50: getstatic 59	ate:a	Ljava/util/logging/Logger;
    //   53: getstatic 146	asn:d	Ljava/util/logging/Level;
    //   56: ldc_w 420
    //   59: invokevirtual 186	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   62: aload_0
    //   63: monitorexit
    //   64: return
    //   65: astore_1
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_1
    //   69: athrow
    //   70: astore_3
    //   71: goto -28 -> 43
    //
    // Exception table:
    //   from	to	target	type
    //   2	36	65	finally
    //   36	43	65	finally
    //   43	62	65	finally
    //   36	43	70	java/lang/IllegalStateException
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ate
 * JD-Core Version:    0.6.0
 */