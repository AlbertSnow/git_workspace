package com.squareup.wire;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class Wire
{
  private final Map<Class<? extends Message.Builder>, a<? extends Message.Builder>> builderAdapters = new LinkedHashMap();
  private final Map<Class<? extends ProtoEnum>, c<? extends ProtoEnum>> enumAdapters = new LinkedHashMap();
  private final Map<Class<? extends Message>, MessageAdapter<? extends Message>> messageAdapters = new LinkedHashMap();
  final e registry$1595c774 = new e();

  public Wire(List<Class<?>> paramList)
  {
    Iterator localIterator = paramList.iterator();
    if (localIterator.hasNext())
    {
      Field[] arrayOfField = ((Class)localIterator.next()).getDeclaredFields();
      int i = arrayOfField.length;
      int j = 0;
      while (j < i)
      {
        Field localField = arrayOfField[j];
        if (localField.getType().equals(Extension.class));
        try
        {
          Extension localExtension = (Extension)localField.get(null);
          this.registry$1595c774.a(localExtension);
          j++;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          throw new AssertionError(localIllegalAccessException);
        }
      }
    }
  }

  public Wire(Class<?>[] paramArrayOfClass)
  {
    this(Arrays.asList(paramArrayOfClass));
  }

  public static <T> T get(T paramT1, T paramT2)
  {
    if (paramT1 != null)
      return paramT1;
    return paramT2;
  }

  private <M extends Message> M parseFrom(u paramu, Class<M> paramClass)
  {
    return messageAdapter(paramClass).a(paramu);
  }

  final <B extends Message.Builder> a<B> builderAdapter(Class<B> paramClass)
  {
    monitorenter;
    try
    {
      a locala = (a)this.builderAdapters.get(paramClass);
      if (locala == null)
      {
        locala = new a(paramClass);
        this.builderAdapters.put(paramClass, locala);
      }
      return locala;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  final <E extends ProtoEnum> c<E> enumAdapter(Class<E> paramClass)
  {
    monitorenter;
    try
    {
      c localc = (c)this.enumAdapters.get(paramClass);
      if (localc == null)
      {
        localc = new c(paramClass);
        this.enumAdapters.put(paramClass, localc);
      }
      return localc;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  final <M extends Message> MessageAdapter<M> messageAdapter(Class<M> paramClass)
  {
    monitorenter;
    try
    {
      MessageAdapter localMessageAdapter = (MessageAdapter)this.messageAdapters.get(paramClass);
      if (localMessageAdapter == null)
      {
        localMessageAdapter = new MessageAdapter(this, paramClass);
        this.messageAdapters.put(paramClass, localMessageAdapter);
      }
      return localMessageAdapter;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final <M extends Message> M parseFrom(InputStream paramInputStream, Class<M> paramClass)
  {
    e.a(paramInputStream, "input");
    e.a(paramClass, "messageClass");
    return parseFrom(u.a(paramInputStream), paramClass);
  }

  public final <M extends Message> M parseFrom(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Class<M> paramClass)
  {
    boolean bool1 = true;
    e.a(paramArrayOfByte, "bytes");
    boolean bool2;
    boolean bool3;
    if (paramInt1 >= 0)
    {
      bool2 = bool1;
      e.a(bool2, "offset < 0");
      if (paramInt2 < 0)
        break label80;
      bool3 = bool1;
      label32: e.a(bool3, "count < 0");
      if (paramInt1 + paramInt2 > paramArrayOfByte.length)
        break label86;
    }
    while (true)
    {
      e.a(bool1, "offset + count > bytes");
      e.a(paramClass, "messageClass");
      return parseFrom(u.a(paramArrayOfByte, paramInt1, paramInt2), paramClass);
      bool2 = false;
      break;
      label80: bool3 = false;
      break label32;
      label86: bool1 = false;
    }
  }

  public final <M extends Message> M parseFrom(byte[] paramArrayOfByte, Class<M> paramClass)
  {
    e.a(paramArrayOfByte, "bytes");
    e.a(paramClass, "messageClass");
    return parseFrom(u.a(paramArrayOfByte), paramClass);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.Wire
 * JD-Core Version:    0.6.0
 */