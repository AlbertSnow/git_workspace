package com.wandoujia.gson.b;

import android.support.v4.app.b;
import com.wandoujia.gson.internal..Gson.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

public class a<T>
{
  final int hashCode;
  final Class<? super T> rawType;
  final Type type;

  protected a()
  {
    this.type = getSuperclassTypeParameter(getClass());
    this.rawType = .Gson.Types.b(this.type);
    this.hashCode = this.type.hashCode();
  }

  a(Type paramType)
  {
    this.type = .Gson.Types.a((Type)b.c(paramType));
    this.rawType = .Gson.Types.b(this.type);
    this.hashCode = this.type.hashCode();
  }

  private static AssertionError buildUnexpectedTypeError(Type paramType, Class<?>[] paramArrayOfClass)
  {
    StringBuilder localStringBuilder = new StringBuilder("Unexpected type. Expected one of: ");
    int i = paramArrayOfClass.length;
    for (int j = 0; j < i; j++)
      localStringBuilder.append(paramArrayOfClass[j].getName()).append(", ");
    localStringBuilder.append("but got: ").append(paramType.getClass().getName()).append(", for type token: ").append(paramType.toString()).append('.');
    return new AssertionError(localStringBuilder.toString());
  }

  public static <T> a<T> get(Class<T> paramClass)
  {
    return new a(paramClass);
  }

  public static a<?> get(Type paramType)
  {
    return new a(paramType);
  }

  static Type getSuperclassTypeParameter(Class<?> paramClass)
  {
    Type localType = paramClass.getGenericSuperclass();
    if ((localType instanceof Class))
      throw new RuntimeException("Missing type parameter.");
    return .Gson.Types.a(((ParameterizedType)localType).getActualTypeArguments()[0]);
  }

  private static boolean isAssignableFrom(Type paramType, GenericArrayType paramGenericArrayType)
  {
    Type localType = paramGenericArrayType.getGenericComponentType();
    if ((localType instanceof ParameterizedType))
    {
      if ((paramType instanceof GenericArrayType))
        paramType = ((GenericArrayType)paramType).getGenericComponentType();
      while (true)
      {
        return isAssignableFrom(paramType, (ParameterizedType)localType, new HashMap());
        if (!(paramType instanceof Class))
          continue;
        for (paramType = (Class)paramType; paramType.isArray(); paramType = paramType.getComponentType());
      }
    }
    return true;
  }

  private static boolean isAssignableFrom(Type paramType, ParameterizedType paramParameterizedType, Map<String, Type> paramMap)
  {
    Object localObject = paramType;
    if (localObject == null)
      return false;
    if (paramParameterizedType.equals(localObject))
      return true;
    Class localClass = .Gson.Types.b((Type)localObject);
    if ((localObject instanceof ParameterizedType));
    for (ParameterizedType localParameterizedType = (ParameterizedType)localObject; ; localParameterizedType = null)
    {
      if (localParameterizedType != null)
      {
        Type[] arrayOfType2 = localParameterizedType.getActualTypeArguments();
        TypeVariable[] arrayOfTypeVariable = localClass.getTypeParameters();
        for (int k = 0; k < arrayOfType2.length; k++)
        {
          Type localType2 = arrayOfType2[k];
          TypeVariable localTypeVariable = arrayOfTypeVariable[k];
          while ((localType2 instanceof TypeVariable))
            localType2 = (Type)paramMap.get(((TypeVariable)localType2).getName());
          paramMap.put(localTypeVariable.getName(), localType2);
        }
        if (typeEquals(localParameterizedType, paramParameterizedType, paramMap))
          return true;
      }
      Type[] arrayOfType1 = localClass.getGenericInterfaces();
      int i = arrayOfType1.length;
      for (int j = 0; j < i; j++)
        if (isAssignableFrom(arrayOfType1[j], paramParameterizedType, new HashMap(paramMap)))
          return true;
      Type localType1 = localClass.getGenericSuperclass();
      paramMap = new HashMap(paramMap);
      localObject = localType1;
      break;
    }
  }

  private static boolean matches(Type paramType1, Type paramType2, Map<String, Type> paramMap)
  {
    return (paramType2.equals(paramType1)) || (((paramType1 instanceof TypeVariable)) && (paramType2.equals(paramMap.get(((TypeVariable)paramType1).getName()))));
  }

  private static boolean typeEquals(ParameterizedType paramParameterizedType1, ParameterizedType paramParameterizedType2, Map<String, Type> paramMap)
  {
    Type[] arrayOfType1;
    Type[] arrayOfType2;
    if (paramParameterizedType1.getRawType().equals(paramParameterizedType2.getRawType()))
    {
      arrayOfType1 = paramParameterizedType1.getActualTypeArguments();
      arrayOfType2 = paramParameterizedType2.getActualTypeArguments();
    }
    for (int i = 0; i < arrayOfType1.length; i++)
      if (!matches(arrayOfType1[i], arrayOfType2[i], paramMap))
        return false;
    return true;
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof a)) && (.Gson.Types.a(this.type, ((a)paramObject).type));
  }

  public final Class<? super T> getRawType()
  {
    return this.rawType;
  }

  public final Type getType()
  {
    return this.type;
  }

  public final int hashCode()
  {
    return this.hashCode;
  }

  @Deprecated
  public boolean isAssignableFrom(a<?> parama)
  {
    return isAssignableFrom(parama.getType());
  }

  @Deprecated
  public boolean isAssignableFrom(Class<?> paramClass)
  {
    return isAssignableFrom(paramClass);
  }

  @Deprecated
  public boolean isAssignableFrom(Type paramType)
  {
    if (paramType == null)
      return false;
    if (this.type.equals(paramType))
      return true;
    if ((this.type instanceof Class))
      return this.rawType.isAssignableFrom(.Gson.Types.b(paramType));
    if ((this.type instanceof ParameterizedType))
      return isAssignableFrom(paramType, (ParameterizedType)this.type, new HashMap());
    if ((this.type instanceof GenericArrayType))
      return (this.rawType.isAssignableFrom(.Gson.Types.b(paramType))) && (isAssignableFrom(paramType, (GenericArrayType)this.type));
    throw buildUnexpectedTypeError(this.type, new Class[] { Class.class, ParameterizedType.class, GenericArrayType.class });
  }

  public final String toString()
  {
    return .Gson.Types.c(this.type);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.b.a
 * JD-Core Version:    0.6.0
 */