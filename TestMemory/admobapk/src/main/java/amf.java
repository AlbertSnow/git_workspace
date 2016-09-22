import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

public final class amf
  implements ServiceConnection
{
  private final int a;

  public amf(alx paramalx, int paramInt)
  {
    this.a = paramInt;
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    anw.a(paramIBinder, "Expecting a valid IBinder");
    synchronized (this.b.e)
    {
      alx localalx = this.b;
      if (paramIBinder == null);
      IInterface localIInterface;
      for (Object localObject3 = null; ; localObject3 = (ank)localIInterface)
      {
        localalx.f = ((ank)localObject3);
        this.b.a(0, null, this.a);
        return;
        localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        if ((localIInterface == null) || (!(localIInterface instanceof ank)))
          break;
      }
      localObject3 = new anm(paramIBinder);
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (this.b.e)
    {
      this.b.f = null;
      this.b.d.sendMessage(this.b.d.obtainMessage(4, this.a, 1));
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     amf
 * JD-Core Version:    0.6.0
 */