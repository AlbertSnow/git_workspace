package com.wandoujia.gson;

import android.support.v4.app.b;
import com.wandoujia.gson.internal.LazilyParsedNumber;
import java.math.BigInteger;

public final class q extends n
{
  private static final Class<?>[] a;
  private Object b;

  static
  {
    Class[] arrayOfClass = new Class[16];
    arrayOfClass[0] = Integer.TYPE;
    arrayOfClass[1] = Long.TYPE;
    arrayOfClass[2] = Short.TYPE;
    arrayOfClass[3] = Float.TYPE;
    arrayOfClass[4] = Double.TYPE;
    arrayOfClass[5] = Byte.TYPE;
    arrayOfClass[6] = Boolean.TYPE;
    arrayOfClass[7] = Character.TYPE;
    arrayOfClass[8] = Integer.class;
    arrayOfClass[9] = Long.class;
    arrayOfClass[10] = Short.class;
    arrayOfClass[11] = Float.class;
    arrayOfClass[12] = Double.class;
    arrayOfClass[13] = Byte.class;
    arrayOfClass[14] = Boolean.class;
    arrayOfClass[15] = Character.class;
    a = arrayOfClass;
  }

  public q(Boolean paramBoolean)
  {
    a(paramBoolean);
  }

  public q(Number paramNumber)
  {
    a(paramNumber);
  }

  public q(String paramString)
  {
    a(paramString);
  }

  private void a(Object paramObject)
  {
    if ((paramObject instanceof Character))
    {
      this.b = String.valueOf(((Character)paramObject).charValue());
      return;
    }
    int j;
    if (!(paramObject instanceof Number))
    {
      if (!(paramObject instanceof String))
        break label58;
      j = 1;
    }
    while (true)
    {
      boolean bool = false;
      if (j != 0)
        bool = true;
      b.a(bool);
      this.b = paramObject;
      return;
      label58: Class localClass = paramObject.getClass();
      Class[] arrayOfClass = a;
      for (int i = 0; ; i++)
      {
        if (i >= 16)
          break label102;
        if (!arrayOfClass[i].isAssignableFrom(localClass))
          continue;
        j = 1;
        break;
      }
      label102: j = 0;
    }
  }

  private static boolean a(q paramq)
  {
    if ((paramq.b instanceof Number))
    {
      Number localNumber = (Number)paramq.b;
      return ((localNumber instanceof BigInteger)) || ((localNumber instanceof Long)) || ((localNumber instanceof Integer)) || ((localNumber instanceof Short)) || ((localNumber instanceof Byte));
    }
    return false;
  }

  public final Number a()
  {
    if ((this.b instanceof String))
      return new LazilyParsedNumber((String)this.b);
    return (Number)this.b;
  }

  public final String b()
  {
    if ((this.b instanceof Number))
      return a().toString();
    if ((this.b instanceof Boolean))
      return ((Boolean)this.b).toString();
    return (String)this.b;
  }

  public final double c()
  {
    if ((this.b instanceof Number))
      return a().doubleValue();
    return Double.parseDouble(b());
  }

  public final long d()
  {
    if ((this.b instanceof Number))
      return a().longValue();
    return Long.parseLong(b());
  }

  public final int e()
  {
    if ((this.b instanceof Number))
      return a().intValue();
    return Integer.parseInt(b());
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    q localq;
    while (true)
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localq = (q)paramObject;
      if (this.b == null)
        if (localq.b != null)
          return false;
      if ((a(this)) && (a(localq)))
        if (a().longValue() != localq.a().longValue())
          return false;
      if ((!(this.b instanceof Number)) || (!(localq.b instanceof Number)))
        break;
      double d1 = a().doubleValue();
      double d2 = localq.a().doubleValue();
      if ((d1 != d2) && ((!Double.isNaN(d1)) || (!Double.isNaN(d2))))
        return false;
    }
    return this.b.equals(localq.b);
  }

  public final boolean f()
  {
    if ((this.b instanceof Boolean))
      return ((Boolean)this.b).booleanValue();
    return Boolean.parseBoolean(b());
  }

  public final boolean h()
  {
    return this.b instanceof Boolean;
  }

  public final int hashCode()
  {
    if (this.b == null)
      return 31;
    if (a(this))
    {
      long l2 = a().longValue();
      return (int)(l2 ^ l2 >>> 32);
    }
    if ((this.b instanceof Number))
    {
      long l1 = Double.doubleToLongBits(a().doubleValue());
      return (int)(l1 ^ l1 >>> 32);
    }
    return this.b.hashCode();
  }

  public final boolean i()
  {
    return this.b instanceof Number;
  }

  public final boolean j()
  {
    return this.b instanceof String;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.q
 * JD-Core Version:    0.6.0
 */