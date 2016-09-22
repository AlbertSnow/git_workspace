import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.HashMap;
import java.util.Set;

final class amw extends amv
  implements Handler.Callback
{
  final HashMap a = new HashMap();
  final Context b;
  final aof c;
  private final Handler d;
  private final long e;

  amw(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
    this.d = new Handler(paramContext.getMainLooper(), this);
    this.c = aof.a();
    this.e = 5000L;
  }

  private final boolean a(amx paramamx, ServiceConnection paramServiceConnection, String paramString)
  {
    anw.a(paramServiceConnection, "ServiceConnection must not be null");
    while (true)
    {
      amy localamy;
      synchronized (this.a)
      {
        localamy = (amy)this.a.get(paramamx);
        if (localamy != null)
          continue;
        localamy = new amy(this, paramamx);
        localamy.a(paramServiceConnection, paramString);
        localamy.a(paramString);
        this.a.put(paramamx, localamy);
        boolean bool = localamy.d;
        return bool;
        this.d.removeMessages(0, localamy);
        if (localamy.a(paramServiceConnection))
        {
          String str = String.valueOf(paramamx);
          throw new IllegalStateException(81 + String.valueOf(str).length() + "Trying to bind a GmsServiceConnection that was already connected before.  config=" + str);
        }
      }
      localamy.a(paramServiceConnection, paramString);
      switch (localamy.c)
      {
      case 1:
        paramServiceConnection.onServiceConnected(localamy.g, localamy.e);
        break;
      case 2:
        localamy.a(paramString);
        continue;
      }
    }
  }

  public final boolean a(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3)
  {
    return a(new amx(paramString1, paramString2), paramServiceConnection, paramString3);
  }

  public final void b(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3)
  {
    amx localamx = new amx(paramString1, paramString2);
    anw.a(paramServiceConnection, "ServiceConnection must not be null");
    amy localamy;
    synchronized (this.a)
    {
      localamy = (amy)this.a.get(localamx);
      if (localamy == null)
      {
        String str1 = String.valueOf(localamx);
        throw new IllegalStateException(50 + String.valueOf(str1).length() + "Nonexistent connection status for service config: " + str1);
      }
    }
    if (!localamy.a(paramServiceConnection))
    {
      String str2 = String.valueOf(localamx);
      throw new IllegalStateException(76 + String.valueOf(str2).length() + "Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + str2);
    }
    localamy.h.c.a(localamy.h.b, aof.a(paramServiceConnection), null, null, 4);
    localamy.b.remove(paramServiceConnection);
    if (localamy.a())
    {
      Message localMessage = this.d.obtainMessage(0, localamy);
      this.d.sendMessageDelayed(localMessage, this.e);
    }
    monitorexit;
  }

  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      return false;
    case 0:
    }
    amy localamy = (amy)paramMessage.obj;
    synchronized (this.a)
    {
      if (localamy.a())
      {
        if (localamy.d)
        {
          localamy.h.c.a(localamy.h.b, localamy.a);
          localamy.d = false;
          localamy.c = 2;
        }
        this.a.remove(localamy.f);
      }
      return true;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     amw
 * JD-Core Version:    0.6.0
 */