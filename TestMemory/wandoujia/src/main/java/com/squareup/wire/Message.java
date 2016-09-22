package com.squareup.wire;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class Message
{
  private static final Wire WIRE = new Wire(new Class[0]);
  private transient int cachedSerializedSize;
  protected transient int hashCode = 0;
  private transient boolean haveCachedSerializedSize;
  private transient UnknownFieldMap unknownFields;

  protected Message(Message.Builder paramBuilder)
  {
    if (paramBuilder.unknownFieldMap != null)
      this.unknownFields = new UnknownFieldMap(paramBuilder.unknownFieldMap);
  }

  protected static <T> List<T> asList(T[] paramArrayOfT)
  {
    return Arrays.asList(paramArrayOfT);
  }

  protected static <T> List<T> copyOf(List<T> paramList)
  {
    if (paramList == null)
      return null;
    return new ArrayList(paramList);
  }

  public static <E extends Enum,  extends ProtoEnum> E enumFromInt(Class<E> paramClass, int paramInt)
  {
    return (Enum)WIRE.enumAdapter(paramClass).a(paramInt);
  }

  protected static <T> List<T> immutableCopyOf(List<T> paramList)
  {
    if (paramList == null)
      return Collections.emptyList();
    return Collections.unmodifiableList(new ArrayList(paramList));
  }

  public static <E extends Enum,  extends ProtoEnum> int intFromEnum(E paramE)
  {
    WIRE.enumAdapter(paramE.getClass());
    return c.a((ProtoEnum)paramE);
  }

  private void write(WireOutput paramWireOutput)
  {
    MessageAdapter localMessageAdapter = WIRE.messageAdapter(getClass());
    try
    {
      localMessageAdapter.a(this, paramWireOutput);
      return;
    }
    catch (IOException localIOException)
    {
    }
    throw new RuntimeException(localIOException);
  }

  protected boolean equals(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }

  protected boolean equals(List<?> paramList1, List<?> paramList2)
  {
    if ((paramList1 != null) && (paramList1.isEmpty()))
      paramList1 = null;
    if ((paramList2 != null) && (paramList2.isEmpty()))
      paramList2 = null;
    return (paramList1 == paramList2) || ((paramList1 != null) && (paramList1.equals(paramList2)));
  }

  public int getSerializedSize()
  {
    if (!this.haveCachedSerializedSize)
    {
      this.cachedSerializedSize = WIRE.messageAdapter(getClass()).a(this);
      this.haveCachedSerializedSize = true;
    }
    return this.cachedSerializedSize;
  }

  public int getUnknownFieldsSerializedSize()
  {
    if (this.unknownFields == null)
      return 0;
    UnknownFieldMap localUnknownFieldMap = this.unknownFields;
    if (localUnknownFieldMap.a != null)
    {
      Iterator localIterator1 = localUnknownFieldMap.a.entrySet().iterator();
      int j;
      for (i = 0; localIterator1.hasNext(); i = j)
      {
        Map.Entry localEntry = (Map.Entry)localIterator1.next();
        Iterator localIterator2 = ((List)localEntry.getValue()).iterator();
        p localp;
        for (j = i; localIterator2.hasNext(); j = j + WireOutput.varintTagSize(((Integer)localEntry.getKey()).intValue()) + localp.a())
          localp = (p)localIterator2.next();
      }
    }
    int i = 0;
    return i;
  }

  public byte[] toByteArray()
  {
    return WIRE.messageAdapter(getClass()).b(this);
  }

  public String toString()
  {
    return WIRE.messageAdapter(getClass()).c(this);
  }

  protected Collection<List<p>> unknownFields()
  {
    if (this.unknownFields == null)
      return Collections.emptySet();
    return this.unknownFields.a.values();
  }

  public void writeTo(byte[] paramArrayOfByte)
  {
    writeTo(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public void writeTo(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    write(WireOutput.newInstance(paramArrayOfByte, paramInt1, paramInt2));
  }

  public void writeUnknownFieldMap(WireOutput paramWireOutput)
  {
    if (this.unknownFields != null)
    {
      UnknownFieldMap localUnknownFieldMap = this.unknownFields;
      if (localUnknownFieldMap.a != null)
      {
        Iterator localIterator1 = localUnknownFieldMap.a.entrySet().iterator();
        while (localIterator1.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator1.next();
          int i = ((Integer)localEntry.getKey()).intValue();
          Iterator localIterator2 = ((List)localEntry.getValue()).iterator();
          while (localIterator2.hasNext())
            ((p)localIterator2.next()).a(i, paramWireOutput);
        }
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.Message
 * JD-Core Version:    0.6.0
 */