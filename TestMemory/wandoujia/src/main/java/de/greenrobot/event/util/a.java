package de.greenrobot.event.util;

import android.content.res.Resources;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  final Resources a;
  final int b;
  final int c;
  protected final Throwable d;

  public static Integer a(Throwable paramThrowable)
  {
    int i = 20;
    Object localObject1 = paramThrowable;
    Class localClass = localObject1.getClass();
    Object localObject2 = (Integer)null.get(localClass);
    Object localObject3;
    Object localObject4;
    label47: Map.Entry localEntry;
    Object localObject5;
    if (localObject2 == null)
    {
      Iterator localIterator = null.entrySet().iterator();
      localObject3 = null;
      localObject4 = localObject2;
      if (localIterator.hasNext())
      {
        localEntry = (Map.Entry)localIterator.next();
        localObject5 = (Class)localEntry.getKey();
        if ((!((Class)localObject5).isAssignableFrom(localClass)) || ((localObject3 != null) && (!localObject3.isAssignableFrom((Class)localObject5))))
          break label196;
      }
    }
    for (Object localObject6 = (Integer)localEntry.getValue(); ; localObject6 = localObject4)
    {
      localObject3 = localObject5;
      localObject4 = localObject6;
      break label47;
      localObject2 = localObject4;
      if (localObject2 != null)
        return localObject2;
      Throwable localThrowable = ((Throwable)localObject1).getCause();
      int j = i - 1;
      if ((j <= 0) || (localThrowable == paramThrowable) || (localThrowable == null))
      {
        new StringBuilder("No specific message ressource ID found for ").append(paramThrowable);
        return null;
      }
      i = j;
      localObject1 = localThrowable;
      break;
      label196: localObject5 = localObject3;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     de.greenrobot.event.util.a
 * JD-Core Version:    0.6.0
 */