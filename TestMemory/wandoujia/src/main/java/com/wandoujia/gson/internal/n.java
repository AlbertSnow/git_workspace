package com.wandoujia.gson.internal;

import android.support.v4.app.d;
import android.support.v7.app.f;
import com.wandoujia.gson.a.b;
import com.wandoujia.gson.b.a;
import com.wandoujia.gson.u;
import com.wandoujia.gson.v;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class n
  implements v, Cloneable
{
  public static final n a = new n();
  private double b = -1.0D;
  private int c = 136;
  private boolean d = true;
  private List<f> e = Collections.emptyList();
  private List<f> f = Collections.emptyList();

  private n a()
  {
    try
    {
      n localn = (n)super.clone();
      return localn;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    throw new AssertionError();
  }

  private boolean a(b paramb, com.wandoujia.gson.a.c paramc)
  {
    int i;
    if ((paramb != null) && (paramb.a() > this.b))
    {
      i = 0;
      if (i == 0)
        break label63;
      if ((paramc == null) || (paramc.a() > this.b))
        break label57;
    }
    label57: for (int j = 0; ; j = 1)
    {
      if (j == 0)
        break label63;
      return true;
      i = 1;
      break;
    }
    label63: return false;
  }

  private static boolean a(Class<?> paramClass)
  {
    return (!Enum.class.isAssignableFrom(paramClass)) && ((paramClass.isAnonymousClass()) || (paramClass.isLocalClass()));
  }

  private static boolean b(Class<?> paramClass)
  {
    if (paramClass.isMemberClass())
    {
      if ((0x8 & paramClass.getModifiers()) != 0);
      for (int i = 1; i == 0; i = 0)
        return true;
    }
    return false;
  }

  public final <T> u<T> a(com.wandoujia.gson.c paramc, a<T> parama)
  {
    Class localClass = parama.getRawType();
    boolean bool1 = a(localClass, true);
    boolean bool2 = a(localClass, false);
    if ((!bool1) && (!bool2))
      return null;
    return new o(this, bool2, bool1, paramc, parama);
  }

  public final boolean a(Class<?> paramClass, boolean paramBoolean)
  {
    if ((this.b != -1.0D) && (!a((b)paramClass.getAnnotation(b.class), (com.wandoujia.gson.a.c)paramClass.getAnnotation(com.wandoujia.gson.a.c.class))))
      return true;
    if ((!this.d) && (b(paramClass)))
      return true;
    if (a(paramClass))
      return true;
    if (paramBoolean);
    for (List localList = this.e; ; localList = this.f)
    {
      Iterator localIterator = localList.iterator();
      do
        if (!localIterator.hasNext())
          break;
      while (!((f)localIterator.next()).h());
      return true;
    }
    return false;
  }

  public final boolean a(Field paramField, boolean paramBoolean)
  {
    if ((this.c & paramField.getModifiers()) != 0)
      return true;
    if ((this.b != -1.0D) && (!a((b)paramField.getAnnotation(b.class), (com.wandoujia.gson.a.c)paramField.getAnnotation(com.wandoujia.gson.a.c.class))))
      return true;
    if (paramField.isSynthetic())
      return true;
    if ((!this.d) && (b(paramField.getType())))
      return true;
    if (a(paramField.getType()))
      return true;
    if (paramBoolean);
    for (List localList = this.e; !localList.isEmpty(); localList = this.f)
    {
      new d(paramField);
      Iterator localIterator = localList.iterator();
      do
        if (!localIterator.hasNext())
          break;
      while (!((f)localIterator.next()).g());
      return true;
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.n
 * JD-Core Version:    0.6.0
 */