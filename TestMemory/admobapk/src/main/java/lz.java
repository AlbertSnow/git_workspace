import java.util.concurrent.ThreadFactory;

final class lz
  implements ThreadFactory
{
  lz(String paramString)
  {
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    return new Thread(paramRunnable, this.a);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     lz
 * JD-Core Version:    0.6.0
 */