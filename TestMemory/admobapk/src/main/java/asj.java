import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class asj
{
  public ExecutorCompletionService a;
  public Future b;
  public Future c;
  public String d;
  public int e;
  public int f;
  asm g;
  public AtomicBoolean h;
  public Socket i;
  public InputStream j;
  public OutputStream k;
  ArrayBlockingQueue l;
  ByteBuffer m;
  final AtomicInteger n;

  public asj(Executor paramExecutor, String paramString, int paramInt1, int paramInt2, asm paramasm)
  {
    anw.a(paramasm, "listener can not be null");
    anw.a(paramExecutor, "executor can not be null");
    boolean bool2;
    if (paramString.length() > 0)
    {
      bool2 = bool1;
      anw.b(bool2, "invalid host");
      if (paramInt1 <= 0)
        break label139;
    }
    while (true)
    {
      anw.b(bool1, "invalid port");
      this.a = new ExecutorCompletionService(paramExecutor);
      this.d = paramString;
      this.e = paramInt1;
      this.f = paramInt2;
      this.g = paramasm;
      this.h = new AtomicBoolean(false);
      this.n = new AtomicInteger(0);
      this.l = new ArrayBlockingQueue(10);
      this.m = ByteBuffer.allocate(1460);
      return;
      bool2 = false;
      break;
      label139: bool1 = false;
    }
  }

  public Socket a()
  {
    return new Socket(this.d, this.e);
  }

  final void a(int paramInt)
  {
    if (!this.h.getAndSet(true));
    try
    {
      this.i.close();
      this.g.a(paramInt);
      return;
    }
    catch (IOException localIOException)
    {
      this.g.a(paramInt);
    }
  }

  public final boolean a(long paramLong)
  {
    int i1 = 1;
    synchronized (this.n)
    {
      if (this.n.get() == 0)
        return i1;
    }
    while (true)
    {
      try
      {
        this.n.wait(250L);
        if (this.n.get() == 0)
        {
          monitorexit;
          return i1;
          localObject = finally;
          monitorexit;
          throw localObject;
        }
      }
      catch (Exception localException)
      {
        monitorexit;
        return false;
      }
      i1 = 0;
    }
  }

  public final boolean a(avf paramavf)
  {
    synchronized (this.n)
    {
      if (this.l.offer(paramavf))
      {
        this.n.incrementAndGet();
        return true;
      }
      return false;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     asj
 * JD-Core Version:    0.6.0
 */