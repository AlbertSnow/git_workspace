import android.os.SystemClock;
import android.util.Log;

public final class aoj
{
  private final long a;
  private final int b;
  private final dh c;

  public aoj()
  {
    this.a = 60000L;
    this.b = 10;
    this.c = new dh(10);
  }

  public aoj(int paramInt, long paramLong)
  {
    this.a = paramLong;
    this.b = 1024;
    this.c = new dh();
  }

  public final Long a(String paramString)
  {
    long l1 = SystemClock.elapsedRealtime();
    long l2 = this.a;
    monitorenter;
    long l3 = l2;
    while (true)
    {
      int i;
      try
      {
        if (this.c.size() < this.b)
          continue;
        i = -1 + this.c.size();
        if (i < 0)
          continue;
        if (l1 - ((Long)this.c.c(i)).longValue() > l3)
        {
          this.c.d(i);
          break label170;
          long l4 = l3 / 2L;
          int j = this.b;
          Log.w("ConnectionTracker", 94 + "The max capacity " + j + " is not enough. Current durationThreshold is: " + l4);
          l3 = l4;
          continue;
          Long localLong = (Long)this.c.put(paramString, Long.valueOf(l1));
          return localLong;
        }
      }
      finally
      {
        monitorexit;
      }
      label170: i--;
    }
  }

  public final boolean b(String paramString)
  {
    monitorenter;
    while (true)
    {
      try
      {
        if (this.c.remove(paramString) != null)
        {
          i = 1;
          return i;
        }
      }
      finally
      {
        monitorexit;
      }
      int i = 0;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aoj
 * JD-Core Version:    0.6.0
 */