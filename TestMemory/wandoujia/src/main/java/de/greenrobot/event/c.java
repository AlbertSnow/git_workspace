package de.greenrobot.event;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

public class c
{
  public static String a = "Event";
  private static volatile c b;
  private static final g c = new g();
  private static final Map<Class<?>, List<Class<?>>> d = new HashMap();
  private final Map<Class<?>, CopyOnWriteArrayList<o>> e = new HashMap();
  private final Map<Object, List<Class<?>>> f = new HashMap();
  private final ThreadLocal<f> g = new d();
  private final h h;
  private final b i;
  private final a j;
  private final n k;
  private final ExecutorService l;
  private final boolean m;
  private final boolean n;
  private final boolean o;
  private final boolean p;
  private final boolean q;

  public c()
  {
    this(c);
  }

  private c(g paramg)
  {
    new ConcurrentHashMap();
    this.h = new h(this, Looper.getMainLooper());
    this.i = new b(this);
    this.j = new a(this);
    this.k = new n();
    this.m = paramg.a;
    this.n = paramg.b;
    this.o = paramg.c;
    this.p = paramg.d;
    this.q = paramg.e;
    this.l = paramg.f;
  }

  public static c a()
  {
    if (b == null)
      monitorenter;
    try
    {
      if (b == null)
        b = new c();
      return b;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private static List<Class<?>> a(Class<?> paramClass)
  {
    synchronized (d)
    {
      Object localObject2 = (List)d.get(paramClass);
      if (localObject2 == null)
      {
        localObject2 = new ArrayList();
        for (Object localObject3 = paramClass; localObject3 != null; localObject3 = ((Class)localObject3).getSuperclass())
        {
          ((List)localObject2).add(localObject3);
          a((List)localObject2, ((Class)localObject3).getInterfaces());
        }
        d.put(paramClass, localObject2);
      }
      return localObject2;
    }
  }

  private void a(o paramo, Object paramObject)
  {
    try
    {
      paramo.b.a.invoke(paramo.a, new Object[] { paramObject });
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      do
      {
        while (true)
        {
          localInvocationTargetException.getCause();
          if (!(paramObject instanceof l))
            break;
          if (!this.m)
            continue;
          new StringBuilder("SubscriberExceptionEvent subscriber ").append(paramo.a.getClass()).append(" threw an exception");
          l locall = (l)paramObject;
          new StringBuilder("Initial event ").append(locall.a).append(" caused exception in ").append(locall.b);
          return;
        }
        if (!this.m)
          continue;
        new StringBuilder("Could not dispatch event: ").append(paramObject.getClass()).append(" to subscribing class ").append(paramo.a.getClass());
      }
      while (!this.o);
      d(new l(paramObject, paramo.a));
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
    throw new IllegalStateException("Unexpected exception", localIllegalAccessException);
  }

  private static void a(List<Class<?>> paramList, Class<?>[] paramArrayOfClass)
  {
    int i1 = paramArrayOfClass.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      Class<?> localClass = paramArrayOfClass[i2];
      if (paramList.contains(localClass))
        continue;
      paramList.add(localClass);
      a(paramList, localClass.getInterfaces());
    }
  }

  // ERROR //
  private boolean a(Object paramObject, f paramf, Class<?> paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 65	de/greenrobot/event/c:e	Ljava/util/Map;
    //   6: aload_3
    //   7: invokeinterface 135 2 0
    //   12: checkcast 240	java/util/concurrent/CopyOnWriteArrayList
    //   15: astore 5
    //   17: aload_0
    //   18: monitorexit
    //   19: aload 5
    //   21: ifnull +216 -> 237
    //   24: aload 5
    //   26: invokevirtual 244	java/util/concurrent/CopyOnWriteArrayList:isEmpty	()Z
    //   29: ifne +208 -> 237
    //   32: aload 5
    //   34: invokevirtual 248	java/util/concurrent/CopyOnWriteArrayList:iterator	()Ljava/util/Iterator;
    //   37: astore 6
    //   39: aload 6
    //   41: invokeinterface 253 1 0
    //   46: ifeq +189 -> 235
    //   49: aload 6
    //   51: invokeinterface 257 1 0
    //   56: checkcast 168	de/greenrobot/event/o
    //   59: astore 7
    //   61: aload_2
    //   62: getfield 260	de/greenrobot/event/f:c	Z
    //   65: istore 9
    //   67: getstatic 265	de/greenrobot/event/e:a	[I
    //   70: aload 7
    //   72: getfield 171	de/greenrobot/event/o:b	Lde/greenrobot/event/m;
    //   75: getfield 268	de/greenrobot/event/m:b	Lde/greenrobot/event/ThreadMode;
    //   78: invokevirtual 274	de/greenrobot/event/ThreadMode:ordinal	()I
    //   81: iaload
    //   82: tableswitch	default:+30 -> 112, 1:+74->156, 2:+84->166, 3:+112->194, 4:+140->222
    //   113: nop
    //   114: <illegal opcode>
    //   115: dup
    //   116: new 193	java/lang/StringBuilder
    //   119: dup
    //   120: ldc_w 276
    //   123: invokespecial 198	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   126: aload 7
    //   128: getfield 171	de/greenrobot/event/o:b	Lde/greenrobot/event/m;
    //   131: getfield 268	de/greenrobot/event/m:b	Lde/greenrobot/event/ThreadMode;
    //   134: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   137: invokevirtual 280	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   140: invokespecial 281	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   143: athrow
    //   144: astore 8
    //   146: aload 8
    //   148: athrow
    //   149: astore 4
    //   151: aload_0
    //   152: monitorexit
    //   153: aload 4
    //   155: athrow
    //   156: aload_0
    //   157: aload 7
    //   159: aload_1
    //   160: invokespecial 283	de/greenrobot/event/c:a	(Lde/greenrobot/event/o;Ljava/lang/Object;)V
    //   163: goto -124 -> 39
    //   166: iload 9
    //   168: ifeq +13 -> 181
    //   171: aload_0
    //   172: aload 7
    //   174: aload_1
    //   175: invokespecial 283	de/greenrobot/event/c:a	(Lde/greenrobot/event/o;Ljava/lang/Object;)V
    //   178: goto -139 -> 39
    //   181: aload_0
    //   182: getfield 83	de/greenrobot/event/c:h	Lde/greenrobot/event/h;
    //   185: aload 7
    //   187: aload_1
    //   188: invokevirtual 284	de/greenrobot/event/h:a	(Lde/greenrobot/event/o;Ljava/lang/Object;)V
    //   191: goto -152 -> 39
    //   194: iload 9
    //   196: ifeq +16 -> 212
    //   199: aload_0
    //   200: getfield 90	de/greenrobot/event/c:i	Lde/greenrobot/event/b;
    //   203: aload 7
    //   205: aload_1
    //   206: invokevirtual 285	de/greenrobot/event/b:a	(Lde/greenrobot/event/o;Ljava/lang/Object;)V
    //   209: goto -170 -> 39
    //   212: aload_0
    //   213: aload 7
    //   215: aload_1
    //   216: invokespecial 283	de/greenrobot/event/c:a	(Lde/greenrobot/event/o;Ljava/lang/Object;)V
    //   219: goto -180 -> 39
    //   222: aload_0
    //   223: getfield 95	de/greenrobot/event/c:j	Lde/greenrobot/event/a;
    //   226: aload 7
    //   228: aload_1
    //   229: invokevirtual 286	de/greenrobot/event/a:a	(Lde/greenrobot/event/o;Ljava/lang/Object;)V
    //   232: goto -193 -> 39
    //   235: iconst_1
    //   236: ireturn
    //   237: iconst_0
    //   238: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   61	112	144	finally
    //   112	144	144	finally
    //   156	163	144	finally
    //   171	178	144	finally
    //   181	191	144	finally
    //   199	209	144	finally
    //   212	219	144	finally
    //   222	232	144	finally
    //   2	19	149	finally
    //   151	153	149	finally
  }

  private void e(Object paramObject)
  {
    monitorenter;
    while (true)
    {
      Class localClass;
      CopyOnWriteArrayList localCopyOnWriteArrayList;
      o localo;
      int i2;
      try
      {
        Iterator localIterator = this.k.a(paramObject.getClass()).iterator();
        if (!localIterator.hasNext())
          break;
        m localm = (m)localIterator.next();
        localClass = localm.c;
        localCopyOnWriteArrayList = (CopyOnWriteArrayList)this.e.get(localClass);
        localo = new o(paramObject, localm);
        if (localCopyOnWriteArrayList != null)
          continue;
        localCopyOnWriteArrayList = new CopyOnWriteArrayList();
        this.e.put(localClass, localCopyOnWriteArrayList);
        int i1 = localCopyOnWriteArrayList.size();
        i2 = 0;
        if (i2 > i1)
          break label203;
        if (i2 != i1)
        {
          localCopyOnWriteArrayList.get(i2);
          i2++;
          continue;
          if (!localCopyOnWriteArrayList.contains(localo))
            continue;
          throw new EventBusException("Subscriber " + paramObject.getClass() + " already registered to event " + localClass);
        }
      }
      finally
      {
        monitorexit;
      }
      localCopyOnWriteArrayList.add(i2, localo);
      label203: Object localObject2 = (List)this.f.get(paramObject);
      if (localObject2 == null)
      {
        localObject2 = new ArrayList();
        this.f.put(paramObject, localObject2);
      }
      ((List)localObject2).add(localClass);
    }
    monitorexit;
  }

  final void a(j paramj)
  {
    Object localObject = paramj.a;
    o localo = paramj.b;
    j.a(paramj);
    if (localo.c)
      a(localo, localObject);
  }

  public final void a(Object paramObject)
  {
    e(paramObject);
  }

  final ExecutorService b()
  {
    return this.l;
  }

  public final boolean b(Object paramObject)
  {
    monitorenter;
    try
    {
      boolean bool = this.f.containsKey(paramObject);
      monitorexit;
      return bool;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void c(Object paramObject)
  {
    monitorenter;
    while (true)
    {
      try
      {
        List localList1 = (List)this.f.get(paramObject);
        if (localList1 == null)
          continue;
        Iterator localIterator = localList1.iterator();
        if (!localIterator.hasNext())
          continue;
        Class localClass = (Class)localIterator.next();
        List localList2 = (List)this.e.get(localClass);
        if (localList2 == null)
          continue;
        i1 = localList2.size();
        i2 = 0;
        if (i2 >= i1)
          continue;
        o localo = (o)localList2.get(i2);
        if (localo.a == paramObject)
        {
          localo.c = false;
          localList2.remove(i2);
          i3 = i2 - 1;
          i4 = i1 - 1;
          break label192;
          this.f.remove(paramObject);
          return;
          new StringBuilder("Subscriber to unregister was not registered before: ").append(paramObject.getClass());
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      int i3 = i2;
      int i4 = i1;
      label192: int i5 = i3 + 1;
      int i1 = i4;
      int i2 = i5;
    }
  }

  public final void d(Object paramObject)
  {
    f localf = (f)this.g.get();
    List localList1 = localf.a;
    localList1.add(paramObject);
    boolean bool1;
    if (!localf.b)
    {
      if (Looper.getMainLooper() != Looper.myLooper())
        break label253;
      bool1 = true;
      localf.c = bool1;
      localf.b = true;
    }
    while (true)
    {
      Object localObject2;
      Class localClass;
      boolean bool3;
      try
      {
        if (localList1.isEmpty())
          break label242;
        localObject2 = localList1.remove(0);
        localClass = localObject2.getClass();
        if (this.q)
        {
          List localList2 = a(localClass);
          int i2 = localList2.size();
          int i3 = 0;
          bool3 = false;
          if (i3 >= i2)
            break label259;
          bool3 |= a(localObject2, localf, (Class)localList2.get(i3));
          i3++;
          continue;
          if (i1 != 0)
            continue;
          if (!this.n)
            continue;
          new StringBuilder("No subscribers registered for event ").append(localClass);
          if ((!this.p) || (localClass == i.class) || (localClass == l.class))
            continue;
          d(new i());
          continue;
        }
      }
      finally
      {
        localf.b = false;
        localf.c = false;
      }
      boolean bool2 = a(localObject2, localf, localClass);
      int i1 = bool2;
      continue;
      label242: localf.b = false;
      localf.c = false;
      return;
      label253: bool1 = false;
      break;
      label259: i1 = bool3;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     de.greenrobot.event.c
 * JD-Core Version:    0.6.0
 */