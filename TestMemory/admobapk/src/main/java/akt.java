import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class akt
  implements Handler.Callback
{
  static final Object a = new Object();
  int b;
  private akv c;

  public static akt a()
  {
    synchronized (a)
    {
      return null;
    }
  }

  final boolean a(ConnectionResult paramConnectionResult, int paramInt)
  {
    if ((paramConnectionResult.a()) || (null.a(paramConnectionResult.c)))
    {
      null.a(null, paramConnectionResult, paramInt);
      return true;
    }
    return false;
  }

  public final void b()
  {
    null.sendMessage(null.obtainMessage(3));
  }

  public final void b(ConnectionResult paramConnectionResult, int paramInt)
  {
    if (!a(paramConnectionResult, paramInt))
      null.sendMessage(null.obtainMessage(5, paramInt, 0));
  }

  public final boolean handleMessage(Message paramMessage)
  {
    ajf localajf;
    ajc localajc;
    akw localakw7;
    switch (paramMessage.what)
    {
    default:
      int m = paramMessage.what;
      Log.w("GoogleApiManager", 31 + "Unknown message id: " + m);
      return false;
    case 1:
      localajf = (ajf)paramMessage.obj;
      Iterator localIterator3 = null.keySet().iterator();
      if (!localIterator3.hasNext())
        break;
      localajc = (ajc)localIterator3.next();
      localakw7 = (akw)null.get(localajc);
      if (localakw7 == null)
        localajf.c();
    case 6:
    case 3:
    case 2:
    case 7:
    case 4:
    case 5:
    case 8:
    case 9:
    case 10:
    }
    while (true)
    {
      return true;
      if (localakw7.b.e())
      {
        localajf.a(localajc, ConnectionResult.a);
        break;
      }
      if (localakw7.h != null)
      {
        localajf.a(localajc, localakw7.h);
        break;
      }
      localakw7.e.add(localajf);
      break;
      ain localain = (ain)paramMessage.obj;
      int k = paramMessage.arg1;
      if (!null.containsKey(null))
        null.put(null, new akw(this, localain));
      akw localakw6 = (akw)null.get(null);
      SparseArray localSparseArray = localakw6.d;
      localSparseArray.put(k, new alm(null.b(), localakw6.b));
      null.put(k, localakw6);
      localakw6.d();
      null.put(k, new aku(this, localain, k, null));
      if ((this.c != null) && (this.c.a.get()))
        continue;
      this.c = new akv(null, null);
      this.c.start();
      continue;
      Iterator localIterator2 = null.values().iterator();
      while (localIterator2.hasNext())
      {
        akw localakw5 = (akw)localIterator2.next();
        localakw5.h = null;
        localakw5.d();
      }
      int i = paramMessage.arg1;
      int j;
      if (paramMessage.arg2 == 1)
        j = 1;
      while (true)
        while (true)
        {
          akw localakw4 = (akw)null.get(i);
          if (localakw4 != null)
          {
            if (j == 0)
              null.delete(i);
            Iterator localIterator1 = localakw4.a.iterator();
            while (true)
              if (localIterator1.hasNext())
              {
                ajb localajb2 = (ajb)localIterator1.next();
                if ((i != 0) || (!localajb2.a()))
                  continue;
                localIterator1.remove();
                continue;
                j = 0;
                break;
              }
            ((alm)localakw4.d.get(i)).a();
            localakw4.f.delete(i);
            if (j != 0)
              break;
            localakw4.d.remove(i);
            null.remove(i);
            if ((localakw4.d.size() != 0) || (!localakw4.a.isEmpty()))
              break;
            localakw4.a();
            localakw4.b.d();
            null.remove(localakw4.c);
            synchronized (a)
            {
              null.remove(localakw4.c);
            }
          }
        }
      Log.wtf("GoogleApiManager", 52 + "onRelease received for unknown instance: " + i, new Exception());
      continue;
      ajb localajb1 = (ajb)paramMessage.obj;
      akw localakw3 = (akw)null.get(0);
      if (localakw3.b.e())
      {
        localakw3.a(localajb1);
        localakw3.b();
        continue;
      }
      localakw3.a.add(localajb1);
      if ((localakw3.h != null) && (localakw3.h.a()))
      {
        localakw3.a(localakw3.h);
        continue;
      }
      localakw3.d();
      continue;
      if (null.get(paramMessage.arg1) == null)
        continue;
      ((akw)null.get(paramMessage.arg1)).a(new Status(17, "Error resolution was canceled by the user."));
      continue;
      if (!null.containsKey(paramMessage.obj))
        continue;
      akw localakw2 = (akw)null.get(paramMessage.obj);
      if (!localakw2.g)
        continue;
      localakw2.d();
      continue;
      if (!null.containsKey(paramMessage.obj))
        continue;
      akw localakw1 = (akw)null.get(paramMessage.obj);
      if (!localakw1.g)
        continue;
      localakw1.a();
      if (null.a(null) == 18);
      for (Status localStatus = new Status(8, "Connection timed out while waiting for Google Play services update to complete."); ; localStatus = new Status(8, "API failed to connect while resuming due to an unknown error."))
      {
        localakw1.a(localStatus);
        localakw1.b.d();
        break;
      }
      if (!null.containsKey(paramMessage.obj))
        continue;
      ((akw)null.get(paramMessage.obj)).c();
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     akt
 * JD-Core Version:    0.6.0
 */