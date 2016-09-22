import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

final class akw
  implements aiq, air
{
  final Queue a = new LinkedList();
  final aif b;
  final ajc c;
  final SparseArray d = new SparseArray();
  final Set e = new HashSet();
  final SparseArray f = new SparseArray();
  boolean g;
  ConnectionResult h = null;
  private final aic j;

  public akw(akt paramakt, ain paramain)
  {
    aib localaib = null.a();
    this.b = localaib.a(null, null.getLooper(), amk.a(null), null, this, this);
    if ((this.b instanceof anz));
    for (this.j = ((anz)this.b).l; ; this.j = this.b)
    {
      this.c = null;
      return;
    }
  }

  private final void b(ConnectionResult paramConnectionResult)
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
      ((ajf)localIterator.next()).a(this.c, paramConnectionResult);
    this.e.clear();
  }

  final void a()
  {
    if (this.g)
    {
      null.removeMessages(9, this.c);
      null.removeMessages(8, this.c);
      this.g = false;
    }
  }

  public final void a(int paramInt)
  {
    this.h = null;
    this.g = true;
    Message localMessage1 = Message.obtain(null, 8, this.c);
    null.sendMessageDelayed(localMessage1, 0L);
    Message localMessage2 = Message.obtain(null, 9, this.c);
    null.sendMessageDelayed(localMessage2, 0L);
    this.i.b = -1;
  }

  final void a(ajb paramajb)
  {
    paramajb.a(this.d);
    try
    {
      paramajb.a(this.j);
      return;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      this.b.d();
      a(1);
    }
  }

  public final void a(Bundle paramBundle)
  {
    this.h = null;
    b(ConnectionResult.a);
    a();
    for (int k = 0; k < this.f.size(); k++)
    {
      Iterator localIterator = ((Map)this.f.get(this.f.keyAt(k))).values().iterator();
      while (localIterator.hasNext())
      {
        ajh localajh = (ajh)localIterator.next();
        try
        {
          localajh.b(this.j);
        }
        catch (DeadObjectException localDeadObjectException)
        {
          this.b.d();
          a(1);
        }
      }
    }
    while ((this.b.e()) && (!this.a.isEmpty()))
      a((ajb)this.a.remove());
    b();
  }

  public final void a(ConnectionResult paramConnectionResult)
  {
    this.h = null;
    this.i.b = -1;
    b(paramConnectionResult);
    int k = this.d.keyAt(0);
    if (this.a.isEmpty())
    {
      this.h = paramConnectionResult;
      label44: return;
    }
    synchronized (akt.a)
    {
      if (this.i.a(paramConnectionResult, k))
        break label44;
    }
    if (this.g)
    {
      Message localMessage = Message.obtain(null, 8, this.c);
      null.sendMessageDelayed(localMessage, 0L);
      return;
      localObject2 = finally;
      monitorexit;
      throw localObject2;
    }
    String str = String.valueOf(null.a);
    a(new Status(17, 38 + String.valueOf(str).length() + "API: " + str + " is not available on this device."));
  }

  final void a(Status paramStatus)
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((ajb)localIterator.next()).a(paramStatus);
    this.a.clear();
  }

  final void b()
  {
    null.removeMessages(10, this.c);
    Message localMessage = null.obtainMessage(10, this.c);
    null.sendMessageDelayed(localMessage, 0L);
  }

  final void c()
  {
    if ((this.b.e()) && (this.f.size() == 0));
    label115: for (int k = 0; k < this.d.size(); k++)
    {
      ajh[] arrayOfajh = (ajh[])((alm)this.d.get(this.d.keyAt(k))).b.toArray(alm.a);
      int m = arrayOfajh.length;
      int n = 0;
      if (n < m)
        if (arrayOfajh[n].b());
      for (int i1 = 1; ; i1 = 0)
      {
        if (i1 == 0)
          break label115;
        b();
        return;
        n++;
        break;
      }
    }
    this.b.d();
  }

  final void d()
  {
    if ((this.b.e()) || (this.b.f()))
      return;
    if (this.i.b != 0)
    {
      akt localakt = this.i;
      localakt.b = null.a(null);
      if (this.i.b != 0)
      {
        a(new ConnectionResult(this.i.b, null));
        return;
      }
    }
    this.b.a(new akx(this.i, this.b, this.c));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     akw
 * JD-Core Version:    0.6.0
 */