import android.content.ContentResolver;
import android.os.Handler;
import android.os.Looper;

final class asf extends Thread
{
  asf(String paramString, ContentResolver paramContentResolver)
  {
    super(paramString);
  }

  public final void run()
  {
    Looper.prepare();
    this.a.registerContentObserver(ase.a, true, new asg(this, new Handler(Looper.myLooper())));
    Looper.loop();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     asf
 * JD-Core Version:    0.6.0
 */