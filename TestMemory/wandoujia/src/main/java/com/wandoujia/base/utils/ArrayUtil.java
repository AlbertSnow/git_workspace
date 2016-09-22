package com.wandoujia.base.utils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayUtil
{
  public static <T> T[] combineArray(T[] paramArrayOfT1, T[] paramArrayOfT2)
  {
    Object[] arrayOfObject = copyOfRange(paramArrayOfT1, 0, paramArrayOfT1.length + paramArrayOfT2.length);
    System.arraycopy(paramArrayOfT2, 0, arrayOfObject, paramArrayOfT1.length, paramArrayOfT2.length);
    return arrayOfObject;
  }

  public static <T> T[] copyOfRange(T[] paramArrayOfT, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfT.length;
    if (paramInt1 > paramInt2)
      throw new IllegalArgumentException();
    if ((paramInt1 < 0) || (paramInt1 > i))
      throw new ArrayIndexOutOfBoundsException();
    int j = paramInt2 - paramInt1;
    int k = Math.min(j, i - paramInt1);
    Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), j);
    System.arraycopy(paramArrayOfT, paramInt1, arrayOfObject, 0, k);
    return arrayOfObject;
  }

  public static <T> T[] insert(T[] paramArrayOfT, int paramInt, T paramT)
  {
    Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), 1 + paramArrayOfT.length);
    int i = 0;
    if (i < arrayOfObject.length)
    {
      T ?;
      if (i < paramInt)
        ? = paramArrayOfT[i];
      while (true)
      {
        arrayOfObject[i] = ?;
        i++;
        break;
        if (i == paramInt)
        {
          ? = paramT;
          continue;
        }
        ? = paramArrayOfT[(i - 1)];
      }
    }
    return arrayOfObject;
  }

  public static List<Long> toList(long[] paramArrayOfLong)
  {
    ArrayList localArrayList;
    if (paramArrayOfLong == null)
      localArrayList = null;
    while (true)
    {
      return localArrayList;
      localArrayList = new ArrayList();
      int i = paramArrayOfLong.length;
      for (int j = 0; j < i; j++)
        localArrayList.add(Long.valueOf(paramArrayOfLong[j]));
    }
  }

  public static long[] toLongArray(List<Long> paramList)
  {
    if (paramList == null)
      return null;
    long[] arrayOfLong = new long[paramList.size()];
    for (int i = 0; i < paramList.size(); i++)
      arrayOfLong[i] = ((Long)paramList.get(i)).longValue();
    return arrayOfLong;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ArrayUtil
 * JD-Core Version:    0.6.0
 */