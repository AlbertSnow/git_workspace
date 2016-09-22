package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class ah
{
  private static String a;
  private static Boolean b;
  private static a c;

  static
  {
    new Long(0L);
    new Double(0.0D);
    zzde.zzT(0L);
    a = new String("");
    b = new Boolean(false);
    new ArrayList(0);
    new HashMap();
    c = a(a);
  }

  public static a a()
  {
    return c;
  }

  public static a a(Object paramObject)
  {
    int i = 1;
    boolean bool1 = false;
    a locala1 = new a();
    if ((paramObject instanceof a))
      return (a)paramObject;
    if ((paramObject instanceof String))
    {
      locala1.a = i;
      locala1.b = ((String)paramObject);
    }
    while (true)
    {
      locala1.l = bool1;
      return locala1;
      if ((paramObject instanceof List))
      {
        locala1.a = 2;
        List localList = (List)paramObject;
        ArrayList localArrayList3 = new ArrayList(localList.size());
        Iterator localIterator2 = localList.iterator();
        boolean bool4 = false;
        if (localIterator2.hasNext())
        {
          a locala4 = a(localIterator2.next());
          if (locala4 == c)
            return c;
          if ((bool4) || (locala4.l));
          for (boolean bool5 = i; ; bool5 = false)
          {
            localArrayList3.add(locala4);
            bool4 = bool5;
            break;
          }
        }
        locala1.c = ((a[])localArrayList3.toArray(new a[0]));
        bool1 = bool4;
        continue;
      }
      if ((paramObject instanceof Map))
      {
        locala1.a = 3;
        Set localSet = ((Map)paramObject).entrySet();
        ArrayList localArrayList1 = new ArrayList(localSet.size());
        ArrayList localArrayList2 = new ArrayList(localSet.size());
        Iterator localIterator1 = localSet.iterator();
        boolean bool2 = false;
        if (localIterator1.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator1.next();
          a locala2 = a(localEntry.getKey());
          a locala3 = a(localEntry.getValue());
          if ((locala2 == c) || (locala3 == c))
            return c;
          if ((bool2) || (locala2.l) || (locala3.l));
          for (boolean bool3 = i; ; bool3 = false)
          {
            localArrayList1.add(locala2);
            localArrayList2.add(locala3);
            bool2 = bool3;
            break;
          }
        }
        locala1.d = ((a[])localArrayList1.toArray(new a[0]));
        locala1.e = ((a[])localArrayList2.toArray(new a[0]));
        bool1 = bool2;
        continue;
      }
      if (((paramObject instanceof Double)) || ((paramObject instanceof Float)) || (((paramObject instanceof zzde)) && (((zzde)paramObject).zzzF())));
      for (int j = i; ; j = 0)
      {
        if (j == 0)
          break label489;
        locala1.a = i;
        locala1.b = paramObject.toString();
        bool1 = false;
        break;
      }
      label489: long l;
      if (((paramObject instanceof Byte)) || ((paramObject instanceof Short)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Long)) || (((paramObject instanceof zzde)) && (((zzde)paramObject).zzzG())))
      {
        label534: if (i == 0)
          break label585;
        locala1.a = 6;
        if (!(paramObject instanceof Number))
          break label576;
        l = ((Number)paramObject).longValue();
      }
      while (true)
      {
        locala1.h = l;
        bool1 = false;
        break;
        i = 0;
        break label534;
        label576: q.a();
        l = 0L;
      }
      label585: if (!(paramObject instanceof Boolean))
        break;
      locala1.a = 8;
      locala1.i = ((Boolean)paramObject).booleanValue();
      bool1 = false;
    }
    StringBuilder localStringBuilder = new StringBuilder("Converting to Value from unknown object type: ");
    if (paramObject == null);
    for (String str = "null"; ; str = paramObject.getClass().toString())
    {
      localStringBuilder.append(str);
      q.a();
      return c;
    }
  }

  public static String a(a parama)
  {
    return b(c(parama));
  }

  public static Boolean b(a parama)
  {
    Object localObject = c(parama);
    if ((localObject instanceof Boolean))
      return (Boolean)localObject;
    String str = b(localObject);
    if ("true".equalsIgnoreCase(str))
      return Boolean.TRUE;
    if ("false".equalsIgnoreCase(str))
      return Boolean.FALSE;
    return b;
  }

  private static String b(Object paramObject)
  {
    if (paramObject == null)
      return a;
    return paramObject.toString();
  }

  public static Object c(a parama)
  {
    int i = 0;
    if (parama == null)
      return null;
    switch (parama.a)
    {
    default:
      new StringBuilder("Failed to convert a value of type: ").append(parama.a);
      q.a();
      return null;
    case 1:
      return parama.b;
    case 2:
      ArrayList localArrayList = new ArrayList(parama.c.length);
      a[] arrayOfa2 = parama.c;
      int k = arrayOfa2.length;
      while (i < k)
      {
        Object localObject3 = c(arrayOfa2[i]);
        if (localObject3 == null)
          return null;
        localArrayList.add(localObject3);
        i++;
      }
      return localArrayList;
    case 3:
      if (parama.d.length != parama.e.length)
      {
        new StringBuilder("Converting an invalid value to object: ").append(parama.toString());
        q.a();
        return null;
      }
      HashMap localHashMap = new HashMap(parama.e.length);
      while (i < parama.d.length)
      {
        Object localObject1 = c(parama.d[i]);
        Object localObject2 = c(parama.e[i]);
        if ((localObject1 == null) || (localObject2 == null))
          return null;
        localHashMap.put(localObject1, localObject2);
        i++;
      }
      return localHashMap;
    case 4:
      q.a();
      return null;
    case 5:
      q.a();
      return null;
    case 6:
      return Long.valueOf(parama.h);
    case 7:
      StringBuffer localStringBuffer = new StringBuffer();
      a[] arrayOfa1 = parama.j;
      int j = arrayOfa1.length;
      while (i < j)
      {
        String str = a(arrayOfa1[i]);
        if (str == a)
          return null;
        localStringBuffer.append(str);
        i++;
      }
      return localStringBuffer.toString();
    case 8:
    }
    return Boolean.valueOf(parama.i);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ah
 * JD-Core Version:    0.6.0
 */