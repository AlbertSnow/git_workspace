import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Set;

public final class amz
  implements ServiceConnection
{
  public amz(amy paramamy)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (this.a.h.a)
    {
      this.a.e = paramIBinder;
      this.a.g = paramComponentName;
      Iterator localIterator = this.a.b.iterator();
      if (localIterator.hasNext())
        ((ServiceConnection)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
    }
    this.a.c = 1;
    monitorexit;
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (this.a.h.a)
    {
      this.a.e = null;
      this.a.g = paramComponentName;
      Iterator localIterator = this.a.b.iterator();
      if (localIterator.hasNext())
        ((ServiceConnection)localIterator.next()).onServiceDisconnected(paramComponentName);
    }
    this.a.c = 2;
    monitorexit;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     amz
 * JD-Core Version:    0.6.0
 */