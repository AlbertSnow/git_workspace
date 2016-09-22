import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class ey
{
  final Map a = new HashMap();
  final Set b = new HashSet();
  final PriorityBlockingQueue c = new PriorityBlockingQueue();
  List d = new ArrayList();
  private AtomicInteger e = new AtomicInteger();
  private final PriorityBlockingQueue f = new PriorityBlockingQueue();
  private final ei g;
  private final eq h;
  private final fc i;
  private er[] j;
  private ek k;

  public ey(ei paramei, eq parameq)
  {
    this(paramei, parameq, 4);
  }

  private ey(ei paramei, eq parameq, int paramInt)
  {
    this(paramei, parameq, 4, new en(new Handler(Looper.getMainLooper())));
  }

  private ey(ei paramei, eq parameq, int paramInt, fc paramfc)
  {
    this.g = paramei;
    this.h = parameq;
    this.j = new er[paramInt];
    this.i = paramfc;
  }

  public final ev a(ev paramev)
  {
    paramev.g = this;
    synchronized (this.b)
    {
      this.b.add(paramev);
      paramev.f = Integer.valueOf(this.e.incrementAndGet());
      paramev.a("add-to-queue");
      if (!paramev.h)
      {
        this.f.add(paramev);
        return paramev;
      }
    }
    while (true)
    {
      String str;
      synchronized (this.a)
      {
        str = paramev.c;
        if (this.a.containsKey(str))
        {
          Object localObject3 = (Queue)this.a.get(str);
          if (localObject3 != null)
            continue;
          localObject3 = new LinkedList();
          ((Queue)localObject3).add(paramev);
          this.a.put(str, localObject3);
          if (!fh.b)
            continue;
          fh.a("Request for cacheKey=%s is in flight, putting on hold.", new Object[] { str });
          return paramev;
        }
      }
      this.a.put(str, null);
      this.c.add(paramev);
    }
  }

  public final void a()
  {
    int m = 0;
    if (this.k != null)
    {
      ek localek = this.k;
      localek.b = true;
      localek.interrupt();
    }
    for (int n = 0; n < this.j.length; n++)
    {
      if (this.j[n] == null)
        continue;
      er localer2 = this.j[n];
      localer2.a = true;
      localer2.interrupt();
    }
    this.k = new ek(this.c, this.f, this.g, this.i);
    this.k.start();
    while (m < this.j.length)
    {
      er localer1 = new er(this.f, this.h, this.g, this.i);
      this.j[m] = localer1;
      localer1.start();
      m++;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ey
 * JD-Core Version:    0.6.0
 */