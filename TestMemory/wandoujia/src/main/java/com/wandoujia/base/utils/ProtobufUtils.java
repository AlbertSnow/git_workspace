package com.wandoujia.base.utils;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import com.squareup.wire.Wire;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;

public class ProtobufUtils
{
  public static int getFieldTag(Class<? extends Message> paramClass, String paramString)
  {
    if (paramClass == null)
      throw new RuntimeException("protoClass should not be null");
    ProtoField localProtoField;
    try
    {
      localProtoField = (ProtoField)paramClass.getField(paramString).getAnnotation(ProtoField.class);
      if (localProtoField == null)
        throw new RuntimeException("the field do not have ProtoField annotation, field name=" + paramString);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      throw new RuntimeException(localNoSuchFieldException);
    }
    int i = localProtoField.tag();
    return i;
  }

  public static <T extends Message> T parse(InputStream paramInputStream, Class<T> paramClass)
  {
    byte[] arrayOfByte = new byte[readRawVarint32(paramInputStream)];
    int i = paramInputStream.read(arrayOfByte);
    return new Wire(new Class[0]).parseFrom(arrayOfByte, 0, i, paramClass);
  }

  public static int readRawVarint32(InputStream paramInputStream)
  {
    int i = paramInputStream.read();
    if (i == -1)
      throw new IOException();
    if ((i & 0x80) == 0)
      return i;
    i &= 127;
    for (int j = 7; ; j += 7)
    {
      if (j >= 32)
        break label90;
      int m = paramInputStream.read();
      if (m == -1)
        throw new IOException();
      i |= (m & 0x7F) << j;
      if ((m & 0x80) == 0)
        break;
    }
    while (true)
    {
      j += 7;
      label90: if (j >= 64)
        break;
      int k = paramInputStream.read();
      if (k == -1)
        throw new IOException();
      if ((k & 0x80) == 0)
        return i;
    }
    throw new IOException();
  }

  public static <T extends Message> void write(OutputStream paramOutputStream, T paramT)
  {
    writeRawVarint32(paramOutputStream, paramT.getSerializedSize());
    paramOutputStream.write(paramT.toByteArray());
  }

  public static void writeRawVarint32(OutputStream paramOutputStream, int paramInt)
  {
    while (true)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        paramOutputStream.write((byte)paramInt);
        return;
      }
      paramOutputStream.write((byte)(0x80 | paramInt & 0x7F));
      paramInt >>>= 7;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ProtobufUtils
 * JD-Core Version:    0.6.0
 */