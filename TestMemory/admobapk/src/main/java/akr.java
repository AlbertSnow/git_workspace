import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

final class akr extends Handler
{
  akr(akp paramakp, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      int i = paramMessage.what;
      Log.w("GACStateManager", 31 + "Unknown message id: " + i);
      return;
    case 1:
      akq localakq = (akq)paramMessage.obj;
      akp localakp = this.a;
      localakp.a.lock();
      try
      {
        ako localako1 = localakp.k;
        ako localako2 = localakq.a;
        if (localako1 != localako2)
          return;
        localakq.a();
        return;
      }
      finally
      {
        localakp.a.unlock();
      }
    case 2:
    }
    throw ((RuntimeException)paramMessage.obj);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     akr
 * JD-Core Version:    0.6.0
 */