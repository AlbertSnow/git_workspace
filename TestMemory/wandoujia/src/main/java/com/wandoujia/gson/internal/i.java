package com.wandoujia.gson.internal;

import com.wandoujia.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

final class i
  implements x<T>
{
  i(Type paramType)
  {
  }

  public final T a()
  {
    if ((this.a instanceof ParameterizedType))
    {
      Type localType = ((ParameterizedType)this.a).getActualTypeArguments()[0];
      if ((localType instanceof Class))
        return EnumSet.noneOf((Class)localType);
      throw new JsonIOException("Invalid EnumSet type: " + this.a.toString());
    }
    throw new JsonIOException("Invalid EnumSet type: " + this.a.toString());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.i
 * JD-Core Version:    0.6.0
 */