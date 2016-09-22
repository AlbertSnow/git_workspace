import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

public final class atk
  implements Runnable
{
  public atk(atj paramatj)
  {
  }

  public final void run()
  {
    Future localFuture = this.a.l.submit(new att(this.a, new atp(this.a), new atv(this.a), new atw(this.a), new atr(this.a), new ats(this.a)));
    try
    {
      atq localatq = (atq)localFuture.get(5000 + atj.b, TimeUnit.MILLISECONDS);
      if (!localatq.a())
        this.a.a(localatq.a);
      return;
    }
    catch (TimeoutException localTimeoutException)
    {
      atj.a.log(asn.a, "Timed out starting a session");
      localFuture.cancel(true);
      this.a.a(101);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      atj.a.log(asn.a, "Failed to start a session", localInterruptedException);
      localFuture.cancel(true);
      this.a.a(100);
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      label154: break label154;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     atk
 * JD-Core Version:    0.6.0
 */