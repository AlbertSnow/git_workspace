package com.squareup.wire;

import java.util.List;

public final class Extension$Builder<T extends ExtendableMessage<?>, E>
{
  private final Message.Datatype datatype;
  private final Class<? extends ProtoEnum> enumType;
  private final Class<T> extendedType;
  private Message.Label label = null;
  private final Class<? extends Message> messageType;
  private String name = null;
  private int tag = -1;

  private Extension$Builder(Class<T> paramClass, Message.Datatype paramDatatype)
  {
    this.extendedType = paramClass;
    this.messageType = null;
    this.enumType = null;
    this.datatype = paramDatatype;
  }

  private Extension$Builder(Class<T> paramClass, Class<? extends Message> paramClass1, Class<? extends ProtoEnum> paramClass2, Message.Datatype paramDatatype)
  {
    this.extendedType = paramClass;
    this.messageType = paramClass1;
    this.enumType = paramClass2;
    this.datatype = paramDatatype;
  }

  private void validate()
  {
    if (this.extendedType == null)
      throw new IllegalArgumentException("extendedType == null");
    if (this.name == null)
      throw new IllegalArgumentException("name == null");
    if (this.datatype == null)
      throw new IllegalArgumentException("datatype == null");
    if (this.label == null)
      throw new IllegalArgumentException("label == null");
    if (this.tag <= 0)
      throw new IllegalArgumentException("tag == " + this.tag);
    if (this.datatype == Message.Datatype.MESSAGE)
    {
      if ((this.messageType == null) || (this.enumType != null))
        throw new IllegalStateException("Message w/o messageType or w/ enumType");
    }
    else if (this.datatype == Message.Datatype.ENUM)
    {
      if ((this.messageType != null) || (this.enumType == null))
        throw new IllegalStateException("Enum w/ messageType or w/o enumType");
    }
    else if ((this.messageType != null) || (this.enumType != null))
      throw new IllegalStateException("Scalar w/ messageType or enumType");
  }

  public final Extension<T, E> buildOptional()
  {
    this.label = Message.Label.OPTIONAL;
    validate();
    return new Extension(this.extendedType, this.messageType, this.enumType, this.name, this.tag, this.label, this.datatype, null);
  }

  public final Extension<T, List<E>> buildPacked()
  {
    this.label = Message.Label.PACKED;
    validate();
    return new Extension(this.extendedType, this.messageType, this.enumType, this.name, this.tag, this.label, this.datatype, null);
  }

  public final Extension<T, List<E>> buildRepeated()
  {
    this.label = Message.Label.REPEATED;
    validate();
    return new Extension(this.extendedType, this.messageType, this.enumType, this.name, this.tag, this.label, this.datatype, null);
  }

  public final Extension<T, E> buildRequired()
  {
    this.label = Message.Label.REQUIRED;
    validate();
    return new Extension(this.extendedType, this.messageType, this.enumType, this.name, this.tag, this.label, this.datatype, null);
  }

  public final Builder<T, E> setName(String paramString)
  {
    this.name = paramString;
    return this;
  }

  public final Builder<T, E> setTag(int paramInt)
  {
    this.tag = paramInt;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.Extension.Builder
 * JD-Core Version:    0.6.0
 */