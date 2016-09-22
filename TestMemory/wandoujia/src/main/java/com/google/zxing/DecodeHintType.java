package com.google.zxing;

import java.util.List;

public enum DecodeHintType
{
  private final Class<?> valueType;

  static
  {
    POSSIBLE_FORMATS = new DecodeHintType("POSSIBLE_FORMATS", 2, List.class);
    TRY_HARDER = new DecodeHintType("TRY_HARDER", 3, Void.class);
    CHARACTER_SET = new DecodeHintType("CHARACTER_SET", 4, String.class);
    ALLOWED_LENGTHS = new DecodeHintType("ALLOWED_LENGTHS", 5, [I.class);
    ASSUME_CODE_39_CHECK_DIGIT = new DecodeHintType("ASSUME_CODE_39_CHECK_DIGIT", 6, Void.class);
    ASSUME_GS1 = new DecodeHintType("ASSUME_GS1", 7, Void.class);
    RETURN_CODABAR_START_END = new DecodeHintType("RETURN_CODABAR_START_END", 8, Void.class);
    NEED_RESULT_POINT_CALLBACK = new DecodeHintType("NEED_RESULT_POINT_CALLBACK", 9, g.class);
    ALLOWED_EAN_EXTENSIONS = new DecodeHintType("ALLOWED_EAN_EXTENSIONS", 10, [I.class);
    DecodeHintType[] arrayOfDecodeHintType = new DecodeHintType[11];
    arrayOfDecodeHintType[0] = OTHER;
    arrayOfDecodeHintType[1] = PURE_BARCODE;
    arrayOfDecodeHintType[2] = POSSIBLE_FORMATS;
    arrayOfDecodeHintType[3] = TRY_HARDER;
    arrayOfDecodeHintType[4] = CHARACTER_SET;
    arrayOfDecodeHintType[5] = ALLOWED_LENGTHS;
    arrayOfDecodeHintType[6] = ASSUME_CODE_39_CHECK_DIGIT;
    arrayOfDecodeHintType[7] = ASSUME_GS1;
    arrayOfDecodeHintType[8] = RETURN_CODABAR_START_END;
    arrayOfDecodeHintType[9] = NEED_RESULT_POINT_CALLBACK;
    arrayOfDecodeHintType[10] = ALLOWED_EAN_EXTENSIONS;
    $VALUES = arrayOfDecodeHintType;
  }

  private DecodeHintType(Class<?> paramClass)
  {
    this.valueType = paramClass;
  }

  public final Class<?> getValueType()
  {
    return this.valueType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.DecodeHintType
 * JD-Core Version:    0.6.0
 */