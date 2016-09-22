package android.support.v4.e;

import java.util.Map;

public class l<K, V>
{
  private static Object[] c;
  private static int d;
  private static Object[] e;
  private static int f;
  Object[] a = c.b;
  int b = 0;
  private int[] g = c.a;

  private int a()
  {
    int i = this.b;
    int j;
    if (i == 0)
      j = -1;
    do
    {
      return j;
      j = c.a(this.g, i, 0);
    }
    while ((j < 0) || (this.a[(j << 1)] == null));
    for (int k = j + 1; (k < i) && (this.g[k] == 0); k++)
      if (this.a[(k << 1)] == null)
        return k;
    j--;
    while (true)
    {
      if ((j < 0) || (this.g[j] != 0))
        break label108;
      if (this.a[(j << 1)] == null)
        break;
      j--;
    }
    label108: return k ^ 0xFFFFFFFF;
  }

  private int a(Object paramObject, int paramInt)
  {
    int i = this.b;
    int j;
    if (i == 0)
      j = -1;
    do
    {
      return j;
      j = c.a(this.g, i, paramInt);
    }
    while ((j < 0) || (paramObject.equals(this.a[(j << 1)])));
    for (int k = j + 1; (k < i) && (this.g[k] == paramInt); k++)
      if (paramObject.equals(this.a[(k << 1)]))
        return k;
    j--;
    while (true)
    {
      if ((j < 0) || (this.g[j] != paramInt))
        break label136;
      if (paramObject.equals(this.a[(j << 1)]))
        break;
      j--;
    }
    label136: return k ^ 0xFFFFFFFF;
  }

  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8)
    {
      monitorenter;
      try
      {
        if (f < 10)
        {
          paramArrayOfObject[0] = e;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (int j = -1 + (paramInt << 1); j >= 2; j--)
            paramArrayOfObject[j] = null;
          e = paramArrayOfObject;
          f = 1 + f;
        }
        return;
      }
      finally
      {
        monitorexit;
      }
    }
    if (paramArrayOfInt.length == 4)
    {
      monitorenter;
      try
      {
        if (d < 10)
        {
          paramArrayOfObject[0] = c;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (int i = -1 + (paramInt << 1); i >= 2; i--)
            paramArrayOfObject[i] = null;
          c = paramArrayOfObject;
          d = 1 + d;
        }
        return;
      }
      finally
      {
        monitorexit;
      }
    }
  }

  private void e(int paramInt)
  {
    if (paramInt == 8)
      monitorenter;
    while (true)
    {
      try
      {
        if (e == null)
          continue;
        Object[] arrayOfObject2 = e;
        this.a = arrayOfObject2;
        e = (Object[])arrayOfObject2[0];
        this.g = ((int[])arrayOfObject2[1]);
        arrayOfObject2[1] = null;
        arrayOfObject2[0] = null;
        f = -1 + f;
        return;
        monitorexit;
        this.g = new int[paramInt];
        this.a = new Object[paramInt << 1];
        return;
      }
      finally
      {
        monitorexit;
      }
      if (paramInt != 4)
        continue;
      monitorenter;
      try
      {
        if (c != null)
        {
          Object[] arrayOfObject1 = c;
          this.a = arrayOfObject1;
          c = (Object[])arrayOfObject1[0];
          this.g = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          d = -1 + d;
          return;
        }
      }
      finally
      {
        monitorexit;
      }
      monitorexit;
    }
  }

  public final int a(Object paramObject)
  {
    if (paramObject == null)
      return a();
    return a(paramObject, paramObject.hashCode());
  }

  public final V a(int paramInt, V paramV)
  {
    int i = 1 + (paramInt << 1);
    Object localObject = this.a[i];
    this.a[i] = paramV;
    return localObject;
  }

  public final void a(int paramInt)
  {
    if (this.g.length < paramInt)
    {
      int[] arrayOfInt = this.g;
      Object[] arrayOfObject = this.a;
      e(paramInt);
      if (this.b > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.g, 0, this.b);
        System.arraycopy(arrayOfObject, 0, this.a, 0, this.b << 1);
      }
      a(arrayOfInt, arrayOfObject, this.b);
    }
  }

  final int b(Object paramObject)
  {
    int i = 1;
    int j = 2 * this.b;
    Object[] arrayOfObject = this.a;
    if (paramObject == null)
      while (i < j)
      {
        if (arrayOfObject[i] == null)
          return i >> 1;
        i += 2;
      }
    while (true)
    {
      i += 2;
      if (i >= j)
        break;
      if (paramObject.equals(arrayOfObject[i]))
        return i >> 1;
    }
    return -1;
  }

  public final K b(int paramInt)
  {
    return this.a[(paramInt << 1)];
  }

  public final V c(int paramInt)
  {
    return this.a[(1 + (paramInt << 1))];
  }

  public void clear()
  {
    if (this.b != 0)
    {
      a(this.g, this.a, this.b);
      this.g = c.a;
      this.a = c.b;
      this.b = 0;
    }
  }

  public boolean containsKey(Object paramObject)
  {
    return a(paramObject) >= 0;
  }

  public boolean containsValue(Object paramObject)
  {
    return b(paramObject) >= 0;
  }

  public final V d(int paramInt)
  {
    int i = 8;
    Object localObject = this.a[(1 + (paramInt << 1))];
    if (this.b <= 1)
    {
      a(this.g, this.a, this.b);
      this.g = c.a;
      this.a = c.b;
      this.b = 0;
    }
    while (true)
    {
      return localObject;
      if ((this.g.length <= i) || (this.b >= this.g.length / 3))
        break;
      if (this.b > i)
        i = this.b + (this.b >> 1);
      int[] arrayOfInt = this.g;
      Object[] arrayOfObject = this.a;
      e(i);
      this.b = (-1 + this.b);
      if (paramInt > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.g, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, this.a, 0, paramInt << 1);
      }
      if (paramInt >= this.b)
        continue;
      System.arraycopy(arrayOfInt, paramInt + 1, this.g, paramInt, this.b - paramInt);
      System.arraycopy(arrayOfObject, paramInt + 1 << 1, this.a, paramInt << 1, this.b - paramInt << 1);
      return localObject;
    }
    this.b = (-1 + this.b);
    if (paramInt < this.b)
    {
      System.arraycopy(this.g, paramInt + 1, this.g, paramInt, this.b - paramInt);
      System.arraycopy(this.a, paramInt + 1 << 1, this.a, paramInt << 1, this.b - paramInt << 1);
    }
    this.a[(this.b << 1)] = null;
    this.a[(1 + (this.b << 1))] = null;
    return localObject;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    while (true)
    {
      return true;
      if (!(paramObject instanceof Map))
        break;
      Map localMap = (Map)paramObject;
      if (size() != localMap.size())
        return false;
      int i = 0;
      try
      {
        while (i < this.b)
        {
          Object localObject1 = b(i);
          Object localObject2 = c(i);
          Object localObject3 = localMap.get(localObject1);
          if (localObject2 == null)
          {
            if (localObject3 != null)
              break label124;
            if (!localMap.containsKey(localObject1))
              break label124;
          }
          else
          {
            boolean bool = localObject2.equals(localObject3);
            if (!bool)
              return false;
          }
          i++;
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        return false;
      }
      catch (ClassCastException localClassCastException)
      {
        return false;
      }
    }
    return false;
    label124: return false;
  }

  public V get(Object paramObject)
  {
    int i = a(paramObject);
    if (i >= 0)
      return this.a[(1 + (i << 1))];
    return null;
  }

  public int hashCode()
  {
    int[] arrayOfInt = this.g;
    Object[] arrayOfObject = this.a;
    int i = this.b;
    int j = 1;
    int k = 0;
    int m = 0;
    if (k < i)
    {
      Object localObject = arrayOfObject[j];
      int n = arrayOfInt[k];
      if (localObject == null);
      for (int i1 = 0; ; i1 = localObject.hashCode())
      {
        m += (i1 ^ n);
        k++;
        j += 2;
        break;
      }
    }
    return m;
  }

  public boolean isEmpty()
  {
    return this.b <= 0;
  }

  public V put(K paramK, V paramV)
  {
    int i = 8;
    int k;
    int j;
    if (paramK == null)
    {
      k = a();
      j = 0;
    }
    while (k >= 0)
    {
      int n = 1 + (k << 1);
      Object localObject = this.a[n];
      this.a[n] = paramV;
      return localObject;
      j = paramK.hashCode();
      k = a(paramK, j);
    }
    int m = k ^ 0xFFFFFFFF;
    if (this.b >= this.g.length)
    {
      if (this.b < i)
        break label275;
      i = this.b + (this.b >> 1);
    }
    while (true)
    {
      int[] arrayOfInt = this.g;
      Object[] arrayOfObject = this.a;
      e(i);
      if (this.g.length > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.g, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject, 0, this.a, 0, arrayOfObject.length);
      }
      a(arrayOfInt, arrayOfObject, this.b);
      if (m < this.b)
      {
        System.arraycopy(this.g, m, this.g, m + 1, this.b - m);
        System.arraycopy(this.a, m << 1, this.a, m + 1 << 1, this.b - m << 1);
      }
      this.g[m] = j;
      this.a[(m << 1)] = paramK;
      this.a[(1 + (m << 1))] = paramV;
      this.b = (1 + this.b);
      return null;
      label275: if (this.b >= 4)
        continue;
      i = 4;
    }
  }

  public V remove(Object paramObject)
  {
    int i = a(paramObject);
    if (i >= 0)
      return d(i);
    return null;
  }

  public int size()
  {
    return this.b;
  }

  public String toString()
  {
    if (isEmpty())
      return "{}";
    StringBuilder localStringBuilder = new StringBuilder(28 * this.b);
    localStringBuilder.append('{');
    int i = 0;
    if (i < this.b)
    {
      if (i > 0)
        localStringBuilder.append(", ");
      Object localObject1 = b(i);
      if (localObject1 != this)
      {
        localStringBuilder.append(localObject1);
        label73: localStringBuilder.append('=');
        Object localObject2 = c(i);
        if (localObject2 == this)
          break label116;
        localStringBuilder.append(localObject2);
      }
      while (true)
      {
        i++;
        break;
        localStringBuilder.append("(this Map)");
        break label73;
        label116: localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.e.l
 * JD-Core Version:    0.6.0
 */