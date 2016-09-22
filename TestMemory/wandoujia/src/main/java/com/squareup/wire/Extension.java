package com.squareup.wire;

public final class Extension<T extends ExtendableMessage<?>, E>
  implements Comparable<Extension<?, ?>>
{
  private final Message.Datatype datatype;
  private final Class<? extends ProtoEnum> enumType;
  private final Class<T> extendedType;
  private final Message.Label label;
  private final Class<? extends Message> messageType;
  private final String name;
  private final int tag;

  private Extension(Class<T> paramClass, Class<? extends Message> paramClass1, Class<? extends ProtoEnum> paramClass2, String paramString, int paramInt, Message.Label paramLabel, Message.Datatype paramDatatype)
  {
    this.extendedType = paramClass;
    this.name = paramString;
    this.tag = paramInt;
    this.datatype = paramDatatype;
    this.label = paramLabel;
    this.messageType = paramClass1;
    this.enumType = paramClass2;
  }

  public static <T extends ExtendableMessage<?>> Extension.Builder<T, Boolean> boolExtending(Class<T> paramClass)
  {
    return new Extension.Builder(paramClass, Message.Datatype.BOOL, null);
  }

  public static <T extends ExtendableMessage<?>> Extension.Builder<T, ByteString> bytesExtending(Class<T> paramClass)
  {
    return new Extension.Builder(paramClass, Message.Datatype.BYTES, null);
  }

  public static <T extends ExtendableMessage<?>> Extension.Builder<T, Double> doubleExtending(Class<T> paramClass)
  {
    return new Extension.Builder(paramClass, Message.Datatype.DOUBLE, null);
  }

  public static <T extends ExtendableMessage<?>, E extends Enum,  extends ProtoEnum> Extension.Builder<T, E> enumExtending(Class<E> paramClass, Class<T> paramClass1)
  {
    return new Extension.Builder(paramClass1, null, paramClass, Message.Datatype.ENUM, null);
  }

  public static <T extends ExtendableMessage<?>> Extension.Builder<T, Integer> fixed32Extending(Class<T> paramClass)
  {
    return new Extension.Builder(paramClass, Message.Datatype.FIXED32, null);
  }

  public static <T extends ExtendableMessage<?>> Extension.Builder<T, Long> fixed64Extending(Class<T> paramClass)
  {
    return new Extension.Builder(paramClass, Message.Datatype.FIXED64, null);
  }

  public static <T extends ExtendableMessage<?>> Extension.Builder<T, Float> floatExtending(Class<T> paramClass)
  {
    return new Extension.Builder(paramClass, Message.Datatype.FLOAT, null);
  }

  public static <T extends ExtendableMessage<?>> Extension.Builder<T, Integer> int32Extending(Class<T> paramClass)
  {
    return new Extension.Builder(paramClass, Message.Datatype.INT32, null);
  }

  public static <T extends ExtendableMessage<?>> Extension.Builder<T, Long> int64Extending(Class<T> paramClass)
  {
    return new Extension.Builder(paramClass, Message.Datatype.INT64, null);
  }

  public static <T extends ExtendableMessage<?>, M extends Message> Extension.Builder<T, M> messageExtending(Class<M> paramClass, Class<T> paramClass1)
  {
    return new Extension.Builder(paramClass1, paramClass, null, Message.Datatype.MESSAGE, null);
  }

  public static <T extends ExtendableMessage<?>> Extension.Builder<T, Integer> sfixed32Extending(Class<T> paramClass)
  {
    return new Extension.Builder(paramClass, Message.Datatype.SFIXED32, null);
  }

  public static <T extends ExtendableMessage<?>> Extension.Builder<T, Long> sfixed64Extending(Class<T> paramClass)
  {
    return new Extension.Builder(paramClass, Message.Datatype.SFIXED64, null);
  }

  public static <T extends ExtendableMessage<?>> Extension.Builder<T, Integer> sint32Extending(Class<T> paramClass)
  {
    return new Extension.Builder(paramClass, Message.Datatype.SINT32, null);
  }

  public static <T extends ExtendableMessage<?>> Extension.Builder<T, Long> sint64Extending(Class<T> paramClass)
  {
    return new Extension.Builder(paramClass, Message.Datatype.SINT64, null);
  }

  public static <T extends ExtendableMessage<?>> Extension.Builder<T, String> stringExtending(Class<T> paramClass)
  {
    return new Extension.Builder(paramClass, Message.Datatype.STRING, null);
  }

  public static <T extends ExtendableMessage<?>> Extension.Builder<T, Integer> uint32Extending(Class<T> paramClass)
  {
    return new Extension.Builder(paramClass, Message.Datatype.UINT32, null);
  }

  public static <T extends ExtendableMessage<?>> Extension.Builder<T, Long> uint64Extending(Class<T> paramClass)
  {
    return new Extension.Builder(paramClass, Message.Datatype.UINT64, null);
  }

  public final int compareTo(Extension<?, ?> paramExtension)
  {
    if (paramExtension == this);
    do
    {
      return 0;
      if (this.tag != paramExtension.tag)
        return this.tag - paramExtension.tag;
      if (this.datatype != paramExtension.datatype)
        return this.datatype.value() - paramExtension.datatype.value();
      if (this.label != paramExtension.label)
        return this.label.value() - paramExtension.label.value();
      if ((this.extendedType != null) && (!this.extendedType.equals(paramExtension.extendedType)))
        return this.extendedType.getName().compareTo(paramExtension.extendedType.getName());
      if ((this.messageType != null) && (!this.messageType.equals(paramExtension.messageType)))
        return this.messageType.getName().compareTo(paramExtension.messageType.getName());
    }
    while ((this.enumType == null) || (this.enumType.equals(paramExtension.enumType)));
    return this.enumType.getName().compareTo(paramExtension.enumType.getName());
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof Extension)) && (compareTo((Extension)paramObject) == 0);
  }

  public final Message.Datatype getDatatype()
  {
    return this.datatype;
  }

  public final Class<? extends ProtoEnum> getEnumType()
  {
    return this.enumType;
  }

  public final Class<T> getExtendedType()
  {
    return this.extendedType;
  }

  public final Message.Label getLabel()
  {
    return this.label;
  }

  public final Class<? extends Message> getMessageType()
  {
    return this.messageType;
  }

  public final String getName()
  {
    return this.name;
  }

  public final int getTag()
  {
    return this.tag;
  }

  public final int hashCode()
  {
    int i = 37 * (37 * (37 * (37 * this.tag + this.datatype.value()) + this.label.value()) + this.extendedType.hashCode());
    if (this.messageType != null);
    for (int j = this.messageType.hashCode(); ; j = 0)
    {
      int k = 37 * (j + i);
      Class localClass = this.enumType;
      int m = 0;
      if (localClass != null)
        m = this.enumType.hashCode();
      return k + m;
    }
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.label;
    arrayOfObject[1] = this.datatype;
    arrayOfObject[2] = this.name;
    arrayOfObject[3] = Integer.valueOf(this.tag);
    return String.format("[%s %s %s = %d]", arrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.Extension
 * JD-Core Version:    0.6.0
 */