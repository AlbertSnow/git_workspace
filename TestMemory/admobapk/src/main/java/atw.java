import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.logging.Logger;

final class atw
  implements aud, Callable
{
  private BlockingQueue a = new ArrayBlockingQueue(1);

  atw(atj paramatj)
  {
  }

  private atq c()
  {
    if (this.b.q == null)
      this.b.q = new aub(this, this.b.k, this.b.o, this.b.d);
    aub localaub = this.b.q;
    localaub.e = localaub.b.submit(new auc(localaub), null);
    try
    {
      atq localatq = (atq)this.a.take();
      return localatq;
    }
    catch (InterruptedException localInterruptedException)
    {
      atj.a.log(asn.a, "Video player startup interrupted");
    }
    return new atq(100);
  }

  public final void a()
  {
    atj.a.log(asn.d, "Video player started");
    this.a.offer(new atq());
  }

  public final void a(int paramInt)
  {
    atj.a.log(asn.a, 50 + "Video player onStartFailure with error " + paramInt);
    this.a.offer(new atq(paramInt));
  }

  public final void b()
  {
    long l = this.b.p.a();
    if (l != 0L)
      atj.a.log(asn.d, 45 + "Video beacon latency " + l + " ms.");
  }

  public final void b(int paramInt)
  {
    atj.a.log(asn.a, 52 + "Video player onStreamingError with error " + paramInt);
    this.b.a(paramInt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     atw
 * JD-Core Version:    0.6.0
 */