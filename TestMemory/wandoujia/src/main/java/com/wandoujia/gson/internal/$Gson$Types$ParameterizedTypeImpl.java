package com.wandoujia.gson.internal;

import android.support.v4.app.b;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class $Gson$Types$ParameterizedTypeImpl
  implements Serializable, ParameterizedType
{
  private static final long serialVersionUID;
  private final Type ownerType;
  private final Type rawType;
  private final Type[] typeArguments;

  public $Gson$Types$ParameterizedTypeImpl(Type paramType1, Type paramType2, Type[] paramArrayOfType)
  {
    boolean bool2;
    if ((paramType2 instanceof Class))
    {
      Class localClass = (Class)paramType2;
      if ((paramType1 != null) || (localClass.getEnclosingClass() == null))
      {
        bool2 = bool1;
        b.a(bool2);
        if ((paramType1 != null) && (localClass.getEnclosingClass() == null))
          break label153;
        label56: b.a(bool1);
      }
    }
    else
    {
      if (paramType1 != null)
        break label159;
    }
    label153: label159: for (Type localType = null; ; localType = .Gson.Types.a(paramType1))
    {
      this.ownerType = localType;
      this.rawType = .Gson.Types.a(paramType2);
      this.typeArguments = ((Type[])paramArrayOfType.clone());
      while (i < this.typeArguments.length)
      {
        b.c(this.typeArguments[i]);
        .Gson.Types.e(this.typeArguments[i]);
        this.typeArguments[i] = .Gson.Types.a(this.typeArguments[i]);
        i++;
      }
      bool2 = false;
      break;
      bool1 = false;
      break label56;
    }
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof ParameterizedType)) && (.Gson.Types.a(this, (ParameterizedType)paramObject));
  }

  public final Type[] getActualTypeArguments()
  {
    return (Type[])this.typeArguments.clone();
  }

  public final Type getOwnerType()
  {
    return this.ownerType;
  }

  public final Type getRawType()
  {
    return this.rawType;
  }

  public final int hashCode()
  {
    return Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode() ^ .Gson.Types.a(this.ownerType);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(30 * (1 + this.typeArguments.length));
    localStringBuilder.append(.Gson.Types.c(this.rawType));
    if (this.typeArguments.length == 0)
      return localStringBuilder.toString();
    localStringBuilder.append("<").append(.Gson.Types.c(this.typeArguments[0]));
    for (int i = 1; i < this.typeArguments.length; i++)
      localStringBuilder.append(", ").append(.Gson.Types.c(this.typeArguments[i]));
    return ">";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal..Gson.Types.ParameterizedTypeImpl
 * JD-Core Version:    0.6.0
 */