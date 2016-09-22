import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class ajy
  implements ako
{
  final akp a;
  final Lock b;
  final Context c;
  final oy d;
  aro e;
  boolean f;
  boolean g;
  anb h;
  boolean i;
  boolean j;
  final amk k;
  private ConnectionResult l;
  private int m;
  private int n = 0;
  private int o;
  private final Bundle p = new Bundle();
  private final Set q = new HashSet();
  private int r;
  private final Map s;
  private final aib t;
  private ArrayList u = new ArrayList();

  public ajy(akp paramakp, amk paramamk, Map paramMap, oy paramoy, aib paramaib, Lock paramLock, Context paramContext)
  {
    this.a = paramakp;
    this.k = paramamk;
    this.s = paramMap;
    this.d = paramoy;
    this.t = paramaib;
    this.b = paramLock;
    this.c = paramContext;
  }

  private final void a(boolean paramBoolean)
  {
    if (this.e != null)
    {
      if ((this.e.e()) && (paramBoolean))
        this.e.c();
      this.e.d();
      this.h = null;
    }
  }

  private static String c(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return "UNKNOWN";
    case 0:
      return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    case 1:
    }
    return "STEP_GETTING_REMOTE_SERVICE";
  }

  private final void g()
  {
    akp localakp = this.a;
    localakp.a.lock();
    try
    {
      localakp.m.f();
      localakp.k = new ajv(localakp);
      localakp.k.a();
      localakp.b.signalAll();
      localakp.a.unlock();
      aks.a.execute(new ajz(this));
      if (this.e != null)
      {
        if (this.i)
          this.e.a(this.h, this.j);
        a(false);
      }
      Iterator localIterator = this.a.g.keySet().iterator();
      if (localIterator.hasNext())
      {
        aid localaid = (aid)localIterator.next();
        ((aif)this.a.f.get(localaid)).d();
      }
    }
    finally
    {
      localakp.a.unlock();
    }
    for (Bundle localBundle = null; ; localBundle = this.p)
    {
      this.a.n.a(localBundle);
      return;
    }
  }

  private final void h()
  {
    Iterator localIterator = this.u.iterator();
    while (localIterator.hasNext())
      ((Future)localIterator.next()).cancel(true);
    this.u.clear();
  }

  public final ajh a(ajh paramajh)
  {
    this.a.m.d.add(paramajh);
    return paramajh;
  }

  public final void a()
  {
    this.a.g.clear();
    this.f = false;
    this.l = null;
    this.n = 0;
    this.r = 2;
    this.g = false;
    this.i = false;
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.s.keySet().iterator();
    while (localIterator.hasNext())
    {
      aia localaia = (aia)localIterator.next();
      aif localaif = (aif)this.a.f.get(localaia.b());
      int i1 = ((Integer)this.s.get(localaia)).intValue();
      if (localaif.g())
      {
        this.f = true;
        if (i1 < this.r)
          this.r = i1;
        if (i1 != 0)
          this.q.add(localaia.b());
      }
      localHashMap.put(localaif, new aka(this, localaia, i1));
    }
    if (this.f)
    {
      this.k.h = Integer.valueOf(System.identityHashCode(this.a.m));
      akh localakh = new akh(this);
      this.e = ((aro)this.t.a(this.c, this.a.m.c, this.k, this.k.g, localakh, localakh));
    }
    this.o = this.a.f.size();
    this.u.add(aks.a.submit(new akb(this, localHashMap)));
  }

  public final void a(int paramInt)
  {
    b(new ConnectionResult(8, null));
  }

  public final void a(Bundle paramBundle)
  {
    if (!b(1));
    do
    {
      return;
      if (paramBundle == null)
        continue;
      this.p.putAll(paramBundle);
    }
    while (!d());
    g();
  }

  public final void a(ConnectionResult paramConnectionResult, aia paramaia, int paramInt)
  {
    if (!b(1));
    do
    {
      return;
      b(paramConnectionResult, paramaia, paramInt);
    }
    while (!d());
    g();
  }

  final boolean a(ConnectionResult paramConnectionResult)
  {
    return (this.r == 2) || ((this.r == 1) && (!paramConnectionResult.a()));
  }

  public final ajh b(ajh paramajh)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }

  final void b(ConnectionResult paramConnectionResult)
  {
    h();
    if (!paramConnectionResult.a());
    for (boolean bool = true; ; bool = false)
    {
      a(bool);
      this.a.a(paramConnectionResult);
      this.a.n.a(paramConnectionResult);
      return;
    }
  }

  final void b(ConnectionResult paramConnectionResult, aia paramaia, int paramInt)
  {
    int i1 = 1;
    int i2;
    if (paramInt != 2)
    {
      if (paramInt == i1)
      {
        if (!paramConnectionResult.a())
          break label83;
        i2 = i1;
        if (i2 == 0)
          break label110;
      }
      if ((this.l != null) && (2147483647 >= this.m))
        break label110;
    }
    while (true)
    {
      if (i1 != 0)
      {
        this.l = paramConnectionResult;
        this.m = 2147483647;
      }
      this.a.g.put(paramaia.b(), paramConnectionResult);
      return;
      label83: if (this.d.b(paramConnectionResult.c) != null)
      {
        i2 = i1;
        break;
      }
      i2 = 0;
      break;
      label110: i1 = 0;
    }
  }

  public final boolean b()
  {
    h();
    a(true);
    this.a.a(null);
    return true;
  }

  final boolean b(int paramInt)
  {
    if (this.n != paramInt)
    {
      Log.i("GoogleApiClientConnecting", this.a.m.h());
      String str1 = String.valueOf(this);
      Log.i("GoogleApiClientConnecting", 23 + String.valueOf(str1).length() + "Unexpected callback in " + str1);
      int i1 = this.o;
      Log.i("GoogleApiClientConnecting", 33 + "mRemainingConnections=" + i1);
      String str2 = String.valueOf(c(this.n));
      String str3 = String.valueOf(c(paramInt));
      Log.wtf("GoogleApiClientConnecting", 70 + String.valueOf(str2).length() + String.valueOf(str3).length() + "GoogleApiClient connecting is in step " + str2 + " but received callback for step " + str3, new Exception());
      b(new ConnectionResult(8, null));
      return false;
    }
    return true;
  }

  public final void c()
  {
  }

  final boolean d()
  {
    this.o = (-1 + this.o);
    if (this.o > 0)
      return false;
    if (this.o < 0)
    {
      Log.i("GoogleApiClientConnecting", this.a.m.h());
      Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
      b(new ConnectionResult(8, null));
      return false;
    }
    if (this.l != null)
    {
      this.a.l = this.m;
      b(this.l);
      return false;
    }
    return true;
  }

  final void e()
  {
    if (this.o != 0);
    ArrayList localArrayList;
    do
    {
      do
        return;
      while ((this.f) && (!this.g));
      localArrayList = new ArrayList();
      this.n = 1;
      this.o = this.a.f.size();
      Iterator localIterator = this.a.f.keySet().iterator();
      while (localIterator.hasNext())
      {
        aid localaid = (aid)localIterator.next();
        if (this.a.g.containsKey(localaid))
        {
          if (!d())
            continue;
          g();
          continue;
        }
        localArrayList.add((aif)this.a.f.get(localaid));
      }
    }
    while (localArrayList.isEmpty());
    this.u.add(aks.a.submit(new ake(this, localArrayList)));
  }

  final void f()
  {
    this.f = false;
    this.a.m.f = Collections.emptySet();
    Iterator localIterator = this.q.iterator();
    while (localIterator.hasNext())
    {
      aid localaid = (aid)localIterator.next();
      if (this.a.g.containsKey(localaid))
        continue;
      this.a.g.put(localaid, new ConnectionResult(17, null));
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ajy
 * JD-Core Version:    0.6.0
 */