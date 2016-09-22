import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
final class lj extends Handler
  implements Runnable
{
  final lk a;
  volatile Thread b;
  private final li c;
  private final int d;

  public lj(lh paramlh, Looper paramLooper, lk paramlk, li paramli, int paramInt)
  {
    super(paramLooper);
    this.a = paramlk;
    this.c = paramli;
    this.d = paramInt;
  }

  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 2)
      throw ((Error)paramMessage.obj);
    this.e.c = false;
    this.e.b = null;
    if (this.a.b())
    {
      this.c.g();
      return;
    }
    switch (paramMessage.what)
    {
    default:
      return;
    case 0:
      this.c.f();
      return;
    case 1:
    }
    this.c.a((IOException)paramMessage.obj);
  }

  public final void run()
  {
    try
    {
      this.b = Thread.currentThread();
      if (this.d > 0)
        Thread.sleep(this.d);
      if (!this.a.b())
        this.a.c();
      sendEmptyMessage(0);
      return;
    }
    catch (IOException localIOException)
    {
      obtainMessage(1, localIOException).sendToTarget();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      lp.b(this.a.b());
      sendEmptyMessage(0);
      return;
    }
    catch (Exception localException)
    {
      Log.e("LoadTask", "Unexpected exception loading stream", localException);
      obtainMessage(1, new ll(localException)).sendToTarget();
      return;
    }
    catch (Error localError)
    {
      Log.e("LoadTask", "Unexpected error loading stream", localError);
      obtainMessage(2, localError).sendToTarget();
    }
    throw localError;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     lj
 * JD-Core Version:    0.6.0
 */