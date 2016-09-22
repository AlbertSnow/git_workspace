package com.alipay.wandoujia;

import android.util.SparseArray;
import com.alipay.android.app.exception.AppErrorException;

public class aj
{
  private static SparseArray a = new SparseArray();
  private bd b;
  private oa c;
  private oa d;

  private oa a(int paramInt)
  {
    Class localClass = (Class)a.get(paramInt);
    if (localClass == null)
      throw new AppErrorException(aj.class, "no such window type:" + paramInt);
    try
    {
      oa localoa = (oa)localClass.newInstance();
      localoa.a(this.b);
      return localoa;
    }
    catch (Exception localException)
    {
    }
    throw new AppErrorException(localException.getClass(), "can not creat window manager");
  }

  public static void a(int paramInt, Class paramClass)
  {
    if ((Class)a.get(paramInt) == null)
      a.put(paramInt, paramClass);
  }

  public final void a()
  {
    a(null, new ah());
  }

  public final void a(bd parambd)
  {
    this.b = parambd;
  }

  public final void a(c paramc, ai paramai)
  {
    int i = paramai.f();
    Class localClass = (Class)a.get(i);
    if ((this.c != null) && (this.c.getClass() != localClass))
    {
      this.d = this.c;
      this.c = null;
    }
    if (this.c == null)
      this.c = a(i);
    this.c.a(paramc, paramai);
  }

  public final void a(c paramc, Exception paramException, int paramInt)
  {
    Class localClass = (Class)a.get(paramInt);
    if (localClass == null)
      throw new AppErrorException(aj.class, "no such window type:" + paramInt);
    if ((this.c != null) && (this.c.getClass() != localClass))
    {
      this.d = this.c;
      this.c = null;
    }
    if (this.c == null)
      this.c = a(paramInt);
    this.c.a(paramc, paramException);
  }

  public final void a(Object paramObject)
  {
    if (this.c != null)
    {
      this.c.a(paramObject);
      if (this.d != null)
      {
        this.d.i();
        this.d = null;
      }
      return;
    }
    throw new AppErrorException(getClass(), "no window creat on window loaded");
  }

  public final void b()
  {
    if (this.c != null)
      this.c.i();
    this.b = null;
  }

  public final boolean c()
  {
    if (this.c != null)
      return this.c.a();
    throw new AppErrorException(getClass(), "no window creat on reapeat last window");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.aj
 * JD-Core Version:    0.6.0
 */