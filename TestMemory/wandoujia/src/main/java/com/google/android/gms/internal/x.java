package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public abstract class x<T extends x>
{
  public static String a(Object paramObject)
  {
    return a(paramObject, 0);
  }

  private static String a(Object paramObject, int paramInt)
  {
    if (paramInt > 10)
      return "ERROR: Recursive toString calls";
    if (paramObject == null)
      return "";
    if ((paramObject instanceof String))
    {
      if (TextUtils.isEmpty((String)paramObject))
        return "";
      return paramObject.toString();
    }
    if ((paramObject instanceof Integer))
    {
      if (((Integer)paramObject).intValue() == 0)
        return "";
      return paramObject.toString();
    }
    if ((paramObject instanceof Long))
    {
      if (((Long)paramObject).longValue() == 0L)
        return "";
      return paramObject.toString();
    }
    if ((paramObject instanceof Double))
    {
      if (((Double)paramObject).doubleValue() == 0.0D)
        return "";
      return paramObject.toString();
    }
    if ((paramObject instanceof Boolean))
    {
      if (!((Boolean)paramObject).booleanValue())
        return "";
      return paramObject.toString();
    }
    if ((paramObject instanceof List))
    {
      StringBuffer localStringBuffer1 = new StringBuffer();
      if (paramInt > 0)
        localStringBuffer1.append("[");
      List localList = (List)paramObject;
      int i = localStringBuffer1.length();
      Iterator localIterator1 = localList.iterator();
      while (localIterator1.hasNext())
      {
        Object localObject = localIterator1.next();
        if (localStringBuffer1.length() > i)
          localStringBuffer1.append(", ");
        localStringBuffer1.append(a(localObject, paramInt + 1));
      }
      if (paramInt > 0)
        localStringBuffer1.append("]");
      return localStringBuffer1.toString();
    }
    if ((paramObject instanceof Map))
    {
      StringBuffer localStringBuffer2 = new StringBuffer();
      Iterator localIterator2 = new TreeMap((Map)paramObject).entrySet().iterator();
      int j = 0;
      int k = 0;
      while (localIterator2.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator2.next();
        String str = a(localEntry.getValue(), paramInt + 1);
        if (TextUtils.isEmpty(str))
          continue;
        if ((paramInt > 0) && (k == 0))
        {
          localStringBuffer2.append("{");
          k = 1;
          j = localStringBuffer2.length();
        }
        if (localStringBuffer2.length() > j)
          localStringBuffer2.append(", ");
        localStringBuffer2.append((String)localEntry.getKey());
        localStringBuffer2.append('=');
        localStringBuffer2.append(str);
      }
      if (k != 0)
        localStringBuffer2.append("}");
      return localStringBuffer2.toString();
    }
    return paramObject.toString();
  }

  public static String a(Map paramMap)
  {
    return a(paramMap, 1);
  }

  public abstract void a(T paramT);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.x
 * JD-Core Version:    0.6.0
 */