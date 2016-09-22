package com.alipay.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

public final class c
  implements Cache
{
  private LinkedHashMap<String, Bitmap> a;
  private final int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;

  private c(int paramInt)
  {
    if (paramInt <= 0)
      throw new IllegalArgumentException("Max size must be positive.");
    this.b = paramInt;
    this.a = new LinkedHashMap(0, 0.75F, true);
  }

  public c(Context paramContext)
  {
    this(p.c(paramContext));
  }

  // ERROR //
  private void a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 48	com/alipay/squareup/picasso/c:c	I
    //   6: iflt +20 -> 26
    //   9: aload_0
    //   10: getfield 38	com/alipay/squareup/picasso/c:a	Ljava/util/LinkedHashMap;
    //   13: invokevirtual 52	java/util/LinkedHashMap:isEmpty	()Z
    //   16: ifeq +48 -> 64
    //   19: aload_0
    //   20: getfield 48	com/alipay/squareup/picasso/c:c	I
    //   23: ifeq +41 -> 64
    //   26: new 54	java/lang/IllegalStateException
    //   29: dup
    //   30: new 56	java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial 57	java/lang/StringBuilder:<init>	()V
    //   37: aload_0
    //   38: invokevirtual 61	java/lang/Object:getClass	()Ljava/lang/Class;
    //   41: invokevirtual 67	java/lang/Class:getName	()Ljava/lang/String;
    //   44: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: ldc 73
    //   49: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 76	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokespecial 77	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   58: athrow
    //   59: astore_2
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_2
    //   63: athrow
    //   64: aload_0
    //   65: getfield 48	com/alipay/squareup/picasso/c:c	I
    //   68: iload_1
    //   69: if_icmple +13 -> 82
    //   72: aload_0
    //   73: getfield 38	com/alipay/squareup/picasso/c:a	Ljava/util/LinkedHashMap;
    //   76: invokevirtual 52	java/util/LinkedHashMap:isEmpty	()Z
    //   79: ifeq +6 -> 85
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: aload_0
    //   86: getfield 38	com/alipay/squareup/picasso/c:a	Ljava/util/LinkedHashMap;
    //   89: invokevirtual 81	java/util/LinkedHashMap:entrySet	()Ljava/util/Set;
    //   92: invokeinterface 87 1 0
    //   97: invokeinterface 93 1 0
    //   102: checkcast 95	java/util/Map$Entry
    //   105: astore_3
    //   106: aload_3
    //   107: invokeinterface 98 1 0
    //   112: checkcast 100	java/lang/String
    //   115: astore 4
    //   117: aload_3
    //   118: invokeinterface 103 1 0
    //   123: checkcast 105	android/graphics/Bitmap
    //   126: astore 5
    //   128: aload_0
    //   129: getfield 38	com/alipay/squareup/picasso/c:a	Ljava/util/LinkedHashMap;
    //   132: aload 4
    //   134: invokevirtual 109	java/util/LinkedHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   137: pop
    //   138: aload_0
    //   139: aload_0
    //   140: getfield 48	com/alipay/squareup/picasso/c:c	I
    //   143: aload 5
    //   145: invokestatic 112	com/alipay/squareup/picasso/p:a	(Landroid/graphics/Bitmap;)I
    //   148: isub
    //   149: putfield 48	com/alipay/squareup/picasso/c:c	I
    //   152: aload_0
    //   153: iconst_1
    //   154: aload_0
    //   155: getfield 114	com/alipay/squareup/picasso/c:e	I
    //   158: iadd
    //   159: putfield 114	com/alipay/squareup/picasso/c:e	I
    //   162: aload_0
    //   163: monitorexit
    //   164: goto -164 -> 0
    //
    // Exception table:
    //   from	to	target	type
    //   2	26	59	finally
    //   26	59	59	finally
    //   60	62	59	finally
    //   64	82	59	finally
    //   82	84	59	finally
    //   85	164	59	finally
  }

  public final Bitmap get(String paramString)
  {
    if (paramString == null)
      throw new NullPointerException("key == null");
    monitorenter;
    try
    {
      Bitmap localBitmap = (Bitmap)this.a.get(paramString);
      if (localBitmap != null)
      {
        this.f = (1 + this.f);
        return localBitmap;
      }
      this.g = (1 + this.g);
      return null;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final int maxSize()
  {
    monitorenter;
    try
    {
      int i = this.b;
      monitorexit;
      return i;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void set(String paramString, Bitmap paramBitmap)
  {
    if ((paramString == null) || (paramBitmap == null))
      throw new NullPointerException("key == null || bitmap == null");
    monitorenter;
    try
    {
      this.d = (1 + this.d);
      this.c += p.a(paramBitmap);
      Bitmap localBitmap = (Bitmap)this.a.put(paramString, paramBitmap);
      if (localBitmap != null)
        this.c -= p.a(localBitmap);
      monitorexit;
      a(this.b);
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final int size()
  {
    monitorenter;
    try
    {
      int i = this.c;
      monitorexit;
      return i;
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
 * Qualified Name:     com.alipay.squareup.picasso.c
 * JD-Core Version:    0.6.0
 */