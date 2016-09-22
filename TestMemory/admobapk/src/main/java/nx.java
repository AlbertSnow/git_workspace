import com.google.android.gms.clearcut.LogEventParcelable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class nx
  implements nv
{
  static final oi a;
  private static final Object e = new Object();
  private static ScheduledExecutorService f;
  private static final long g;
  final aom b;
  final Object c = new Object();
  aio d = null;
  private long h = 0L;

  static
  {
    a = new oi();
    g = TimeUnit.MILLISECONDS.convert(2L, TimeUnit.MINUTES);
  }

  public nx()
  {
    this(new aon(), g, new oe());
  }

  private nx(aom paramaom, long paramLong, od paramod)
  {
    new ny(this);
    this.b = paramaom;
  }

  private final ScheduledExecutorService a()
  {
    synchronized (e)
    {
      if (f == null)
        f = Executors.newSingleThreadScheduledExecutor(new nz(this));
      return f;
    }
  }

  static void a(LogEventParcelable paramLogEventParcelable)
  {
    if ((paramLogEventParcelable.j != null) && (paramLogEventParcelable.i.e.length == 0))
      paramLogEventParcelable.i.e = paramLogEventParcelable.j.a();
    if ((paramLogEventParcelable.k != null) && (paramLogEventParcelable.i.g.length == 0))
      paramLogEventParcelable.i.g = paramLogEventParcelable.k.a();
    paramLogEventParcelable.c = awb.a(paramLogEventParcelable.i);
  }

  public final ais a(aio paramaio, LogEventParcelable paramLogEventParcelable)
  {
    a.a();
    og localog = new og(paramLogEventParcelable, paramaio);
    localog.a(new oc(this));
    a().execute(new ob(this, paramaio, localog));
    return localog;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     nx
 * JD-Core Version:    0.6.0
 */