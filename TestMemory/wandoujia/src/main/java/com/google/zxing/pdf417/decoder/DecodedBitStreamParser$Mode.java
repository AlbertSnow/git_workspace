package com.google.zxing.pdf417.decoder;

 enum DecodedBitStreamParser$Mode
{
  static
  {
    ALPHA_SHIFT = new Mode("ALPHA_SHIFT", 4);
    PUNCT_SHIFT = new Mode("PUNCT_SHIFT", 5);
    Mode[] arrayOfMode = new Mode[6];
    arrayOfMode[0] = ALPHA;
    arrayOfMode[1] = LOWER;
    arrayOfMode[2] = MIXED;
    arrayOfMode[3] = PUNCT;
    arrayOfMode[4] = ALPHA_SHIFT;
    arrayOfMode[5] = PUNCT_SHIFT;
    $VALUES = arrayOfMode;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode
 * JD-Core Version:    0.6.0
 */