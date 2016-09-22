import android.os.Handler;
import java.util.concurrent.Executor;

public final class en
  implements fc
{
  private final Executor a;

  public en(Handler paramHandler)
  {
    this.a = new eo(this, paramHandler);
  }

  public final void a(ev paramev, ez paramez)
  {
    a(paramev, paramez, null);
  }

  public final void a(ev paramev, ez paramez, Runnable paramRunnable)
  {
    paramev.i = true;
    paramev.a("post-response");
    this.a.execute(new ep(this, paramev, paramez, paramRunnable));
  }

  public final void a(ev paramev, fg paramfg)
  {
    paramev.a("post-error");
    ez localez = new ez(paramfg);
    this.a.execute(new ep(this, paramev, localez, null));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     en
 * JD-Core Version:    0.6.0
 */