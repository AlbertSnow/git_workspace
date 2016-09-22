package de.greenrobot.event;

import java.lang.reflect.Method;

final class m
{
  final Method a;
  final ThreadMode b;
  final Class<?> c;
  String d;

  m(Method paramMethod, ThreadMode paramThreadMode, Class<?> paramClass)
  {
    this.a = paramMethod;
    this.b = paramThreadMode;
    this.c = paramClass;
  }

  private void a()
  {
    monitorenter;
    try
    {
      if (this.d == null)
      {
        StringBuilder localStringBuilder = new StringBuilder(64);
        localStringBuilder.append(this.a.getDeclaringClass().getName());
        localStringBuilder.append('#').append(this.a.getName());
        localStringBuilder.append('(').append(this.c.getName());
        this.d = localStringBuilder.toString();
      }
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof m))
    {
      a();
      m localm = (m)paramObject;
      localm.a();
      return this.d.equals(localm.d);
    }
    return false;
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     de.greenrobot.event.m
 * JD-Core Version:    0.6.0
 */