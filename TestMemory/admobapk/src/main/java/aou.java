import android.os.Process;

final class aou
  implements Runnable
{
  private final Runnable a;
  private final int b;

  public aou(Runnable paramRunnable, int paramInt)
  {
    this.a = paramRunnable;
    this.b = paramInt;
  }

  public final void run()
  {
    Process.setThreadPriority(this.b);
    this.a.run();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aou
 * JD-Core Version:    0.6.0
 */