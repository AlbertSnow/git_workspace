import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceView;
import java.lang.reflect.Method;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class atj
{
  static final Logger a = aso.a("AppStreamingFragment", "SessionHandler");
  static final int b;
  static final avb[] c;
  public auz d;
  final Handler e;
  public asj f;
  public atz g;
  final atx h;
  public final asq i;
  final Activity j;
  public final Executor k;
  CompletionService l;
  public AtomicBoolean m = new AtomicBoolean();
  public AtomicBoolean n = new AtomicBoolean();
  SurfaceView o;
  asz p;
  aub q;
  asu r;
  boolean s;

  static
  {
    if (Build.FINGERPRINT.startsWith("generic"));
    for (int i1 = 10000; ; i1 = 3000)
    {
      b = i1;
      avb[] arrayOfavb = new avb[2];
      arrayOfavb[0] = new avb();
      arrayOfavb[1] = new avb();
      c = arrayOfavb;
      arrayOfavb[0].a = "control_proto.Event";
      c[1].a = "control_proto.LaunchIntent";
      return;
    }
  }

  public atj(atx paramatx, asq paramasq, Activity paramActivity, SurfaceView paramSurfaceView, Handler paramHandler, Executor paramExecutor, auz paramauz)
  {
    this.h = paramatx;
    this.i = paramasq;
    this.j = paramActivity;
    this.o = paramSurfaceView;
    this.e = paramHandler;
    this.k = paramExecutor;
    this.l = new ExecutorCompletionService(this.k);
    this.d = paramauz;
    if (this.d != null)
    {
      aua localaua1 = new aua();
      localaua1.a = this.d.c;
      aua localaua2 = localaua1.a(this.d.e.a, this.d.e.b);
      localaua2.b = this.d.j;
      this.g = localaua2.a();
    }
  }

  static String a(String paramString)
  {
    try
    {
      String str2 = (String)Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] { String.class }).invoke(null, new Object[] { paramString });
      return str2;
    }
    catch (Exception localException)
    {
      Logger localLogger = a;
      Level localLevel = asn.b;
      String str1 = String.valueOf(localException);
      localLogger.log(localLevel, 40 + String.valueOf(paramString).length() + String.valueOf(str1).length() + "Failed to get android system property " + paramString + ": " + str1);
    }
    return "";
  }

  protected static void d()
  {
    System.loadLibrary("appstreaming_jni");
  }

  public final void a()
  {
    this.s = true;
    if (this.r != null)
      this.r.b();
  }

  public final void a(int paramInt)
  {
    if (this.m.getAndSet(true))
      return;
    this.d = null;
    atl localatl = new atl(this, paramInt);
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      localatl.run();
      return;
    }
    this.e.post(localatl);
  }

  public final void b()
  {
    this.s = false;
    if (this.r != null)
      this.r.a();
  }

  public final void c()
  {
    Future localFuture = this.l.submit(new atn(this));
    try
    {
      localFuture.get(500L, TimeUnit.MILLISECONDS);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      a.log(asn.a, "Error releasing resources", localInterruptedException);
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      break label33;
    }
    catch (TimeoutException localTimeoutException)
    {
      label33: break label33;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     atj
 * JD-Core Version:    0.6.0
 */