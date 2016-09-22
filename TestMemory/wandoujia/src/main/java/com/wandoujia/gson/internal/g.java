package com.wandoujia.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

final class g
  implements x<T>
{
  g(Constructor paramConstructor)
  {
  }

  public final T a()
  {
    try
    {
      Object localObject = this.a.newInstance(null);
      return localObject;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new RuntimeException("Failed to invoke " + this.a + " with no args", localInstantiationException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new RuntimeException("Failed to invoke " + this.a + " with no args", localInvocationTargetException.getTargetException());
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
    throw new AssertionError(localIllegalAccessException);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.g
 * JD-Core Version:    0.6.0
 */