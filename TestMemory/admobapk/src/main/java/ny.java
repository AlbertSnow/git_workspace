import android.util.Log;

final class ny
  implements Runnable
{
  ny(nx paramnx)
  {
  }

  public final void run()
  {
    synchronized (this.a.c)
    {
      if ((0L <= this.a.b.b()) && (this.a.d != null))
      {
        Log.i("ClearcutLoggerApiImpl", "disconnect managed GoogleApiClient");
        this.a.d.c();
        this.a.d = null;
      }
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ny
 * JD-Core Version:    0.6.0
 */