import android.media.AudioTrack;
import com.google.android.libraries.appstreaming.framework.NativeAudioPlayer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class asu
{
  static final Logger a = aso.a("AppStreamingFragment", "AudioPlayer");
  final auz b;
  public final ast c;
  AtomicBoolean d = new AtomicBoolean(true);
  public boolean e;
  public final asw f;
  public final asy g = new asy(this);
  private final ExecutorCompletionService h;
  private asx i;
  private asv j;
  private Future k;
  private Future l;

  asu(asw paramasw, Executor paramExecutor, auz paramauz)
  {
    this.f = paramasw;
    this.h = new ExecutorCompletionService(paramExecutor);
    this.b = paramauz;
    aug localaug = paramauz.f;
    a.log(asn.d, "Audio parameters:");
    Logger localLogger1 = a;
    Level localLevel1 = asn.d;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(localaug.a);
    arrayOfObject1[1] = Integer.valueOf(localaug.b);
    localLogger1.log(localLevel1, String.format("codec = %d, num channels = %d", arrayOfObject1));
    Logger localLogger2 = a;
    Level localLevel2 = asn.d;
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Integer.valueOf(localaug.c);
    arrayOfObject2[1] = Integer.valueOf(localaug.d);
    localLogger2.log(localLevel2, String.format("codec sample rate = %d, player sample rate = %d", arrayOfObject2));
    Logger localLogger3 = a;
    Level localLevel3 = asn.d;
    Object[] arrayOfObject3 = new Object[1];
    arrayOfObject3[0] = Integer.valueOf(localaug.e);
    localLogger3.log(localLevel3, String.format("codec frame size = %d", arrayOfObject3));
    Logger localLogger4 = a;
    Level localLevel4 = asn.d;
    Object[] arrayOfObject4 = new Object[2];
    arrayOfObject4[0] = Integer.valueOf(localaug.f);
    arrayOfObject4[1] = Integer.valueOf(localaug.g);
    localLogger4.log(localLevel4, String.format("player repeat size = %d, player buffer size = %d", arrayOfObject4));
    if (localaug.a != 2)
    {
      Logger localLogger5 = a;
      Level localLevel5 = asn.b;
      int m = localaug.a;
      localLogger5.log(localLevel5, 35 + "Unsupported audio codec " + m);
      a.log(asn.b, "Use OPUS instead.");
      localaug.a = 2;
    }
    if (localaug.f == 0)
    {
      a.log(asn.b, "Set player repeat size to default 60");
      localaug.f = 60;
    }
    if (localaug.g == 0)
    {
      a.log(asn.b, "Set player buffer size to default 2880");
      localaug.g = 2880;
    }
    this.c = new ast(localaug.g, localaug.b);
  }

  protected static AudioTrack a(int paramInt1, int paramInt2, int paramInt3)
  {
    return new AudioTrack(3, paramInt1, paramInt2, 2, paramInt3, 1);
  }

  private static void a(Future paramFuture)
  {
    try
    {
      paramFuture.get();
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      a.log(asn.a, "Exception thrown while waiting for task completion: ", localExecutionException);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      a.log(asn.b, "Interrupted while waiting for task completion: ", localInterruptedException);
    }
  }

  final void a()
  {
    if (this.d.getAndSet(false))
    {
      this.i = new asx(this);
      this.k = this.h.submit(this.i, null);
      a.log(asn.d, "Native video player runnable submitted.");
      this.j = new asv(this);
      this.l = this.h.submit(this.j, null);
      a.log(asn.d, "Audio track runnable submitted.");
    }
  }

  final void b()
  {
    if (!this.d.getAndSet(true))
    {
      a.log(asn.d, "Waiting for audio track runnable to finish.");
      a(this.l);
      a.log(asn.d, "Audio track runnable finished.");
      this.i.a.stop();
      a.log(asn.d, "Waiting for native audio player runnable to finish.");
      a(this.k);
      a.log(asn.d, "Native audio player runnable finished.");
      this.c.a();
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     asu
 * JD-Core Version:    0.6.0
 */