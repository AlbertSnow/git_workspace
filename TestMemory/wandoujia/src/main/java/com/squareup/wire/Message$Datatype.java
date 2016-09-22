package com.squareup.wire;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public enum Message$Datatype
{
  public static final Comparator<Datatype> ORDER_BY_NAME;
  private static final Map<String, Datatype> TYPES_BY_NAME;
  private final int value;

  static
  {
    SINT32 = new Datatype("SINT32", 4, 5);
    SINT64 = new Datatype("SINT64", 5, 6);
    BOOL = new Datatype("BOOL", 6, 7);
    ENUM = new Datatype("ENUM", 7, 8);
    STRING = new Datatype("STRING", 8, 9);
    BYTES = new Datatype("BYTES", 9, 10);
    MESSAGE = new Datatype("MESSAGE", 10, 11);
    FIXED32 = new Datatype("FIXED32", 11, 12);
    SFIXED32 = new Datatype("SFIXED32", 12, 13);
    FIXED64 = new Datatype("FIXED64", 13, 14);
    SFIXED64 = new Datatype("SFIXED64", 14, 15);
    FLOAT = new Datatype("FLOAT", 15, 16);
    DOUBLE = new Datatype("DOUBLE", 16, 17);
    Datatype[] arrayOfDatatype = new Datatype[17];
    arrayOfDatatype[0] = INT32;
    arrayOfDatatype[1] = INT64;
    arrayOfDatatype[2] = UINT32;
    arrayOfDatatype[3] = UINT64;
    arrayOfDatatype[4] = SINT32;
    arrayOfDatatype[5] = SINT64;
    arrayOfDatatype[6] = BOOL;
    arrayOfDatatype[7] = ENUM;
    arrayOfDatatype[8] = STRING;
    arrayOfDatatype[9] = BYTES;
    arrayOfDatatype[10] = MESSAGE;
    arrayOfDatatype[11] = FIXED32;
    arrayOfDatatype[12] = SFIXED32;
    arrayOfDatatype[13] = FIXED64;
    arrayOfDatatype[14] = SFIXED64;
    arrayOfDatatype[15] = FLOAT;
    arrayOfDatatype[16] = DOUBLE;
    $VALUES = arrayOfDatatype;
    ORDER_BY_NAME = new h();
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    TYPES_BY_NAME = localLinkedHashMap;
    localLinkedHashMap.put("int32", INT32);
    TYPES_BY_NAME.put("int64", INT64);
    TYPES_BY_NAME.put("uint32", UINT32);
    TYPES_BY_NAME.put("uint64", UINT64);
    TYPES_BY_NAME.put("sint32", SINT32);
    TYPES_BY_NAME.put("sint64", SINT64);
    TYPES_BY_NAME.put("bool", BOOL);
    TYPES_BY_NAME.put("enum", ENUM);
    TYPES_BY_NAME.put("string", STRING);
    TYPES_BY_NAME.put("bytes", BYTES);
    TYPES_BY_NAME.put("message", MESSAGE);
    TYPES_BY_NAME.put("fixed32", FIXED32);
    TYPES_BY_NAME.put("sfixed32", SFIXED32);
    TYPES_BY_NAME.put("fixed64", FIXED64);
    TYPES_BY_NAME.put("sfixed64", SFIXED64);
    TYPES_BY_NAME.put("float", FLOAT);
    TYPES_BY_NAME.put("double", DOUBLE);
  }

  private Message$Datatype(int paramInt)
  {
    this.value = paramInt;
  }

  public static Datatype of(String paramString)
  {
    return (Datatype)TYPES_BY_NAME.get(paramString);
  }

  public final int value()
  {
    return this.value;
  }

  public final WireType wireType()
  {
    switch (g.a[ordinal()])
    {
    default:
      throw new AssertionError("No wiretype for datatype " + this);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
      return WireType.VARINT;
    case 9:
    case 10:
    case 11:
      return WireType.FIXED32;
    case 12:
    case 13:
    case 14:
      return WireType.FIXED64;
    case 15:
    case 16:
    case 17:
    }
    return WireType.LENGTH_DELIMITED;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.Message.Datatype
 * JD-Core Version:    0.6.0
 */