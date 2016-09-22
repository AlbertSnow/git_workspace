import android.os.SystemClock;

final class hu
{
  boolean a;
  long b;
  long c;

  static long b(long paramLong)
  {
    return 1000L * SystemClock.elapsedRealtime() - paramLong;
  }

  public final void a()
  {
    if (this.a)
    {
      this.b = b(this.c);
      this.a = false;
    }
  }

  public final void a(long paramLong)
  {
    this.b = paramLong;
    this.c = b(paramLong);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     hu
 * JD-Core Version:    0.6.0
 */