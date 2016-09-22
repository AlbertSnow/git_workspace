import android.os.Handler;
import com.google.android.libraries.appstreaming.framework.NativeControlStreamer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

final class ats
  implements atc, Callable
{
  private BlockingQueue a = new ArrayBlockingQueue(1);

  ats(atj paramatj)
  {
  }

  private atq c()
  {
    if (this.b.p == null)
      this.b.p = new asz(this, this.b.o, this.b.e, this.b.d);
    try
    {
      asz localasz = this.b.p;
      if (localasz.c.a.connect())
      {
        localasz.d.post(new ata(localasz));
        localasz.e = false;
        localasz.a.a();
      }
      while (true)
      {
        return (atq)this.a.take();
        localasz.a.b();
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      atj.a.log(asn.a, "Control manager startup interrupted");
    }
    return new atq(100);
  }

  public final void a()
  {
    atj.a.log(asn.d, "Control manager started");
    this.a.offer(new atq());
  }

  public final void b()
  {
    atj.a.log(asn.a, "Control manager onStartFailure");
    this.a.offer(new atq(105));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ats
 * JD-Core Version:    0.6.0
 */