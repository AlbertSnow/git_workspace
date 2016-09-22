package com.wandoujia.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class z
{
  public static z a()
  {
    try
    {
      Class localClass = Class.forName("sun.misc.Unsafe");
      Field localField = localClass.getDeclaredField("theUnsafe");
      localField.setAccessible(true);
      Object localObject = localField.get(null);
      aa localaa = new aa(localClass.getMethod("allocateInstance", new Class[] { Class.class }), localObject);
      return localaa;
    }
    catch (Exception localException1)
    {
      try
      {
        Method localMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[] { Class.class, Class.class });
        localMethod3.setAccessible(true);
        ab localab = new ab(localMethod3);
        return localab;
      }
      catch (Exception localException2)
      {
        try
        {
          Method localMethod1 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[] { Class.class });
          localMethod1.setAccessible(true);
          int i = ((Integer)localMethod1.invoke(null, new Object[] { Object.class })).intValue();
          Class[] arrayOfClass = new Class[2];
          arrayOfClass[0] = Class.class;
          arrayOfClass[1] = Integer.TYPE;
          Method localMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", arrayOfClass);
          localMethod2.setAccessible(true);
          ac localac = new ac(localMethod2, i);
          return localac;
        }
        catch (Exception localException3)
        {
        }
      }
    }
    return new ad();
  }

  public abstract <T> T a(Class<T> paramClass);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.z
 * JD-Core Version:    0.6.0
 */