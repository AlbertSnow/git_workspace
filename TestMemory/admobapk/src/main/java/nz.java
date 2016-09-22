import java.util.concurrent.ThreadFactory;

final class nz
  implements ThreadFactory
{
  nz(nx paramnx)
  {
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    return new Thread(new oa(this, paramRunnable), "ClearcutLoggerApiImpl");
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     nz
 * JD-Core Version:    0.6.0
 */