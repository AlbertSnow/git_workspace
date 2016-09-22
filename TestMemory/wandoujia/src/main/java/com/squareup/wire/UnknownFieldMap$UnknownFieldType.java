package com.squareup.wire;

 enum UnknownFieldMap$UnknownFieldType
{
  static
  {
    FIXED32 = new UnknownFieldType("FIXED32", 1);
    FIXED64 = new UnknownFieldType("FIXED64", 2);
    LENGTH_DELIMITED = new UnknownFieldType("LENGTH_DELIMITED", 3);
    UnknownFieldType[] arrayOfUnknownFieldType = new UnknownFieldType[4];
    arrayOfUnknownFieldType[0] = VARINT;
    arrayOfUnknownFieldType[1] = FIXED32;
    arrayOfUnknownFieldType[2] = FIXED64;
    arrayOfUnknownFieldType[3] = LENGTH_DELIMITED;
    $VALUES = arrayOfUnknownFieldType;
  }

  public static UnknownFieldType of(String paramString)
  {
    if ("varint".equals(paramString))
      return VARINT;
    if ("fixed32".equals(paramString))
      return FIXED32;
    if ("fixed64".equals(paramString))
      return FIXED64;
    if ("length-delimited".equals(paramString))
      return LENGTH_DELIMITED;
    throw new IllegalArgumentException("Unknown type " + paramString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.UnknownFieldMap.UnknownFieldType
 * JD-Core Version:    0.6.0
 */