package com.wandoujia.gson.internal;

import java.lang.reflect.Method;

final class ac extends z
{
  ac(Method paramMethod, int paramInt)
  {
  }

  public final <T> T a(Class<T> paramClass)
  {
    Method localMethod = this.a;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramClass;
    arrayOfObject[1] = Integer.valueOf(this.b);
    return localMethod.invoke(null, arrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.ac
 * JD-Core Version:    0.6.0
 */