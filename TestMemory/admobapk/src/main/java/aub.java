import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.libraries.appstreaming.framework.NativeVideoPlayer;
import java.util.concurrent.CompletionService;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class aub
{
  static final Logger a = aso.a("AppStreamingFragment", "VideoPlayer");
  final CompletionService b;
  final ate c;
  final NativeVideoPlayer d;
  Future e;
  boolean f;
  public final aud g;
  private auf h = new auf(this);

  aub(aud paramaud, Executor paramExecutor, SurfaceView paramSurfaceView, auz paramauz)
  {
    this.b = new ExecutorCompletionService(paramExecutor);
    this.g = paramaud;
    CompletionService localCompletionService = this.b;
    avk localavk = paramauz.e;
    long l = paramauz.i;
    aue localaue = new aue(this);
    ate localate = new ate(localCompletionService, ate.b(), paramSurfaceView, l, localaue);
    if (localavk.e == 0);
    for (int i = 1; ; i = localavk.e)
    {
      int j = localavk.a;
      int k = localavk.b;
      ate.a.log(asn.d, "MediaCodecRenderer configuration:");
      ate.a.log(asn.d, 37 + "width " + j + ", height " + k);
      ate.a.log(asn.d, 37 + "target jitter buffer size " + i);
      localate.f = i;
      MediaFormat localMediaFormat = MediaFormat.createVideoFormat("video/avc", j, k);
      Logger localLogger = ate.a;
      Level localLevel = asn.d;
      String str = String.valueOf(localMediaFormat);
      localLogger.log(localLevel, 20 + String.valueOf(str).length() + "MediaFormat created:" + str);
      localate.c.configure(localMediaFormat, localate.d.getHolder().getSurface(), null, 0);
      localate.c.setVideoScalingMode(1);
      localate.c.start();
      localate.h = localate.c.getInputBuffers();
      localate.i = localate.b.submit(localate.r, null);
      ate.a.log(asn.d, "Decoder runnable submitted");
      this.c = localate;
      this.d = new NativeVideoPlayer(paramauz.e, paramauz.a, paramauz.b, paramauz.c, paramauz.d, this.h);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aub
 * JD-Core Version:    0.6.0
 */