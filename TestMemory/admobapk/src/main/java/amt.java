import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class amt
  implements Handler.Callback
{
  public final amu a;
  public final ArrayList b = new ArrayList();
  public final ArrayList c = new ArrayList();
  public final ArrayList d = new ArrayList();
  public volatile boolean e = false;
  public final AtomicInteger f = new AtomicInteger(0);
  public boolean g = false;
  public final Handler h;
  public final Object i = new Object();

  public amt(Looper paramLooper, amu paramamu)
  {
    this.a = paramamu;
    this.h = new Handler(paramLooper, this);
  }

  public final void a()
  {
    this.e = false;
    this.f.incrementAndGet();
  }

  public final void a(air paramair)
  {
    anw.a(paramair);
    synchronized (this.i)
    {
      if (this.d.contains(paramair))
      {
        String str = String.valueOf(paramair);
        Log.w("GmsClientEvents", 67 + String.valueOf(str).length() + "registerConnectionFailedListener(): listener " + str + " is already registered");
        return;
      }
      this.d.add(paramair);
    }
  }

  public final boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
    {
      aiq localaiq = (aiq)paramMessage.obj;
      synchronized (this.i)
      {
        if ((this.e) && (this.a.e()) && (this.b.contains(localaiq)))
          localaiq.a(null);
        return true;
      }
    }
    int j = paramMessage.what;
    Log.wtf("GmsClientEvents", 45 + "Don't know how to handle message: " + j, new Exception());
    return false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     amt
 * JD-Core Version:    0.6.0
 */