import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class fi
{
  public static final boolean a = fh.b;
  private final List b = new ArrayList();
  private boolean c = false;

  public final void a(String paramString)
  {
    monitorenter;
    try
    {
      this.c = true;
      int i = this.b.size();
      long l2;
      if (i == 0)
      {
        l2 = 0L;
        if (l2 > 0L)
          break label86;
      }
      while (true)
      {
        return;
        long l1 = ((fj)this.b.get(0)).c;
        l2 = ((fj)this.b.get(-1 + this.b.size())).c - l1;
        break;
        label86: long l3 = ((fj)this.b.get(0)).c;
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Long.valueOf(l2);
        arrayOfObject1[1] = paramString;
        fh.b("(%-4d ms) %s", arrayOfObject1);
        Iterator localIterator = this.b.iterator();
        long l4 = l3;
        while (localIterator.hasNext())
        {
          fj localfj = (fj)localIterator.next();
          long l5 = localfj.c;
          Object[] arrayOfObject2 = new Object[3];
          arrayOfObject2[0] = Long.valueOf(l5 - l4);
          arrayOfObject2[1] = Long.valueOf(localfj.b);
          arrayOfObject2[2] = localfj.a;
          fh.b("(+%-4d) [%2d] %s", arrayOfObject2);
          l4 = l5;
        }
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void a(String paramString, long paramLong)
  {
    monitorenter;
    try
    {
      if (this.c)
        throw new IllegalStateException("Marker added to finished log");
    }
    finally
    {
      monitorexit;
    }
    this.b.add(new fj(paramString, paramLong, SystemClock.elapsedRealtime()));
    monitorexit;
  }

  protected final void finalize()
  {
    if (!this.c)
    {
      a("Request on the loose");
      fh.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     fi
 * JD-Core Version:    0.6.0
 */