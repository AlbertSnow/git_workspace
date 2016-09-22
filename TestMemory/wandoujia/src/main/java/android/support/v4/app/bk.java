package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.os.Bundle;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.List;

final class bk
{
  private static final Object a = new Object();
  private static Field b;
  private static boolean c;

  static
  {
    new Object();
  }

  public static Bundle a(Notification.Builder paramBuilder, bi parambi)
  {
    paramBuilder.addAction(parambi.a(), parambi.b(), parambi.c());
    return new Bundle(parambi.d());
  }

  public static Bundle a(Notification paramNotification)
  {
    synchronized (a)
    {
      if (c)
        return null;
    }
    try
    {
      if (b == null)
      {
        Field localField = Notification.class.getDeclaredField("extras");
        if (!Bundle.class.isAssignableFrom(localField.getType()))
        {
          c = true;
          monitorexit;
          return null;
        }
        localField.setAccessible(true);
        b = localField;
      }
      Bundle localBundle = (Bundle)b.get(paramNotification);
      if (localBundle == null)
      {
        localBundle = new Bundle();
        b.set(paramNotification, localBundle);
      }
      monitorexit;
      return localBundle;
      localObject2 = finally;
      monitorexit;
      throw localObject2;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      c = true;
      monitorexit;
      return null;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label110: break label110;
    }
  }

  public static SparseArray<Bundle> a(List<Bundle> paramList)
  {
    SparseArray localSparseArray = null;
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      Bundle localBundle = (Bundle)paramList.get(j);
      if (localBundle == null)
        continue;
      if (localSparseArray == null)
        localSparseArray = new SparseArray();
      localSparseArray.put(j, localBundle);
    }
    return localSparseArray;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.bk
 * JD-Core Version:    0.6.0
 */