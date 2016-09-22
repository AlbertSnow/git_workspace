import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

final class ajs
  implements ala
{
  final akk a;
  final akp b;
  final akp c;
  Bundle d;
  ConnectionResult e = null;
  ConnectionResult f = null;
  boolean g = false;
  final Lock h;
  int i = 0;
  private final Context j;
  private final Map k;
  private final Set l = Collections.newSetFromMap(new WeakHashMap());
  private final aif m;

  private ajs(Context paramContext, akk paramakk, Lock paramLock, Looper paramLooper, oy paramoy, Map paramMap1, Map paramMap2, amk paramamk, aib paramaib, aif paramaif, ArrayList paramArrayList1, ArrayList paramArrayList2, Map paramMap3, Map paramMap4)
  {
    this.j = paramContext;
    this.a = paramakk;
    this.h = paramLock;
    this.m = paramaif;
    this.b = new akp(paramContext, this.a, paramLock, paramLooper, paramoy, paramMap2, null, paramMap4, null, paramArrayList2, new ajt(this));
    this.c = new akp(paramContext, this.a, paramLock, paramLooper, paramoy, paramMap1, paramamk, paramMap3, paramaib, paramArrayList1, new aju(this));
    cw localcw = new cw();
    Iterator localIterator1 = paramMap2.keySet().iterator();
    while (localIterator1.hasNext())
      localcw.put((aid)localIterator1.next(), this.b);
    Iterator localIterator2 = paramMap1.keySet().iterator();
    while (localIterator2.hasNext())
      localcw.put((aid)localIterator2.next(), this.c);
    this.k = Collections.unmodifiableMap(localcw);
  }

  public static ajs a(Context paramContext, akk paramakk, Lock paramLock, Looper paramLooper, oy paramoy, Map paramMap1, amk paramamk, Map paramMap2, aib paramaib, ArrayList paramArrayList)
  {
    cw localcw1 = new cw();
    cw localcw2 = new cw();
    Iterator localIterator1 = paramMap1.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      aif localaif = (aif)localEntry.getValue();
      if (localaif.g())
      {
        localcw1.put((aid)localEntry.getKey(), localaif);
        continue;
      }
      localcw2.put((aid)localEntry.getKey(), localaif);
    }
    boolean bool;
    cw localcw3;
    cw localcw4;
    Iterator localIterator2;
    if (!localcw1.isEmpty())
    {
      bool = true;
      anw.a(bool, "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
      localcw3 = new cw();
      localcw4 = new cw();
      localIterator2 = paramMap2.keySet().iterator();
    }
    while (true)
    {
      if (!localIterator2.hasNext())
        break label293;
      aia localaia = (aia)localIterator2.next();
      aid localaid = localaia.b();
      if (localcw1.containsKey(localaid))
      {
        localcw3.put(localaia, (Integer)paramMap2.get(localaia));
        continue;
        bool = false;
        break;
      }
      if (!localcw2.containsKey(localaid))
        break label283;
      localcw4.put(localaia, (Integer)paramMap2.get(localaia));
    }
    label283: throw new IllegalStateException("Each API in the apiTypeMap must have a corresponding client in the clients map.");
    label293: ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator3 = paramArrayList.iterator();
    while (localIterator3.hasNext())
    {
      ajr localajr = (ajr)localIterator3.next();
      if (localcw3.containsKey(localajr.a))
      {
        localArrayList1.add(localajr);
        continue;
      }
      if (localcw4.containsKey(localajr.a))
      {
        localArrayList2.add(localajr);
        continue;
      }
      throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the apiTypeMap");
    }
    return new ajs(paramContext, paramakk, paramLock, paramLooper, paramoy, localcw1, localcw2, paramamk, paramaib, null, localArrayList1, localArrayList2, localcw3, localcw4);
  }

  static boolean b(ConnectionResult paramConnectionResult)
  {
    return (paramConnectionResult != null) && (paramConnectionResult.b());
  }

  private final boolean c(ajh paramajh)
  {
    aid localaid = paramajh.a;
    anw.b(this.k.containsKey(localaid), "GoogleApiClient is not configured to use the API required for this call.");
    return ((akp)this.k.get(localaid)).equals(this.c);
  }

  private final PendingIntent f()
  {
    if (this.m == null)
      return null;
    return PendingIntent.getActivity(this.j, System.identityHashCode(this.a), this.m.h(), 134217728);
  }

  public final ajh a(ajh paramajh)
  {
    if (c(paramajh))
    {
      if (e())
      {
        paramajh.b(new Status(4, null, f()));
        return paramajh;
      }
      return this.c.a(paramajh);
    }
    return this.b.a(paramajh);
  }

  public final void a()
  {
    this.i = 2;
    this.g = false;
    this.f = null;
    this.e = null;
    this.b.a();
    this.c.a();
  }

  final void a(int paramInt, boolean paramBoolean)
  {
    this.a.a(paramInt, paramBoolean);
    this.f = null;
    this.e = null;
  }

  final void a(ConnectionResult paramConnectionResult)
  {
    switch (this.i)
    {
    default:
      Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
    case 2:
    case 1:
    }
    while (true)
    {
      this.i = 0;
      return;
      this.a.a(paramConnectionResult);
      d();
    }
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("authClient").println(":");
    this.c.a(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.append(paramString).append("anonClient").println(":");
    this.b.a(String.valueOf(paramString).concat("  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }

  public final ajh b(ajh paramajh)
  {
    if (c(paramajh))
    {
      if (e())
      {
        paramajh.b(new Status(4, null, f()));
        return paramajh;
      }
      return this.c.b(paramajh);
    }
    return this.b.b(paramajh);
  }

  public final void b()
  {
    this.f = null;
    this.e = null;
    this.i = 0;
    this.b.b();
    this.c.b();
    d();
  }

  public final boolean c()
  {
    int n = 1;
    this.h.lock();
    try
    {
      if (this.b.c())
        if ((!this.c.c()) && (!e()))
        {
          int i1 = this.i;
          if (i1 != n);
        }
        else
        {
          return n;
        }
      n = 0;
    }
    finally
    {
      this.h.unlock();
    }
  }

  final void d()
  {
    Iterator localIterator = this.l.iterator();
    while (localIterator.hasNext())
      localIterator.next();
    this.l.clear();
  }

  final boolean e()
  {
    return (this.f != null) && (this.f.c == 4);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ajs
 * JD-Core Version:    0.6.0
 */