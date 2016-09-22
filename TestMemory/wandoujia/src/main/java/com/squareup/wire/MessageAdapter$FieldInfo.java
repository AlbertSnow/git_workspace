package com.squareup.wire;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class MessageAdapter$FieldInfo
{
  private final Method builderMethod;
  final Message.Datatype datatype;
  final Class<? extends ProtoEnum> enumType;
  final Message.Label label;
  private final Field messageField;
  final Class<? extends Message> messageType;
  final String name;
  final int tag;

  private MessageAdapter$FieldInfo(int paramInt, String paramString, Message.Datatype paramDatatype, Message.Label paramLabel, Class<?> paramClass, Field paramField, Method paramMethod)
  {
    this.tag = paramInt;
    this.name = paramString;
    this.datatype = paramDatatype;
    this.label = paramLabel;
    if (paramDatatype == Message.Datatype.ENUM)
    {
      this.enumType = paramClass;
      this.messageType = null;
    }
    while (true)
    {
      this.messageField = paramField;
      this.builderMethod = paramMethod;
      return;
      if (paramDatatype == Message.Datatype.MESSAGE)
      {
        this.messageType = paramClass;
        this.enumType = null;
        continue;
      }
      this.enumType = null;
      this.messageType = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.MessageAdapter.FieldInfo
 * JD-Core Version:    0.6.0
 */