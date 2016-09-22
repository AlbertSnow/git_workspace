import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class aot
  implements ThreadFactory
{
  private final String a;
  private final int b;
  private final AtomicInteger c = new AtomicInteger();
  private final ThreadFactory d = Executors.defaultThreadFactory();

  public aot(String paramString)
  {
    this(paramString, 0);
  }

  private aot(String paramString, int paramInt)
  {
    this.a = ((String)anw.a(paramString, "Name must not be null"));
    this.b = 0;
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = this.d.newThread(new aou(paramRunnable, this.b));
    String str = this.a;
    int i = this.c.getAndIncrement();
    localThread.setName(13 + String.valueOf(str).length() + str + "[" + i + "]");
    return localThread;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aot
 * JD-Core Version:    0.6.0
 */