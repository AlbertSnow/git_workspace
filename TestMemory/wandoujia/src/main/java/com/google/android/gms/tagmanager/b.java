package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Map<Ljava.lang.String;Ljava.lang.Object;>;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
{
  private static Object a = new Object();
  private static String[] b = "gtm.lifetime".toString().split("\\.");
  private static final Pattern c = Pattern.compile("(\\d+)\\s*([smhd]?)");
  private final ConcurrentHashMap<e, Integer> d;
  private final Map<String, Object> e;
  private final ReentrantLock f;
  private final LinkedList<Map<String, Object>> g;
  private final f h;
  private final CountDownLatch i;

  b()
  {
    this(new c());
  }

  b(f paramf)
  {
    this.h = paramf;
    this.d = new ConcurrentHashMap();
    this.e = new HashMap();
    this.f = new ReentrantLock();
    this.g = new LinkedList();
    this.i = new CountDownLatch(1);
    this.h.a(new g(this));
  }

  private static Long a(String paramString)
  {
    Matcher localMatcher = c.matcher(paramString);
    if (!localMatcher.matches())
    {
      q.d();
      return null;
    }
    long l1;
    try
    {
      long l2 = Long.parseLong(localMatcher.group(1));
      l1 = l2;
      if (l1 <= 0L)
      {
        q.d();
        return null;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
      {
        l1 = 0L;
        q.c();
      }
      String str = localMatcher.group(2);
      if (str.length() == 0)
        return Long.valueOf(l1);
      switch (str.charAt(0))
      {
      default:
        q.c();
        return null;
      case 's':
      case 'm':
      case 'h':
      case 'd':
      }
    }
    return Long.valueOf(l1 * 1000L);
    return Long.valueOf(60L * (l1 * 1000L));
    return Long.valueOf(60L * (60L * (l1 * 1000L)));
    return Long.valueOf(24L * (60L * (60L * (l1 * 1000L))));
  }

  static Map<String, Object> a(String paramString, Object paramObject)
  {
    HashMap localHashMap1 = new HashMap();
    String[] arrayOfString = paramString.toString().split("\\.");
    int j = 0;
    HashMap localHashMap2;
    for (Object localObject = localHashMap1; j < -1 + arrayOfString.length; localObject = localHashMap2)
    {
      localHashMap2 = new HashMap();
      ((Map)localObject).put(arrayOfString[j], localHashMap2);
      j++;
    }
    ((Map)localObject).put(arrayOfString[(-1 + arrayOfString.length)], paramObject);
    return (Map<String, Object>)localHashMap1;
  }

  private void a(List<Object> paramList1, List<Object> paramList2)
  {
    while (paramList2.size() < paramList1.size())
      paramList2.add(null);
    int j = 0;
    if (j < paramList1.size())
    {
      Object localObject = paramList1.get(j);
      if ((localObject instanceof List))
      {
        if (!(paramList2.get(j) instanceof List))
          paramList2.set(j, new ArrayList());
        a((List)localObject, (List)paramList2.get(j));
      }
      while (true)
      {
        j++;
        break;
        if ((localObject instanceof Map))
        {
          if (!(paramList2.get(j) instanceof Map))
            paramList2.set(j, new HashMap());
          a((Map)localObject, (Map)paramList2.get(j));
          continue;
        }
        if (localObject == a)
          continue;
        paramList2.set(j, localObject);
      }
    }
  }

  private void a(Map<String, Object> paramMap, String paramString, Collection<d> paramCollection)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      StringBuilder localStringBuilder = new StringBuilder().append(paramString);
      if (paramString.length() == 0);
      String str2;
      for (String str1 = ""; ; str1 = ".")
      {
        str2 = str1 + (String)localEntry.getKey();
        if (!(localEntry.getValue() instanceof Map))
          break label124;
        a((Map)localEntry.getValue(), str2, paramCollection);
        break;
      }
      label124: if (str2.equals("gtm.lifetime"))
        continue;
      paramCollection.add(new d(str2, localEntry.getValue()));
    }
  }

  private void a(Map<String, Object> paramMap1, Map<String, Object> paramMap2)
  {
    Iterator localIterator = paramMap1.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramMap1.get(str);
      if ((localObject instanceof List))
      {
        if (!(paramMap2.get(str) instanceof List))
          paramMap2.put(str, new ArrayList());
        a((List)localObject, (List)paramMap2.get(str));
        continue;
      }
      if ((localObject instanceof Map))
      {
        if (!(paramMap2.get(str) instanceof Map))
          paramMap2.put(str, new HashMap());
        a((Map)localObject, (Map)paramMap2.get(str));
        continue;
      }
      paramMap2.put(str, localObject);
    }
  }

  private void b(Map<String, Object> paramMap)
  {
    this.f.lock();
    while (true)
    {
      Map localMap1;
      try
      {
        this.g.offer(paramMap);
        if (this.f.getHoldCount() != 1)
          break label214;
        j = 0;
        localMap1 = (Map)this.g.poll();
        if (localMap1 == null)
          break label214;
        synchronized (this.e)
        {
          Iterator localIterator1 = localMap1.keySet().iterator();
          if (localIterator1.hasNext())
          {
            String str = (String)localIterator1.next();
            a(a(str, localMap1.get(str)), this.e);
          }
        }
      }
      finally
      {
        this.f.unlock();
      }
      monitorexit;
      Iterator localIterator2 = this.d.keySet().iterator();
      while (localIterator2.hasNext())
        ((e)localIterator2.next()).a(localMap1);
      int k = j + 1;
      if (k > 500)
      {
        this.g.clear();
        throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
        label214: Object localObject3 = c(paramMap);
        if (localObject3 == null);
        Long localLong;
        for (Object localObject4 = null; ; localObject4 = localLong)
        {
          if (localObject4 != null)
          {
            ArrayList localArrayList = new ArrayList();
            a(paramMap, "", localArrayList);
            localArrayList.remove("gtm.lifetime");
            this.h.a(localArrayList, localObject4.longValue());
          }
          this.f.unlock();
          return;
          localLong = a(localObject3.toString());
        }
      }
      int j = k;
    }
  }

  private static Object c(Map<String, Object> paramMap)
  {
    String[] arrayOfString = b;
    int j = arrayOfString.length;
    int k = 0;
    Object localObject2;
    for (Object localObject1 = paramMap; ; localObject1 = localObject2)
    {
      String str;
      if (k < j)
      {
        str = arrayOfString[k];
        if (!(localObject1 instanceof Map))
          localObject1 = null;
      }
      else
      {
        return localObject1;
      }
      localObject2 = ((Map)localObject1).get(str);
      k++;
    }
  }

  final void a(e parame)
  {
    this.d.put(parame, Integer.valueOf(0));
  }

  public final void a(Map<String, Object> paramMap)
  {
    try
    {
      this.i.await();
      b(paramMap);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        q.c();
    }
  }

  public final String toString()
  {
    StringBuilder localStringBuilder;
    synchronized (this.e)
    {
      localStringBuilder = new StringBuilder();
      Iterator localIterator = this.e.entrySet().iterator();
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = localEntry.getKey();
        arrayOfObject[1] = localEntry.getValue();
        localStringBuilder.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", arrayOfObject));
      }
    }
    String str = localStringBuilder.toString();
    monitorexit;
    return str;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.b
 * JD-Core Version:    0.6.0
 */