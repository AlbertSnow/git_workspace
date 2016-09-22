package com.google.android.gms.ads.internal.mediation;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.future.g;
import com.google.android.gms.ads.internal.util.s;
import com.google.android.gms.ads.internal.util.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@com.google.android.gms.ads.internal.report.client.a
public final class l
  implements a
{
  final long a;
  final long b;
  final Object c = new Object();
  boolean d = false;
  final Map e = new HashMap();
  private final AdRequestInfoParcel f;
  private final com.google.android.gms.ads.internal.mediation.client.b g;
  private final Context h;
  private final c i;
  private final boolean j;
  private final int k;
  private final boolean l;
  private List m = new ArrayList();

  public l(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, com.google.android.gms.ads.internal.mediation.client.b paramb, c paramc, boolean paramBoolean1, boolean paramBoolean2, long paramLong1, long paramLong2, int paramInt)
  {
    this.h = paramContext;
    this.f = paramAdRequestInfoParcel;
    this.g = paramb;
    this.i = paramc;
    this.j = paramBoolean1;
    this.l = paramBoolean2;
    this.a = paramLong1;
    this.b = paramLong2;
    this.k = 2;
  }

  private final void a(g paramg)
  {
    y.a.post(new n(this, paramg));
  }

  private final i b(List paramList)
  {
    while (true)
    {
      g localg;
      synchronized (this.c)
      {
        if (!this.d)
          continue;
        i locali1 = new i(-1);
        return locali1;
        Iterator localIterator = paramList.iterator();
        if (localIterator.hasNext())
          localg = (g)localIterator.next();
      }
      try
      {
        i locali2 = (i)localg.get();
        this.m.add(locali2);
        if ((locali2 == null) || (locali2.a != 0))
          continue;
        a(localg);
        return locali2;
      }
      catch (InterruptedException localInterruptedException)
      {
        com.google.android.gms.ads.internal.util.c.c("Exception while processing an adapter; continuing with other adapters", localInterruptedException);
        continue;
        localObject2 = finally;
        monitorexit;
        throw localObject2;
        a(null);
        return new i(1);
      }
      catch (ExecutionException localExecutionException)
      {
        label109: break label109;
      }
    }
  }

  // ERROR //
  private final i c(List paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	com/google/android/gms/ads/internal/mediation/l:c	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 39	com/google/android/gms/ads/internal/mediation/l:d	Z
    //   11: ifeq +18 -> 29
    //   14: new 91	com/google/android/gms/ads/internal/mediation/i
    //   17: dup
    //   18: iconst_m1
    //   19: invokespecial 94	com/google/android/gms/ads/internal/mediation/i:<init>	(I)V
    //   22: astore 4
    //   24: aload_2
    //   25: monitorexit
    //   26: aload 4
    //   28: areturn
    //   29: aload_2
    //   30: monitorexit
    //   31: iconst_m1
    //   32: istore 5
    //   34: aconst_null
    //   35: astore 6
    //   37: aconst_null
    //   38: astore 7
    //   40: aload_0
    //   41: getfield 57	com/google/android/gms/ads/internal/mediation/l:i	Lcom/google/android/gms/ads/internal/mediation/c;
    //   44: getfield 138	com/google/android/gms/ads/internal/mediation/c:m	J
    //   47: ldc2_w 139
    //   50: lcmp
    //   51: ifeq +205 -> 256
    //   54: aload_0
    //   55: getfield 57	com/google/android/gms/ads/internal/mediation/l:i	Lcom/google/android/gms/ads/internal/mediation/c;
    //   58: getfield 138	com/google/android/gms/ads/internal/mediation/c:m	J
    //   61: lstore 8
    //   63: aload_1
    //   64: invokeinterface 100 1 0
    //   69: astore 10
    //   71: lload 8
    //   73: lstore 11
    //   75: aload 10
    //   77: invokeinterface 106 1 0
    //   82: ifeq +264 -> 346
    //   85: aload 10
    //   87: invokeinterface 110 1 0
    //   92: checkcast 112	com/google/android/gms/ads/internal/util/future/g
    //   95: astore 13
    //   97: invokestatic 145	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   100: getfield 148	com/google/android/gms/ads/internal/bc:i	Laom;
    //   103: invokeinterface 153 1 0
    //   108: lstore 14
    //   110: lload 11
    //   112: lconst_0
    //   113: lcmp
    //   114: ifne +150 -> 264
    //   117: aload 13
    //   119: invokeinterface 156 1 0
    //   124: ifeq +140 -> 264
    //   127: aload 13
    //   129: invokeinterface 115 1 0
    //   134: checkcast 91	com/google/android/gms/ads/internal/mediation/i
    //   137: astore 20
    //   139: aload_0
    //   140: getfield 49	com/google/android/gms/ads/internal/mediation/l:m	Ljava/util/List;
    //   143: aload 20
    //   145: invokeinterface 119 2 0
    //   150: pop
    //   151: aload 20
    //   153: ifnull +228 -> 381
    //   156: aload 20
    //   158: getfield 121	com/google/android/gms/ads/internal/mediation/i:a	I
    //   161: ifne +220 -> 381
    //   164: aload 20
    //   166: getfield 159	com/google/android/gms/ads/internal/mediation/i:f	Lcom/google/android/gms/ads/internal/mediation/client/k;
    //   169: astore 25
    //   171: aload 25
    //   173: ifnull +208 -> 381
    //   176: aload 25
    //   178: invokeinterface 164 1 0
    //   183: iload 5
    //   185: if_icmple +196 -> 381
    //   188: aload 25
    //   190: invokeinterface 164 1 0
    //   195: istore 26
    //   197: iload 26
    //   199: istore 24
    //   201: aload 20
    //   203: astore 27
    //   205: aload 13
    //   207: astore 23
    //   209: aload 27
    //   211: astore 22
    //   213: lload 11
    //   215: invokestatic 145	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   218: getfield 148	com/google/android/gms/ads/internal/bc:i	Laom;
    //   221: invokeinterface 153 1 0
    //   226: lload 14
    //   228: lsub
    //   229: lsub
    //   230: lconst_0
    //   231: invokestatic 170	java/lang/Math:max	(JJ)J
    //   234: lstore 11
    //   236: aload 23
    //   238: astore 6
    //   240: iload 24
    //   242: istore 5
    //   244: aload 22
    //   246: astore 7
    //   248: goto -173 -> 75
    //   251: astore_3
    //   252: aload_2
    //   253: monitorexit
    //   254: aload_3
    //   255: athrow
    //   256: ldc2_w 171
    //   259: lstore 8
    //   261: goto -198 -> 63
    //   264: aload 13
    //   266: lload 11
    //   268: getstatic 178	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   271: invokeinterface 181 4 0
    //   276: checkcast 91	com/google/android/gms/ads/internal/mediation/i
    //   279: astore 20
    //   281: goto -142 -> 139
    //   284: astore 16
    //   286: ldc 125
    //   288: aload 16
    //   290: invokestatic 130	com/google/android/gms/ads/internal/util/c:c	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   293: lload 11
    //   295: invokestatic 145	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   298: getfield 148	com/google/android/gms/ads/internal/bc:i	Laom;
    //   301: invokeinterface 153 1 0
    //   306: lload 14
    //   308: lsub
    //   309: lsub
    //   310: lconst_0
    //   311: invokestatic 170	java/lang/Math:max	(JJ)J
    //   314: lstore 11
    //   316: goto -241 -> 75
    //   319: astore 17
    //   321: lload 11
    //   323: invokestatic 145	com/google/android/gms/ads/internal/bc:a	()Lcom/google/android/gms/ads/internal/bc;
    //   326: getfield 148	com/google/android/gms/ads/internal/bc:i	Laom;
    //   329: invokeinterface 153 1 0
    //   334: lload 14
    //   336: lsub
    //   337: lsub
    //   338: lconst_0
    //   339: invokestatic 170	java/lang/Math:max	(JJ)J
    //   342: pop2
    //   343: aload 17
    //   345: athrow
    //   346: aload_0
    //   347: aload 6
    //   349: invokespecial 123	com/google/android/gms/ads/internal/mediation/l:a	(Lcom/google/android/gms/ads/internal/util/future/g;)V
    //   352: aload 7
    //   354: ifnonnull +42 -> 396
    //   357: new 91	com/google/android/gms/ads/internal/mediation/i
    //   360: dup
    //   361: iconst_1
    //   362: invokespecial 94	com/google/android/gms/ads/internal/mediation/i:<init>	(I)V
    //   365: areturn
    //   366: astore 16
    //   368: goto -82 -> 286
    //   371: astore 16
    //   373: goto -87 -> 286
    //   376: astore 16
    //   378: goto -92 -> 286
    //   381: aload 7
    //   383: astore 22
    //   385: aload 6
    //   387: astore 23
    //   389: iload 5
    //   391: istore 24
    //   393: goto -180 -> 213
    //   396: aload 7
    //   398: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   7	26	251	finally
    //   29	31	251	finally
    //   252	254	251	finally
    //   117	139	284	android/os/RemoteException
    //   139	151	284	android/os/RemoteException
    //   156	171	284	android/os/RemoteException
    //   176	197	284	android/os/RemoteException
    //   264	281	284	android/os/RemoteException
    //   117	139	319	finally
    //   139	151	319	finally
    //   156	171	319	finally
    //   176	197	319	finally
    //   264	281	319	finally
    //   286	293	319	finally
    //   117	139	366	java/lang/InterruptedException
    //   139	151	366	java/lang/InterruptedException
    //   156	171	366	java/lang/InterruptedException
    //   176	197	366	java/lang/InterruptedException
    //   264	281	366	java/lang/InterruptedException
    //   117	139	371	java/util/concurrent/ExecutionException
    //   139	151	371	java/util/concurrent/ExecutionException
    //   156	171	371	java/util/concurrent/ExecutionException
    //   176	197	371	java/util/concurrent/ExecutionException
    //   264	281	371	java/util/concurrent/ExecutionException
    //   117	139	376	java/util/concurrent/TimeoutException
    //   139	151	376	java/util/concurrent/TimeoutException
    //   156	171	376	java/util/concurrent/TimeoutException
    //   176	197	376	java/util/concurrent/TimeoutException
    //   264	281	376	java/util/concurrent/TimeoutException
  }

  public final i a(List paramList)
  {
    com.google.android.gms.ads.internal.util.c.b("Starting mediation.");
    ExecutorService localExecutorService = Executors.newCachedThreadPool();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = paramList.iterator();
    if (localIterator1.hasNext())
    {
      b localb = (b)localIterator1.next();
      String str1 = String.valueOf(localb.b);
      if (str1.length() != 0);
      for (String str2 = "Trying mediation network: ".concat(str1); ; str2 = new String("Trying mediation network: "))
      {
        com.google.android.gms.ads.internal.util.c.d(str2);
        Iterator localIterator2 = localb.c.iterator();
        while (localIterator2.hasNext())
        {
          String str3 = (String)localIterator2.next();
          f localf = new f(this.h, str3, this.g, this.i, localb, this.f.c, this.f.d, this.f.k, this.j, this.l, this.f.z, this.f.n);
          g localg = s.a(localExecutorService, new m(this, localf));
          this.e.put(localg, localf);
          localArrayList.add(localg);
        }
        break;
      }
    }
    switch (this.k)
    {
    default:
      return b(localArrayList);
    case 2:
    }
    return c(localArrayList);
  }

  public final void a()
  {
    synchronized (this.c)
    {
      this.d = true;
      Iterator localIterator = this.e.values().iterator();
      if (localIterator.hasNext())
        ((f)localIterator.next()).a();
    }
    monitorexit;
  }

  public final List b()
  {
    return this.m;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.l
 * JD-Core Version:    0.6.0
 */