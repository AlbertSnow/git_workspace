package com.wandoujia.base.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionUtils
{
  public static <T> List<T> appendFromPosition(List<T> paramList1, List<T> paramList2, int paramInt)
  {
    if ((paramList1 == null) || (paramList1.isEmpty()))
    {
      paramList1 = new ArrayList();
      if (paramList2 != null)
        paramList1.addAll(paramList2);
    }
    do
      return paramList1;
    while ((paramList2 == null) || (paramList2.isEmpty()));
    if (paramInt > paramList1.size())
      paramInt = paramList1.size();
    ArrayList localArrayList = new ArrayList(paramList1);
    localArrayList.addAll(paramInt, paramList2);
    return localArrayList;
  }

  public static <T> ArrayList<T> copyFrom(List<T> paramList)
  {
    if (paramList == null)
      return null;
    return new ArrayList(paramList);
  }

  public static <T> boolean isEmpty(Collection<T> paramCollection)
  {
    return (paramCollection == null) || (paramCollection.isEmpty());
  }

  public static <T> List<T> notNull(List<T> paramList)
  {
    if (paramList == null)
      paramList = Collections.emptyList();
    return paramList;
  }

  public static <T> List<T> replaceFromPosition(List<T> paramList1, List<T> paramList2, int paramInt)
  {
    if ((paramList1 == null) || (paramList1.isEmpty()))
      paramList1 = paramList2;
    do
      return paramList1;
    while ((paramList2 == null) || (paramList2.isEmpty()));
    if (paramInt > paramList1.size())
      paramInt = paramList1.size();
    ArrayList localArrayList = new ArrayList(paramList1);
    int i = paramInt + paramList2.size();
    localArrayList.addAll(paramInt, paramList2);
    while (localArrayList.size() > i)
      localArrayList.remove(-1 + localArrayList.size());
    return localArrayList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.CollectionUtils
 * JD-Core Version:    0.6.0
 */