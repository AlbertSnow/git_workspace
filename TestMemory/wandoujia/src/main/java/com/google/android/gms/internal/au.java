package com.google.android.gms.internal;

import B;
import D;
import F;
import I;
import J;
import Z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class au
  implements Cloneable
{
  private as<?, ?> a;
  private Object b;
  private List<ax> c = new ArrayList();

  private void a(zzrg paramzzrg)
  {
    if (this.b != null)
      try
      {
        paramzzrg.a(0);
        throw new IllegalArgumentException("Unknown type 0");
      }
      catch (IOException localIOException)
      {
        throw new IllegalStateException(localIOException);
      }
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      ax localax = (ax)localIterator.next();
      paramzzrg.a(localax.a);
      paramzzrg.b(localax.b);
    }
  }

  private byte[] b()
  {
    if (this.b != null)
      throw new IllegalArgumentException("Unknown type 0");
    Iterator localIterator = this.c.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      ax localax = (ax)localIterator.next();
      int j = localax.a;
      int k;
      if ((j & 0xFFFFFF80) == 0)
        k = 1;
      while (true)
      {
        i += k + 0 + localax.b.length;
        break;
        if ((j & 0xFFFFC000) == 0)
        {
          k = 2;
          continue;
        }
        if ((0xFFE00000 & j) == 0)
        {
          k = 3;
          continue;
        }
        if ((j & 0xF0000000) == 0)
        {
          k = 4;
          continue;
        }
        k = 5;
      }
    }
    byte[] arrayOfByte = new byte[i];
    a(zzrg.a(arrayOfByte));
    return arrayOfByte;
  }

  public final au a()
  {
    int i = 0;
    au localau = new au();
    try
    {
      localau.a = this.a;
      if (this.c == null)
        localau.c = null;
      while (true)
      {
        if (this.b == null)
          break label369;
        if (!(this.b instanceof aw))
          break;
        localau.b = ((aw)this.b).b();
        return localau;
        localau.c.addAll(this.c);
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
    if ((this.b instanceof byte[]))
    {
      localau.b = ((byte[])this.b).clone();
      return localau;
    }
    if ((this.b instanceof byte[][]))
    {
      byte[][] arrayOfByte = (byte[][])this.b;
      byte[][] arrayOfByte1 = new byte[arrayOfByte.length][];
      localau.b = arrayOfByte1;
      for (int j = 0; j < arrayOfByte.length; j++)
        arrayOfByte1[j] = ((byte[])arrayOfByte[j].clone());
    }
    if ((this.b instanceof boolean[]))
    {
      localau.b = ((boolean[])this.b).clone();
      return localau;
    }
    if ((this.b instanceof int[]))
    {
      localau.b = ((int[])this.b).clone();
      return localau;
    }
    if ((this.b instanceof long[]))
    {
      localau.b = ((long[])this.b).clone();
      return localau;
    }
    if ((this.b instanceof float[]))
    {
      localau.b = ((float[])this.b).clone();
      return localau;
    }
    if ((this.b instanceof double[]))
    {
      localau.b = ((double[])this.b).clone();
      return localau;
    }
    if ((this.b instanceof aw[]))
    {
      aw[] arrayOfaw1 = (aw[])this.b;
      aw[] arrayOfaw2 = new aw[arrayOfaw1.length];
      localau.b = arrayOfaw2;
      while (i < arrayOfaw1.length)
      {
        arrayOfaw2[i] = arrayOfaw1[i].b();
        i++;
      }
    }
    label369: return localau;
  }

  public final boolean equals(Object paramObject)
  {
    int i;
    if (paramObject == this)
      i = 1;
    au localau;
    while (true)
    {
      return i;
      boolean bool1 = paramObject instanceof au;
      i = 0;
      if (!bool1)
        continue;
      localau = (au)paramObject;
      if ((this.b == null) || (localau.b == null))
        break;
      as localas1 = this.a;
      as localas2 = localau.a;
      i = 0;
      if (localas1 != localas2)
        continue;
      if (!this.a.a.isArray())
        return this.b.equals(localau.b);
      if ((this.b instanceof byte[]))
        return Arrays.equals((byte[])this.b, (byte[])localau.b);
      if ((this.b instanceof int[]))
        return Arrays.equals((int[])this.b, (int[])localau.b);
      if ((this.b instanceof long[]))
        return Arrays.equals((long[])this.b, (long[])localau.b);
      if ((this.b instanceof float[]))
        return Arrays.equals((float[])this.b, (float[])localau.b);
      if ((this.b instanceof double[]))
        return Arrays.equals((double[])this.b, (double[])localau.b);
      if ((this.b instanceof boolean[]))
        return Arrays.equals((boolean[])this.b, (boolean[])localau.b);
      return Arrays.deepEquals((Object[])this.b, (Object[])localau.b);
    }
    if ((this.c != null) && (localau.c != null))
      return this.c.equals(localau.c);
    try
    {
      boolean bool2 = Arrays.equals(b(), localau.b());
      return bool2;
    }
    catch (IOException localIOException)
    {
    }
    throw new IllegalStateException(localIOException);
  }

  public final int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(b());
      return i + 527;
    }
    catch (IOException localIOException)
    {
    }
    throw new IllegalStateException(localIOException);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.au
 * JD-Core Version:    0.6.0
 */