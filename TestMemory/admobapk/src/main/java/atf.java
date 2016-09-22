import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.os.Build.VERSION;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

final class atf
  implements Runnable
{
  atf(ate paramate)
  {
  }

  public final void run()
  {
    while (true)
    {
      int i;
      try
      {
        if ((!this.a.j.get()) && (!Thread.interrupted()))
        {
          i = this.a.c.dequeueOutputBuffer(this.a.g, 200000L);
          if (i < 0)
            break label316;
          long l = 1000L * this.a.g.presentationTimeUs;
          this.a.n.incrementAndGet();
          this.a.p.set((int)((System.nanoTime() - l) / 1000000L));
          if (this.a.m.get() - this.a.n.get() <= this.a.e + this.a.f)
            break label252;
          j = 1;
          if (j == 0)
            break label258;
          this.a.c.releaseOutputBuffer(i, false);
          if (j != 0)
            break label302;
          this.a.o.incrementAndGet();
          this.a.q.set((int)((System.nanoTime() - l) / 1000000L));
          if ((this.a.l == null) || (l != this.a.k.get()))
            continue;
          this.a.l.a();
          continue;
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        if (!this.a.j.get())
          ate.a.log(asn.a, "dequeueOutputBuffer failed", localIllegalStateException);
      }
      return;
      label252: int j = 0;
      continue;
      label258: if (Build.VERSION.SDK_INT <= 22)
      {
        this.a.c.releaseOutputBuffer(i, true);
        continue;
      }
      this.a.c.releaseOutputBuffer(i, System.nanoTime() - 1000000000L);
      continue;
      label302: this.a.q.set(0);
      continue;
      label316: if (i == -1)
      {
        ate.a.log(asn.d, "MediaCodec.INFO_TRY_AGAIN_LATER");
        continue;
      }
      if (i == -3)
      {
        ate.a.log(asn.d, "MediaCodec.INFO_OUTPUT_BUFFERS_CHANGED");
        continue;
      }
      if (i == -2)
      {
        Logger localLogger = ate.a;
        Level localLevel = asn.d;
        String str = String.valueOf(this.a.c.getOutputFormat());
        localLogger.log(localLevel, 41 + String.valueOf(str).length() + "MediaCodec.INFO_OUTPUT_FORMAT_CHANGED to " + str);
        continue;
      }
      ate.a.log(asn.a, 64 + "Unknown output from MediaCodec.dequeueOutputBuffer() " + i);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     atf
 * JD-Core Version:    0.6.0
 */