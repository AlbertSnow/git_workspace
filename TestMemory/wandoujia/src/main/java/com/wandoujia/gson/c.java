package com.wandoujia.gson;

import com.wandoujia.gson.internal.a.r;
import com.wandoujia.gson.internal.a.t;
import com.wandoujia.gson.internal.a.w;
import com.wandoujia.gson.internal.y;
import com.wandoujia.gson.stream.JsonToken;
import com.wandoujia.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c
{
  private final ThreadLocal<Map<com.wandoujia.gson.b.a<?>, i<?>>> a = new ThreadLocal();
  private final Map<com.wandoujia.gson.b.a<?>, u<?>> b = Collections.synchronizedMap(new HashMap());
  private final List<v> c;
  private final com.wandoujia.gson.internal.a d;
  private final boolean e;

  public c()
  {
    this(com.wandoujia.gson.internal.n.a, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), true, LongSerializationPolicy.DEFAULT, Collections.emptyList());
  }

  c(com.wandoujia.gson.internal.n paramn, b paramb, Map<Type, k<?>> paramMap, boolean paramBoolean, LongSerializationPolicy paramLongSerializationPolicy, List<v> paramList)
  {
    new d();
    new e();
    this.d = new com.wandoujia.gson.internal.a(paramMap);
    this.e = paramBoolean;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(w.x);
    localArrayList.add(com.wandoujia.gson.internal.a.k.a);
    localArrayList.add(paramn);
    localArrayList.addAll(paramList);
    localArrayList.add(w.m);
    localArrayList.add(w.g);
    localArrayList.add(w.d);
    localArrayList.add(w.e);
    localArrayList.add(w.f);
    Class localClass = Long.TYPE;
    if (paramLongSerializationPolicy == LongSerializationPolicy.DEFAULT);
    for (Object localObject = w.h; ; localObject = new h())
    {
      localArrayList.add(w.a(localClass, Long.class, (u)localObject));
      localArrayList.add(w.a(Double.TYPE, Double.class, new f()));
      localArrayList.add(w.a(Float.TYPE, Float.class, new g()));
      localArrayList.add(w.i);
      localArrayList.add(w.j);
      localArrayList.add(w.n);
      localArrayList.add(w.o);
      localArrayList.add(w.a(BigDecimal.class, w.k));
      localArrayList.add(w.a(BigInteger.class, w.l));
      localArrayList.add(w.p);
      localArrayList.add(w.q);
      localArrayList.add(w.s);
      localArrayList.add(w.v);
      localArrayList.add(w.r);
      localArrayList.add(w.b);
      localArrayList.add(com.wandoujia.gson.internal.a.e.a);
      localArrayList.add(w.u);
      localArrayList.add(t.a);
      localArrayList.add(r.a);
      localArrayList.add(w.t);
      localArrayList.add(com.wandoujia.gson.internal.a.a.a);
      localArrayList.add(w.y);
      localArrayList.add(w.a);
      localArrayList.add(new com.wandoujia.gson.internal.a.c(this.d));
      localArrayList.add(new com.wandoujia.gson.internal.a.i(this.d));
      localArrayList.add(new com.wandoujia.gson.internal.a.n(this.d, paramb, paramn));
      this.c = Collections.unmodifiableList(localArrayList);
      return;
    }
  }

  private static com.wandoujia.gson.stream.c a(Writer paramWriter)
  {
    com.wandoujia.gson.stream.c localc = new com.wandoujia.gson.stream.c(paramWriter);
    localc.c(false);
    return localc;
  }

  public final <T> u<T> a(com.wandoujia.gson.b.a<T> parama)
  {
    Object localObject1 = (u)this.b.get(parama);
    if (localObject1 != null)
      return localObject1;
    Map localMap = (Map)this.a.get();
    Object localObject2;
    if (localMap == null)
    {
      HashMap localHashMap = new HashMap();
      this.a.set(localHashMap);
      localObject2 = localHashMap;
    }
    for (int i = 1; ; i = 0)
    {
      while (true)
      {
        localObject1 = (i)((Map)localObject2).get(parama);
        if (localObject1 != null)
          break;
        try
        {
          i locali = new i();
          ((Map)localObject2).put(parama, locali);
          Iterator localIterator = this.c.iterator();
          while (localIterator.hasNext())
          {
            localObject1 = ((v)localIterator.next()).a(this, parama);
            if (localObject1 == null)
              continue;
            locali.a((u)localObject1);
            this.b.put(parama, localObject1);
            return localObject1;
          }
          throw new IllegalArgumentException("GSON cannot handle " + parama);
        }
        finally
        {
          ((Map)localObject2).remove(parama);
          if (i != 0)
            this.a.remove();
        }
      }
      localObject2 = localMap;
    }
  }

  public final <T> u<T> a(v paramv, com.wandoujia.gson.b.a<T> parama)
  {
    Iterator localIterator = this.c.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      v localv = (v)localIterator.next();
      if (i == 0)
      {
        if (localv != paramv)
          continue;
        i = 1;
        continue;
      }
      u localu = localv.a(this, parama);
      if (localu != null)
        return localu;
    }
    throw new IllegalArgumentException("GSON cannot serialize " + parama);
  }

  public final <T> u<T> a(Class<T> paramClass)
  {
    return a(com.wandoujia.gson.b.a.get(paramClass));
  }

  public final <T> T a(n paramn, Type paramType)
  {
    if (paramn == null)
      return null;
    return a(new com.wandoujia.gson.internal.a.g(paramn), paramType);
  }

  // ERROR //
  public final <T> T a(com.wandoujia.gson.stream.a parama, Type paramType)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_1
    //   3: invokevirtual 350	com/wandoujia/gson/stream/a:p	()Z
    //   6: istore 4
    //   8: aload_1
    //   9: iload_3
    //   10: invokevirtual 352	com/wandoujia/gson/stream/a:a	(Z)V
    //   13: aload_1
    //   14: invokevirtual 355	com/wandoujia/gson/stream/a:f	()Lcom/wandoujia/gson/stream/JsonToken;
    //   17: pop
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_0
    //   21: aload_2
    //   22: invokestatic 358	com/wandoujia/gson/b/a:get	(Ljava/lang/reflect/Type;)Lcom/wandoujia/gson/b/a;
    //   25: invokevirtual 331	com/wandoujia/gson/c:a	(Lcom/wandoujia/gson/b/a;)Lcom/wandoujia/gson/u;
    //   28: aload_1
    //   29: invokevirtual 361	com/wandoujia/gson/u:a	(Lcom/wandoujia/gson/stream/a;)Ljava/lang/Object;
    //   32: astore 10
    //   34: aload_1
    //   35: iload 4
    //   37: invokevirtual 352	com/wandoujia/gson/stream/a:a	(Z)V
    //   40: aload 10
    //   42: areturn
    //   43: astore 8
    //   45: iload_3
    //   46: ifeq +11 -> 57
    //   49: aload_1
    //   50: iload 4
    //   52: invokevirtual 352	com/wandoujia/gson/stream/a:a	(Z)V
    //   55: aconst_null
    //   56: areturn
    //   57: new 363	com/wandoujia/gson/JsonSyntaxException
    //   60: dup
    //   61: aload 8
    //   63: invokespecial 366	com/wandoujia/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   66: athrow
    //   67: astore 6
    //   69: aload_1
    //   70: iload 4
    //   72: invokevirtual 352	com/wandoujia/gson/stream/a:a	(Z)V
    //   75: aload 6
    //   77: athrow
    //   78: astore 7
    //   80: new 363	com/wandoujia/gson/JsonSyntaxException
    //   83: dup
    //   84: aload 7
    //   86: invokespecial 366	com/wandoujia/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   89: athrow
    //   90: astore 5
    //   92: new 363	com/wandoujia/gson/JsonSyntaxException
    //   95: dup
    //   96: aload 5
    //   98: invokespecial 366	com/wandoujia/gson/JsonSyntaxException:<init>	(Ljava/lang/Throwable;)V
    //   101: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   13	18	43	java/io/EOFException
    //   20	34	43	java/io/EOFException
    //   13	18	67	finally
    //   20	34	67	finally
    //   57	67	67	finally
    //   80	90	67	finally
    //   92	102	67	finally
    //   13	18	78	java/lang/IllegalStateException
    //   20	34	78	java/lang/IllegalStateException
    //   13	18	90	java/io/IOException
    //   20	34	90	java/io/IOException
  }

  public final <T> T a(Reader paramReader, Type paramType)
  {
    com.wandoujia.gson.stream.a locala = new com.wandoujia.gson.stream.a(paramReader);
    Object localObject = a(locala, paramType);
    if (localObject != null)
      try
      {
        if (locala.f() != JsonToken.END_DOCUMENT)
          throw new JsonIOException("JSON document was not fully consumed.");
      }
      catch (MalformedJsonException localMalformedJsonException)
      {
        throw new JsonSyntaxException(localMalformedJsonException);
      }
      catch (IOException localIOException)
      {
        throw new JsonIOException(localIOException);
      }
    return localObject;
  }

  public final <T> T a(String paramString, Class<T> paramClass)
  {
    Object localObject = a(paramString, paramClass);
    return y.a(paramClass).cast(localObject);
  }

  public final <T> T a(String paramString, Type paramType)
  {
    if (paramString == null)
      return null;
    return a(new StringReader(paramString), paramType);
  }

  public final String a(Object paramObject)
  {
    if (paramObject == null)
    {
      o localo = o.a;
      StringWriter localStringWriter = new StringWriter();
      try
      {
        com.wandoujia.gson.stream.c localc = a((Writer)localStringWriter);
        boolean bool1 = localc.a();
        localc.a(true);
        boolean bool2 = localc.b();
        localc.b(this.e);
        boolean bool3 = localc.c();
        localc.c(false);
        try
        {
          com.wandoujia.gson.internal.b.a(localo, localc);
          return localStringWriter.toString();
        }
        catch (IOException localIOException2)
        {
          throw new JsonIOException(localIOException2);
        }
        finally
        {
          localc.a(bool1);
          localc.b(bool2);
          localc.c(bool3);
        }
      }
      catch (IOException localIOException1)
      {
        throw new RuntimeException(localIOException1);
      }
    }
    return a(paramObject, paramObject.getClass());
  }

  public final String a(Object paramObject, Type paramType)
  {
    StringWriter localStringWriter = new StringWriter();
    try
    {
      a(paramObject, paramType, a((Writer)localStringWriter));
      return localStringWriter.toString();
    }
    catch (IOException localIOException)
    {
    }
    throw new JsonIOException(localIOException);
  }

  public final void a(Object paramObject, Type paramType, com.wandoujia.gson.stream.c paramc)
  {
    u localu = a(com.wandoujia.gson.b.a.get(paramType));
    boolean bool1 = paramc.a();
    paramc.a(true);
    boolean bool2 = paramc.b();
    paramc.b(this.e);
    boolean bool3 = paramc.c();
    paramc.c(false);
    try
    {
      localu.a(paramc, paramObject);
      return;
    }
    catch (IOException localIOException)
    {
      throw new JsonIOException(localIOException);
    }
    finally
    {
      paramc.a(bool1);
      paramc.b(bool2);
      paramc.c(bool3);
    }
    throw localObject;
  }

  public final String toString()
  {
    return "{serializeNulls:falsefactories:" + this.c + ",instanceCreators:" + this.d + "}";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.c
 * JD-Core Version:    0.6.0
 */