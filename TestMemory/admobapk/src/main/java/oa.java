import android.os.Process;

final class oa
  implements Runnable
{
  oa(nz paramnz, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    Process.setThreadPriority(10);
    this.a.run();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     oa
 * JD-Core Version:    0.6.0
 */