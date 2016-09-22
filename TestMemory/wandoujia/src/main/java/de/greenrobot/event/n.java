package de.greenrobot.event;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

final class n
{
  private static final Map<String, List<m>> a = new HashMap();
  private final Map<Class<?>, Class<?>> b = new ConcurrentHashMap();

  final List<m> a(Class<?> paramClass)
  {
    String str1 = paramClass.getName();
    synchronized (a)
    {
      List localList = (List)a.get(str1);
      if (localList != null)
        return localList;
    }
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    StringBuilder localStringBuilder = new StringBuilder();
    for (Object localObject2 = paramClass; localObject2 != null; localObject2 = ((Class)localObject2).getSuperclass())
    {
      String str2 = ((Class)localObject2).getName();
      if ((str2.startsWith("java.")) || (str2.startsWith("javax.")) || (str2.startsWith("android.")))
        break;
      Method[] arrayOfMethod = ((Class)localObject2).getDeclaredMethods();
      int i = arrayOfMethod.length;
      int j = 0;
      if (j >= i)
        continue;
      Method localMethod = arrayOfMethod[j];
      String str3 = localMethod.getName();
      String str4;
      ThreadMode localThreadMode;
      if (str3.startsWith("onEvent"))
      {
        int k = localMethod.getModifiers();
        if (((k & 0x1) == 0) || ((k & 0x1448) != 0))
          break label388;
        Class[] arrayOfClass = localMethod.getParameterTypes();
        if (arrayOfClass.length == 1)
        {
          str4 = str3.substring(7);
          if (str4.length() != 0)
            break label295;
          localThreadMode = ThreadMode.PostThread;
          label219: Class localClass = arrayOfClass[0];
          localStringBuilder.setLength(0);
          localStringBuilder.append(str3);
          localStringBuilder.append('>').append(localClass.getName());
          if (localHashSet.add(localStringBuilder.toString()))
            localArrayList.add(new m(localMethod, localThreadMode, localClass));
        }
      }
      while (true)
      {
        j++;
        break;
        label295: if (str4.equals("MainThread"))
        {
          localThreadMode = ThreadMode.MainThread;
          break label219;
        }
        if (str4.equals("BackgroundThread"))
        {
          localThreadMode = ThreadMode.BackgroundThread;
          break label219;
        }
        if (str4.equals("Async"))
        {
          localThreadMode = ThreadMode.Async;
          break label219;
        }
        if (this.b.containsKey(localObject2))
          continue;
        throw new EventBusException("Illegal onEvent method, check for typos: " + localMethod);
        label388: if (this.b.containsKey(localObject2))
          continue;
        new StringBuilder("Skipping method (not public, static or abstract): ").append(localObject2).append(".").append(str3);
      }
    }
    if (localArrayList.isEmpty())
      throw new EventBusException("Subscriber " + paramClass + " has no public methods called onEvent");
    synchronized (a)
    {
      a.put(str1, localArrayList);
      return localArrayList;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     de.greenrobot.event.n
 * JD-Core Version:    0.6.0
 */