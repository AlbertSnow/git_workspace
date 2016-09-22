import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public abstract class ajl extends ais
{
  static final ThreadLocal c = new ajm();
  private ajn a;
  private WeakReference b;
  public final Object d = new Object();
  public final ArrayList e = new ArrayList();
  public aiv f;
  public volatile boolean g;
  private final CountDownLatch h = new CountDownLatch(1);
  private aiw i;
  private boolean j;
  private boolean k;
  private ane l;
  private volatile all m;
  private boolean n = false;

  @Deprecated
  ajl()
  {
    this.a = new ajn(Looper.getMainLooper());
    this.b = new WeakReference(null);
  }

  protected ajl(aio paramaio)
  {
    if (paramaio != null);
    for (Looper localLooper = paramaio.a(); ; localLooper = Looper.getMainLooper())
    {
      this.a = new ajn(localLooper);
      this.b = new WeakReference(paramaio);
      return;
    }
  }

  @Deprecated
  protected ajl(Looper paramLooper)
  {
    this.a = new ajn(paramLooper);
    this.b = new WeakReference(null);
  }

  public static void b(aiv paramaiv)
  {
    if ((paramaiv instanceof aiu));
    try
    {
      ((aiu)paramaiv).b();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      String str = String.valueOf(paramaiv);
      Log.w("BasePendingResult", 18 + String.valueOf(str).length() + "Unable to release " + str, localRuntimeException);
    }
  }

  private final void c(aiv paramaiv)
  {
    this.f = paramaiv;
    this.l = null;
    this.h.countDown();
    this.f.a();
    if (this.j)
      this.i = null;
    while (true)
    {
      Iterator localIterator = this.e.iterator();
      while (localIterator.hasNext())
        ((ait)localIterator.next()).a();
      if (this.i == null)
      {
        if (!(this.f instanceof aiu))
          continue;
        new ajo(this);
        continue;
      }
      this.a.removeMessages(2);
      this.a.a(this.i, g());
    }
    this.e.clear();
  }

  private boolean f()
  {
    synchronized (this.d)
    {
      boolean bool = this.j;
      return bool;
    }
  }

  private final aiv g()
  {
    boolean bool = true;
    synchronized (this.d)
    {
      if (!this.g)
      {
        anw.a(bool, "Result has already been consumed.");
        anw.a(b(), "Result is not ready.");
        aiv localaiv = this.f;
        this.f = null;
        this.i = null;
        this.g = true;
        a();
        return localaiv;
      }
      bool = false;
    }
  }

  public abstract aiv a(Status paramStatus);

  protected void a()
  {
  }

  public final void a(ait paramait)
  {
    if (!this.g);
    for (boolean bool = true; ; bool = false)
    {
      anw.a(bool, "Result has already been consumed.");
      anw.b(true, "Callback cannot be null.");
      synchronized (this.d)
      {
        if (b())
        {
          this.f.a();
          paramait.a();
          return;
        }
        this.e.add(paramait);
      }
    }
  }

  public final void a(aiv paramaiv)
  {
    boolean bool1 = true;
    while (true)
    {
      synchronized (this.d)
      {
        if ((this.k) || (this.j))
          continue;
        if ((!b()) || (!b()))
        {
          bool2 = bool1;
          anw.a(bool2, "Results have already been set");
          if (this.g)
            break label88;
          anw.a(bool1, "Result has already been consumed");
          c(paramaiv);
          return;
          b(paramaiv);
          return;
        }
      }
      boolean bool2 = false;
      continue;
      label88: bool1 = false;
    }
  }

  public final void a(aiw paramaiw)
  {
    boolean bool = true;
    Object localObject1 = this.d;
    monitorenter;
    if (paramaiw == null);
    while (true)
    {
      try
      {
        this.i = null;
        return;
        if (!this.g)
        {
          anw.a(bool, "Result has already been consumed.");
          anw.a(true, "Cannot set callbacks if then() has been called.");
          if (!f())
            break;
          return;
        }
      }
      finally
      {
        monitorexit;
      }
      bool = false;
    }
    if (b())
      this.a.a(paramaiw, g());
    while (true)
    {
      monitorexit;
      return;
      this.i = paramaiw;
    }
  }

  public final boolean b()
  {
    return this.h.getCount() == 0L;
  }

  public final void c()
  {
    synchronized (this.d)
    {
      if ((this.j) || (this.g))
        return;
      b(this.f);
      this.j = true;
      c(a(Status.d));
      return;
    }
  }

  public final void c(Status paramStatus)
  {
    synchronized (this.d)
    {
      if (!b())
      {
        a(a(paramStatus));
        this.k = true;
      }
      return;
    }
  }

  public final boolean d()
  {
    synchronized (this.d)
    {
      if (((aio)this.b.get() == null) || (!this.n))
        c();
      boolean bool = f();
      return bool;
    }
  }

  public final void e()
  {
    if ((this.n) || (((Boolean)c.get()).booleanValue()));
    for (boolean bool = true; ; bool = false)
    {
      this.n = bool;
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ajl
 * JD-Core Version:    0.6.0
 */