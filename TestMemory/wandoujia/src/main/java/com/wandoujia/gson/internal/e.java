package com.wandoujia.gson.internal;

import java.lang.reflect.Type;

final class e
  implements x<T>
{
  private final z a = z.a();

  e(Class paramClass, Type paramType)
  {
  }

  public final T a()
  {
    try
    {
      Object localObject = this.a.a(this.b);
      return localObject;
    }
    catch (Exception localException)
    {
    }
    throw new RuntimeException("Unable to invoke no-args constructor for " + this.c + ". Register an InstanceCreator with Gson for this type may fix this problem.", localException);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.e
 * JD-Core Version:    0.6.0
 */