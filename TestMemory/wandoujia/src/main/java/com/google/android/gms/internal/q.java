package com.google.android.gms.internal;

import java.util.LinkedHashMap;

public class q<K, V>
{
  private final LinkedHashMap<K, V> a;
  private int b;
  private int c;
  private int d;

  private int b(K paramK, V paramV)
  {
    int i = a(paramV);
    if (i < 0)
      throw new IllegalStateException("Negative size: " + paramK + "=" + paramV);
    return i;
  }

  protected int a(V paramV)
  {
    return 1;
  }

  public final V a(K paramK, V paramV)
  {
    if (paramV == null)
      throw new NullPointerException("key == null || value == null");
    monitorenter;
    try
    {
      this.c = (1 + this.c);
      this.b += b(paramK, paramV);
      Object localObject2 = this.a.put(paramK, paramV);
      if (localObject2 != null)
        this.b -= b(paramK, localObject2);
      monitorexit;
      a(0);
      return localObject2;
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }

  // ERROR //
  public final void a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 50	com/google/android/gms/internal/q:b	I
    //   6: iflt +20 -> 26
    //   9: aload_0
    //   10: getfield 54	com/google/android/gms/internal/q:a	Ljava/util/LinkedHashMap;
    //   13: invokevirtual 66	java/util/LinkedHashMap:isEmpty	()Z
    //   16: ifeq +48 -> 64
    //   19: aload_0
    //   20: getfield 50	com/google/android/gms/internal/q:b	I
    //   23: ifeq +41 -> 64
    //   26: new 18	java/lang/IllegalStateException
    //   29: dup
    //   30: new 20	java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial 69	java/lang/StringBuilder:<init>	()V
    //   37: aload_0
    //   38: invokevirtual 73	java/lang/Object:getClass	()Ljava/lang/Class;
    //   41: invokevirtual 78	java/lang/Class:getName	()Ljava/lang/String;
    //   44: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: ldc 80
    //   49: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 39	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokespecial 40	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   58: athrow
    //   59: astore_2
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_2
    //   63: athrow
    //   64: aload_0
    //   65: getfield 50	com/google/android/gms/internal/q:b	I
    //   68: iload_1
    //   69: if_icmple +13 -> 82
    //   72: aload_0
    //   73: getfield 54	com/google/android/gms/internal/q:a	Ljava/util/LinkedHashMap;
    //   76: invokevirtual 66	java/util/LinkedHashMap:isEmpty	()Z
    //   79: ifeq +6 -> 85
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: aload_0
    //   86: getfield 54	com/google/android/gms/internal/q:a	Ljava/util/LinkedHashMap;
    //   89: invokevirtual 84	java/util/LinkedHashMap:entrySet	()Ljava/util/Set;
    //   92: invokeinterface 90 1 0
    //   97: invokeinterface 96 1 0
    //   102: checkcast 98	java/util/Map$Entry
    //   105: astore_3
    //   106: aload_3
    //   107: invokeinterface 101 1 0
    //   112: astore 4
    //   114: aload_3
    //   115: invokeinterface 104 1 0
    //   120: astore 5
    //   122: aload_0
    //   123: getfield 54	com/google/android/gms/internal/q:a	Ljava/util/LinkedHashMap;
    //   126: aload 4
    //   128: invokevirtual 108	java/util/LinkedHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: aload_0
    //   133: aload_0
    //   134: getfield 50	com/google/android/gms/internal/q:b	I
    //   137: aload_0
    //   138: aload 4
    //   140: aload 5
    //   142: invokespecial 52	com/google/android/gms/internal/q:b	(Ljava/lang/Object;Ljava/lang/Object;)I
    //   145: isub
    //   146: putfield 50	com/google/android/gms/internal/q:b	I
    //   149: aload_0
    //   150: iconst_1
    //   151: aload_0
    //   152: getfield 110	com/google/android/gms/internal/q:d	I
    //   155: iadd
    //   156: putfield 110	com/google/android/gms/internal/q:d	I
    //   159: aload_0
    //   160: monitorexit
    //   161: goto -161 -> 0
    //
    // Exception table:
    //   from	to	target	type
    //   2	26	59	finally
    //   26	59	59	finally
    //   60	62	59	finally
    //   64	82	59	finally
    //   82	84	59	finally
    //   85	161	59	finally
  }

  public final String toString()
  {
    monitorenter;
    try
    {
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(0);
      arrayOfObject[1] = Integer.valueOf(0);
      arrayOfObject[2] = Integer.valueOf(0);
      arrayOfObject[3] = Integer.valueOf(0);
      String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", arrayOfObject);
      monitorexit;
      return str;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.internal.q
 * JD-Core Version:    0.6.0
 */