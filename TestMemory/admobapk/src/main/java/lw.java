import android.os.HandlerThread;
import android.os.Process;

public final class lw extends HandlerThread
{
  private final int a = -16;

  public lw(String paramString, int paramInt)
  {
    super(paramString);
  }

  public final void run()
  {
    Process.setThreadPriority(this.a);
    super.run();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     lw
 * JD-Core Version:    0.6.0
 */