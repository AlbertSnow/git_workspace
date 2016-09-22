import android.os.Handler;
import java.util.concurrent.Executor;

final class eo
  implements Executor
{
  eo(en paramen, Handler paramHandler)
  {
  }

  public final void execute(Runnable paramRunnable)
  {
    this.a.post(paramRunnable);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     eo
 * JD-Core Version:    0.6.0
 */