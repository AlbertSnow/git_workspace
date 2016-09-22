package com.wandoujia.base.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class JavaCalls
{
  private static final String LOG_TAG = "JavaCalls";
  private static final Map<Class<?>, Class<?>> PRIMITIVE_MAP;

  static
  {
    HashMap localHashMap = new HashMap();
    PRIMITIVE_MAP = localHashMap;
    localHashMap.put(Boolean.class, Boolean.TYPE);
    PRIMITIVE_MAP.put(Byte.class, Byte.TYPE);
    PRIMITIVE_MAP.put(Character.class, Character.TYPE);
    PRIMITIVE_MAP.put(Short.class, Short.TYPE);
    PRIMITIVE_MAP.put(Integer.class, Integer.TYPE);
    PRIMITIVE_MAP.put(Float.class, Float.TYPE);
    PRIMITIVE_MAP.put(Long.class, Long.TYPE);
    PRIMITIVE_MAP.put(Double.class, Double.TYPE);
    PRIMITIVE_MAP.put(Boolean.TYPE, Boolean.TYPE);
    PRIMITIVE_MAP.put(Byte.TYPE, Byte.TYPE);
    PRIMITIVE_MAP.put(Character.TYPE, Character.TYPE);
    PRIMITIVE_MAP.put(Short.TYPE, Short.TYPE);
    PRIMITIVE_MAP.put(Integer.TYPE, Integer.TYPE);
    PRIMITIVE_MAP.put(Float.TYPE, Float.TYPE);
    PRIMITIVE_MAP.put(Long.TYPE, Long.TYPE);
    PRIMITIVE_MAP.put(Double.TYPE, Double.TYPE);
  }

  public static <T> T callMethod(Object paramObject, String paramString, Object[] paramArrayOfObject)
  {
    try
    {
      Object localObject = callMethodOrThrow(paramObject, paramString, paramArrayOfObject);
      return localObject;
    }
    catch (Exception localException)
    {
      new StringBuilder("Meet exception when call Method '").append(paramString).append("' in ").append(paramObject);
    }
    return null;
  }

  public static <T> T callMethodOrThrow(Object paramObject, String paramString, Object[] paramArrayOfObject)
  {
    return getDeclaredMethod(paramObject.getClass(), paramString, getParameterTypes(paramArrayOfObject)).invoke(paramObject, getParameters(paramArrayOfObject));
  }

  public static <T> T callStaticMethod(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    try
    {
      Object localObject = callStaticMethodOrThrow(Class.forName(paramString1), paramString2, paramArrayOfObject);
      return localObject;
    }
    catch (Exception localException)
    {
      new StringBuilder("Meet exception when call Method '").append(paramString2).append("' in ").append(paramString1);
    }
    return null;
  }

  public static <T> T callStaticMethodOrThrow(Class<?> paramClass, String paramString, Object[] paramArrayOfObject)
  {
    return getDeclaredMethod(paramClass, paramString, getParameterTypes(paramArrayOfObject)).invoke(null, getParameters(paramArrayOfObject));
  }

  public static <T> T callStaticMethodOrThrow(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    return getDeclaredMethod(Class.forName(paramString1), paramString2, getParameterTypes(paramArrayOfObject)).invoke(null, getParameters(paramArrayOfObject));
  }

  private static boolean compareClassLists(Class<?>[] paramArrayOfClass1, Class<?>[] paramArrayOfClass2)
  {
    int k;
    if (paramArrayOfClass1 == null)
      if (paramArrayOfClass2 != null)
      {
        int i1 = paramArrayOfClass2.length;
        k = 0;
        if (i1 != 0);
      }
      else
      {
        k = 1;
      }
    int i;
    int j;
    do
    {
      while (true)
      {
        return k;
        if (paramArrayOfClass2 != null)
          break;
        int n = paramArrayOfClass1.length;
        k = 0;
        if (n == 0)
          return true;
      }
      i = paramArrayOfClass1.length;
      j = paramArrayOfClass2.length;
      k = 0;
    }
    while (i != j);
    for (int m = 0; ; m++)
    {
      if (m >= paramArrayOfClass1.length)
        break label150;
      if (paramArrayOfClass1[m].isAssignableFrom(paramArrayOfClass2[m]))
        continue;
      boolean bool1 = PRIMITIVE_MAP.containsKey(paramArrayOfClass1[m]);
      k = 0;
      if (!bool1)
        break;
      boolean bool2 = ((Class)PRIMITIVE_MAP.get(paramArrayOfClass1[m])).equals(PRIMITIVE_MAP.get(paramArrayOfClass2[m]));
      k = 0;
      if (!bool2)
        break;
    }
    label150: return true;
  }

  private static Method findMethodByName(Method[] paramArrayOfMethod, String paramString, Class<?>[] paramArrayOfClass)
  {
    if (paramString == null)
      throw new NullPointerException("Method name must not be null.");
    int i = paramArrayOfMethod.length;
    for (int j = 0; j < i; j++)
    {
      Method localMethod = paramArrayOfMethod[j];
      if ((localMethod.getName().equals(paramString)) && (compareClassLists(localMethod.getParameterTypes(), paramArrayOfClass)))
        return localMethod;
    }
    return null;
  }

  private static Method getDeclaredMethod(Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass)
  {
    Method localMethod;
    while (true)
    {
      localMethod = findMethodByName(paramClass.getDeclaredMethods(), paramString, paramArrayOfClass);
      if (localMethod != null)
        break;
      if (paramClass.getSuperclass() != null)
      {
        paramClass = paramClass.getSuperclass();
        continue;
      }
      throw new NoSuchMethodException();
    }
    localMethod.setAccessible(true);
    return localMethod;
  }

  private static Object getDefaultValue(Class<?> paramClass)
  {
    if ((Integer.TYPE.equals(paramClass)) || (Integer.class.equals(paramClass)) || (Byte.TYPE.equals(paramClass)) || (Byte.class.equals(paramClass)) || (Short.TYPE.equals(paramClass)) || (Short.class.equals(paramClass)) || (Long.TYPE.equals(paramClass)) || (Long.class.equals(paramClass)) || (Double.TYPE.equals(paramClass)) || (Double.class.equals(paramClass)) || (Float.TYPE.equals(paramClass)) || (Float.class.equals(paramClass)))
      return Integer.valueOf(0);
    if ((Boolean.TYPE.equals(paramClass)) || (Boolean.class.equals(paramClass)))
      return Boolean.valueOf(false);
    if ((Character.TYPE.equals(paramClass)) || (Character.class.equals(paramClass)))
      return Character.valueOf('\000');
    return null;
  }

  public static <T> T getField(Object paramObject, String paramString)
  {
    try
    {
      Object localObject = getFieldOrThrow(paramObject, paramString);
      return localObject;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      return null;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label11: break label11;
    }
  }

  public static <T> T getFieldOrThrow(Object paramObject, String paramString)
  {
    Class localClass = paramObject.getClass();
    Field localField = null;
    while (true)
      if (localField == null)
        try
        {
          localField = localClass.getDeclaredField(paramString);
          localField.setAccessible(true);
          if (localClass != null)
            continue;
          throw new NoSuchFieldException();
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          while (true)
            localClass = localClass.getSuperclass();
        }
    localField.setAccessible(true);
    return localField.get(paramObject);
  }

  private static Class<?>[] getParameterTypes(Object[] paramArrayOfObject)
  {
    Object localObject1 = null;
    if (paramArrayOfObject != null)
    {
      int i = paramArrayOfObject.length;
      localObject1 = null;
      if (i > 0)
      {
        Class[] arrayOfClass1 = new Class[paramArrayOfObject.length];
        int j = 0;
        if (j < paramArrayOfObject.length)
        {
          Object localObject2 = paramArrayOfObject[j];
          Class localClass;
          int k;
          Class[] arrayOfClass2;
          if ((localObject2 != null) && ((localObject2 instanceof JavaCalls.JavaParam)))
          {
            localClass = ((JavaCalls.JavaParam)localObject2).clazz;
            k = j;
            arrayOfClass2 = arrayOfClass1;
          }
          while (true)
          {
            arrayOfClass2[k] = localClass;
            j++;
            break;
            if (localObject2 == null)
            {
              k = j;
              arrayOfClass2 = arrayOfClass1;
              localClass = null;
              continue;
            }
            localClass = localObject2.getClass();
            k = j;
            arrayOfClass2 = arrayOfClass1;
          }
        }
        localObject1 = arrayOfClass1;
      }
    }
    return localObject1;
  }

  private static Object[] getParameters(Object[] paramArrayOfObject)
  {
    Object localObject1 = null;
    if (paramArrayOfObject != null)
    {
      int i = paramArrayOfObject.length;
      localObject1 = null;
      if (i > 0)
      {
        Object[] arrayOfObject = new Object[paramArrayOfObject.length];
        int j = 0;
        if (j < paramArrayOfObject.length)
        {
          Object localObject2 = paramArrayOfObject[j];
          if ((localObject2 != null) && ((localObject2 instanceof JavaCalls.JavaParam)))
            arrayOfObject[j] = ((JavaCalls.JavaParam)localObject2).obj;
          while (true)
          {
            j++;
            break;
            arrayOfObject[j] = localObject2;
          }
        }
        localObject1 = arrayOfObject;
      }
    }
    return localObject1;
  }

  public static <T> T newEmptyInstance(Class<?> paramClass)
  {
    try
    {
      Object localObject = newEmptyInstanceOrThrow(paramClass);
      return localObject;
    }
    catch (Exception localException)
    {
      new StringBuilder("Meet exception when make instance as a ").append(paramClass.getSimpleName());
    }
    return null;
  }

  public static <T> T newEmptyInstanceOrThrow(Class<?> paramClass)
  {
    int i = 0;
    Constructor[] arrayOfConstructor = paramClass.getDeclaredConstructors();
    if ((arrayOfConstructor == null) || (arrayOfConstructor.length == 0))
      throw new IllegalArgumentException("Can't get even one available constructor for " + paramClass);
    Constructor localConstructor = arrayOfConstructor[0];
    localConstructor.setAccessible(true);
    Class[] arrayOfClass = localConstructor.getParameterTypes();
    if ((arrayOfClass == null) || (arrayOfClass.length == 0))
      return localConstructor.newInstance(new Object[0]);
    Object[] arrayOfObject = new Object[arrayOfClass.length];
    while (i < arrayOfClass.length)
    {
      arrayOfObject[i] = getDefaultValue(arrayOfClass[i]);
      i++;
    }
    return localConstructor.newInstance(arrayOfObject);
  }

  public static <T> T newInstance(Class<?> paramClass, Object[] paramArrayOfObject)
  {
    try
    {
      Object localObject = newInstanceOrThrow(paramClass, paramArrayOfObject);
      return localObject;
    }
    catch (Exception localException)
    {
      new StringBuilder("Meet exception when make instance as a ").append(paramClass.getSimpleName());
    }
    return null;
  }

  public static Object newInstance(String paramString, Object[] paramArrayOfObject)
  {
    try
    {
      Object localObject = newInstanceOrThrow(paramString, paramArrayOfObject);
      return localObject;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static <T> T newInstanceOrThrow(Class<?> paramClass, Object[] paramArrayOfObject)
  {
    return paramClass.getConstructor(getParameterTypes(paramArrayOfObject)).newInstance(getParameters(paramArrayOfObject));
  }

  public static Object newInstanceOrThrow(String paramString, Object[] paramArrayOfObject)
  {
    return newInstanceOrThrow(Class.forName(paramString), getParameters(paramArrayOfObject));
  }

  public static void setField(Object paramObject1, String paramString, Object paramObject2)
  {
    try
    {
      setFieldOrThrow(paramObject1, paramString, paramObject2);
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
  }

  public static void setFieldOrThrow(Object paramObject1, String paramString, Object paramObject2)
  {
    Class localClass = paramObject1.getClass();
    Object localObject = null;
    while (true)
      if (localObject == null)
        try
        {
          Field localField = localClass.getDeclaredField(paramString);
          localObject = localField;
          if (localClass != null)
            continue;
          throw new NoSuchFieldException();
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          while (true)
            localClass = localClass.getSuperclass();
        }
    localObject.setAccessible(true);
    localObject.set(paramObject1, paramObject2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.reflect.JavaCalls
 * JD-Core Version:    0.6.0
 */