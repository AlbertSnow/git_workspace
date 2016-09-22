package com.squareup.wire;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class MessageAdapter<M extends Message>
{
  private final Wire a;
  private final Class<M> b;
  private final Class<Message.Builder<M>> c;
  private final Map<String, Integer> d = new LinkedHashMap();
  private final Map<Integer, MessageAdapter.FieldInfo> e = new LinkedHashMap();

  MessageAdapter(Wire paramWire, Class<M> paramClass)
  {
    this.a = paramWire;
    this.b = paramClass;
    this.c = a(paramClass);
    Field[] arrayOfField = paramClass.getDeclaredFields();
    int i = arrayOfField.length;
    int j = 0;
    if (j < i)
    {
      Field localField = arrayOfField[j];
      ProtoField localProtoField = (ProtoField)localField.getAnnotation(ProtoField.class);
      int k;
      String str;
      Message.Datatype localDatatype1;
      Class localClass;
      if (localProtoField != null)
      {
        k = localProtoField.tag();
        str = localField.getName();
        this.d.put(str, Integer.valueOf(k));
        localDatatype1 = localProtoField.type();
        if (localDatatype1 != Message.Datatype.ENUM)
          break label274;
        localClass = localField.getType();
        if (!Enum.class.isAssignableFrom(localClass))
          break label210;
      }
      while (true)
      {
        this.e.put(Integer.valueOf(k), new MessageAdapter.FieldInfo(k, str, localDatatype1, localProtoField.label(), localClass, localField, a(str, localField.getType()), null));
        j++;
        break;
        label210: if (List.class.isAssignableFrom(localClass))
        {
          Type localType2 = ((java.lang.reflect.ParameterizedType)localField.getGenericType()).getActualTypeArguments()[0];
          if (((localType2 instanceof Class)) && (Enum.class.isAssignableFrom((Class)localType2)))
          {
            localClass = (Class)localType2;
            continue;
          }
        }
        localClass = null;
        continue;
        label274: Message.Datatype localDatatype2 = Message.Datatype.MESSAGE;
        localClass = null;
        if (localDatatype1 != localDatatype2)
          continue;
        localClass = localField.getType();
        if (Message.class.isAssignableFrom(localClass))
          continue;
        if (List.class.isAssignableFrom(localClass))
        {
          Type localType1 = ((java.lang.reflect.ParameterizedType)localField.getGenericType()).getActualTypeArguments()[0];
          if (((localType1 instanceof Class)) && (Message.class.isAssignableFrom((Class)localType1)))
          {
            localClass = (Class)localType1;
            continue;
          }
        }
        localClass = null;
      }
    }
  }

  private int a(int paramInt, Object paramObject, Message.Datatype paramDatatype)
  {
    return WireOutput.varintTagSize(paramInt) + a(paramObject, paramDatatype);
  }

  private int a(Object paramObject, Message.Datatype paramDatatype)
  {
    int i = 0;
    switch (j.a[paramDatatype.ordinal()])
    {
    default:
      throw new RuntimeException();
    case 1:
      return WireOutput.int32Size(((Integer)paramObject).intValue());
    case 2:
    case 3:
      return WireOutput.varint64Size(((Long)paramObject).longValue());
    case 4:
      return WireOutput.varint32Size(((Integer)paramObject).intValue());
    case 5:
      return WireOutput.varint32Size(WireOutput.zigZag32(((Integer)paramObject).intValue()));
    case 6:
      return WireOutput.varint64Size(WireOutput.zigZag64(((Long)paramObject).longValue()));
    case 7:
      return 1;
    case 8:
      ProtoEnum localProtoEnum = (ProtoEnum)paramObject;
      this.a.enumAdapter(localProtoEnum.getClass());
      return WireOutput.varint32Size(c.a(localProtoEnum));
    case 9:
      String str = (String)paramObject;
      int m = str.length();
      int n = 0;
      if (i < m)
      {
        int i1 = str.charAt(i);
        if (i1 <= 127)
          n++;
        while (true)
        {
          i++;
          break;
          if (i1 <= 2047)
          {
            n += 2;
            continue;
          }
          if (Character.isHighSurrogate(i1))
          {
            n += 4;
            i++;
            continue;
          }
          n += 3;
        }
      }
      return n + WireOutput.varint32Size(n);
    case 10:
      int k = ((ByteString)paramObject).size();
      return k + WireOutput.varint32Size(k);
    case 11:
      int j = ((Message)paramObject).getSerializedSize();
      return j + WireOutput.varint32Size(j);
    case 12:
    case 13:
    case 14:
      return 4;
    case 15:
    case 16:
    case 17:
    }
    return 8;
  }

  private int a(List<?> paramList, int paramInt, Message.Datatype paramDatatype)
  {
    int i = 0;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      i += a(paramInt, localIterator.next(), paramDatatype);
    return i;
  }

  private Extension<ExtendableMessage<?>, ?> a(int paramInt)
  {
    e locale = this.a.registry$1595c774;
    if (locale == null)
      return null;
    return locale.a(this.b, paramInt);
  }

  private static Class<Message.Builder<M>> a(Class<M> paramClass)
  {
    try
    {
      Class localClass = Class.forName(paramClass.getName() + "$Builder");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
    }
    throw new IllegalArgumentException("No builder class found for message type " + paramClass.getName());
  }

  private static Object a(M paramM, MessageAdapter.FieldInfo paramFieldInfo)
  {
    if (MessageAdapter.FieldInfo.access$000(paramFieldInfo) == null)
      throw new AssertionError("Field is not of type \"Message\"");
    try
    {
      Object localObject = MessageAdapter.FieldInfo.access$000(paramFieldInfo).get(paramM);
      return localObject;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
    throw new AssertionError(localIllegalAccessException);
  }

  private Object a(u paramu, int paramInt, Message.Datatype paramDatatype)
  {
    boolean bool = true;
    switch (j.a[paramDatatype.ordinal()])
    {
    default:
      throw new RuntimeException();
    case 1:
    case 4:
      return Integer.valueOf(paramu.c());
    case 2:
    case 3:
      return Long.valueOf(paramu.d());
    case 5:
      int m = paramu.c();
      return Integer.valueOf(m >>> 1 ^ -(m & 0x1));
    case 6:
      long l = paramu.d();
      return Long.valueOf(l >>> bool ^ -(l & 1L));
    case 7:
      if (paramu.c() != 0);
      while (true)
      {
        return Boolean.valueOf(bool);
        bool = false;
      }
    case 8:
      Wire localWire2 = this.a;
      MessageAdapter.FieldInfo localFieldInfo2 = (MessageAdapter.FieldInfo)this.e.get(Integer.valueOf(paramInt));
      Class localClass2;
      if (localFieldInfo2 == null)
        localClass2 = null;
      while (true)
      {
        if (localClass2 == null)
        {
          Extension localExtension2 = a(paramInt);
          if (localExtension2 != null)
            localClass2 = localExtension2.getEnumType();
        }
        c localc = localWire2.enumAdapter(localClass2);
        int k = paramu.c();
        try
        {
          ProtoEnum localProtoEnum = localc.a(k);
          return localProtoEnum;
          localClass2 = localFieldInfo2.enumType;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          return Integer.valueOf(k);
        }
      }
    case 9:
      return paramu.b();
    case 10:
      return paramu.b(paramu.c());
    case 11:
      int i = paramu.c();
      if (paramu.a >= 64)
        throw new IOException("Wire recursion limit exceeded");
      int j = paramu.c(i);
      paramu.a = (1 + paramu.a);
      Wire localWire1 = this.a;
      MessageAdapter.FieldInfo localFieldInfo1 = (MessageAdapter.FieldInfo)this.e.get(Integer.valueOf(paramInt));
      if (localFieldInfo1 == null);
      for (Class localClass1 = null; ; localClass1 = localFieldInfo1.messageType)
      {
        if (localClass1 == null)
        {
          Extension localExtension1 = a(paramInt);
          if (localExtension1 != null)
            localClass1 = localExtension1.getMessageType();
        }
        Message localMessage = localWire1.messageAdapter(localClass1).a(paramu);
        paramu.a(0);
        paramu.a = (-1 + paramu.a);
        paramu.d(j);
        return localMessage;
      }
    case 12:
    case 13:
      return Integer.valueOf(paramu.e());
    case 15:
    case 16:
      return Long.valueOf(paramu.f());
    case 14:
      return Float.valueOf(Float.intBitsToFloat(paramu.e()));
    case 17:
    }
    return Double.valueOf(Double.longBitsToDouble(paramu.f()));
  }

  private Method a(String paramString, Class<?> paramClass)
  {
    try
    {
      Method localMethod = this.c.getMethod(paramString, new Class[] { paramClass });
      return localMethod;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
    throw new AssertionError("No builder method " + this.c.getName() + "." + paramString + "(" + paramClass.getName() + ")");
  }

  private Collection<MessageAdapter.FieldInfo> a()
  {
    return this.e.values();
  }

  private void a(Message.Builder<M> paramBuilder, int paramInt, Object paramObject)
  {
    try
    {
      MessageAdapter.FieldInfo.access$100((MessageAdapter.FieldInfo)this.e.get(Integer.valueOf(paramInt))).invoke(paramBuilder, new Object[] { paramObject });
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
    }
    throw new AssertionError(localInvocationTargetException);
  }

  private void a(WireOutput paramWireOutput, int paramInt, Object paramObject, Message.Datatype paramDatatype)
  {
    paramWireOutput.writeTag(paramInt, paramDatatype.wireType());
    a(paramWireOutput, paramObject, paramDatatype);
  }

  private void a(WireOutput paramWireOutput, Object paramObject, Message.Datatype paramDatatype)
  {
    switch (j.a[paramDatatype.ordinal()])
    {
    default:
      throw new RuntimeException();
    case 1:
      paramWireOutput.writeSignedVarint32(((Integer)paramObject).intValue());
      return;
    case 2:
    case 3:
      paramWireOutput.writeVarint64(((Long)paramObject).longValue());
      return;
    case 4:
      paramWireOutput.writeVarint32(((Integer)paramObject).intValue());
      return;
    case 5:
      paramWireOutput.writeVarint32(WireOutput.zigZag32(((Integer)paramObject).intValue()));
      return;
    case 6:
      paramWireOutput.writeVarint64(WireOutput.zigZag64(((Long)paramObject).longValue()));
      return;
    case 7:
      if (((Boolean)paramObject).booleanValue());
      for (int i = 1; ; i = 0)
      {
        paramWireOutput.writeRawByte(i);
        return;
      }
    case 8:
      ProtoEnum localProtoEnum = (ProtoEnum)paramObject;
      this.a.enumAdapter(localProtoEnum.getClass());
      paramWireOutput.writeVarint32(c.a(localProtoEnum));
      return;
    case 9:
      byte[] arrayOfByte = ((String)paramObject).getBytes("UTF-8");
      paramWireOutput.writeVarint32(arrayOfByte.length);
      paramWireOutput.writeRawBytes(arrayOfByte);
      return;
    case 10:
      ByteString localByteString = (ByteString)paramObject;
      paramWireOutput.writeVarint32(localByteString.size());
      paramWireOutput.writeRawBytes(localByteString.toByteArray());
      return;
    case 11:
      Message localMessage = (Message)paramObject;
      paramWireOutput.writeVarint32(localMessage.getSerializedSize());
      this.a.messageAdapter(localMessage.getClass()).a(localMessage, paramWireOutput);
      return;
    case 12:
    case 13:
      paramWireOutput.writeFixed32(((Integer)paramObject).intValue());
      return;
    case 15:
    case 16:
      paramWireOutput.writeFixed64(((Long)paramObject).longValue());
      return;
    case 14:
      paramWireOutput.writeFixed32(Float.floatToIntBits(((Float)paramObject).floatValue()));
      return;
    case 17:
    }
    paramWireOutput.writeFixed64(Double.doubleToLongBits(((Double)paramObject).doubleValue()));
  }

  private void a(WireOutput paramWireOutput, List<?> paramList, int paramInt, Message.Datatype paramDatatype)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      a(paramWireOutput, paramInt, localIterator.next(), paramDatatype);
  }

  private int b(List<?> paramList, int paramInt, Message.Datatype paramDatatype)
  {
    int i = 0;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      i += a(localIterator.next(), paramDatatype);
    return i + (WireOutput.varint32Size(WireOutput.makeTag(paramInt, WireType.LENGTH_DELIMITED)) + WireOutput.varint32Size(i));
  }

  private void b(WireOutput paramWireOutput, List<?> paramList, int paramInt, Message.Datatype paramDatatype)
  {
    int i = 0;
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
      i += a(localIterator1.next(), paramDatatype);
    paramWireOutput.writeTag(paramInt, WireType.LENGTH_DELIMITED);
    paramWireOutput.writeVarint32(i);
    Iterator localIterator2 = paramList.iterator();
    while (localIterator2.hasNext())
      a(paramWireOutput, localIterator2.next(), paramDatatype);
  }

  final int a(M paramM)
  {
    int i = 0;
    Iterator localIterator1 = a().iterator();
    int j = 0;
    while (localIterator1.hasNext())
    {
      MessageAdapter.FieldInfo localFieldInfo = (MessageAdapter.FieldInfo)localIterator1.next();
      Object localObject2 = a(paramM, localFieldInfo);
      if (localObject2 == null)
        continue;
      int m = localFieldInfo.tag;
      Message.Datatype localDatatype2 = localFieldInfo.datatype;
      Message.Label localLabel2 = localFieldInfo.label;
      if (localLabel2.isRepeated())
      {
        if (localLabel2.isPacked())
        {
          j += b((List)localObject2, m, localDatatype2);
          continue;
        }
        j += a((List)localObject2, m, localDatatype2);
        continue;
      }
      j += a(m, localObject2, localDatatype2);
    }
    if ((paramM instanceof ExtendableMessage))
    {
      ExtendableMessage localExtendableMessage = (ExtendableMessage)paramM;
      if (localExtendableMessage.extensionMap != null)
      {
        f localf = localExtendableMessage.extensionMap;
        Iterator localIterator2 = localf.a().iterator();
        while (localIterator2.hasNext())
        {
          Extension localExtension = (Extension)localIterator2.next();
          Object localObject1 = localf.a(localExtension);
          int k = localExtension.getTag();
          Message.Datatype localDatatype1 = localExtension.getDatatype();
          Message.Label localLabel1 = localExtension.getLabel();
          if (localLabel1.isRepeated())
          {
            if (localLabel1.isPacked())
            {
              i += b((List)localObject1, k, localDatatype1);
              continue;
            }
            i += a((List)localObject1, k, localDatatype1);
            continue;
          }
          i += a(k, localObject1, localDatatype1);
        }
        j += i;
      }
    }
    return j + paramM.getUnknownFieldsSerializedSize();
  }

  final M a(u paramu)
  {
    while (true)
    {
      Message.Builder localBuilder;
      k localk;
      int j;
      WireType localWireType;
      try
      {
        localBuilder = (Message.Builder)this.c.newInstance();
        localk = new k(0);
        int i = paramu.a();
        j = i >> 3;
        localWireType = WireType.valueOf(i);
        if (j != 0)
          break label172;
        Iterator localIterator = localk.a().iterator();
        if (localIterator.hasNext())
        {
          k = ((Integer)localIterator.next()).intValue();
          if ((MessageAdapter.FieldInfo)this.e.get(Integer.valueOf(k)) == null)
            continue;
          a(localBuilder, k, localk.a(k));
          continue;
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        int k;
        throw new RuntimeException(localIllegalAccessException);
        ((ExtendableMessage.ExtendableBuilder)localBuilder).setExtension(a(k), localk.a(k));
        continue;
      }
      catch (InstantiationException localInstantiationException)
      {
        throw new RuntimeException(localInstantiationException);
      }
      return localBuilder.build();
      label172: MessageAdapter.FieldInfo localFieldInfo = (MessageAdapter.FieldInfo)this.e.get(Integer.valueOf(j));
      Object localObject1;
      Object localObject2;
      Object localObject3;
      label221: int m;
      long l;
      int n;
      if (localFieldInfo != null)
      {
        Message.Datatype localDatatype1 = localFieldInfo.datatype;
        Message.Label localLabel1 = localFieldInfo.label;
        localObject1 = null;
        localObject2 = localDatatype1;
        localObject3 = localLabel1;
        if ((((Message.Label)localObject3).isPacked()) && (localWireType == WireType.LENGTH_DELIMITED))
        {
          m = paramu.c();
          l = paramu.g();
          n = paramu.c(m);
        }
      }
      else
      {
        while (true)
        {
          if (paramu.g() >= l + m)
            break label510;
          Object localObject5 = a(paramu, j, (Message.Datatype)localObject2);
          if ((localObject2 == Message.Datatype.ENUM) && ((localObject5 instanceof Integer)))
          {
            localBuilder.addVarint(j, ((Integer)localObject5).intValue());
            continue;
            Extension localExtension = a(j);
            if (localExtension == null)
              switch (j.b[localWireType.ordinal()])
              {
              case 6:
              default:
                throw new RuntimeException("Unsupported wire type: " + localWireType);
              case 1:
                localBuilder.addVarint(j, paramu.d());
                break;
              case 2:
                localBuilder.addFixed32(j, paramu.e());
                break;
              case 3:
                localBuilder.addFixed64(j, paramu.f());
                break;
              case 4:
                localBuilder.addLengthDelimited(j, paramu.b(paramu.c()));
                break;
              case 5:
                paramu.h();
                break;
              }
            Message.Datatype localDatatype2 = localExtension.getDatatype();
            Message.Label localLabel2 = localExtension.getLabel();
            localObject1 = localExtension;
            localObject2 = localDatatype2;
            localObject3 = localLabel2;
            break label221;
          }
          localk.a(j, localObject5);
        }
        label510: paramu.d(n);
        if (paramu.g() == l + m)
          continue;
        throw new IOException("Packed data had wrong length!");
      }
      Object localObject4 = a(paramu, j, (Message.Datatype)localObject2);
      if ((localObject2 == Message.Datatype.ENUM) && ((localObject4 instanceof Integer)))
      {
        localBuilder.addVarint(j, ((Integer)localObject4).intValue());
        continue;
      }
      if (((Message.Label)localObject3).isRepeated())
      {
        localk.a(j, localObject4);
        continue;
      }
      if (localObject1 != null)
      {
        ((ExtendableMessage.ExtendableBuilder)localBuilder).setExtension(localObject1, localObject4);
        continue;
      }
      a(localBuilder, j, localObject4);
    }
  }

  final void a(M paramM, WireOutput paramWireOutput)
  {
    Iterator localIterator1 = a().iterator();
    while (localIterator1.hasNext())
    {
      MessageAdapter.FieldInfo localFieldInfo = (MessageAdapter.FieldInfo)localIterator1.next();
      Object localObject2 = a(paramM, localFieldInfo);
      if (localObject2 == null)
        continue;
      int j = localFieldInfo.tag;
      Message.Datatype localDatatype2 = localFieldInfo.datatype;
      Message.Label localLabel2 = localFieldInfo.label;
      if (localLabel2.isRepeated())
      {
        if (localLabel2.isPacked())
        {
          b(paramWireOutput, (List)localObject2, j, localDatatype2);
          continue;
        }
        a(paramWireOutput, (List)localObject2, j, localDatatype2);
        continue;
      }
      a(paramWireOutput, j, localObject2, localDatatype2);
    }
    if ((paramM instanceof ExtendableMessage))
    {
      ExtendableMessage localExtendableMessage = (ExtendableMessage)paramM;
      if (localExtendableMessage.extensionMap != null)
      {
        f localf = localExtendableMessage.extensionMap;
        Iterator localIterator2 = localf.a().iterator();
        while (localIterator2.hasNext())
        {
          Extension localExtension = (Extension)localIterator2.next();
          Object localObject1 = localf.a(localExtension);
          int i = localExtension.getTag();
          Message.Datatype localDatatype1 = localExtension.getDatatype();
          Message.Label localLabel1 = localExtension.getLabel();
          if (localLabel1.isRepeated())
          {
            if (localLabel1.isPacked())
            {
              b(paramWireOutput, (List)localObject1, i, localDatatype1);
              continue;
            }
            a(paramWireOutput, (List)localObject1, i, localDatatype1);
            continue;
          }
          a(paramWireOutput, i, localObject1, localDatatype1);
        }
      }
    }
    paramM.writeUnknownFieldMap(paramWireOutput);
  }

  final byte[] b(M paramM)
  {
    byte[] arrayOfByte = new byte[a(paramM)];
    try
    {
      a(paramM, WireOutput.newInstance(arrayOfByte));
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
    }
    throw new RuntimeException(localIOException);
  }

  final String c(M paramM)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.b.getSimpleName());
    localStringBuilder.append("{");
    Iterator localIterator = a().iterator();
    String str = "";
    while (localIterator.hasNext())
    {
      MessageAdapter.FieldInfo localFieldInfo = (MessageAdapter.FieldInfo)localIterator.next();
      Object localObject = a(paramM, localFieldInfo);
      if (localObject == null)
        continue;
      localStringBuilder.append(str);
      str = ", ";
      localStringBuilder.append(localFieldInfo.name);
      localStringBuilder.append("=");
      localStringBuilder.append(localObject);
    }
    if ((paramM instanceof ExtendableMessage))
    {
      ExtendableMessage localExtendableMessage = (ExtendableMessage)paramM;
      localStringBuilder.append(str);
      localStringBuilder.append("{extensions=");
      localStringBuilder.append(localExtendableMessage.extensionsToString());
      localStringBuilder.append("}");
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.MessageAdapter
 * JD-Core Version:    0.6.0
 */