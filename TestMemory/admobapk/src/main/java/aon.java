import android.os.SystemClock;

public final class aon
  implements aom
{
  private static aon a;

  public static aom d()
  {
    monitorenter;
    try
    {
      if (a == null)
        a = new aon();
      aon localaon = a;
      return localaon;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final long a()
  {
    return System.currentTimeMillis();
  }

  public final long b()
  {
    return SystemClock.elapsedRealtime();
  }

  public final long c()
  {
    return System.nanoTime();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aon
 * JD-Core Version:    0.6.0
 */