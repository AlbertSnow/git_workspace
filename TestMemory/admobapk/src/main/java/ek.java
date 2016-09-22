import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class ek extends Thread
{
  private static final boolean c = fh.b;
  final BlockingQueue a;
  volatile boolean b = false;
  private final BlockingQueue d;
  private final ei e;
  private final fc f;

  public ek(BlockingQueue paramBlockingQueue1, BlockingQueue paramBlockingQueue2, ei paramei, fc paramfc)
  {
    super("VolleyCacheDispatcher");
    this.d = paramBlockingQueue1;
    this.a = paramBlockingQueue2;
    this.e = paramei;
    this.f = paramfc;
  }

  public final void run()
  {
    if (c)
      fh.a("start new dispatcher", new Object[0]);
    Process.setThreadPriority(10);
    this.e.a();
    ev localev;
    ej localej;
    label94: int i;
    label108: ez localez;
    while (true)
    {
      try
      {
        localev = (ev)this.d.take();
        localev.a("cache-queue-take");
        localej = this.e.a(localev.c);
        if (localej != null)
          break label94;
        localev.a("cache-miss");
        this.a.put(localev);
        continue;
      }
      catch (InterruptedException localInterruptedException)
      {
      }
      if (this.b)
      {
        return;
        if (localej.e >= System.currentTimeMillis())
          break;
        i = 1;
        if (i != 0)
        {
          localev.a("cache-hit-expired");
          localev.k = localej;
          this.a.put(localev);
          continue;
        }
        localev.a("cache-hit");
        localez = localev.a(new et(localej.a, localej.g));
        localev.a("cache-hit-parsed");
        if (localej.f >= System.currentTimeMillis())
          break label251;
      }
    }
    label251: for (int j = 1; ; j = 0)
    {
      if (j == 0)
      {
        this.f.a(localev, localez);
        break;
      }
      localev.a("cache-hit-refresh-needed");
      localev.k = localej;
      localez.d = true;
      this.f.a(localev, localez, new el(this, localev));
      break;
      i = 0;
      break label108;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ek
 * JD-Core Version:    0.6.0
 */