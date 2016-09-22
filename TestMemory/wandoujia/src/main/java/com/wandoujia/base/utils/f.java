package com.wandoujia.base.utils;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

final class f extends ObjectInputStream
{
  private ClassLoader a;

  public f(InputStream paramInputStream, ClassLoader paramClassLoader)
  {
    super(paramInputStream);
    this.a = paramClassLoader;
  }

  protected final Class<?> resolveClass(ObjectStreamClass paramObjectStreamClass)
  {
    String str = paramObjectStreamClass.getName();
    try
    {
      Class localClass = Class.forName(str, false, this.a);
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
    }
    return Class.forName(str, false, Thread.currentThread().getContextClassLoader());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.f
 * JD-Core Version:    0.6.0
 */