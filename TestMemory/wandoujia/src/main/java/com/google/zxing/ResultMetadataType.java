package com.google.zxing;

public enum ResultMetadataType
{
  static
  {
    ORIENTATION = new ResultMetadataType("ORIENTATION", 1);
    BYTE_SEGMENTS = new ResultMetadataType("BYTE_SEGMENTS", 2);
    ERROR_CORRECTION_LEVEL = new ResultMetadataType("ERROR_CORRECTION_LEVEL", 3);
    ISSUE_NUMBER = new ResultMetadataType("ISSUE_NUMBER", 4);
    SUGGESTED_PRICE = new ResultMetadataType("SUGGESTED_PRICE", 5);
    POSSIBLE_COUNTRY = new ResultMetadataType("POSSIBLE_COUNTRY", 6);
    UPC_EAN_EXTENSION = new ResultMetadataType("UPC_EAN_EXTENSION", 7);
    PDF417_EXTRA_METADATA = new ResultMetadataType("PDF417_EXTRA_METADATA", 8);
    STRUCTURED_APPEND_SEQUENCE = new ResultMetadataType("STRUCTURED_APPEND_SEQUENCE", 9);
    STRUCTURED_APPEND_PARITY = new ResultMetadataType("STRUCTURED_APPEND_PARITY", 10);
    ResultMetadataType[] arrayOfResultMetadataType = new ResultMetadataType[11];
    arrayOfResultMetadataType[0] = OTHER;
    arrayOfResultMetadataType[1] = ORIENTATION;
    arrayOfResultMetadataType[2] = BYTE_SEGMENTS;
    arrayOfResultMetadataType[3] = ERROR_CORRECTION_LEVEL;
    arrayOfResultMetadataType[4] = ISSUE_NUMBER;
    arrayOfResultMetadataType[5] = SUGGESTED_PRICE;
    arrayOfResultMetadataType[6] = POSSIBLE_COUNTRY;
    arrayOfResultMetadataType[7] = UPC_EAN_EXTENSION;
    arrayOfResultMetadataType[8] = PDF417_EXTRA_METADATA;
    arrayOfResultMetadataType[9] = STRUCTURED_APPEND_SEQUENCE;
    arrayOfResultMetadataType[10] = STRUCTURED_APPEND_PARITY;
    $VALUES = arrayOfResultMetadataType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.ResultMetadataType
 * JD-Core Version:    0.6.0
 */