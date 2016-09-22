import android.os.Message;
import java.util.concurrent.locks.Lock;

abstract class aki
  implements Runnable
{
  aki(ajy paramajy)
  {
  }

  protected abstract void a();

  public void run()
  {
    this.a.b.lock();
    try
    {
      boolean bool = Thread.interrupted();
      if (bool)
        return;
      a();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      akp localakp = this.a.a;
      Message localMessage = localakp.e.obtainMessage(2, localRuntimeException);
      localakp.e.sendMessage(localMessage);
      return;
    }
    finally
    {
      this.a.b.unlock();
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aki
 * JD-Core Version:    0.6.0
 */