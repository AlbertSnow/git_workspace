package com.wandoujia.base.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtil
{
  public static Object getField(Object paramObject, String paramString)
  {
    Class localClass = paramObject.getClass();
    try
    {
      Field localField = localClass.getDeclaredField(paramString);
      localField.setAccessible(true);
      Object localObject = localField.get(paramObject);
      return localObject;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      return null;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      label31: break label31;
    }
  }

  public static Object invokeMethod(Object paramObject, String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    return paramObject.getClass().getMethod(paramString, paramArrayOfClass).invoke(paramObject, paramArrayOfObject);
  }

  public static Object invokeMethod(Object paramObject, String paramString, Object[] paramArrayOfObject)
  {
    Class localClass = paramObject.getClass();
    Class[] arrayOfClass = new Class[paramArrayOfObject.length];
    for (int i = 0; i < paramArrayOfObject.length; i++)
      arrayOfClass[i] = paramArrayOfObject[i].getClass();
    return localClass.getMethod(paramString, arrayOfClass).invoke(paramObject, paramArrayOfObject);
  }

  public static Object invokeStaticMethod(Class paramClass, String paramString, Object[] paramArrayOfObject)
  {
    try
    {
      Object localObject = paramClass.getMethod(paramString, new Class[0]).invoke(paramClass, paramArrayOfObject);
      return localObject;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      return null;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      break label21;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label21;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label21;
    }
    catch (SecurityException localSecurityException)
    {
      label21: break label21;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ReflectionUtil
 * JD-Core Version:    0.6.0
 */