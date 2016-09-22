import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public final class akk extends aio
  implements alb
{
  ala b = null;
  final Looper c;
  final Queue d = new LinkedList();
  final Map e;
  Set f = new HashSet();
  Set g = null;
  final alm h;
  private final Lock i;
  private final amt j;
  private final int k;
  private final Context l;
  private volatile boolean m;
  private long n = 120000L;
  private long o = 5000L;
  private final akm p;
  private final ox q;
  private aky r;
  private amk s;
  private Map t;
  private aib u;
  private final alh v = new alh();
  private final ArrayList w;
  private Integer x = null;
  private final amu y = new akl(this);

  public akk(Context paramContext, Lock paramLock, Looper paramLooper, amk paramamk, ox paramox, aib paramaib, Map paramMap1, List paramList1, List paramList2, Map paramMap2, int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    this.l = paramContext;
    this.i = paramLock;
    this.j = new amt(paramLooper, this.y);
    this.c = paramLooper;
    this.p = new akm(this, paramLooper);
    this.q = paramox;
    this.k = paramInt1;
    if (this.k >= 0)
      this.x = Integer.valueOf(paramInt2);
    this.t = paramMap1;
    this.e = paramMap2;
    this.w = paramArrayList;
    this.h = new alm(this.e);
    Iterator localIterator1 = paramList1.iterator();
    while (localIterator1.hasNext())
    {
      aiq localaiq = (aiq)localIterator1.next();
      amt localamt = this.j;
      anw.a(localaiq);
      synchronized (localamt.i)
      {
        if (localamt.b.contains(localaiq))
        {
          String str = String.valueOf(localaiq);
          Log.w("GmsClientEvents", 62 + String.valueOf(str).length() + "registerConnectionCallbacks(): listener " + str + " is already registered");
          if (!localamt.a.e())
            continue;
          localamt.h.sendMessage(localamt.h.obtainMessage(1, localaiq));
          continue;
        }
        localamt.b.add(localaiq);
      }
    }
    Iterator localIterator2 = paramList2.iterator();
    while (localIterator2.hasNext())
    {
      air localair = (air)localIterator2.next();
      this.j.a(localair);
    }
    this.s = paramamk;
    this.u = paramaib;
  }

  public static int a(Iterable paramIterable, boolean paramBoolean)
  {
    Iterator localIterator = paramIterable.iterator();
    int i1 = 0;
    if (localIterator.hasNext())
      if (!((aif)localIterator.next()).g())
        break label52;
    label52: for (int i2 = 1; ; i2 = i1)
    {
      i1 = i2;
      break;
      if (i1 != 0)
        return 1;
      return 3;
    }
  }

  private final void a(int paramInt)
  {
    if (this.x == null)
      this.x = Integer.valueOf(paramInt);
    while (this.b != null)
    {
      return;
      if (this.x.intValue() == paramInt)
        continue;
      String str1 = String.valueOf(b(paramInt));
      String str2 = String.valueOf(b(this.x.intValue()));
      throw new IllegalStateException(51 + String.valueOf(str1).length() + String.valueOf(str2).length() + "Cannot use sign-in mode: " + str1 + ". Mode was already set to " + str2);
    }
    Iterator localIterator = this.e.values().iterator();
    int i1 = 0;
    if (localIterator.hasNext())
      if (!((aif)localIterator.next()).g())
        break label316;
    label316: for (int i2 = 1; ; i2 = i1)
    {
      i1 = i2;
      break;
      switch (this.x.intValue())
      {
      case 3:
      default:
      case 1:
      case 2:
      }
      do
      {
        do
        {
          this.b = new akp(this.l, this, this.i, this.c, this.q, this.e, this.s, this.t, this.u, this.w, this);
          return;
        }
        while (i1 != 0);
        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
      }
      while (i1 == 0);
      this.b = ajs.a(this.l, this, this.i, this.c, this.q, this.e, this.s, this.t, this.u, this.w);
      return;
    }
  }

  private static String b(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return "UNKNOWN";
    case 3:
      return "SIGN_IN_MODE_NONE";
    case 1:
      return "SIGN_IN_MODE_REQUIRED";
    case 2:
    }
    return "SIGN_IN_MODE_OPTIONAL";
  }

  private final void i()
  {
    this.j.e = true;
    this.b.a();
  }

  public final ajh a(ajh paramajh)
  {
    boolean bool1;
    if (paramajh.a != null)
      bool1 = true;
    while (true)
    {
      anw.b(bool1, "This task can not be enqueued (it's probably a Batch or malformed)");
      boolean bool2 = this.e.containsKey(paramajh.a);
      String str;
      if (paramajh.b != null)
      {
        str = paramajh.b.a;
        label46: anw.b(bool2, 65 + String.valueOf(str).length() + "GoogleApiClient is not configured to use " + str + " required for this call.");
        this.i.lock();
      }
      try
      {
        if (this.b == null)
        {
          this.d.add(paramajh);
          return paramajh;
          bool1 = false;
          continue;
          str = "the API";
          break label46;
        }
        ajh localajh = this.b.a(paramajh);
        return localajh;
      }
      finally
      {
        this.i.unlock();
      }
    }
    throw localObject;
  }

  public final Looper a()
  {
    return this.c;
  }

  public final void a(int paramInt, boolean paramBoolean)
  {
    if ((paramInt == 1) && (!paramBoolean) && (!this.m))
    {
      this.m = true;
      if (this.r == null)
        this.r = this.q.a(this.l.getApplicationContext(), new akn(this));
      this.p.sendMessageDelayed(this.p.obtainMessage(1), this.n);
      this.p.sendMessageDelayed(this.p.obtainMessage(2), this.o);
    }
    ajh[] arrayOfajh = (ajh[])this.h.b.toArray(alm.a);
    int i1 = arrayOfajh.length;
    for (int i2 = 0; i2 < i1; i2++)
      arrayOfajh[i2].c(new Status(8, "The connection to Google Play services was lost"));
    amt localamt = this.j;
    if (Looper.myLooper() == localamt.h.getLooper());
    for (boolean bool = true; ; bool = false)
    {
      anw.a(bool, "onUnintentionalDisconnection must only be called on the Handler thread");
      localamt.h.removeMessages(1);
      synchronized (localamt.i)
      {
        localamt.g = true;
        ArrayList localArrayList = new ArrayList(localamt.b);
        int i3 = localamt.f.get();
        Iterator localIterator = localArrayList.iterator();
        aiq localaiq;
        do
        {
          if (!localIterator.hasNext())
            break;
          localaiq = (aiq)localIterator.next();
          if ((!localamt.e) || (localamt.f.get() != i3))
            break;
        }
        while (!localamt.b.contains(localaiq));
        localaiq.a(paramInt);
      }
    }
    localamt.c.clear();
    localamt.g = false;
    monitorexit;
    this.j.a();
    if (paramInt == 2)
      i();
  }

  public final void a(air paramair)
  {
    this.j.a(paramair);
  }

  public final void a(Bundle paramBundle)
  {
    boolean bool1 = true;
    while (!this.d.isEmpty())
      b((ajh)this.d.remove());
    amt localamt = this.j;
    boolean bool2;
    if (Looper.myLooper() == localamt.h.getLooper())
    {
      bool2 = bool1;
      anw.a(bool2, "onConnectionSuccess must only be called on the Handler thread");
    }
    while (true)
    {
      synchronized (localamt.i)
      {
        if (localamt.g)
          break label233;
        bool3 = bool1;
        anw.a(bool3);
        localamt.h.removeMessages(1);
        localamt.g = true;
        if (localamt.c.size() != 0)
          break label239;
        anw.a(bool1);
        ArrayList localArrayList = new ArrayList(localamt.b);
        int i1 = localamt.f.get();
        Iterator localIterator = localArrayList.iterator();
        if (!localIterator.hasNext())
          break label244;
        aiq localaiq = (aiq)localIterator.next();
        if ((!localamt.e) || (!localamt.a.e()) || (localamt.f.get() != i1))
          break label244;
        if (localamt.c.contains(localaiq))
          continue;
        localaiq.a(paramBundle);
      }
      bool2 = false;
      break;
      label233: boolean bool3 = false;
      continue;
      label239: bool1 = false;
    }
    label244: localamt.c.clear();
    localamt.g = false;
    monitorexit;
  }

  public final void a(ConnectionResult paramConnectionResult)
  {
    if (!this.q.a(this.l, paramConnectionResult.c))
      f();
    amt localamt;
    boolean bool;
    if (!this.m)
    {
      localamt = this.j;
      if (Looper.myLooper() != localamt.h.getLooper())
        break label155;
      bool = true;
      anw.a(bool, "onConnectionFailure must only be called on the Handler thread");
      localamt.h.removeMessages(1);
    }
    while (true)
    {
      synchronized (localamt.i)
      {
        ArrayList localArrayList = new ArrayList(localamt.d);
        int i1 = localamt.f.get();
        Iterator localIterator = localArrayList.iterator();
        if (localIterator.hasNext())
        {
          air localair = (air)localIterator.next();
          if ((localamt.e) && (localamt.f.get() == i1))
            continue;
          this.j.a();
          return;
          label155: bool = false;
          break;
          if (!localamt.d.contains(localair))
            continue;
          localair.a(paramConnectionResult);
        }
      }
      monitorexit;
    }
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("mContext=").println(this.l);
    paramPrintWriter.append(paramString).append("mResuming=").print(this.m);
    paramPrintWriter.append(" mWorkQueue.size()=").print(this.d.size());
    alm localalm = this.h;
    paramPrintWriter.append(" mUnconsumedApiCalls.size()=").println(localalm.b.size());
    if (this.b != null)
      this.b.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }

  public final ajh b(ajh paramajh)
  {
    boolean bool1;
    boolean bool2;
    if (paramajh.a != null)
    {
      bool1 = true;
      anw.b(bool1, "This task can not be executed (it's probably a Batch or malformed)");
      bool2 = this.e.containsKey(paramajh.a);
      if (paramajh.b == null)
        break label134;
    }
    label134: for (String str = paramajh.b.a; ; str = "the API")
    {
      anw.b(bool2, 65 + String.valueOf(str).length() + "GoogleApiClient is not configured to use " + str + " required for this call.");
      this.i.lock();
      try
      {
        if (this.b != null)
          break label142;
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
      }
      finally
      {
        this.i.unlock();
      }
      bool1 = false;
      break;
    }
    label142: if (this.m)
    {
      this.d.add(paramajh);
      while (!this.d.isEmpty())
      {
        ajh localajh2 = (ajh)this.d.remove();
        this.h.a(localajh2);
        localajh2.b(Status.b);
      }
      this.i.unlock();
      return paramajh;
    }
    ajh localajh1 = this.b.b(paramajh);
    this.i.unlock();
    return localajh1;
  }

  // ERROR //
  public final void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 96	akk:i	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 323 1 0
    //   9: aload_0
    //   10: getfield 116	akk:k	I
    //   13: iflt +117 -> 130
    //   16: aload_0
    //   17: getfield 83	akk:x	Ljava/lang/Integer;
    //   20: ifnull +104 -> 124
    //   23: iconst_1
    //   24: istore 5
    //   26: iload 5
    //   28: ldc_w 500
    //   31: invokestatic 394	anw:a	(ZLjava/lang/Object;)V
    //   34: aload_0
    //   35: getfield 83	akk:x	Ljava/lang/Integer;
    //   38: invokevirtual 245	java/lang/Integer:intValue	()I
    //   41: istore_2
    //   42: aload_0
    //   43: getfield 96	akk:i	Ljava/util/concurrent/locks/Lock;
    //   46: invokeinterface 323 1 0
    //   51: iload_2
    //   52: iconst_3
    //   53: if_icmpeq +15 -> 68
    //   56: iload_2
    //   57: iconst_1
    //   58: if_icmpeq +10 -> 68
    //   61: iconst_0
    //   62: istore_3
    //   63: iload_2
    //   64: iconst_2
    //   65: if_icmpne +5 -> 70
    //   68: iconst_1
    //   69: istore_3
    //   70: iload_3
    //   71: new 179	java/lang/StringBuilder
    //   74: dup
    //   75: bipush 33
    //   77: invokespecial 186	java/lang/StringBuilder:<init>	(I)V
    //   80: ldc_w 502
    //   83: invokevirtual 192	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: iload_2
    //   87: invokevirtual 505	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   90: invokevirtual 198	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: invokestatic 303	anw:b	(ZLjava/lang/Object;)V
    //   96: aload_0
    //   97: iload_2
    //   98: invokespecial 506	akk:a	(I)V
    //   101: aload_0
    //   102: invokespecial 421	akk:i	()V
    //   105: aload_0
    //   106: getfield 96	akk:i	Ljava/util/concurrent/locks/Lock;
    //   109: invokeinterface 329 1 0
    //   114: aload_0
    //   115: getfield 96	akk:i	Ljava/util/concurrent/locks/Lock;
    //   118: invokeinterface 329 1 0
    //   123: return
    //   124: iconst_0
    //   125: istore 5
    //   127: goto -101 -> 26
    //   130: aload_0
    //   131: getfield 83	akk:x	Ljava/lang/Integer;
    //   134: ifnonnull +38 -> 172
    //   137: aload_0
    //   138: aload_0
    //   139: getfield 126	akk:e	Ljava/util/Map;
    //   142: invokeinterface 263 1 0
    //   147: iconst_0
    //   148: invokestatic 508	akk:a	(Ljava/lang/Iterable;Z)I
    //   151: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   154: putfield 83	akk:x	Ljava/lang/Integer;
    //   157: goto -123 -> 34
    //   160: astore_1
    //   161: aload_0
    //   162: getfield 96	akk:i	Ljava/util/concurrent/locks/Lock;
    //   165: invokeinterface 329 1 0
    //   170: aload_1
    //   171: athrow
    //   172: aload_0
    //   173: getfield 83	akk:x	Ljava/lang/Integer;
    //   176: invokevirtual 245	java/lang/Integer:intValue	()I
    //   179: iconst_2
    //   180: if_icmpne -146 -> 34
    //   183: new 250	java/lang/IllegalStateException
    //   186: dup
    //   187: ldc_w 510
    //   190: invokespecial 257	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   193: athrow
    //   194: astore 4
    //   196: aload_0
    //   197: getfield 96	akk:i	Ljava/util/concurrent/locks/Lock;
    //   200: invokeinterface 329 1 0
    //   205: aload 4
    //   207: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   9	23	160	finally
    //   26	34	160	finally
    //   34	51	160	finally
    //   105	114	160	finally
    //   130	157	160	finally
    //   172	194	160	finally
    //   196	208	160	finally
    //   70	105	194	finally
  }

  public final void b(air paramair)
  {
    amt localamt = this.j;
    anw.a(paramair);
    synchronized (localamt.i)
    {
      if (!localamt.d.remove(paramair))
      {
        String str = String.valueOf(paramair);
        Log.w("GmsClientEvents", 57 + String.valueOf(str).length() + "unregisterConnectionFailedListener(): listener " + str + " not found");
      }
      return;
    }
  }

  public final void c()
  {
    this.i.lock();
    try
    {
      this.h.a();
      if (this.b != null)
        this.b.b();
      this.v.a();
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
      {
        ajh localajh = (ajh)localIterator.next();
        localajh.a(null);
        localajh.c();
      }
    }
    finally
    {
      this.i.unlock();
    }
    this.d.clear();
    ala localala = this.b;
    if (localala == null)
    {
      this.i.unlock();
      return;
    }
    f();
    this.j.a();
    this.i.unlock();
  }

  final void d()
  {
    this.i.lock();
    try
    {
      if (this.m)
        i();
      return;
    }
    finally
    {
      this.i.unlock();
    }
    throw localObject;
  }

  final void e()
  {
    this.i.lock();
    try
    {
      if (f())
        i();
      return;
    }
    finally
    {
      this.i.unlock();
    }
    throw localObject;
  }

  final boolean f()
  {
    if (!this.m)
      return false;
    this.m = false;
    this.p.removeMessages(2);
    this.p.removeMessages(1);
    if (this.r != null)
    {
      this.r.a();
      this.r = null;
    }
    return true;
  }

  final boolean g()
  {
    this.i.lock();
    try
    {
      Set localSet = this.g;
      if (localSet == null)
        return false;
      boolean bool = this.g.isEmpty();
      int i1 = 0;
      if (!bool)
        i1 = 1;
      return i1;
    }
    finally
    {
      this.i.unlock();
    }
    throw localObject;
  }

  final String h()
  {
    StringWriter localStringWriter = new StringWriter();
    a("", null, new PrintWriter(localStringWriter), null);
    return localStringWriter.toString();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     akk
 * JD-Core Version:    0.6.0
 */